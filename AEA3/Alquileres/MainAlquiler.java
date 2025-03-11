package AEA3.Alquileres;
import java.util.Scanner;
import AEA3.utils.*;

public class MainAlquiler {
    public static void main(String[] args) {
        LectorDatosTerminal sc = new LectorDatosTerminal();
        Scanner s = new Scanner(System.in);
        int opcion;
        System.out.println("Cuantos alquileres quieres registrar?");
        int cant = sc.leerInt();
        Alquiler[] alq = new Alquiler[cant];
        String nombre;
        int capacidad;
        for (int i = 0; i < cant; i++) {
            System.out.println("Que tipo de alquiler quieres registrar?");
            String tipo = s.nextLine().trim().toLowerCase();
            switch (tipo) {
                case "habitacion":
                    System.out.println("Introduce el nombre de la habitacion: ");
                    nombre = s.nextLine();
                    System.out.println("Introduce la capacidad de la habitacion: ");
                    capacidad = sc.leerInt();
                    System.out.println("Introduce el numero de camas: ");
                    int numCamas = sc.leerInt();
                    alq[i] = new Habitacion(nombre, capacidad, numCamas);
                    break;
                case "apartamento":
                    System.out.println("Introduce el nombre del apartamento: ");
                    nombre = s.nextLine();
                    System.out.println("Introduce la capacidad del apartamento: ");
                    capacidad = sc.leerInt();
                    System.out.println("Habitaciones: ");
                    int hab = sc.leerInt();
                    System.out.println("Tiene cocina? (Y/N) ");
                    boolean cocina = (s.nextLine().equalsIgnoreCase("Y"));
                    alq[i] = new Apartamento(nombre, capacidad, hab, cocina);
                    break;
                case "casa rural":
                    System.out.println("Introduce el nombre de la casa rural: ");
                    nombre = s.nextLine();
                    System.out.println("Introduce la capacidad de la casa rural: ");
                    capacidad = sc.leerInt();
                    System.out.println("Tiene piscina: (Y/N)");
                    boolean piscina = (s.nextLine().equalsIgnoreCase("Y"));
                    System.out.println("Tiene jardin: (Y/N)");
                    boolean jardin = (s.nextLine().equalsIgnoreCase("Y"));
                    alq[i] = new CasaRural(nombre, capacidad, piscina, jardin);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    i--;
                    break;
            }
        }
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar allotjaments disponibles");
            System.out.println("2. Reservar allotjament");
            System.out.println("3. Alliberar allotjament");
            System.out.println("4. Sortir");
            System.out.print("Tria una opció: ");
            opcion = sc.leerInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < alq.length; i++)
                        if (alq[i].getDisp()) {
                            System.out.println("---------------------");
                            alq[i].mostrarInformacio();
                        }
                    break;
                case 2:
                    System.out.print("Introdueix el nom de l'allotjament a reservar: ");
                    String nom = s.nextLine();
                    System.out.println(nom);
                    for (int i = 0; i < alq.length; i++)
                        if (alq[i].getNombre().equalsIgnoreCase(nom)) 
                            alq[i].reservar();
                    break;
                case 3:
                    System.out.print("Introdueix el nom de l'allotjament a alliberar: ");
                    nom = s.nextLine();
                    for (int i = 0; i < alq.length; i++)
                        if (alq[i].getNombre().equalsIgnoreCase(nom))
                            alq[i].liberar();
                    break;
            }
        } while (opcion != 4);
    }
}

