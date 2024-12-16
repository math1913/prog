import java.util.Scanner;
public class estrellitaDeMar {
    //Te queremos marina
    private boolean fin = false;
    public static void main(String[] args) {
        estrellitaDeMar programa = new estrellitaDeMar();
        programa.iniciar();
    }
    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        while(!fin) {
            System.out.println("Que caracter quieres imprimir?");
            char car = sc.next().charAt(0);
            System.out.println("Cuantas veces?");
            int cant = sc.nextInt();
            imprimir(car, cant);
            System.out.println("¿Quieres continuar? (Si/No)");
            String resp = sc.next();
            if (resp.equals("No"))
                fin = true;
        }
    }
    public void imprimir(char car, int cant) {
        for (int i = 0; i < cant; i++)
            System.out.print(car);
        System.out.println();
    }
}
