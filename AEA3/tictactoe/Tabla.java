public class Tabla {
    private char[][] tabla;
    public Tabla(int n) {
        tabla = new char[n][n];
        for (int i = 0; i < tabla.length; i++)
            for (int j = 0; j < tabla[i].length; j++)
                tabla[i][j] = '-';
    }

    public void imprimir() {
        for (int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length; j++)
                System.out.print("|" + tabla[i][j] + "|");
            System.out.println();
        }
    }

    public void dibujar(int i, int j, char jugador) {
        if ((i >= 0 && i < tabla.length && j >= 0 && j < tabla.length) && (tabla[i][j] == '-'))
            tabla[i][j] = jugador;
    }

    public boolean hayGanador(char jugador){
        boolean filas = true;
        boolean columnas = true;
        boolean d1 = true;
        boolean d2 = true;
        for (int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla.length; j++){
                if (tabla[i][j] != jugador) filas = false;
                if (tabla[j][i] != jugador) columnas = false;
            }
            if (filas || columnas)
                return filas || columnas;
            if (tabla[i][i] != jugador) d1 = false;
            if (tabla[i][tabla.length-i-1] != jugador) d2 = false;
        }
        return filas || columnas || d1 || d2;
/* 
        for (int i = 0; i < 3; i++){
            if (tabla[i][0] == jugador && tabla[i][1] == jugador && tabla[i][2] == jugador)
                return true;
            if (tabla[0][i] == jugador && tabla[1][i] == jugador && tabla[2][i] == jugador)
                return true;
            }
        return ((tabla[0][0] == jugador && tabla[1][1] == jugador && tabla[2][2] == jugador) || (tabla[0][2] == jugador && tabla[1][1] == jugador && tabla[2][0] == jugador));
    */}
    
    public boolean esLlena(){
        for (int i = 0; i < tabla.length; i++)
            for (int j = 0; j < tabla[i].length; j++)
                if (tabla[i][j] == '-')
                    return false;
        return true;
    }

    public boolean ocupado(int i, int j){
        return tabla[i][j] != '-';
    }
}
