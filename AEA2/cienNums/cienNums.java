import java.util.Scanner;
public class cienNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas filas quieres que tenga la matriz?");
        int filas = sc.nextInt();
        System.out.println("¿Cuantas columnas quieres que tenga la matriz?");
        int columnas = sc.nextInt();    
        char[][] pares = new char[filas][columnas];
        for (int i = 0; i < pares.length; i++) {
            for (int j = 0; j < pares[i].length; j++) {
                if (j<=i)
                    pares[i][j] = 'x';
                System.out.print(pares[i][j]);
            }
            System.out.println();
        }
    }
}