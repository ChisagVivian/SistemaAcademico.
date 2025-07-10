/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.trabajadores;

/**
 *
 * @author Usuario
 */
public class Trabajadores implements ITrabajadores{
    
    
   private final Trabajador[] trabajadores;
    private int totaltrabajadores;

    public Trabajadores(int dimension) {
        trabajadores = new Trabajador[dimension];
        totaltrabajadores = 0;
    }

   @Override
    public String agregarTrabajadores(Trabajador trabajador) {
        if (totaltrabajadores == trabajadores.length) {
            return "Error";
        } else {
            trabajadores[totaltrabajadores] = trabajador;
            totaltrabajadores = totaltrabajadores + 1;
            return "Agregado con exito los trabajadores";
        }
    }

   @Override
    public boolean actualizarTrabajadores(int i, Trabajador trabajador) {
        trabajadores[i]= trabajador;
        return false;
    }

   @Override
    public boolean eliminarTrabajadores(int i,Trabajador trabajador) {
        trabajadores[i]= trabajador;
        return false;
    }
    
   @Override
    public void imprimirTrabajador(){
        for (int i = 0; i < totaltrabajadores; i++) {
            
            System.out.println("Gremio "+trabajadores[i].getGremio());
            System.out.println("Id "+trabajadores[i].getId());
            System.out.println("Nombre "+trabajadores[i].getNombre());
            System.out.println("correo personal "+trabajadores[i].getCorreopersonal());
        }
    }

   @Override
    public void guardarTrabajadores() {

        System.out.println("lista de estudiantes: ");
        for (int i = 0; i < totaltrabajadores; i++) {
            System.out.println(trabajadores[i]);

        }
    }

   @Override
    public void cerrarTrabajadores() {

        System.out.println("lista de trabajadores: ");
        for (int i = 0; i < totaltrabajadores; i++) {
            System.out.println(trabajadores[i]);

        }
    }
}
