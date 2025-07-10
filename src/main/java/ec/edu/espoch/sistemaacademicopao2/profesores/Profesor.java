/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.profesores;

import ec.edu.espoch.sistemaacademicopao2.personalAcademico.PersonalAcademico;

/**
 *
 * @author Usuario
 */
public class Profesor extends PersonalAcademico {

    private Escalafon escalfon;
    
    //CONSTRUCTORES.........

    public Profesor(Escalafon escalfon, String deciaction, double sueldo, String correoInstitucional, int id, String Nombre, String Correopersonal, String Cedula) {
        super(deciaction, sueldo, correoInstitucional, id, Nombre, Correopersonal, Cedula);
        this.escalfon = escalfon;
    }


    
    //setter and getter....

    public Escalafon getEscalfon() {
        return escalfon;
    }

    public void setEscalfon(Escalafon escalfon) {
        this.escalfon = escalfon;
    }

    
   //Polimorfismo......

    @Override
    public String toString() {
        return "Profesor{" + "escalfon=" + escalfon + '}';
    }


    
    
    
}
