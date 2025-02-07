package AEA3.utils;
public class funcionesMod {
    public static void main(String[] args) {
        System.out.println("Introduce 5 numeros:");
        double[] numeros = new double[5];
        minMaxMid x = new minMaxMid();
        LectorDatosTerminal l = new LectorDatosTerminal();
        for (int i = 0; i < 5; i++) 
            numeros[i] = l.leerDouble();
        System.out.println("El minimo es: " + x.min(numeros));
        System.out.println("El maximo es: " + x.max(numeros));
        System.out.println("La media es: " + x.mid(numeros));
    }

}