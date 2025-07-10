/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.trabajadores;

import ec.edu.espoch.sistemaacademicopao2.empleado.Empleado;

/**
 *
 * @author Usuario
 */
public class Trabajador extends Empleado {
    
    
   private String gremio;

   //Contructores..........   
    public Trabajador(String gremio, double sueldo, String correoInstitucional, int id, String Nombre, String Correopersonal, String Cedula) {
        super(sueldo, correoInstitucional, id, Nombre, Correopersonal, Cedula);
        this.gremio = gremio;
    }
    
    //setter and getter........

    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }
    
    // polimorfismo dinamico..........

    @Override
    public String toString() {
        return "Trabajador{" + "gremio=" + gremio + '}';
    }
    
    
   
   
}
