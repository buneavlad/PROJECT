package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa3.fasttrackit.org:8008/blog")
public class BlogPage extends PageObject {
    @FindBy(css="textarea[id=\"comment\"]")
    private WebElementFacade commentsField;

    @FindBy(css="input[id=\"author\"]")
    private WebElementFacade nameField;

    @FindBy(css="input[id=\"email\"]")
    private WebElementFacade emailField;

    @FindBy(id="submit")
    private WebElementFacade clickPostComment;

    @FindBy(css="li article")
    private List<WebElementFacade> nameLists;

    public void setCommentsFieldField(String comment){
        typeInto(commentsField,comment);

    }
    public void setNameField(String name){
        typeInto(nameField,name);
    }
    public void setEmailField(String email){
        typeInto(emailField,email);
    }
    public void clickPostCommentButton(){
        clickOn(clickPostComment);
    }


    public boolean getNameOfCommentator(String getname){
        for(WebElementFacade elementFacade:nameLists){
            String name =elementFacade.findElement(By.cssSelector("b[class=\"fn\"]")).getText();
            if(getname.contains(name)){
                return true;
            }

        }return false;
    }


    }


