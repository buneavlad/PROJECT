package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.SearchPage;
import org.junit.Assert;

public class SearchSteps {
    private Homepage homepage;
    private SearchPage searchPage;

    @Step
    public void searchProduct(String name) {
        homepage.open();
        homepage.clickSearchButton();
        homepage.setSearchField(name);
        homepage.clickSearchFieldButton();
    }

    @Step
    public void findProducts(String name, String name1, String name2) {
        searchPage.getProductName(name);
        searchPage.getProductName(name1);
        searchPage.getProductName(name2);
    }

    @Step
    public void checkIfProductIsThere(String productName){
        boolean title= searchPage.getProductName(productName);
        Assert.assertTrue(searchPage.getProductName(productName));



    }


}
