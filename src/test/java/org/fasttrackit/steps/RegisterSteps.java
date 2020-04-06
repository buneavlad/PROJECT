package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {
    private Homepage homepage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    @Step
    public void navigateToRegisterPage(){
        homepage.open();
        homepage.signInRegisterButton();
    }
    @Step
    public void setCredentials (String email, String password){
        registerPage.setEmailField(email);
        registerPage.setPasswordField(password);
    }
    @Step
    public void clickonRegisterButton(){
        registerPage.clickRegister();
    }
    @Step
    public void getWelcomeMesage(String expected){
        String message = registerPage.welcomeMessage();
        Assert.assertEquals(expected,message);

    }
}
