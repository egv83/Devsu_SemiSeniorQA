#language: es
# Author: Esteban Vallejo

Característica: Realizar la compra de dos articulos

  Antecedentes:
    Dado el usuario navega al sitio web "https://www.saucedemo.com/"

  @Comprar
  Esquema del escenario: Realizar la compra de productos
    Cuando ingresa credenciales usuario "standard_user", clave "secret_sauce" y da click en "Login"
    Y agrega "2" productos al carrito
    Y visualiza el carrito, luego dar click en "Checkout"
    Y completa el formulario de compra con la siguiente información <nombre>, <apellido>, <zip> y haga click en "Continue"
    Entonces finaliza la compra dando click en "Finish" y valida  la confirmación "Thank you for your order!"
    Ejemplos:
      | nombre    | apellido  | zip      |
      | 'Esteban' | 'Vallejo' | '100107' |
