
public class parImpar {
    public static void main(String[] args) {
        int[][] matriz = new int[4][19];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                if (i%2 == 0 && j %2 == 0) 
                    matriz[i][j] = 1;
                else if (i%2 == 0 && j %2 == 1) 
                    matriz[i][j] = 2;
                else if (i%2 == 1 && j %2 == 0)
                    matriz[i][j] = 3;
                else
                    matriz[i][j] = 4;
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
}