package com.devsu.test.utils.ui.Actions;

import com.devsu.test.utils.WebElement.car.CarPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class CarActions {

    private CarPage carPage;

    @Step("Agregar items")
    public void addProducto(int index) {
        Actions actions = new Actions(carPage.getDriver());
        actions.click(carPage.products.get(index)).perform();
    }

    @Step("Ver carrito")
    public void whatchCar() {
        carPage.car.click();
    }

    @Step("Checkout")
    public void clickBUtton(String text) {
        carPage.button(text).click();
    }

    @Step("Fill data form")
    public void fillForm(String firstName, String lastName, String zip) {
        carPage.insertDataForm(firstName, lastName, zip);
    }

    @Step("Click continue")
    public void clickInputButton(String text){
        carPage.inputButton(text).click();
    }

    @Step("obtener el mensaje")
    public String getMessage(){
        return carPage.getMessageText();
    }
}
