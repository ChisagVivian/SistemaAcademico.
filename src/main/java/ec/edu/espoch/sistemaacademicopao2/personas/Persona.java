
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
    
    //setther and getter........

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreopersonal() {
        return Correopersonal;
    }

    public void setCorreopersonal(String Correopersonal) {
        this.Correopersonal = Correopersonal;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", Nombre=" + Nombre + ", Correopersonal=" + Correopersonal + ", Cedula=" + Cedula + '}';
    }
    
}
