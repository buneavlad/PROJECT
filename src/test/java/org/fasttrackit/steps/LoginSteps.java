package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;
import org.fasttrackit.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps {
    private Homepage homepage;
    private LoginPage loginPage;

    @Step
    public void navigateToLoginPage() {
        homepage.open();
        homepage.signInRegisterButton();

    }

    @Step
    public void setCredentials(String email,String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);

    }

    @Step
    public void clickLogin(){
        loginPage.setLoginButton();
    }

    @Step
    public void checkWelcomeMessage(String expected){
        String message=loginPage.welcomeMessage();
        Assert.assertEquals(expected,message);
    }

    @Step
    public void checkErrorMessage(String expected){
        String message=loginPage.errorMessage();
        Assert.assertEquals(expected,message);

    }

    @Step
    public void resetPasword(String user){
        loginPage.clickLostPassword();
        loginPage.setEmailOrUsernameRecoveryField(user);
        loginPage.clickResetPassword();
    }

    @Step
    public void resetPasswordMessage(String expected){
        String text=loginPage.resetMesasge();
        Assert.assertEquals(expected,text);
    }



}
