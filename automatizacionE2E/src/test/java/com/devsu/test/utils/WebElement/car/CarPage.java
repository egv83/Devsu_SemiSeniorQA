package com.devsu.test.utils.WebElement.car;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class CarPage extends PageObject {

    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory ']")
    public List<WebElementFacade> products;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElementFacade car;


    public WebElementFacade button(String text){
        return findBy("//button[text()='"+text+"']");
    }

    public WebElementFacade inputButton(String text){
        return findBy("//input[@value='"+text+"']");
    }

    public void insertDataForm(String firstName, String lastName, String zip){
        find(By.xpath("//input[@id='first-name']")).type(firstName);
        find(By.xpath("//input[@id='last-name']")).type(lastName);
        find(By.xpath("//input[@id='postal-code']")).type(zip);
    }

    public String getMessageText(){
        return find(By.xpath("//h2[@class='complete-header']")).getText();
    }
}
