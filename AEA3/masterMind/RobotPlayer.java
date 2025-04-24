import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RobotPlayer extends Player{
    private Random rand = new Random();
    private Feedback f = new Feedback();
    private HashMap<Character, boolean[]> mapa = new HashMap<>(); //mapa con clave letra y valor vector con pocisiones disponibles
    private char[] sol = new char[Game.LONG_SECRET];
    private char[] code;

    public RobotPlayer(char[] code){
        this.code = code;
        
        for(int i = 0; i < MasterMain.abc.length; i++){
            boolean[] pos = new boolean[Game.LONG_SECRET];//vector con las posiciones disponibles de dicha letra
            for (int j = 0; j < Game.LONG_SECRET; j++)
                pos[j] = true;
            mapa.put(MasterMain.abc[i], pos); //guardo todas las letras con todas las posiciones disponibles
        }
        for(int i = 0; i < Game.LONG_SECRET; i++)
            this.sol[i] = '%';
    }
    
    @Override
    public char[] makeGuess(){
        char[] res = new char[Game.LONG_SECRET];
        //solo buscamos otra letra si el vector sol en esa pos es %
        //solo nos sirve si el random generado, en esa clave del mapa tiene la pocision esta libre, sino i--
        int random;
        for (int i = 0; i < Game.LONG_SECRET; i++){
            if(this.sol[i] == '%'){
                random = rand.nextInt(26);//random entre 0 y 26
                if (mapa.get(MasterMain.abc[random])[i]){// entra si la pos esta disp
                    res[i] = MasterMain.abc[random];
                }
                else
                    i--;
            }else
                i--;
        }

        //antes de retornar guardo las x y - en el mapa, las 0 en el vector solucion
        actualizarPosiciones(res);
        return res;
    }

    public  void actualizarPosiciones(char[] res){
        char[] retroalimentacion = f.generarPista(res, this.code);
        for(int i = 0; i < Game.LONG_SECRET; i++){
            if(retroalimentacion[i] == '-'){
                for(int j = 0; j < Game.LONG_SECRET; j++)
                    mapa.get(res[i])[j] = false;
            }
            else if (retroalimentacion[i] == 'X'){
                mapa.get(res[i])[i] = false;
            }
            else{
                sol[i] = res[i];
            }
        }
    }
}