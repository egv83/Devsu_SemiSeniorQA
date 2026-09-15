#Author: Esteban Vallejo

Feature: Prueba de API con karate

  Background:
    Given url 'https://petstore.swagger.io/v2'


    Scenario: Añadir una mascota a la tienda de forma exitosa
    Given path 'pet'
    And request
      """
      {
        "id": 959296,
        "category": {
          "id": 1,
          "name": "perro"
        },
        "name": "Mia Cori",
        "photoUrls": [
          "https://www.magnific.com/es/fotos-vectores-gratis/perro-jpg"
        ],
        "tags": [
          {
            "id": 2,
            "name": "Adulto"
          }
        ],
        "status": "available"
      }
      """
    When method post
    Then status 200
    And match response.name == 'Mia Cori'

    Scenario: Se realiza la consulta de la mascota por el id
      Given path 'pet', 959296
      When method get
      Then status 200

    Scenario: Actualizar el nombre y el estado de la mascota a vendido
      Given path 'pet', 959296
      And form field name = 'Peluza Vallejo'
      And form field status = 'sold'
      When method post
      Then status 200
      And match response.message == '959296'

    Scenario: Consultar la mascota por el estado
      Given path '/pet/findByStatus'
      And param status = 'sold'
      When method get
      Then status 200

    Scenario: Consultar la mascota actualizada y en estado sold
      Given path 'pet', 959296
      When method get
      Then status 200
      And match response.name == 'Peluza Vallejo'
      And match response.status == 'sold'

    Scenario: Consultar una mascora por un id no existente
      Given path 'pet', 9999999
      When method get
      Then status 404

    Scenario: Consultar una mascora por id obteniendo error 400
      Given path 'pet', 'dddd'
      When method get
      Then status 400