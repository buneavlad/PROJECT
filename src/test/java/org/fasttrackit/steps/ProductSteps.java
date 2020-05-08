package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ShopPage;
import org.junit.Assert;

public class ProductSteps {
    private ProductPage productPage;
    private ShopPage shopPage;
    private Homepage homepage;
    private CartPage cartPage;


    @Step
    public void addReviewtoProduct(String name, String email,String text){
        homepage.open();
        homepage.clickshopButton();
        shopPage.clickProduct();
        productPage.addStarToReview();
        productPage.addCommenttoReview(text);
        productPage.setNameOfReviewer(name);
        productPage.setEmailofReviewer(email);
        productPage.clickSubmitButton();

    }

    @Step
    public void findTheComment(String text){
        Assert.assertTrue(productPage.getCommentOfReview(text));
    }


    @Step
    public void clickCartPage(){
    homepage.clickCartButton();
    }

    @Step
    public void addProductsToCart(){
        homepage.open();
        homepage.clickshopButton();
        productPage.addAaaToCart();
        productPage.addAbcToCart();
    }
}
