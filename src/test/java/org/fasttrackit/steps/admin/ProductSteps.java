package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.admin.CategoryProductsPage;
import org.fasttrackit.pages.admin.DashboardPage;
import org.fasttrackit.pages.admin.ProductPage;
import org.junit.Assert;

public class ProductSteps {

    private ProductPage productPage;
    private DashboardPage dash;
    private CategoryProductsPage category;

    @Step
    public void addProduct(String name,String text, String price){
        dash.hoveroverProducts();
        dash.clickAddNewProduct();
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

    @Step
    public void moveToTrash(){
        productPage.clickAllProducts();
        productPage.hoveroverAddedProduct();
        productPage.clickTrashButton();
    }


    @Step
    public void getRemoveProductMessage(String expected){
        String text = productPage.removeProductMessage();
        Assert.assertEquals(expected,text);
    }

    @Step
    public void addNewCategory(String name, String text){
       dash.hoveroverProducts();
       dash.clickCategories();
       category.setNameField(name);
       category.setDescriptionField(text);
       category.clickAddNewCategoryButton();

    }

    @Step
    public void getTitleofCategory(String title){
        Assert.assertTrue(category.checkIfCategoryIsAdded(title));
    }
}
