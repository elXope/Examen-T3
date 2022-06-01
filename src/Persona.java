import java.io.*;

public class Persona implements Serializable {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String domicilio;

    public Persona(String nombre, String apellidos, int edad, String dni, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return nombre +" "+ apellidos +" "+ edad +" "+ dni +" "+ domicilio;
    }

    public void serializar() {
        String nombreFichero = "./" + (nombre + apellidos).replace(" ","") + ".persona";
        File fichero = new File(nombreFichero);
        try {
            fichero.createNewFile();
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(fichero));
            escritor.writeObject(this);
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha podido crear o escribir el fichero.");
        }
    }
}
