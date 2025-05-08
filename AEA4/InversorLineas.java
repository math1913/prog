import java.io.*;
import java.util.Scanner;

public class InversorLineas {

    public static void main(String[] args) {
        String archivoEntrada = "archivo.txt";
        String archivoSalida = "archivoInvertido.txt";

        Scanner lector = null;
        PrintWriter escritor = null;

        try {
            File entrada = new File(archivoEntrada);
            lector = new Scanner(entrada);

            escritor = new PrintWriter(archivoSalida);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                for (int i = linea.length() - 1; i >= 0; i--) {
                    escritor.print(linea.charAt(i));
                }
                escritor.println();
            }

            System.out.println("Las líneas se han invertido correctamente.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: el archivo '" + archivoEntrada + "' no se ha encontrado.");
        } finally {
            if (lector != null) lector.close();
            if (escritor != null) escritor.close();
        }
    }
}
