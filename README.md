# PruebaIteriam

Prueba técnica para proceso de selección de Sanitas en Iteriam.

Para el proceso de trabajo he utilizado la metodología Gitflow.

He creado dos ramas principales, master y develop, master para el proyecto en producción y develop con el proyecto que se está desarrollando hasta la última versión. Para realizar la prueba he creado una rama "feature/Refactorizacion" a partir de develop.

En esta rama es donde he realizado el primer cambio, la configuración del proyecto a JUnit 5 y a Java 1.8, trás refactorizar el código se realizó una subida a dicha rama.

Cuando la cobertura se completó al 100%, realicé el merge a la ramas develop y master, con el proyecto finalizado.

Para simular una corrección en el entorno de producción, se dejó un caso sin testear, una vez localizado el problema se creó a partir de master la rama "hotfix/caseIE" que solventa el inconveniente. Trás su resolución se mergea con la rama master.

Se ha añadido la librería slf4j para subsanar el error mostrado por consola sobre los log.

En cuanto a la refactorización se ha optado por crear una clase de utilidad, donde se agrupen los métodos necesarios para la ejecución e implementación de las pruebas. Simplificando así la clase Enumerada.

Esta clase de utilidad tiene dos métodos principales:

1.- getWebDriverByBrowser(), recibe por parámetro DesiredCapabilities, que es común para todas las pruebas y el browser a ejecutar por el test, dependiendo del tipo de browser se utiliza un método auxiliar que crea e inicializa el driver del navegador a ejecutar. 

2.- configureSystem(), dependiendo del browser que se esté ejecutando, configura el sistema para que se pueda realizar la prueba, ya que cada browser tiene configuraciones independientes como el driver que lo ejecuta (chrome, gecko y edge).

Por otro lado, se ha utilizado SonarLint para el aseguramiento y optimización del código, dando como resultado 0 bugs, code smell, etc.

Para llevar a cabo la compilación del proyecto se ha de ejecutar el comando:

--> mvn package

esto nos generará en la carpeta target el .jar del proyecto.
