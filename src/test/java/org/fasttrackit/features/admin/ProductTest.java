package org.fasttrackit.features.admin;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.admin.LoginSteps;
import org.fasttrackit.steps.admin.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ProductSteps productSteps;

    @Test

    public void AddProduct(){
        String name =RandomStringUtils.randomAlphabetic(15);
        String text = RandomStringUtils.randomAlphabetic(20);
        loginSteps.LoginInAdmin("admin","parola11");
        productSteps.addProduct(name,text,"10");
      productSteps.checkProductMessage("Product published. View Product\n" +
                "Dismiss this notice.");
    }

    @Test
    public void RemoveProduct(){
        String text = RandomStringUtils.randomAlphabetic(20);
        loginSteps.LoginInAdmin("admin","parola11");
        productSteps.addProduct("testfast",text,"10");
        productSteps.moveToTrash();
        productSteps.getRemoveProductMessage("1 product moved to the Trash. Undo");

    }

    @Test
    public void AddnewCategoryOfProducts(){
        String text = RandomStringUtils.randomAlphabetic(10);
        String name = RandomStringUtils.randomAlphabetic(4);
        loginSteps.LoginInAdmin("admin","parola11");
        productSteps.addNewCategory(name,text);
        productSteps.getTitleofCategory(name);


    }


}
