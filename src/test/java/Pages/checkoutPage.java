package Pages;

import BaseTest.baseTest;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebElement;

public class checkoutPage extends baseTest {

    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement checkoutbtnfromcartpage;
    @AndroidBy(id="com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")
    WebElement guestCheckout;

    //Billing Address
    @AndroidBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFirstName")
    WebElement firstname;
    @AndroidBy(id = "com.nopstation.nopcomm")
    WebElement firstname;


    public void tapCheckoutButton(){
        checkoutbtnfromcartpage.isDisplayed();
        checkoutbtnfromcartpage.click();
    }
    public void guestUserCheckout(){
        guestCheckout.click();
    }
    //Fill up Billing Address




}
