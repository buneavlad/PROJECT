package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.ShopPage;
import org.fasttrackit.pages.admin.DashboardPage;
import org.fasttrackit.pages.admin.ProductPage;
import org.junit.Assert;

public class CartSteps {
    private ShopPage shopPage;
    private Homepage homepage;
    private CartPage cartPage;
    private ProductPage product;
    private DashboardPage dash;

    @Step
    public void addProductToCart() {
        homepage.open();
        homepage.clickshopButton();
        shopPage.clickProduct();
        shopPage.clickAddProduct();

    }

    @Step
    public void getCartMessage(String expected) {
        String message = shopPage.getCartMessage();
        Assert.assertEquals(expected, message);

    }

    @Step

    public void removeProductFromCart() {
        homepage.clickCartButton();
        cartPage.removeProductFromCart();


    }

    @Step
    public void getRemoveMessage(String expected) {
        String message = cartPage.removeMess();
        Assert.assertEquals(expected, message);

    }

    @Step
    public void changeQuantityInCartPage(String number) {
        cartPage.changeQuantityField(number);
        cartPage.clickUpdateButton();
    }

    @Step
    public void getQuantityUpdateMessage(String expected) {
        String text = cartPage.quantityMessage();
        Assert.assertEquals(expected, text);

    }

    @Step
    public void clickCartPage() {
        homepage.clickCartButton();
    }

    @Step
    public void tryToClickUpdateButton() {
        Assert.assertTrue(cartPage.tryToClickUpdateButton());
    }

    @Step
    public void applyCupon(String cupon) {
        cartPage.setCuponField(cupon);
        cartPage.clickApplyCupon();

    }

    @Step
    public void errorCuponMessage(String expected) {
        String text = cartPage.errorCuponMessage();
        Assert.assertEquals(expected, text);
    }

    @Step
    public void succesufullyCuponMessage(String expected) {
        String text = cartPage.succesufullyCuponMessage();
        Assert.assertEquals(expected, text);
    }

    @Step
    public void checkSumOfProducts (){
        Assert.assertTrue(cartPage.sumOfProducts());
    }


}
