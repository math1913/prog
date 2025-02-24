import java.util.Scanner;
import AEA3.utils.LectorDatosTerminal;
public class JocActivitat {
    private Tabla tabla;
    private char jugadorActual;
    private boolean ganador;
    private LectorDatosTerminal sc;
    private int tamaño;
    
    public JocActivitat() {
        sc = new LectorDatosTerminal();
        System.out.println("Joc de TicTacToe");
        System.out.println("Ingresa el tamaño del tablero: ");
        tamaño = sc.leerInt();
        tabla = new Tabla(tamaño);
        ganador = false;
        System.out.println("Que jugador empieza? ");
        jugadorActual = sc.leerChar();
        iniciar();
    }
    public void iniciar() {
        System.out.println(jugadorActual);
        tabla.imprimir();
        while (!ganador && !tabla.esLlena()) {
            turnoActual();
            ganador = tabla.hayGanador(jugadorActual);
            if (!ganador)
                cambiarTurno();
            tabla.imprimir();
        }
        if (ganador)
            System.out.println("El ganador es " + jugadorActual);
    }

    public void turnoActual() {
        System.out.println(jugadorActual +", ingresa en que fila y columna dibujar: ");
        int i = sc.leerInt();
        int j = sc.leerInt();
        while (tabla.ocupado(i, j)){
            System.out.println("Ingresa en una celda vacia: ");
            i = sc.leerInt();
            j = sc.leerInt();
        }
        tabla.dibujar(i, j, jugadorActual);
        if (tabla.hayGanador(jugadorActual))
            ganador = true;
    }

    public void cambiarTurno() {
        if (jugadorActual == 'X')
            jugadorActual = 'O';
        else
            jugadorActual = 'X';
    }
}
