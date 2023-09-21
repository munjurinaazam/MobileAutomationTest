package Pages;

import BaseTest.baseTest;
import Util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LandingPage extends baseTest {
    @AndroidBy(xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[3]")
    WebElement clickCategory;


    public LandingPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }
    public void tapCategory(){
        clickCategory.isDisplayed();
        clickCategory.click();
    }
//    public void tabChoosenProduct(){
//        clickProduct.click();
//    }


}
