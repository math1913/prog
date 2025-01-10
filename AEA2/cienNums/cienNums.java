public class cienNums {
    public static void main(String[] args) {
        int[] pares = new int[100];
        int[] impares = new int[100];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;
            System.out.print(pares[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < impares.length; i++) {
            impares[i] = i * 2 + 1;
            System.out.print(impares[i] + " ");    
        }
    }
}