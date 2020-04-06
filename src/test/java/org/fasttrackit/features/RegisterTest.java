package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validRegister(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setCredentials("vlad123456@mailinator.com","testfast12345");
        registerSteps.getWelcomeMesage("Hello vlad123456 (not vlad123456? Log out)");

    }
}
