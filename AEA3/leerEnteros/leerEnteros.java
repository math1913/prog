import java.util.Scanner;

public class leerEnteros{
    public static void main(String[] args){
        leerEnteros programa = new leerEnteros();
        programa.inicio();
    }
    public void inicio(){
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        int i = 0;
        while (i < 10){
            System.out.println("Introduzca un numero");
            arreglo[i] = sc.nextInt();
            i++;
        }
        System.out.println("El mayor valor es: " + segMayor(arreglo));
    }
    
    public int segMayor(int[] arreglo){
        int mayor = arreglo[0];
        int segMayor = arreglo[1];
        if (mayor < segMayor){
            int aux = segMayor;
            segMayor = mayor;
            mayor = aux;
        }
        for (int i = 2; i < arreglo.length; i++)
            if(arreglo[i] > mayor){
                segMayor = mayor;
                mayor = arreglo[i];
            }
            else if (arreglo[i] > segMayor)
                segMayor = arreglo[i];
        return segMayor;
    }
}