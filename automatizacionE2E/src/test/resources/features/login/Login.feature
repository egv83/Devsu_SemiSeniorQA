#language: es
# Author: Esteban Vallejo

Característica: Realizar el proceso de login

  Antecedentes:
    Dado el usuario navega al sitio web "https://www.saucedemo.com/"

  @LoginCorrecto
  Esquema del escenario: Realizar la validación al realizar el login con datos correctos
    Cuando ingresa credenciales usuario <user>, clave <password> y da click en "Login"
    Entonces se vasualiza la pantalla de productos
    Ejemplos:
      | user            | password       |
      | 'standard_user' | 'secret_sauce' |

  @LoginErroneo
  Esquema del escenario: Realizar la validación al realizar el login con datos erroneos
    Cuando ingresa credenciales usuario <user>, clave <password> y da click en "Login"
    Entonces se valida el mensaje <message>
    Ejemplos:
      | user            | password       | message                                                                     |
      | 'standard_user' | '12345'        | 'Epic sadface: Username and password do not match any user in this service' |
      | 'usuario'       | 'secret_sauce' | 'Epic sadface: Username and password do not match any user in this service' |
      | ''              | 'secret_sauce' | 'Epic sadface: Username is required'                                        |
      | 'standard_user' | ''             | 'Epic sadface: Password is required'                                        |
      | ''              | ''             | 'Epic sadface: Username is required'                                        |