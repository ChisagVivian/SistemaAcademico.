/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.decanos;



public class Decanos implements IDecanos {

private final Decano[] decanos;
    private int totalDecanos;


    public Decanos(int dimension) {

        decanos = new Decano[dimension];
        totalDecanos = 0;
    }

    @Override
    public String agregarDecanos(Decano decano) {
        if (totalDecanos == decanos.length) {
            return "Error";
        } else {
            decanos[totalDecanos] = decano;
            totalDecanos = totalDecanos + 1;
            return "Agregado con exito estudiante";
        }
    }

@Override
    public void imprimirDecanos(){
        for (int i = 0; i < totalDecanos; i++) {
            System.out.println("Nivel jerarquico "+decanos[i].getNivel());
            System.out.println("Nombre "+decanos[i].getNombre());
            System.out.println("Correo personal "+decanos[i].getCorreopersonal());
        }
    }


    public boolean actualizarDecanos(int i, Decano decano) {
         decanos[i]= decano;
        return false;
    }


    public boolean eliminarDecanos(int i, Decano decano) {
       decanos[i]= decano;
       return false;
    }
    
    

    @Override
    public void guardarDecanos() {
        System.out.println("lista de estudiantes: ");
         for (int i = 0; i < totalDecanos; i++) {
             System.out.println(decanos[i]);
    }
    }
   
 
@Override
    public void cerrarDecanos(){
          
        System.out.println("Proceso finalizado. recursos liberados");
    }

}
