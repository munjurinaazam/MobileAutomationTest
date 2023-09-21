package Pages;

import BaseTest.baseTest;
import Util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ProductListPage extends baseTest {
    @AndroidBy(xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[13]")
    WebElement clickProduct;
    @AndroidBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Placeholder\"])[3]")
    WebElement addbutton;

    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/counterIcon")
    WebElement cartbtn;
    @AndroidBy(xpath = "(//android.widget.ImageView[@content-desc=\"Placeholder\"])[14]")
    WebElement wishlistBtn;

    public ProductListPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }
    public void displayedProduct(){
        clickProduct.isDisplayed();
    }
    public void tapWishlist(){
        wishlistBtn.isDisplayed();
        wishlistBtn.click();
    }
    public void clickAddToCart() {
        addbutton.click();
        addbutton.click();
        cartbtn.click();
        cartbtn.isDisplayed();

        driver.navigate().back();
    }




}
