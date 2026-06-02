# integration-tests-separation

Mini proyecto Java Maven para demostrar separacion de tests unitarios e integracion usando:

- Surefire para unit tests.
- Failsafe para integration tests.
- Perfil Maven `integration-tests` para activar los tests de integracion.

## Estructura

```text
repo/
	pom.xml
	src/
		main/java/com/example/service/DummyService.java
		test/java/com/example/service/DummyServiceTest.java
		integration-test/java/com/example/service/DummyServiceIT.java
```

## Comandos

Ejecutar solo tests unitarios:

```bash
mvn clean test
```

Ejecutar unitarios + integracion (perfil activado):

```bash
mvn clean verify -Pintegration-tests
```

Comando minimo solicitado para pipeline/verificacion:

```bash
mvn verify -Pintegration-tests
```

## Convencion de nombres

- Unit tests: clases que terminan en `*Test.java`
	- Ejemplo: `DummyServiceTest`
- Integration tests: clases que terminan en `*IT.java`
	- Ejemplo: `DummyServiceIT`

## Como funciona la separacion

- `maven-surefire-plugin` ejecuta `**/*Test.java` en fase `test`.
- Perfil `integration-tests`:
	- Agrega `src/integration-test/java` como fuente de tests.
	- Activa `maven-failsafe-plugin` para ejecutar `**/*IT.java` en:
		- fase `integration-test`
		- fase `verify`

Sin el perfil, no se ejecutan tests de integracion. Con `-Pintegration-tests`, se ejecutan ambos tipos.
