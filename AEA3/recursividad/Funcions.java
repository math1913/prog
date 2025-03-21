package AEA3.recursividad;
import java.util.*;

public class Funcions{
    public static void main(String[] args){
        Funcions f = new Funcions();
        System.out.println(f.sumarial(4));
        System.out.println(f.potencia(2,3));
        System.out.println(f.invertirString("Hola marina", ""));
    }

    public int sumarial(int num){
        if (num == 0)
            return 0;
        else
            return num + sumarial(num - 1);
    }

    public double potencia(double num, int exp){
        if (exp == 0)
            return 1;
        else
            return num * potencia(num, exp - 1);
    }

    public String invertirString(String str, String res){
        if (str.length() == 1)
            return str;
        else{
            res = invertirString(str.substring(1), res);
            res = res.concat(str.substring(0, 1));
            return res;
        }
    }
}
