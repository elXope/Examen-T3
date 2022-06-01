import java.io.*;

public class DobleByte {
    public static void main(String[] args) {
        String nombreFichero = "./Enunciado.md"; // No he sabut posar-ho des del terminal
        try {
            InputStream inputStream = new FileInputStream(nombreFichero);

            //Asumo que el fichero de entrada tiene extension
            File ficheroSalida = new File(nombreSinExtension(nombreFichero) + ".double");
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
    
    public static String nombreSinExtension(String nombre) {
        String out = "";
        boolean punto = false;
        for (int i = nombre.length() - 1; i >= 0; i--) {
            if (!punto && nombre.charAt(i) == '.') {
                punto = true;
            } else if (punto) {
                out = nombre.charAt(i) + out;
            }
        }
        return out;
    }
}
