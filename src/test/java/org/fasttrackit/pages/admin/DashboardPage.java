package org.fasttrackit.pages.admin;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage extends PageObject {
    @FindBy(css = "#menu-posts-product > ul > li:nth-child(3) > a")
    private WebElementFacade addNewProduct;

    @FindBy(css="#wp-admin-bar-site-name > a")
    private WebElementFacade frontHomePage;

    @FindBy(css="#menu-posts-product > ul > li:nth-child(4) > a")
    private WebElementFacade categories;

    @FindBy(css = "#menu-comments > a > div.wp-menu-name")
    private WebElementFacade commentsPage;

    @FindBy(css="li.wp-first-item.current > a")
    private WebElementFacade allPosts;



    public void hoveroverProducts() {
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.cssSelector("#menu-posts-product > a > div.wp-menu-name"));
        action.moveToElement(element).perform();

    }
    public void clickfrontHomePage(){
        clickOn(frontHomePage);
    }

    public void clickAddNewProduct(){
        clickOn(addNewProduct);
    }

    public void clickCategories(){
        clickOn(categories);
    }

    public void clickCommentsPage(){
        clickOn(commentsPage);
    }


    public void hoveroverPosts() {
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.cssSelector("#menu-posts > a > div.wp-menu-name"));
        action.moveToElement(element).perform();
    }

    public void clickAllPosts(){
        clickOn(allPosts);
    }




}
