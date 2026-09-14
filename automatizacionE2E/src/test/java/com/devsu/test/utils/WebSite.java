package com.devsu.test.utils;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {
    @Steps(shared = true)
    PageObject pageObject;

    @Step("Ir al sitio web")
    public void navigateTo(String url){
        pageObject.setDefaultBaseUrl(url);
        pageObject.open();
    }
}
