# PruebaIteriam

Prueba técnica para proceso de selección de Sanitas en Iteriam.

Para el proceso de trabajo he utilizado la metodología gitflow.

He creado dos ramas principales, master y develop, master para el proyecto en producción, y develop con el proyecto que se está desarrollando has la ultima versión. Para realizar la prueba he creado una rama "feature/Refactorizacion" a partir de develop.

En esta rama es donde he realizado el primer cambio, la configuración del proyecto a JUnit 5 y a Java 1.8, trás refactorizar el código se realizo una subida a dicha rama.

Cuando la cobertura se completó al 100% realicé el merge a la ramas develop y master, con el proyecto finalizado.

En este caso al no tener que realizar ningun cambio sobre la rama master debido a alguna incidencia, no hay rama creada denominada hotfix.

Se ha añadido la libreria slf4j para subsanar el error mostrado por consola sobre los log.

En cuanto a la refactorización se ha optado por crear una clase de utilidad, donde se agrupen los métodos necesarios para la ejecución e implementación de las pruebas. Simplificando así la clase Enumerada.

Esta clase utilidad tiene dos métodos principales:

1.- getWebDriverByBrowser(), recibe por parámetro DesiredCapabilities, que es común para todas las pruebas y el browser a ejecutar por el test, dependiendo del tipo de browser se utiliza un método auxiliar que crea e inicializa el driver del navegador a ejecutar. 

2.- configureSystem(), dependiendo del browser que se esté ejecutando, configura el sistema para que se pueda realizar la prueba, ya que cada browser tiene configuraciones independientes como el driver que lo ejecuta (chrome, gecko y edge).

Para llevar a cabo la compilación del proyecto se ha de ejecutar el comando:

--> mvn package

esto nos generará en la carpeta target el .jar del proyecto.
