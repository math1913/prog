import java.util.Scanner;

//Un programa per jugar al MasterMind.
public class MasterMain {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final static String ENCERTAT = "OOO";
    public final static int LONG_SECRET = 3;
    public static String secret = "";
    public static String resposta = "";
    public static String abc = "abcdefghijklmnopqrstuvwxyz";
    
    //Mètodes associats al problema general
    public static void main(String[] args) {
        CodeGenerator codigo = new CodeGenerator();
        String secret = codigo.generateCode();
        boolean encertat = false;
        Feedback feed = new Feedback();
        HumanPlayer player = new HumanPlayer();
        while (!encertat) {
            resposta = player.makeGuess();
            encertat = feed.getFeedback(secret, resposta);
        }
    }   
}