package com.devsu.test.steps;

import com.devsu.test.utils.WebSite;
import com.devsu.test.utils.ui.Actions.LoginActions;
import com.devsu.test.utils.ui.validation.ValidationActions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class LoginStepDefinitions {

    @Steps(shared = true)
    WebSite webSite;

    @Steps(shared = true)
    LoginActions loginActions;

    @Steps(shared = true)
    ValidationActions validationActions;

    @Dado("el usuario navega al sitio web {string}")
    public void el_usuario_navega_al_sitio_web(String url) {
        webSite.navigateTo(url);
    }

    @Cuando("ingresa credenciales usuario {string}, clave {string} y da click en {string}")
    public void ingresa_credenciales_clave_y_da_click_en(String user, String password, String button) {
        loginActions.inputUserName(user);
        loginActions.inputPassword(password);
        loginActions.clickLogin(button);
    }

    @Entonces("se valida el mensaje {string}")
    public void se_valida_el_mensaje(String message) {
        String getMessage = validationActions.getErrorMessage();
        Assertions.assertEquals(message,getMessage);
    }

    @Entonces("se vasualiza la pantalla de productos")
    public void se_vasualiza_la_pantalla_de_productos() {
        Assertions.assertTrue(validationActions.titleIsVisible());
    }
}
