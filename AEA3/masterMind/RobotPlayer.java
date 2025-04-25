import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RobotPlayer extends Player{
    private Random rand = new Random();
    private Feedback f = new Feedback();
    private HashMap<Character, boolean[]> mapa = new HashMap<>(); //mapa con clave letra y valor vector con posiciones disponibles
    private char[] sol = new char[Game.LONG_SECRET];
    private char[] code;
    private char[] malPos = new char[Game.LONG_SECRET]; //letras que dieron 'X' para seguir probandolas
    private int tope = 0; //tope para saber hasta cuantas letras agarra del arreglo

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
        System.out.println("makeguess:");
        char[] res = new char[Game.LONG_SECRET];
        //solo buscamos otra letra si el vector sol en esa pos es %
        //solo nos sirve si el random generado, en esa clave del mapa tiene la pocision esta libre, sino i--
        int random;
        int maxLetrasConocidas = tope;
        for (int i = 0; i < Game.LONG_SECRET; i++){
            if(this.sol[i] == '%'){
                if (maxLetrasConocidas > 0){
                    random = rand.nextInt(maxLetrasConocidas + 1); //elije una letra random de las que sabe que estan pero noen que pos
                    res[i] = malPos[random];
                    maxLetrasConocidas--;
                    System.out.println("if maxLetras");
                }else{
                    System.out.println("else maxLetras");
                    random = rand.nextInt(3);//random entre 0 y 25
                    System.out.println(random);
                    System.out.println(mapa.get(MasterMain.abc[random])[i]);
                    if (mapa.get(MasterMain.abc[random])[i]){// entra si la pos esta disp
                        System.out.println("if mapa.get");
                        res[i] = MasterMain.abc[random];
                    }else{
                        System.out.println("else mapa.get");
                        i--;
                    }
                    
                }
            }else
                res[i] = this.sol[i];
        }
        //antes de retornar guardo las x y - en el mapa, las 0 en el vector solucion
        for(int i = 0; i < Game.LONG_SECRET; i++)
            System.out.print(i+ " "+res[i]);
        System.out.println();
        actualizarPosiciones(res);
        return res;
    }

    public  void actualizarPosiciones(char[] res){
        System.out.println("funcion actualizar:");
        char[] retroalimentacion = f.generarPista(res, this.code);
        for(int i = 0; i < Game.LONG_SECRET; i++){
            
            //System.out.println(i);
            if(retroalimentacion[i] == '-'){
                //i=0;
                //System.out.println("i v2.1");
                //System.out.println(i + " lelele " + res[i]);
                for(int j = 0; j < Game.LONG_SECRET; j++){
                    //System.out.println("i v2");
                    //System.out.println(i + "hola " + res[i]);
                    //System.out.println(mapa.get(res[i]));
                    mapa.get(res[i])[j] = false;
                }
            }
            else if (retroalimentacion[i] == 'X'){
                //System.out.println("i v3");
                //System.out.println(i + " hola  " +  res[i]);
                //System.out.println(mapa.get(res[i]));
                mapa.get(res[i])[i] = false;
                malPos[tope] =  res[i];
                tope++;
            }
            else{
                sol[i] = res[i];
            }
        }
        System.out.println("reinicio tope");
        tope = 0;
    }
}