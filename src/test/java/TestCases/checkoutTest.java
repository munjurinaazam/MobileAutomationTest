package TestCases;

import BaseTest.baseTest;
import Pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class checkoutTest extends baseTest {
    private CartPage cartPage;
    private RegisterPopupPage registerPopupPage;
    private BillingAddressPage billingAddressPage;
  //  private ShippingAddressPage shippingAddressPage;
    private PaymentPage paymentPage;
    private confirmPage ConfirmPage;

    @BeforeClass
    public void setUp() {
        // Initialize page objects and driver (Assuming BaseTest class handles driver setup)
        cartPage = new CartPage(driver);
        registerPopupPage = new RegisterPopupPage(driver);
        billingAddressPage = new BillingAddressPage(driver);
        //shippingAddressPage = new ShippingAddressPage(driver);
        paymentPage = new PaymentPage(driver);
        ConfirmPage = new confirmPage(driver);
    }

    @Test
    public void testCheckoutFromCartPage() {

        cartPage.setBuyNowBTN();
        registerPopupPage.setRegisterAsGuest();
        billingAddressPage.BillingAddressDetails();
        paymentPage.setChooseCOD();
        ConfirmPage.setConfirmOrder();


    }
}


