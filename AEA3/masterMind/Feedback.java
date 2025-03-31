import java.util.Scanner;

public class Feedback {
    public String generarPista(String s, String r) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res += MasterMain.TOT_CORRECTE;
            } else if (s.indexOf(charResposta) != -1) {
                res += MasterMain.MALA_POSICIO;
            } else {
                res += MasterMain.INCORRECTE;
            }
        }
        return res;
    }

    public boolean getFeedback(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "].");
        if (resposta.equals(secret)) {
            System.out.println("Has encertat!");
            fi = true;
        } else {
            System.out.println("Continua intentan!");
        }
        return fi;
    }
}
