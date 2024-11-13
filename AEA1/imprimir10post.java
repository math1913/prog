import java.util.Scanner;

public class imprimir10post {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Que numero quieres que sea el inicial? ");
        int num = lector.nextInt();
        for(int i = num; i<= num + 100; i++){
            System.out.print(i);
            if((i % 5) == 0)
               System.out.print(" soy multiplo de 5");
            System.out.println();
        }
    }
}