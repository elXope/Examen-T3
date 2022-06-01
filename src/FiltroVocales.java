import java.io.*;

public class FiltroVocales {
    public static void main(String[] args) {
        String origenNombre = "./Enunciado.md";
        File origen = new File(origenNombre);
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader(origen));
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero.");
            return;
        }

        // Asumo que el fichero de entrada tiene extension
        File destino = new File(DobleByte.nombreSinExtension(origenNombre) + ".filtrado");
        try {
            destino.createNewFile();
        } catch (IOException e) {
            System.out.println("No se ha podido crear el nuevo fichero.");
            return;
        }

        BufferedWriter escritor = null;
        String linia;
        try {
            escritor = new BufferedWriter(new FileWriter(destino));
            while((linia = lector.readLine()) != null) {
                escritor.write(eliminarVocales(linia));
                escritor.write("\n");
            }
        } catch (IOException e) {
            System.out.println("No se ha encontrado el fichero de destino o no hay espacio.");
        }

        try {
            lector.close();
            escritor.close();
        } catch (IOException e) {
            System.out.println("Problemas en la escritura del fichero.");
        }
    }

    public static String eliminarVocales(String linia) {
        linia = linia.replaceAll("[aeiouAEIOU]","");
        return linia;
    }
}
