import java.util.Arrays;
import java.util.Scanner;

public class Feedback {

    public char[] generarPista(char[] code, char[] intento) {
        char[] res = new char[Game.LONG_SECRET];
        for (int i = 0; i < res.length; i++) {
            if (code[i] == intento[i]) {
                res[i] = MasterMain.TOT_CORRECTE;
            } else if (esta(code, intento[i])) {
                res[i] = MasterMain.MALA_POSICIO;
            } else {
                res[i] = MasterMain.INCORRECTE;
            }
        }
        return res;
    }
    public boolean esta(char[] code, char valor){
        for(int i = 0; i < Game.LONG_SECRET; i++)
            if( code[i] == valor)
                return true;
        return false;
    }

    public boolean getFeedback(char[] secret, char[] resposta) {
        char[] feedback = generarPista(secret, resposta);
        System.out.print("FeedBack: [ ");
        for(int i = 0; i < feedback.length; i++)
            System.out.print(feedback[i]);
        System.out.println( "].");

        if (Arrays.equals(secret, resposta)) {
            System.out.println("Correcto! Has ganado!");
            return true;
        } else {
            System.out.println("Incorrecto!");
            return false;
        }
    }
}
