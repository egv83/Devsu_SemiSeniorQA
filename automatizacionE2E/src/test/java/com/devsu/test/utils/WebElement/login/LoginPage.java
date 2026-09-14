package com.devsu.test.utils.WebElement.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    public WebElementFacade userName;

    @FindBy(id = "password")
    public WebElementFacade password;

    @FindBy(id="login-button")
    public WebElementFacade btnLogin;
    
    public WebElementFacade btnLogin(String value){
        return findBy("//input[@type='submit' and @value='"+value+"']");
    }
}