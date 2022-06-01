import java.io.*;

public class FiltroVocales {
    public static void main(String[] args) {
        String origenNombre = "./Enunciado.md";
        File origen = new File(origenNombre);
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader(origen));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //String destinoNombre = nombreDestino(origenNombre);
        File destino = new File(origenNombre + ".filtrado");
        try {
            destino.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter escritor = null;
        try {
             escritor = new BufferedWriter(new FileWriter(destino));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String linia;
        try {
            while((linia = lector.readLine()) != null) {
                escritor.write(eliminarVocales(linia));
                escritor.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            lector.close();
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String nombreDestino(String origenNombre) {
        String[] nDestino = origenNombre.split("\\.");
        nDestino[nDestino.length - 1] = "filtrado";
        String out = "";
        for (String parte : nDestino) {
            out += parte;
        }
        return out;
    }

    public static String eliminarVocales(String linia) {
        linia = linia.replaceAll("[aeiouAEIOU]","");
        return linia;
    }
}
