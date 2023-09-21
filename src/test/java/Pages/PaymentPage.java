package Pages;

import BaseTest.baseTest;
import Util.GeneralUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class PaymentPage extends baseTest {
    @FindBy(xpath="(//android.widget.ImageView[@content-desc=\"Placeholder\"])[16]")
    WebElement chooseCOD;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
     WebElement getChooseCODButton;
    public PaymentPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(baseTest.driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public void setChooseCOD() {
        //this.chooseCOD = chooseCOD;
        chooseCOD.click();

        getChooseCODButton.click();
    }

}
