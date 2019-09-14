El objetivo de este ejercicio es refactorizar la clase `com.mycorp.BrowserManagerEnum`, para cumplir unos criterios determinados.

Como se puede observar, el test asociado a esta clase comprueba un valor para los métodos `getBrowserManager()` y `getDriver()`, a partir del enumerado `BrowserManagerEnum.NONE`. Se ha metido este módulo dentro de un sistema de integración continua y han saltado unos umbrales, que indican que no existe suficiente cobertura por rama para los dos métodos antes mencionados.

El motivo de no pasar por el resto de `case` de ambos switch es que, para ejecutar cualquier otra rama no asociada a `BrowserManagerEnum.NONE`, se requiere de una infraestructura previa, que no existe en el entorno de integración continua (no es el mejor de los entornos de IC), por lo que este entorno es incapaz de ejecutar el código contenido en estos `case`. Se puede comprobar este comportamiento ejecutando el test marcado con @Ignore.

Se requiere realizar las refactorizaciones oportunas para poder tener cobertura de las ramas que faltan en el sistema de integración continua, teniendo en cuenta que el contenido de estas no puede ser ejecutado dentro del susodicho sistema de IC.


### Requisitos

* Conseguir cobertura por todas las ramas para los métodos `getBrowserManager()` y `getDriver()` de  la clase `com.mycorp.BrowserManagerEnum`.

* **El entregable debe compilar**, en una instalación de maven totalmente limpia, debe indicarse en un fichero README los pasos necesarios para generar el jar final (no hace falta mucho detalle).

* El tiempo para realizar el ejercicio es de hasta cuatro horas a partir de la recepción del correo. Posteriormente debe notificarse una URL de *github* (o similares) a la dirección de arquitecturainternet@sanitas.es donde validar la prueba.

### Notas adicionales

* **NO se busca la solución ideal del ejercicio**; lo que se busca ver es la manera en que se afronta el problema. En este sentido, no hay una solución correcta, es mucho más interesante el histórico de Git como hilo conductor de lo que se va haciendo. *Tener un único commit con todas las actuaciones efectuadas no es aconsejable*.

* **Hay libertad total para hacer cualquier cosa que mejore el código** (añadir tantas nuevas librerías, clases, métodos, variables como se crea necesario, así como actualizar plugins, configuraciones, etc.).

* Si se desea ver un informe de cobertura del módulo en cualquier momento, se puede obtener ejecutando el comando `$MAVEN_HOME/bin/mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent test org.jacoco:jacoco-maven-plugin:report`. El informe queda generado en la subcarpeta `./target/site/jacoco`.

* *Reservar los últimos 15 minutos para indicar, en el correo enviado, las acciones adicionales que podrían realizarse para seguir mejorando la clase*.