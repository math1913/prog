package AEA3.Personas;

public class MainPersonas {
    public static void main(String[] args) {
        /*Persona p = new Persona();
        p.setId(1);
        p.setNombre("Marina");
        p.setApellido("Moreno");
        p.setDireccion("calle 3");
        p.setEdad(25);
        p.imprimir();
        */
        Estudiante Eric = new Estudiante();
        Eric.setId(2);
        Eric.setNombre("Eric");
        Eric.setApellido("Segura");
        Eric.setDireccion("calle 1");
        Eric.setEdad(20);
        Asignatura[] asignaturas = new Asignatura[3];
        asignaturas[0] = new Asignatura();       
        asignaturas[0].setAsignatura("Matemática", 10);
        asignaturas[1] = new Asignatura();
        asignaturas[1].setAsignatura("Ingeniería", 8);
        asignaturas[2] = new Asignatura();
        asignaturas[2].setAsignatura("Física", 9.5);
        Eric.setAsignaturas(asignaturas);
        Eric.setCurso("DAM1");
        Eric.setEscuela("Prat");
        Eric.imprimir();
    }
}
