package Pages;

import BaseTest.baseTest;
import Util.GeneralUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class confirmPage extends baseTest {
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement confirmOrder;
    public confirmPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(baseTest.driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public void setConfirmOrder() {

        confirmOrder.click();
    }
}
