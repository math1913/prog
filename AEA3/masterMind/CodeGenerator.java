public class CodeGenerator {

    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % MasterMain.abc.length());
        return MasterMain.abc.charAt(index);
    }
    String generateCode(){
        String res = "";
        for (int i = 0; i < MasterMain.LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }
} 
