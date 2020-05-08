package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.admin.DashboardPage;
import org.fasttrackit.pages.admin.ProductPage;
import org.junit.Assert;

public class ProductSteps {

    private ProductPage productPage;
    private DashboardPage dash;

    @Step
    public void addProduct(String name,String text, String price){
        dash.hoveroverProductPage();
        productPage.addTitle(name);
       productPage.addContent(text);
       productPage.setPrice(price);
        productPage.clickPublishButton();
    }

    @Step
    public void checkProductMessage(String expected){
        String message = productPage.checkProductMessage();
        Assert.assertEquals(expected,message);

    }
}
