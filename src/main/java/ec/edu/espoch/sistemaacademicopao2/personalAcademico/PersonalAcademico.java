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

    //Constructores.................
    public PersonalAcademico(double sueldo, String correoInstitucional, int id, String Nombre, String Correopersonal, String Cedula) {
        super(sueldo, correoInstitucional, id, Nombre, Correopersonal, Cedula);
    }
    
    
    //pilimorfismo dinamico..........

    @Override
    public String toString() {
        return "PersonalAcademico{" + '}';
    }
    
    
    
}
