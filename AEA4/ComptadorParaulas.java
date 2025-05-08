import java.io.*;
import java.util.Scanner;
public class ComptadorParaules {

    public static void main(String[] args) {
        String entradaTxt = "entrada.txt";
        String salidaTxt = "salida.txt";
        int totPal = 0;

        Scanner lector = null;
        try {
            File archivo = new File(entradaTxt);
            lector = new Scanner(archivo);

            while (lector.hasNext()) {
                lector.next();
                totPal++;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo '" + entradaTxt + " no existe");
            return;
        } finally {
            if (lector != null) {
                lector.close();
            }
        }

        PrintWriter escritor = null;
        try {
            escritor = new PrintWriter(salidaTxt);
            escritor.println("El archivo tiene " + totPal + " palabras.");
            System.out.println("Se escribio en: " + salidaTxt);
        } catch (IOException e) {
            System.err.println("Se produjo un error durante la escritura: " + e.getMessage());
        } finally {
            if (escritor != null) {
                escritor.close();
            }
        }
    }
}

