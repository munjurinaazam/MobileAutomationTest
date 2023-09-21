package Pages;

import BaseTest.baseTest;
import Util.GeneralUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BillingAddressPage extends baseTest {
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFirstName")
    WebElement firstName;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etLastName")
    WebElement lastName;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etEmail")
    WebElement email;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")
    WebElement selectCountry;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCompanyNam")
    WebElement companyName;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")
    WebElement choosestate;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCity")
    WebElement cityName;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")
    WebElement streetAddress;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etZipCode")
    WebElement zipCode;
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement btnContinue;

    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    WebElement shippingContinueButton;
    public BillingAddressPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(baseTest.driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }
    public void BillingAddressDetails(){
        firstName.click();
        firstName.sendKeys("Munjurina");
        lastName.click();
        lastName.sendKeys("Azam");
        email.click();
        email.sendKeys();
        Select select=new Select(selectCountry);
        select.selectByVisibleText("Bangladesh");
        companyName.click();
        companyName.sendKeys("GDIC");
        Select chooseState=new Select(choosestate);
        chooseState.selectByIndex(0);
        cityName.click();
        cityName.sendKeys("Dhaka");
        streetAddress.click();
        streetAddress.sendKeys("Gulshan");
        zipCode.click();
        zipCode.sendKeys("1212");
        btnContinue.isDisplayed();
        btnContinue.click();

        shippingContinueButton.click();











    }

}
