package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class ShopPage extends PageObject {
    @FindBy(css="#main > ul > li.post-2627.product.type-product.status-publish.product_cat-uncategorized.first.instock.sale.shipping-taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")
    private WebElementFacade abcProduct;

    @FindBy(css="#product-2627 > div.summary.entry-summary > form > button")
    private WebElementFacade addAbcProduct;

    @FindBy(css="div.woocommerce-message")
    private WebElementFacade addToCartMessage;



public void clickAbcProduct(){clickOn(abcProduct);}
public void clickAddAbcProduct(){clickOn(addAbcProduct);}
public String getCartMessage(){
    return addToCartMessage.getText();
}


}
