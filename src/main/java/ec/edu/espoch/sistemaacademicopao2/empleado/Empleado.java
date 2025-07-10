/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.empleado;

import ec.edu.espoch.sistemaacademicopao2.personaInstitucional.PersonaInstitucional;

/**
 *
 * @author Usuario
 */
public class Empleado extends PersonaInstitucional{
    
    private double sueldo;
    
    //constructores............

    public Empleado(double sueldo, String correoInstitucional, int id, String Nombre, String Correopersonal, String Cedula) {
        super(correoInstitucional, id, Nombre, Correopersonal, Cedula);
        this.sueldo = sueldo;
    }


    
    //pilimorfimos dinamico que suscribe de la clase:

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + super.toString()+'}';
    }
    
    
    
}
