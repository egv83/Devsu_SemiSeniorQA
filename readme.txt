******************************************************************
*  INSTRUCCIONES DE EJECUCIÓN SUITE DE AUTOMATIZACIÓN (UI & API) *
******************************************************************

/////////////////
/ Requisitos:   /
/////////////////
1- Tener instalado Java JDK 21 y configurado en las variables de entorno JAVA_HOME.
2- Tener instalado Maven y configurado en las variables de entorno MAVEN_HOME.
3- Un IDE para ver el código (IntelliJ o Eclipse)

/////////////////////////
/Pasos para la ejecución/
/////////////////////////
1- Descomprirmi el archivo .zip o .rar en la ubicacion que selecciones.
2- Para ejecutar desde el terminal abrir CMD u la terminal de Linux/Mac
3- Ir hasta la ruta donde se descomprimio el archivo ejm: c:/proyectos/Devsu_SemiSeniorQA/

/////////////////////
/Automatización Test/
/////////////////////
1- Nos diriginos hasta la carpeta automatizacionE2E, aqui esta el archivo pom.
2- Ejecutamos los siguientes comandos
    1. mvn clean install  para instalar la dependencias
    2. mvn clean compile  para compilar el proyecto
    3. mvn clean verify  para ejecutar el test realizando una limpieza previa
    4. opcional si se quiere ejecutar el test especifico: mvn clean verify "-Dcucumber.filter.tags=@Comprar

3- Para visualizar el reporte del test se puede realizar de dos formas
    1. ir a la carpeta target del proyecto tomando en cuenta esta ruta
        /target/site/serenity/index.html
    2. la otra via es al final del test en la linea de comados nos da una ruta 
       la cual podemos dar click o copiar y pegar en el navegador para acceder
       ejm:  file:///H:/PROYECTOS/QA_TEST/Devsu_SemiSeniorQA/automatizacionE2E/target/site/serenity/index.html

//////////
/API Test/
//////////
1- Nos diriginos hasta la carpeta ApiTest, aqui esta el archivo pom.
2- Ejecutamos los siguientes comandos
    1. mvn clean install  para instalar la dependencias
    2. mvn clean compile  para compilar el proyecto
    3. para ejecutar el test se usa el comando mvn clean test
Para visualizar el reporte del test se puede realizar de dos formas
    1. ir a la carpeta target del proyecto tomando en cuenta esta ruta
        /target/karate-reports/karate-summary.html
    2. la otra via es al final del test en la linea de comados nos da una ruta 
       la cual podemos dar click o copiar y pegar en el navegador para acceder
       ejm:  file:///H:/PROYECTOS/QA_TEST/Devsu_SemiSeniorQA/ApiTest/target/karate-reports/karate-summary.html