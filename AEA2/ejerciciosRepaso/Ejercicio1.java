import javax.swing.text.View;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        float tot = 0;
        int mayor = matriz[0][0];
        int contador = 1;
        int diagonal = matriz[0][0];
        int ultFil= 0;
        int[] pares = new int[matriz.length * matriz[0].length];
        int topePares = 0;
        int[] primos = new int[matriz.length * matriz[0].length];
        int topePrimos = 0;
        for (int i = 0; i < matriz.length; i++)
            for (int j = 1; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
                tot = tot + matriz[i][j];
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                    contador = 1;
                }
                else if (matriz[i][j] == mayor)
                    contador++;
                if ((i == j) || (i == j - matriz.length -1))
                    diagonal = diagonal + matriz[i][j];
                if (j == matriz[i].length - 1)
                    ultFil = ultFil + matriz[i][j];
                if (matriz[i][j] % 2 == 0){
                    pares[topePares] = matriz[i][j];
                    topePares++;
                }

                boolean prime = true; 
                for(int k = 2; k < Math.sqrt(matriz[i][j]); k++)
                    if (matriz[i][j] != 0)
                        if (matriz[i][j] % k == 0) {
                            prime = false;
                            break;
                        }
                if (prime){
                    primos[topePrimos] = matriz[i][j];
                    topePrimos++;
                }
            }
        System.out.println();
        System.out.println("Promedio " + tot/(matriz.length * matriz[0].length));
        System.out.println();
        System.out.println("Mayor: " + mayor + ", cantidad de aparciciones: " + contador);
        System.out.println();
        System.out.println("Suma diagonal: " + diagonal);
        System.out.println();
        System.out.println("Suma ultima fila: " + ultFil);
        System.out.println();
        System.out.println("Pares: ");
        for (int i = 0; i < topePares; i++)
            System.out.print(pares[i] + " ");
        System.out.println("\n");
        System.out.println("Primos: ");
        for (int i = 0; i < topePrimos; i++)
            System.out.print(primos[i] + " ");
    }
}
