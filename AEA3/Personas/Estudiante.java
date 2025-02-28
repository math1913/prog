package AEA3.Personas;

public class Estudiante extends Persona{

    private Asignatura[] asignaturas;
    private String curso;
    private String escuela;

    public Estudiante(){
        this.setId(this.getId() + 1);
        this.setNombre(getNombre());
        this.setApellido(getApellido());
        this.setDireccion(getDireccion());
        this.setEdad(getEdad());
    }
    
    public void setAsignaturas(Asignatura[] nAsignaturas) {
        asignaturas = nAsignaturas;
    }
    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setCurso(String nCurso) {
        curso = nCurso;
    }
    public String getCurso() {
        return curso;
    }
    
    public void setEscuela(String nEscuela) {
        escuela = nEscuela;
    }
    public String getEscuela() {
        return escuela;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Curso: " + this.getCurso());
        for(int i = 0; i < asignaturas.length; i++)
            System.out.print("Asignatura " + asignaturas[i].nombre + ", nota: " + asignaturas[i].nota + "\n");
        System.out.println("Escuela: " + this.getEscuela());

    }
}
