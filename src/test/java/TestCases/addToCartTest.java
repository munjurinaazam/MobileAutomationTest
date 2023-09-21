package TestCases;

import BaseTest.baseTest;
import Pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addToCartTest extends baseTest {
    ProductDetailsPage productDetailsPage;
    ProductListPage productListPage;
    RegisterPopupPage registerPopupPage;
    BillingAddressPage billingAddressPage;
    PaymentPage paymentPage;
    confirmPage ConfirmPage;

    @BeforeClass
    public void initialization() {
        new LandingPage()
                .setUp();
    }
    @Test
    public void tapAddButtonfromProductDetails(){
        productListPage.displayedProduct();
        productListPage.tapWishlist();
        productListPage.clickAddToCart();
    }
    @Test
    public void tapAddButtonShouldSucceed() {
        productDetailsPage.AddButtonfromProductDetails();
        productDetailsPage.setDownloadBtn();
        productDetailsPage.tapAddButton();
        driver.navigate().back();
        //productDetailsPage.setCheckoutBtn();

    }
    @Test
    public void tapCheckoutBtn(){
        productDetailsPage.setCheckoutBtn();
        registerPopupPage.setRegisterAsGuest();
        billingAddressPage.BillingAddressDetails();
        paymentPage.setChooseCOD();
        ConfirmPage.setConfirmOrder();




    }


}
