package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Steps
    private ProductSteps productSteps;

    @Steps
    private CartSteps cartSteps;


    @Test
    public void addReviewToProduct(){
        String text = RandomStringUtils.randomAlphabetic(10);
        productSteps.addReviewtoProduct("vlad","vladovidiubunea@gmail.com",text);
        productSteps.findTheComment(text);
    }

    @Test
    public void SumofTwoProducts(){
        productSteps.addProductsToCart();
        productSteps.clickCartPage();
        cartSteps.checkSumOfProducts();



    }


}
