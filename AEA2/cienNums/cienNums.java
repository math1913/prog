public class cienNums {
    public static void main(String[] args) {
        int[][] pares = new int[10][10];
        //int[] impares = new int[100];
        //int[] suma = new int[100];
        //int j = suma.length - 1;
        int num = 0;
        for (int i = 0; i < pares.length; i++) {
            for (int j = 0; j < pares[i].length; j++) {
                pares[i][j] = num * 2;
                num++;
                System.out.print(pares[i][j] + " ");
            }
            System.out.println();
            


            /*
            impares[j] = j * 2 + 1;
            suma[i] = pares[i] + impares[j];
            System.out.print(suma[i] + " ");
            j --;
            */
        }
    }
}