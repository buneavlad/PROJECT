package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Steps
    private CartSteps cartSteps;

    @Test
    public void addAProductToCart(){
        cartSteps.addProductToCart();
        cartSteps.getCartMessage("View cart\n" +
                "“abc” has been added to your cart.");
    }

    @Test
    public void removeAProductFromCart(){
        cartSteps.addProductToCart();
        cartSteps.removeProductFromCart();
        cartSteps.getRemoveMessage("“abc” removed. Undo?");
    }
}
