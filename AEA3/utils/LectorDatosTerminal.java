package AEA3.utils;
import java.util.Scanner;

public class LectorDatosTerminal {
    private Scanner s = new Scanner(System.in);
    public double leerDouble(){
        boolean noleido = true;
        while(noleido) {
            if (s.hasNextDouble()) {
                noleido = false;
                return s.nextDouble();
            } else {
                s.next();
            }
        }
        return 0;
    }
    public int leerInt(){
        boolean noleido = true;
        while(noleido) {
            if (s.hasNextInt()) {
                noleido = false;
                return s.nextInt();
            } else {
                s.next();
            }
        }
        return 0;
    }

}
