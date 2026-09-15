package com.devsu.test.steps;

import com.devsu.test.utils.WebSite;
import com.devsu.test.utils.ui.Actions.CarActions;
import com.devsu.test.utils.ui.Actions.LoginActions;
import com.devsu.test.utils.ui.validation.ValidationActions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;

import org.junit.jupiter.api.Assertions;

public class CompraStepDefinitions {


    @Steps(shared = true)
    CarActions carActions;

    @Steps(shared = true)
    ValidationActions validationActions;

    @Dado("agrega {string} productos al carrito")
    public void agrega_dos_productos_al_carrito(String cantidad) {
        for(int i= 0; i <= (Integer.parseInt(cantidad)-1); i++){
            carActions.addProducto(i);
        }
    }

    @Dado("visualiza el carrito, luego dar click en {string}")
    public void visualiza_el_carrito(String button) {
        carActions.whatchCar();
        carActions.clickBUtton(button);
    }

    @Y("completa el formulario de compra con la siguiente información {string}, {string}, {string} y haga click en {string}")
    public void completa_el_formulario_de_compra(String firstName,String lastName, String zip ,String button) {
        carActions.fillForm(firstName, lastName, zip);
        carActions.clickInputButton(button);
    }

    @Entonces("finaliza la compra dando click en {string} y valida  la confirmación {string}")
    public void finaliza_la_compra_hasta_la_confirmación(String button, String message) {
        carActions.clickBUtton(button);

        String mensajeObtenido= carActions.getMessage();

        Assertions.assertEquals(message,mensajeObtenido);
    }
}
