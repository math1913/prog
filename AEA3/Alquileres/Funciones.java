import java.util.Scanner;

import AEA3.Alquileres.*;
import AEA3.utils.LectorDatosTerminal;
public class Funciones {
    LectorDatosTerminal sc = new LectorDatosTerminal();
    Scanner s = new Scanner(System.in);
    
    public void inicializar(){
            System.out.println("Cuantos alquileres quieres registrar?");
            int cant = sc.leerInt();
            Alquiler[] alq = new Alquiler[cant];
            String nombre;
            int capacidad;
            System.out.println("Que tipo de alquiler quieres registrar?");
            String tipo = s.nextLine().trim().toLowerCase();
            for (int i = 0; i < cant; i++) {
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
    }
}
