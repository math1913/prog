import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] repeticiones = new int[11];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("Introduce un valor para la posicion " + (i + 1) + "," + (j + 1) + " entre 0 y 10: ");
                matriz[i][j] = sc.nextInt();
                repeticiones[matriz[i][j]]++;
            }
        }
        for (int i = 0; i < repeticiones.length; i++)
            System.out.println("El valor " + i + " ocurre " + repeticiones[i] + " veces");
    }
}
