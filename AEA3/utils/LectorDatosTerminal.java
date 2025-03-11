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
    public int leerIntPos(){
        boolean noleido = true;
        int res;
        while(noleido) {

            if (s.hasNextInt()) {
                res = s.nextInt();
                if(res > 0) {
                    noleido = false;
                    return res;
                }
                else {
                    s.next();
                }
            } else {
                s.next();
            }
        }
        return 0;
    }

    public char leerChar(){
        boolean noleido = true;
        char ch = s.next().charAt(0);
        while(noleido) {
            if (Character.isLetter(ch)) {
                return ch;
            } else {
                s.next();
            }
        }
        return '0';
    }

    //////////////////////// NO FUNCIONA //////////////////////////
    public String leerString(){
        boolean noleido = true;
        while(noleido) {
            if ((!s.hasNextDouble()) && (!s.hasNextInt())) {
                return s.nextLine();
            } else {
                s.next();
            }
        }
        return "0";
    }
}
