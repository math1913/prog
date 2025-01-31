package AEA3.here;
import java.util.Scanner;

public class calculoAreas{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.println("De que figura quieres calcular el area?");
		System.out.println("Tienes las siguientes opciones: triangulo, cuadrado, rectangulo, trapecio, rombo, paralelogramo o circulo.");
		String fig = lector.nextLine();
		calculadora x = new calculadora();
		if (fig.equals("triangulo"))
			x.area(1);
		else if (fig.equals("circulo"))
			x.area(2);
		else if (fig.equals("trapecio"))
			x.area(3);
		else if (fig.equals("rombo"))
			x.area(4);
		else if (fig.equals("paralelogramo"))
			x.area(5);
	}
}