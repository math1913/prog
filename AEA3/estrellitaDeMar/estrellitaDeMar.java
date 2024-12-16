public class estrellitaDeMar {
    //Te queremos marina
    public static void main(String[] args) {
        estrellitaDeMar programa = new estrellitaDeMar();
        programa.imprimir('*', 7);
        programa.imprimir('-',1);
        programa.imprimir('5', 6);
        programa.imprimir('*', 3);
        programa.imprimir('-', 5);
        programa.imprimir('3',2);
    }
    public void imprimir(char car, int cant) {
        for (int i = 0; i < cant; i++)
            System.out.print(car);
        System.out.println();
    }
}
