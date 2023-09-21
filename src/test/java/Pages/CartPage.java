package Pages;

import BaseTest.baseTest;
import Util.GeneralUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

//import io.appium.java_client.MobileElement;
public class CartPage extends baseTest {
    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement buyNowBTN;
    public CartPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(baseTest.driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public void setBuyNowBTN() {
       // this.buyNowBTN = buyNowBTN;
        buyNowBTN.click();
    }

}