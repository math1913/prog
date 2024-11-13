import java.util.Scanner;
import java.util.Random;

public class adivinaNum{
	public static void main(String[] args) {
		Random rnd = new Random(System.currentTimeMillis());
		Scanner lector = new Scanner(System.in);

		int num = rnd.nextInt(10);
		System.out.print("Tienes 3 intentos, introduce un numero entre 1 y 10: ");
		int intento = lector.nextInt();
		int i = 2;
		
		while ((intento != num) && (i > 0)){
			System.out.println("Numero incorrecto, te quedan " + i + " intentos");
			System.out.print("Introduce un numero entre 1 y 10: ");
			intento = lector.nextInt();
			i--;
		}
		if (intento == num)
			System.out.println("Has acertado!");
		else
			System.out.println("Has perdido :(");
	}
}
