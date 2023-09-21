package screen;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen{
    private By btnStart = By.id("btnStart");
    private By btnCompare = By.id("btnCompare");
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }
    public CartScreen tapOnCartBtn() {
        getWebElement(btnStart).click();
        return getInstance(CartScreen.class);
    }

    public checkoutScreen tapOnCheckoutBtn() {
        getWebElement(btnCompare).click();
        return getInstance(checkoutScreen.class);
    }

    public boolean hasEmiCalculateBtn() {
        return getWebElements(btnStart).size() > 0;
    }

    public boolean hasCompareLoanBtn() {
        return getWebElements(btnCompare).size() > 0;
    }

}
