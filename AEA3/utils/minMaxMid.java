package AEA3.utils;

public class minMaxMid {
    public double min(double[] numeros){
        double min = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < min){
                min = numeros[i];
            }
        }
        return min;
    }
    public double max(double[] numeros){
        double max = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > max){
                max = numeros[i];
            }
        }
        return max;
    }
    public double mid(double[] numeros){
        double cont = 0;
        for (int i = 0; i < numeros.length; i++){
            cont = cont + numeros[i];
        }
        return cont/numeros.length;
    }
    
}
