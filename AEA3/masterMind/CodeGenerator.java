
    public class CodeGenerator {

    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % MasterMain.abc.length);
        return MasterMain.abc[index];
    }
    char[] generateCode(){
        char[] res = new char[Game.LONG_SECRET];
        for (int i = 0; i < Game.LONG_SECRET; i++) {
            res[i] = generarLletraAleatoria();
        }
        return res;
    }
} 
