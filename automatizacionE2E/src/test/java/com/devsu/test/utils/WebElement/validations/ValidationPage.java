package com.devsu.test.utils.WebElement.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div/span[@class='title']")
    public WebElementFacade lblProduct;

//    @FindBy(xpath = "//h2[@class='complete-header']")
//    public WebElementFacade messageLabel;


}
