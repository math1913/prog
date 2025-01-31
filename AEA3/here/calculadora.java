package AEA3.here;
import java.util.Scanner;
public class calculadora {
    Scanner lector = new Scanner(System.in);
    public void area(int num) {
		if (num == 1){
			System.out.print("Ingrese la base del triangulo: ");
			double base = lector.nextFloat();
			System.out.print("Ingrese la altura del triangulo: ");
			double altura = lector.nextFloat();
			System.out.println(base * altura / 2);
		}
		else if (num == 2){
			System.out.print("Ingrese el radio del circulo: ");
			double radio = lector.nextFloat();
			System.out.println(radio * radio * 3.14);
		}
		else if (num == 3){
			System.out.print("Ingrese la base mayor del trapecio: ");
			double bMayor = lector.nextFloat();
			System.out.print("Ingrese la base menor del trapecio: ");
			double bMenor = lector.nextFloat();
			System.out.print("Ingrese la altura del trapecio: ");
			double h = lector.nextFloat();
			System.out.println((bMayor + bMenor)*h/2);
		}
		else if (num == 4){
			System.out.print("Ingrese la diagonal mayor del rombo: ");
			float dMayor = lector.nextFloat();
			System.out.print("Ingrese la diagonal menor del rombo: ");
			float dMenor = lector.nextFloat();
			System.out.println((dMayor * dMenor)/2);
		}
		else if (num == 5){
			System.out.print("Ingrese la base del paralelogramo: ");
			double lado1 = lector.nextFloat();
			System.out.print("Ingrese la altura del paralelogramo: ");
			double lado2 = lector.nextFloat();
			System.out.println(lado1 * lado2);
		}
    }
}
