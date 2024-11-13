import java.util.Scanner;
public class tablasMul {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Hasta que tabla de multiplicar quieres conocer? ");
        int n = lector.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("La tabla del " + (i+1) + " es:");
            for(int j = 0; j < 10; j++)
                System.out.println((i+1) + " * " + (j+1) + " = " + ((i+1)*(j+1)));
            System.out.println("----------------------");
        }
    }
}
