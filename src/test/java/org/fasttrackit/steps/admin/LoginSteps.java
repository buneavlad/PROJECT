package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.admin.LoginPage;
import org.fasttrackit.pages.admin.ProductPage;

public class LoginSteps {

    private LoginPage login;
    private ProductPage product;


    @Step
    public void LoginInAdmin (String user,String password){
        login.open();
        login.setUserField(user);
        login.setPasswordField(password);
        login.clickLoginButton();
    }




}
