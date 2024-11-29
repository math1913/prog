import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las columnas de la matriz: ");
        int n = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz: ");
        int m = sc.nextInt();
        int[][] matriz1 = new int[n][m];
        int[][] matriz2 = new int[n][m];
        int[][] matrizRes = new int[n][m];
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j] = (int)(Math.random() * 10);
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }  
        System.out.println("\n");
        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                matriz2[i][j] = (int)(Math.random() * 10);
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }  
        System.out.println("\n");
        System.out.println("Resultado: ");
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                matrizRes[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(matrizRes[i][j] + " ");
            }
            System.out.println();
        }    
        System.out.println("\n");
    }
}
