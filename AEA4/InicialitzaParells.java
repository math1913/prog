public class InicialitzaParells {
  public static void main(String[] args) {
      int[] arrayParells = new int[100];
      try {
          for (int i = 0; i <= 150; i++) {
              arrayParells[i] = 2 * i;
          }
      } catch (ArrayIndexOutOfBoundsException e) {
          System.err.println("Error: Índice fuera de los límites del array.");
          System.err.println("Mensaje de la excepción: " + e.getMessage());
      }
  }
}