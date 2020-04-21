package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.ShopPage;
import org.junit.Assert;

public class CartSteps {
    private ShopPage shopPage;
    private Homepage homepage;
    private CartPage cartPage;

    @Step
    public void addProductToCart(){
        homepage.open();
        homepage.clickshopButton();
        shopPage.clickAbcProduct();
        shopPage.clickAddAbcProduct();

    }

    @Step
    public void getCartMessage(String expected){
        String message = shopPage.getCartMessage();
        Assert.assertEquals(expected,message);

    }

    @Step

    public void removeProductFromCart(){
        homepage.clickCartButton();
        cartPage.removeProductFromCart();


    }

    @Step
    public void getRemoveMessage(String expected){
        String message = cartPage.removeMess();
        Assert.assertEquals(expected,message);

    }
}
