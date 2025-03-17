import java.util.Scanner;

public class Funciones {
    static Scanner sc = new Scanner(System.in);
    static String apartamentAReservar;

    public void mostrarAlojamientos(Allotjament[] alq){
        int num = 1;
        for (int i =0; i < alq.length; i++)
            if (alq[i].isDisponible()){
                System.out.println((num +": "));
                alq[i].mostrarInformacio();
                num++;
            }
    }

    public void incializarVector(Allotjament[] alq) {
        int cant = alq.length;
        String nombre;
        int capacidad;
        for (int i = 0; i < cant; i++) {
            System.out.println("Quin tipus de lloguer vols registrar?");
            String tipo = sc.nextLine().trim().toLowerCase();
            switch (tipo) {
                case "habitacio":
                    System.out.println("Introdueix el nom: ");
                    nombre = sc.nextLine();
                    System.out.println("Introdueix la capacitat: ");
                    capacidad = sc.nextInt();
                    System.out.println("Introdueix el nombre de llits: ");
                    int numCamas = sc.nextInt();
                    sc.nextLine();
                    alq[i] = new Habitacio(nombre, capacidad, numCamas);
                    break;
    
                case "apartament":
                    System.out.println("Introdueix el nom: ");
                    nombre = sc.nextLine();
                    System.out.println("Introdueix la capacitat: ");
                    capacidad = sc.nextInt();
                    System.out.println("Nombre d'habitacions: ");
                    int hab = sc.nextInt();
                    System.out.println("Té cuina? (Y/N) ");
                    sc.nextLine();
                    boolean cocina = (sc.nextLine().equalsIgnoreCase("Y"));
                    alq[i] = new Apartament(nombre, capacidad, hab, cocina);
                    break;
    
                case "casa rural":
                    System.out.println("Introdueix el nom: ");
                    nombre = sc.nextLine();
                    System.out.println("Introdueix la capacitat: ");
                    capacidad = sc.nextInt();
                    System.out.println("Té piscina? (Y/N)");
                    sc.nextLine();
                    boolean piscina = (sc.nextLine().equalsIgnoreCase("Y"));
                    System.out.println("Té jardí? (Y/N)");
                    boolean jardin = (sc.nextLine().equalsIgnoreCase("Y"));
                    alq[i] = new CasaRural(nombre, capacidad, piscina, jardin);
                    break;
    
                default:
                    System.out.println("Opció no vàlida");
                    i--;
                    break;
            }
        }
    }
    
    public void reservar(Allotjament[] alq){
        System.out.println("Digues el nom del allotjament que vols reservar");
        apartamentAReservar = sc.nextLine();
        for (int i =0; i < alq.length; i++)
            if (alq[i].getNom().toLowerCase().equalsIgnoreCase(apartamentAReservar))
                if (alq[i].isDisponible()){
                    alq[i].setDisponible(false);
                    System.out.println("Reserva completada a l'allotjament " + alq[i].getNom() + " correctament! Gràcies!");
                } else
                    System.out.println("L'allotjament " + alq[i].getNom() + " no està disponible per reservar.");
    }

    public void liberar(Allotjament[] alq){
        System.out.println("Digues el nom del allotjament que vols alliberar");
        apartamentAReservar = sc.nextLine();
        for (int i =0; i < alq.length; i++)
            if (alq[i].getNom().toLowerCase().equalsIgnoreCase(apartamentAReservar))
                if (alq[i].isDisponible()){
                    System.out.println("L'allotjament desitjat ja està disponible per reservar.");
                }else{
                    alq[i].setDisponible(true);
                    System.out.println("Allotjament "+ alq[i].getNom() + " alliberat correctament! Gràcies!");
                }
    }

    public void busquedaPersonalizada(Allotjament[] alq){
        System.out.println("Quin tipus de lloguer vols buscar?");
        String tipo = sc.nextLine().trim().toLowerCase();
        int max;
        switch (tipo) {
            case "habitacio":
                System.out.println("Introdueix el màxim preu per nit: ");
                max = sc.nextInt();
                for (int i = 0; i < alq.length; i++)
                    if (alq[i].getClass().equals(Habitacio.class)){
                        Habitacio h = (Habitacio) alq[i];
                        if (h.calcularPreuPerNit() <= max)
                            h.mostrarInformacio();
                    }
                break;
            case "apartament":
                System.out.println("Introdueix el màxim preu per nit: ");
                max = sc.nextInt();
                System.out.println("Vols que tingui cuina? (Y/N)");
                sc.nextLine();
                boolean cocina = (sc.nextLine().equalsIgnoreCase("Y"));
                for (int i = 0; i < alq.length; i++)
                    if (alq[i].getClass().equals(Apartament.class)){
                        Apartament a = (Apartament) alq[i];
                        if (a.calcularPreuPerNit() <= max && a.isTeCuina() == cocina)
                            a.mostrarInformacio();
                    }
                break;
            case "casa rural":
                System.out.println("Introdueix el màxim preu per nit: ");
                max = sc.nextInt();
                System.out.println("Vols que tingui piscina? (Y/N)");
                sc.nextLine();
                boolean piscina = (sc.nextLine().equalsIgnoreCase("Y"));
                System.out.println("Vols que tingui jardí? (Y/N)");
                boolean jardin = (sc.nextLine().equalsIgnoreCase("Y"));
                for (int i = 0; i < alq.length; i++)
                    if (alq[i].getClass().equals(CasaRural.class)){
                        CasaRural cR = (CasaRural) alq[i];
                        if (cR.calcularPreuPerNit() <= max && cR.isTePiscina() == piscina && cR.isTeJardi() == jardin)
                            cR.mostrarInformacio();
                    }
                break;
        }
    }
}