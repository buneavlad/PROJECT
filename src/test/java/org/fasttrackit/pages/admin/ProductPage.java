package org.fasttrackit.pages.admin;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class ProductPage extends PageObject {



    @FindBy(id="title")
    private WebElementFacade addTitle;


    @FindBy(id="content")
    private WebElementFacade addContent;

    @FindBy(css="input[name=\"_regular_price\"]")
    private WebElementFacade addPrice;

    @FindBy(id="publish")
    private WebElementFacade publishButton;

    @FindBy(id="message")
    private WebElementFacade productMessage;


    public void addTitle(String name){
        typeInto(addTitle,name);
    }

    public void addContent(String text){
        typeInto(addContent,text);
    }

    public void setPrice(String price){
        typeInto(addPrice,price);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,-250)", "");
    }
    public void clickPublishButton(){
        publishButton.withTimeoutOf(5,TimeUnit.SECONDS).waitUntilClickable();
        clickOn(publishButton);
    }

    public String checkProductMessage(){
        return productMessage.getText();
    }






}
