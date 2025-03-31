import java.util.Scanner;

public class HumanPlayer extends Player{
    
    @Override
    public String makeGuess() {
        Scanner lector = new Scanner(System.in);
        boolean lecturaOk = false;
        String res = null;
        do {
            System.out.print("Escriu " + MasterMain.LONG_SECRET + " lletres miníscules: ");
            res = lector.next();
            lector.nextLine();
            lecturaOk = comprovarResposta(res);
            if (!lecturaOk) {
                System.out.println("Aquesta resposta no és vàlida!");
            }
        } while (!lecturaOk);
        return res;
    }
    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != MasterMain.LONG_SECRET) {
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if (-1 == MasterMain.abc.indexOf(c)) {
                return false;
            }
        }
        return true;
    }
} 