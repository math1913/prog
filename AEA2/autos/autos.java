import java.util.Scanner;
public class autos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cars = new String[4];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Ingresa el nombre del coche:");
            cars[i] = sc.nextLine();
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}