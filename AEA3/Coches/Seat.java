package AEA3.Coches;

public class Seat extends Coche{
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void marca(){
        System.out.println("Marca: Seat " + this.getModelo());

    }
    public void velocidad(){
        
    }
}
