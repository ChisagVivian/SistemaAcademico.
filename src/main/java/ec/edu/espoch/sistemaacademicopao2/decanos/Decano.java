/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.decanos;

import ec.edu.espoch.sistemaacademicopao2.personalAcademico.PersonalAcademico;

/**
 *
 * @author Usuario
 */
public class Decano extends PersonalAcademico{
    
    private String nivel;
    
    //CONSTRUCTORES:

    public Decano(String nivel, String deciaction, double sueldo, String correoInstitucional, int id, String Nombre, String Correopersonal, String Cedula) {
        super(deciaction, sueldo, correoInstitucional, id, Nombre, Correopersonal, Cedula);
        this.nivel = nivel;
    }


    
    
    //SETTER AND GETTER:

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
    //PILIMORFISMO DINAMICO:

    @Override
    public String toString() {
        return "Decano{" + "nivel=" + nivel + '}';
    }


    
    
}
