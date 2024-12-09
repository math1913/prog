import java.util.Scanner;

public class tresEnRaya {
    public static void main(String[] args){
        int[][] matriz = new int[3][3];
        int[][] interfaz = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int turno = 1;
        int x;
        int y;
        int k = 2;
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = k;
                k++;
            }
        for (int i = 0; i < interfaz.length; i++)
       for (int j = 0; j < interfaz[i].length; j++){
            interfaz[i][j] = 0;
        }
        while(
            !(matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) && 
            !(matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) &&
            !(matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2]) &&
            !(matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2]) &&
            !(matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2]) &&
            !(matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0]) &&
            !(matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1]) &&
            !(matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2])){
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[i].length; j++)
                    System.out.print("[" + interfaz[i][j] + "] ");
                System.out.println();
            }
            System.out.print("En que fila quieres poner el " + turno + ": ");
            x = sc.nextInt() - 1;
            System.out.print("En que columna quieres poner el " + turno + ": ");
            y = sc.nextInt() - 1;
            matriz[x][y] = turno;
            interfaz[x][y] = turno;
            if (turno == 2)
                turno = 1;
            else 
                turno = 2;
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++)
                System.out.print("[" + interfaz[i][j] + "] ");
            System.out.println();
        }
        if (turno == 0)
            System.out.println("El 1 ha ganado");
        else
            System.out.println("El 0 ha ganado");
    }
}


