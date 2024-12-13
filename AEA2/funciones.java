public class funciones {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        calcularMax(a, b, c);
        int min = calcularMin(a, b, c);
        System.out.println("el valor minimo es: " + min);
    }
    public static void calcularMax(int a, int b, int c) {
        if (a > b && a > c) 
            System.out.println("El valor máximo es " + a);
        else if (b > a && b > c)
            System.out.println("El valor máximo es " + b);
        else
            System.out.println("El valor máximo es " + c);
    }
    public static int calcularMin(int a, int b, int c) {
        int min;
        if (a < b && a < c) 
            min = a;
        else if (b < a && b < c) 
            min = b;
        else 
            min = c; 
        return min;
    }   
}
