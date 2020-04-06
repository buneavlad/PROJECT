package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest extends Constants {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLogin(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(USER_EMAIL, USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkWelcomeMessage("Hello vladovidiubunea (not vladovidiubunea? Log out)");


    }

    @Test
    public void TestInvalidPasswordLogin(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(USER_EMAIL, "123456");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: The password you entered for the email address vladovidiubunea@gmail.com is incorrect. Lost your password?");


    }
    @Test
    public void TestInvalidEmailLogin(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials("asdf@gmail.com", "buneavlad12345");
        loginSteps.clickLogin();
        loginSteps.checkErrorMessage("ERROR: Invalid email address. Lost your password?");

    }


}
