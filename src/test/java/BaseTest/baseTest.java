package BaseTest;

import Util.GeneralUtil;
import com.google.common.io.Files;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.apache.commons.codec.binary.Base64;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class baseTest {
    public static AndroidDriver driver;

    @AfterClass
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "9HTWMBYLU87T7LBI");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
        capabilities.setCapability("appActivity", "com.bs.ecommerce");
        capabilities.setCapability("platformName", "Android");


        try {
            driver = new AndroidDriver(new URL("localhost/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GeneralUtil.LOAD_TIME));
        driver.startRecordingScreen();

    }

    @AfterClass
    public void tearDown() {
        stopRecording();
        driver.quit();
    }

    protected void stopRecording() {
        String base64String = driver.stopRecordingScreen();
        byte[] data = Base64.decodeBase64(base64String);

        //prepare video save directory path
        String projectHomeDirectory = System.getProperty("user.dir");
        System.out.println("projectHomeDirectory :" + projectHomeDirectory);
        String destinationPath = projectHomeDirectory + "/build/videos";

        File theDir = new File(destinationPath);
        if (!theDir.exists()) {
            theDir.mkdirs();
        }

        String filePath = destinationPath + "/" + driver.getDeviceTime().replace(":", "_").replace("+", " ") + ".mp4";
        System.out.println("filePath : " + filePath);
        Path path = Paths.get(filePath);
        try {
            Files.write(path, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot() {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
