package AEA3.Coches;

public class MainCoches {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setId(1);
        Seat seat = new Seat();
        seat.setId(2);
        seat.setModelo("Leon");
        coche.setId(1);
        coche.tipoVehiculo();
        seat.marca();
        seat.velocidad();
    }
}
