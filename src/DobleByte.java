import java.io.*;

public class DobleByte {
    public static void main(String[] args) {
        String nombreFichero = "./JuanPerezPerez.persona";
        try {
            InputStream inputStream = new FileInputStream(nombreFichero);

            File ficheroSalida = new File(nombreFichero + ".double");
            ficheroSalida.createNewFile();
            OutputStream outputStream = new FileOutputStream(ficheroSalida);

            int next;
            while ((next = inputStream.read()) != -1) {
                outputStream.write(next);
                outputStream.write(next);
            }

            inputStream.close();
            outputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero.");
        } catch (IOException e) {
            System.out.println("Ha habido un problema con la creacion o escritura del fichero.");
        }
    }
}
