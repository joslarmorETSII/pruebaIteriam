# PruebaIteriam

Prueba técnica para proceso de selección de Sanitas en Iteriam.

Para el proceso de trabajo hemos utilizado la metodología gitflow.

Se han creado dos ramas principales, master y develop, estas son las ramas principales, master para el proyecto en producción, y develop con el proyecto que se está desarrollando. Para ejecutar la prueba hemos creado una rama, "feature/Refactorizacion" a partir de develop que tiene el proyecto desarrollado hasta la ultima versión.

En esta rama es donde hemos realizado el primer cambio, la configuración del proyecto a JUnit 5 y a Java 1.8. Trás refactorizar el codigo se realizo una subida a dicha rama.

Cuando la cobertura se completo al 100% se realizado el merge a la ramas develop y master, con el proyecto finalizado.

En este caso al no tener que realizar ningun cambio sobre la rama master, no hay rama creada denominada hotfix.

Se ha añadido la libreria slf4j para subsanar el error mostrado por consola sobre los log.

En cuanto a la refactorización se ha optado por crear una clase de utilidad, donde se agrupen los métodos necesarios para la ejecución e implementación de las pruebas. Simplificando así la clase Enumerada.

Para llevar a cabo la compilación del proyecto se ha de ejecutar el comando "mvn package", esto nos generará en la carpeta target el .jar del proyecto.
