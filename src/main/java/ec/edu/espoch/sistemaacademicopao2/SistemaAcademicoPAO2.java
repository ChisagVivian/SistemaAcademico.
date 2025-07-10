

package ec.edu.espoch.sistemaacademicopao2;

import ec.edu.espoch.sistemaacademicopao2.personas.Persona;


public class SistemaAcademicoPAO2 {

    public static void main(String[] args) {
       
        System.out.println("DATOS DEL OBJETO PERSONA");
        Persona objpersona = new Persona(1, "Maribel Manzano", "jimi-maribel@hotmail.com", "092211");
        
        System.out.println("Datos " +objpersona.toString());
        
    }
}
