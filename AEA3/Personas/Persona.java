package AEA3.Personas;

public class Persona {
    private static int id;
    private int edad;
    private String nombre;
    private String apellido;
    private String direccion;

    public int getId() {
        return id;
    }

    public void setId(int nId) {
        id = nId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nNombre) {
        nombre = nNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String nApellido) {
        apellido = nApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String nDireccion) {
        direccion = nDireccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nEdad) {
        edad = nEdad;
    }
    
    public void imprimir(){
        System.out.println("Id: " +this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Direccion: "+ this.getDireccion());        
        System.out.println("Edad: " + this.getEdad());
    }

}