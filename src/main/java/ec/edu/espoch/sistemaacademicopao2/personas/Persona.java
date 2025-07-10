
package ec.edu.espoch.sistemaacademicopao2.personas;


public class Persona {
    
    private int id;
    private String Nombre;
    private String Correopersonal;
    private String Cedula;

    public Persona(int id, String Nombre, String Correopersonal, String Cedula) {
        this.id = id;
        this.Nombre = Nombre;
        this.Correopersonal = Correopersonal;
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", Nombre=" + Nombre + ", Correopersonal=" + Correopersonal + ", Cedula=" + Cedula + '}';
    }
    
}
