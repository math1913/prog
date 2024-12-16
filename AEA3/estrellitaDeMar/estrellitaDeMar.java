    public class estrellitaDeMar {
    public static void main(String[] args) {
        estrellitaDeMar programa = new estrellitaDeMar();
        programa.estrellas(7);
        programa.guiones(1);
        programa.numeros(5, 6);
        programa.estrellas(3);
        programa.guiones(5);
        programa.numeros(3,2);
    }
    public void estrellas(int cant){
        for (int i = 0; i < cant; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public void guiones(int cant){
        for (int i = 0; i < cant; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public void numeros(int num, int cant){
        for (int i = 0; i < cant; i++){
            System.out.print(num);
        }
        System.out.println();
    }
}
