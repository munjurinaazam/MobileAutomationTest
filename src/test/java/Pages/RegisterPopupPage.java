package Pages;

import BaseTest.baseTest;
import Util.GeneralUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RegisterPopupPage extends baseTest {
    @FindBy(id="com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")
    WebElement registerAsGuest;
    public RegisterPopupPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(baseTest.driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);

    }

    public void setRegisterAsGuest() {
        //this.registerAsGuest = registerAsGuest;
        registerAsGuest.click();
    }
}
