import java.util.Scanner;
import java.util.Random;

public class HumanPlayer extends Player{
    
    @Override
    public char[] makeGuess() {
        Scanner lector = new Scanner(System.in);
        boolean lecturaOk = false;
        char[] res = new char[Game.LONG_SECRET];
        
        String st;
        do {
            System.out.print("Escriu " + Game.LONG_SECRET + " lletres miníscules: ");
            st = lector.next();
            lector.nextLine();
            lecturaOk = comprovarResposta(res);
            if (!lecturaOk) {
                System.out.println("Aquesta resposta no és vàlida!");
            }
        } while (!lecturaOk);
        res = st.toCharArray();
        return res;
    }
    
    public boolean comprovarResposta(char[] resposta) {
        if (resposta.length != Game.LONG_SECRET)
            return false;
        Feedback f = new Feedback();
        for (int i = 0; i < resposta.length; i++)
            if (!f.esta(resposta, resposta[i]))
                return false;
        return true;
    }
} 