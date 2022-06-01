# Ejercicio 1 - DobleByte (2.5 puntos).

Crea un fichero "DobleByte.java"

Debes crear un programa que duplique byte a byte un fichero cuyo nombre debe pasarse por la línea de comandos. El fichero de salida debe añadir al final del nombre la extensión ".doble". El fichero original debe permanecer inalterado.

* Haz commit.

# Ejercicio 2 - FiltroVocales (2.5 puntos)

Crea un fichero "FiltroVocales.java"

Debes crear un programa que elimine las vocales sin acentuar de un fichero. El fichero de salida debe añadir la extensión ".filtrado" al nombre del fichero original.

* Haz commit.

# Ejercicio 3 - Persona (2.5 puntos)

Crea una clase "Persona" con los siguientes atributos:

* Nombre
* Apellidos
* Edad
* DNI
* Domicilio

Los atributos no deben ser visibles desde fuera de la clase.

Crea el constructor adecuado.

Crea los getters y setters para todos los atributos.

Crea el método adecuado para que Java pueda manejar un objeto de la clase Persona como una cadena de texto.

Crea un método "serializar" que escriba el objeto serializado en un fichero cuyo nombre debe ser el resultado de unir nombre y apellidos sin espacios. El fichero también tiene que tener una extensión ".persona".

Crea una clase TestPersona.java en la que se construyan dos objetos y se llame al método "serializar" de los mismos.

* Haz commit.

# Ejercicio 4 - PersonaXML (2.5 puntos)

Crea una interfaz "GenerableXML" con el siguiente método:

> public void generarXML()

Crea una clase PersonaXML que herede de Persona (del ejercicio anterior). Esta clase debe implementar la interfaz "GenerableXML"

El método implementado debe permitir generar en un fichero el XML correspondiente a todos los campos del objeto PersonaXML. El nombre del fichero generado debe ser el resultado de concatenar el nombre y la edad sin espacios. La extensión del fichero debe ser ".xml".

No hay limitación en las clases que debes usar para generar el XML.

Crea la clase TestPersonaXML y prueba con un objeto.

* Haz commit.
