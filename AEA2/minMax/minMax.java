
public class minMax {
    public static void main(String[] args) {
        int[] arr = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

}
