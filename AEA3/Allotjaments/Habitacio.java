public class Habitacio extends Allotjament {
    
    private int numLlits;
    private double preuPerNit;
    
    public Habitacio(String nom, int capacitat,int numLlits){
        super(nom, capacitat);
        this.numLlits = numLlits;
    }

    @Override
    public double calcularPreuPerNit(){
        if (this.numLlits > 2){
            preuPerNit = 50+(20*this.numLlits);
        } else{
            preuPerNit = 50;
        }
        return preuPerNit;
    }

    @Override
    public void mostrarInformacio(){
        System.out.print("Habitacio: " + getNom() + " (Llits: " + getNumLlits() + " )");
        super.mostrarInformacio();
    }
    public int getNumLlits() {
        return numLlits;
    }

    public void setNumLlits(int numLlits) {
        this.numLlits = numLlits;
    }
}
