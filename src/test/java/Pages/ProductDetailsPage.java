package Pages;

import BaseTest.baseTest;
import Util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ProductDetailsPage extends baseTest{

    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement productName;
    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView")
    WebElement downloadBtn;
    @AndroidBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Placeholder\"])[3]")
    WebElement addbutton;

    //For checkout
    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[2]")
    WebElement checkoutBtn;

    public ProductDetailsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
    }

    public void AddButtonfromProductDetails(){
        productName.click();
    }
    public void setDownloadBtn(){
        downloadBtn.click();
    }
    public void tapAddButton(){
        addbutton.click();
        addbutton.click();
    }

    public void setCheckoutBtn() {
        //this.checkoutBtn = checkoutBtn;
        checkoutBtn.click();
    }
}
