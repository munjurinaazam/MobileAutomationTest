package screen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class checkoutScreen extends BaseScreen {
    public checkoutScreen(AndroidDriver driver) {
            super(driver);
        }



        public checkoutScreen tapCheckoutBtn() {
            getWebElement(By.xpath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]"))).click();
            return this;
        }

        public checkoutScreen choosePayment() {
            getWebElement(By.xpath("\"//android.widget.ImageView[@content-desc=\\\"Placeholder\\\"])[16]\")")).click();
            return this;
        }

    }
