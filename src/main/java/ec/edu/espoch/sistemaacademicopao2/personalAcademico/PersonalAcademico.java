/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.personalAcademico;

import ec.edu.espoch.sistemaacademicopao2.empleado.Empleado;

/**
 *
 * @author Usuario
 */
public class PersonalAcademico extends Empleado {

    private String deciaction;
    
    //Constructores.................

    public PersonalAcademico(String deciaction, double sueldo, String correoInstitucional, int id, String Nombre, String Correopersonal, String Cedula) {
        super(sueldo, correoInstitucional, id, Nombre, Correopersonal, Cedula);
        this.deciaction = deciaction;
    }

    
    
    //pilimorfismo dinamico..........

    @Override
    public String toString() {
        return "PersonalAcademico{" + "deciaction=" + deciaction + super.toString()+ '}';
    }


    
    
}
