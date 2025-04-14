import java.util.Scanner;

//Un programa per jugar al MasterMind.
public class MasterMain {

    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public static char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    //Mètodes associats al problema general
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En que dificultad quieres jugar?\n1. Adulto\n2. Niño");
        Game juego = new Game(sc.nextInt());
        juego.jugar();
    }   
}
