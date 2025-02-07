package AEA3;

import AEA3.utils.minMaxMid;
import AEA3.utils.LectorDatosTerminal;

public class RegistreNotesMod {
  public static void main(String[] args) {
    LectorDatosTerminal lector = new LectorDatosTerminal();
    minMaxMid calculador = new minMaxMid();
    System.out.println("Introdueix les notes:");
    double[] notes = new double[5];
    for (int i = 0; i < notes.length; i++)
      notes[i] = lector.leerDouble();
    double max = calculador.max(notes);
    double min = calculador.min(notes);
    double mitjana = calculador.mid(notes);
    System.out.println("La nota màxima és " + max + ".");
    System.out.println("La nota mínima és " + min + ".");
    System.out.println("La mitjana de les notes és " + mitjana + ".");
  }
}
