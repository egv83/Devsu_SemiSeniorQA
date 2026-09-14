package com.devsu.test.utils.ui.Actions;

import com.devsu.test.utils.WebElement.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginActions {

    private LoginPage loginPage;

    @Step("Ingresar usuario")
    public void inputUserName(String user){
        loginPage.userName.sendKeys(user);
    }

    @Step("Ingresar clave")
    public  void inputPassword(String password){
        loginPage.password.sendKeys(password);
    }

    @Step("Cick en login")
    public void clickLogin(String boton){
        loginPage.btnLogin(boton).click();
    }

}
