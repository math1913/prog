import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese las columnas de la matriz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matriz = new int[5][n];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)(Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}