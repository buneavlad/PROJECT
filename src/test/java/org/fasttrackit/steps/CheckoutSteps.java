package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.Homepage;
import org.junit.Assert;

public class CheckoutSteps {
    private Homepage homepage;
    private CheckoutPage checkoutPage;

    @Step
    public void checkoutProduct(String firstname, String lastname, String adress, String town, String postcode,
    String phone, String email){
        homepage.clickCheckoutButton();
        checkoutPage.setFirstNameField(firstname);
        checkoutPage.setLastNameField(lastname);
        checkoutPage.setStreetAdressField(adress);
        checkoutPage.setTownField(town);
        checkoutPage.setPostCodeField(postcode);
        checkoutPage.setPhoneField(phone);
        checkoutPage.setEmailField(email);
        checkoutPage.clickPlaceOrderButton();
    }
    @Step
    public void waitUntilButtonDisappears(){
        checkoutPage.waitAfterButton();
    }


    @Step
    public void orderMesage(String expected){
        String text = checkoutPage.getReceivedOrderMessage();
        Assert.assertEquals(expected,text);
    }

    @Step
    public void invalidEmailMessage(String expected){
        String text = checkoutPage.getInvalidEmailMessage();
        Assert.assertEquals(expected,text);
    }
}
