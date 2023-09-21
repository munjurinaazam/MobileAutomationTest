package screen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartScreen extends BaseScreen {
    private By btnDetail = By.id("btnDetail");
    public CartScreen(AndroidDriver driver) {
        super(driver);
    }

    public CartScreen tapOnCartBtn() {
        getWebElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]\")"));
        return this;
    }


    public boolean hasDetailBtn() {
        return getWebElements(btnDetail).size() > 0;
    }


}
