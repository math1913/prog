
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for (int i = 1; i < vector.length; i++)
            vector[i] = (int)(Math.random() * 100);
        int segMenor = vector[0];
        int menor = vector[1];
        if (vector[0] < vector[1]){
            segMenor = vector[1];
            menor= vector[0];
        }        
        for (int i = 2; i < vector.length; i++){
            if (vector[i] < menor){
                segMenor = menor;
                menor = vector[i];
            }else if (vector[i] < segMenor){
                segMenor = vector[i];
            }
            System.out.print(vector[i] + " ");
        }
        System.out.println("Según el algoritmo de segundo menor: " + segMenor);
    }
}
