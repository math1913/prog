import java.util.Scanner;
public class registroTemps {
    //ctes
    private static final int MAX_SEM = 52;

    //var glob
    private boolean fin = false;
    private int numTemps = 0;
    private float[] temperaturas = new float[MAX_SEM * 7];
    private int dia = 1;
    private int mes = 1;

    public static void main(String[] args) {
        registroTemps programa = new registroTemps();
        programa.iniciar();
    }

    public void iniciar() {
        while(!fin) {
            mostrarMenu();
            tratarOpcion();
        }
    }

    public void mostrarMenu() {
        System.out.println("\nBienvenido al registro de temperaturas");
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[RT] Registrar temperaturas semanales.");
        System.out.println("[MJ] Consultar temperatura mediana.");
        System.out.println("[DF] Consultar diferencia maxima.");
        System.out.println("[FI] Salir.");
        System.out.print("Opción: ");
    }

    public void tratarOpcion() {
        Scanner lector = new Scanner(System.in);
        String opcion = lector.next();
        if (opcion.equals("RT"))
            registrarTemperaturasSemestrales();
        else if (opcion.equals("MJ")) 
            mostrarMedia();
        else if (opcion.equals("DF"))
            mostrarDiferencia();
        else if (opcion.equals("FI")) 
            fin = true;
        else {
            System.out.println("Opción no válida");
        }
    }

    public void registrarTemperaturasSemestrales() {
        if (numTemps + 7 >= temperaturas.length) 
            System.out.println("No se puede registrar más de " + MAX_SEM + " temperaturas");
        else {
            leerTemperaturas();
            incrementarFecha();
        }
    }

    public void mostrarMedia() {
        if (numTemps == 0)
            System.out.println("No hay datos registrados");
        else{
            System.out.print("\nHasta hoy: ");
            mostrarFecha();
            System.out.print(" Media: ");
            calcularMedia();
            System.out.println(" grados.");
        }
    }

    public void mostrarDiferencia() {
        if (numTemps == 0)
            System.out.println("No hay datos registrados");
        else {
            System.out.print("\nHasta hoy: ");
            mostrarFecha();
            System.out.print(" Diferencia: ");
            calcularDiferencia();
            System.out.println(" grados.");
        }
    }

    public void leerTemperaturas() {
        System.out.println("Escribe las temperaturas de esta semana:");
        Scanner lector = new Scanner(System.in);
        int numLeidos = 0;
        while (numLeidos < 7) {
            if (lector.hasNextFloat()) {
                temperaturas[numTemps] = lector.nextFloat();
                numLeidos++;
                numTemps++;
            }
            else
                lector.next();
        }
    }

    public void incrementarFecha() {
        int diasEsteMes = 0;
        if (mes == 2)
            diasEsteMes = 28;
        else if ((mes == 4)||(mes == 6)||(mes == 9 )||(mes == 11))
            diasEsteMes = 30;
        else
            diasEsteMes = 31;
        dia = dia + 7;
        if (dia > diasEsteMes) {
            dia = dia - diasEsteMes;
            mes++;
            if (mes > 12)
                mes = 1;
        }   
    }

    public void mostrarFecha() {
        System.out.print(dia + " de ");
        switch(mes) {
            case 1:
                System.out.print("Gen");
                break;
            case 2:
                System.out.print("Feb");
                break;
            case 3:
                System.out.print("Mar");
                break;
            case 4:
                System.out.print("Abr");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("Jun");
                break;
            case 7:
                System.out.print("Jul");
                break;
            case 8:
                System.out.print("Ago");
                break;
            case 9:
                System.out.print("Sep");
                break;
            case 10:
                System.out.print("Oct");
                break;
            case 11:
                System.out.print("Nov");
                break;
            case 12:
                System.out.print("Dic");
        }
    }

    public void calcularMedia() {
        float acumulador = 0;
        for (int i = 0; i < numTemps; i++)
            acumulador = acumulador + temperaturas[i];
        System.out.print((acumulador / numTemps));
    }

    public void calcularDiferencia() {
        float min = temperaturas[0];
        float max = temperaturas[0];
        for (int i = 1; i < numTemps; i++) {
            if (temperaturas[i] < min) 
                min = temperaturas[i];
            else if (temperaturas[i] > max)
                max = temperaturas[i];
        }
        System.out.print((max - min));
    }
}
