package com.devsu.test.utils.ui.validation;

import com.devsu.test.utils.WebElement.validations.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationActions {

    private ValidationPage validationPage;

    @Step("se ve titulo")
    public Boolean titleIsVisible(){
        return validationPage.lblProduct.isDisplayed();
    }

}
