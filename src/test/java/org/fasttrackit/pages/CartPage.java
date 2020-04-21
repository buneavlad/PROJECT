package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/cart")
public class CartPage extends PageObject {
    @FindBy(css="td[class=\"product-remove\"]")
    private WebElementFacade removeProduct;

    @FindBy(css="div.entry-content > div.woocommerce-message")
    private WebElementFacade removeMessage;

    public void removeProductFromCart(){clickOn(removeProduct);}

    public String removeMess(){
        return removeMessage.getText();
    }

}
