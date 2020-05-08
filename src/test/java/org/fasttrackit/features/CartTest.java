package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.admin.DashboardSteps;
import org.fasttrackit.steps.admin.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Steps
    private CartSteps cartSteps;

    @Steps
    private ProductSteps product;

    @Steps
    private DashboardSteps dash;

    @Test
    public void addAProductToCart(){
        cartSteps.addProductToCart();
        cartSteps.getCartMessage("View cart\n" +
                "“aaa” has been added to your cart.");
    }

    @Test
    public void removeAProductFromCart(){
        cartSteps.addProductToCart();
        cartSteps.removeProductFromCart();
        cartSteps.getRemoveMessage("“aaa” removed. Undo?");
    }

    @Test
    public void changeQuantityFromCart(){
        cartSteps.addProductToCart();
        cartSteps.clickCartPage();
        cartSteps.changeQuantityInCartPage("3");
        cartSteps.getQuantityUpdateMessage("Cart updated.");


    }
    @Test
    public void tryToClickUpdateButtonWithoutChangeQuantity(){
        cartSteps.addProductToCart();
        cartSteps.clickCartPage();
        cartSteps.tryToClickUpdateButton();

    }

    @Test
    public void applyInvalidCupon(){
        cartSteps.addProductToCart();
        cartSteps.clickCartPage();
        cartSteps.applyCupon("invalidcupon");
        cartSteps.errorCuponMessage("Coupon \"invalidcupon\" does not exist!");
    }

    @Test
    public void applyValidCupon(){
        cartSteps.addProductToCart();
        cartSteps.clickCartPage();
        cartSteps.applyCupon("testcupon");
        cartSteps.succesufullyCuponMessage("Coupon code applied successfully.");

    }


}
