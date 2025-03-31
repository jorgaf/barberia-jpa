# Barbería JPA

Es una aplicación de consola con fines educativos que usa Java Persistence API (JPA) para interactuar con una base de datos relacional (MySQL) que modelo el comportamiento básico de las cistas de una barbería, modelando los datos de:

- Clientes
- Barberos
- Servicios
- Citas

La única funcionalidad creada hasta el momento es la creación de una nuevo servicio.

¿Qué cambios se debería realizar para que la aplicación permita crear una nueva cita?

Respuesta:

Es necesario agregar un mecanismo para recuperar la información que se necesita para crear una nueva cita, es decir,
recuperar: un cliente, un barbero y un servicio. En la implementación se usaron *NamedQuery* en las respectivas clases, 
así:

- [Barbero.java](src/main/java/ec/edu/utpl/carreras/computacion/model/Barbero.java#L7)
- [Cliente.java](src/main/java/ec/edu/utpl/carreras/computacion/model/Barbero.java#L8)
- [Servicio.java](src/main/java/ec/edu/utpl/carreras/computacion/model/Servicio.java#L7)

La recuperación de las entidades y uso de las *NamedQuery*, usando *TypedQuery*, se hizo en la clase App.java, los 
cambios inician en la [línea 20](src/main/java/ec/edu/utpl/carreras/computacion/App.java#L20). Recuerde revisar los
import que se necesitan.

¿Es correcta la implementación de la fecha de la cita? Analice y proponga otras opciones (Recuerde que está trabajando 
en consola).

