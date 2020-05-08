package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private CartSteps cartSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void checkoutAProduct(){
        cartSteps.addProductToCart();
        checkoutSteps.checkoutProduct("vlad","bunea","cluj-napoca",
                "cluj-napoca","400123","0700000000","vlad@mailinator.com");
        checkoutSteps.waitUntilButtonDisappears();
        checkoutSteps.orderMesage("Thank you. Your order has been received.");
    }
    @Test
    public void checkoutWithInvalidEmail(){
        cartSteps.addProductToCart();
        checkoutSteps.checkoutProduct("vlad","bunea","cluj-napoca",
                "cluj-napoca","400123","0700000000","vlad");
        checkoutSteps.invalidEmailMessage("Billing Email address is not a valid email address.");

    }





}
