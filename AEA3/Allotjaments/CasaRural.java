public class CasaRural extends Allotjament {

    private boolean teJardi;
    private boolean tePiscina;
    private double preuPerNit;

    public CasaRural(String nom,int capacitat, boolean teJardi, boolean tePiscina){
        super(nom,capacitat);
        this.teJardi = teJardi;
        this.tePiscina = tePiscina;
    }

    public boolean isTeJardi() {
        return teJardi;
    }

    public void setTeJardi(boolean teJardi) {
        this.teJardi = teJardi;
    }

    public boolean isTePiscina() {
        return tePiscina;
    }

    public void setTePiscina(boolean tePiscina) {
        this.tePiscina = tePiscina;
    }

    @Override
    public double calcularPreuPerNit(){
        if (this.tePiscina){
            preuPerNit = 150+50;
        } else{
            preuPerNit = 150;
        }
        return preuPerNit;
    }

    @Override
    public void mostrarInformacio(){
        System.out.print("Casa Rural: " + getNom() + " (Jardí: ");
        if (isTeJardi())
            System.out.print(" Sí,");
        else
            System.out.print(" No,");
        if (isTePiscina())
            System.out.print(" Piscina: Sí)");
        else
            System.out.print(" Piscina: No)");
        super.mostrarInformacio();
    }
}
