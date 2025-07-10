/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.personaInstitucional;

import ec.edu.espoch.sistemaacademicopao2.personas.Persona;

/**
 *
 * @author Usuario
 */
public class PersonaInstitucional extends Persona{
    
    private String correoInstitucional;

    public PersonaInstitucional(String correoInstitucional, int id, String Nombre, String Correopersonal, String Cedula) {
        super(id, Nombre, Correopersonal, Cedula);
        this.correoInstitucional = correoInstitucional;
    }

    @Override
    public String toString() {
        return "PersonaInstitucional{" + "correoInstitucional=" + correoInstitucional +  super.toString()+'}';
    }

 
    
    
    
}
