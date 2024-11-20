public class cienNums {
    public static void main(String[] args) {
        int[] array = new int[100];
        int par = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = par;
            par = par + 2;
        }
        for (int j = 0; j < array.length; j++) 
            System.out.print(array[j] + " ");
    }
}