import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Funciones f = new Funciones();
    static Allotjament[] totsAllotjaments;
    
    public static void main(String[] args) {
        System.out.println("Quants allutjaments vols registrar?");
        int cant = sc.nextInt();
        totsAllotjaments = new Allotjament[cant];
        f.incializarVector(totsAllotjaments);
        menu();
    }

    public static void menu(){
        boolean mostrarMenu = true;
        int eleccio;
        while(mostrarMenu){
            System.out.println("Benvingut/da al sistema de reserves de BooQueen");
            System.out.println("Selecciona una de les següents ordres: ");
            System.out.println("1. Mostrar els allotjaments disponibles");
            System.out.println("2. Reservar allotjament");
            System.out.println("3. Alliberar allotjament");
            System.out.println("4. Cerca personalitzada");
            System.out.println("5. Sortir del programa");
            System.out.println("------------------------------------------------");
            eleccio = sc.nextInt();
            switch (eleccio) {
                case 1:
                    f.mostrarAlojamientos(totsAllotjaments);
                    break;
                case 2:
                    f.reservar(totsAllotjaments);
                    break;
                case 3:
                    f.liberar(totsAllotjaments);
                    break;
                case 4:
                    f.busquedaPersonalizada(totsAllotjaments);
                    break;
                case 5:
                    mostrarMenu = false;
                    break;
                default:
                    System.out.println("Selecció incorrecte. Selecciona un nombre del menú. ");
                    break;
            }
        }
    }
}
