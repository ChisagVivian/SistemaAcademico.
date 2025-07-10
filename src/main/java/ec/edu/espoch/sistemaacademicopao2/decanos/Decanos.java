/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.decanos;



public class Decanos implements IDecanos {

    private Decano[] decanos;
    private int totalDecanos;

    public Decanos(int dimension) {
        decanos = new Decano[dimension];
       totalDecanos = 0;
        
    }
    
    public String agregarDecanos( Decano decano){
 
        if(totalDecanos == decanos.length){
           return "Error";
         }else{
          decanos[totalDecanos]= decano;
          totalDecanos = totalDecanos + 1;
           return "Decano Agregado correctamente"; 
         }
    }
    
    public void imprimirDecanos(){
        
        
       for (int i = 0; i < totalDecanos ; i++) {
            System.out.println("    DATOS    ");
            System.out.println("nivel" + decanos[i].getNivel());
            System.out.println("Nombre" +decanos[i].toString());

        }
        
    }

    public boolean actualizarDecanos(){
   return true;
        
    }

    public boolean eliminarDecanos(){
        
        return true;
        
    }

    public void guardarDecanos(){
         
    }

    public boolean cerrarDecanos(){
        
        return true;
    }

}
 /*
 private final Estudiante[]estudiantes;
 private int totalEstudiantes;

//ponre las partes iniciales del objeto.
    public Estudiantes(int dimension) {
        
        estudiantes = new Estudiante[dimension];
        totalEstudiantes= 0;
    }
 
 
 @Override
    public boolean agregarPersona( Estudiante estudiante) {
        
        if(totalEstudiantes == estudiantes.length){
           return false;
         }else{
          estudiantes[totalEstudiantes]= estudiante;
          totalEstudiantes = totalEstudiantes + 1;
           return true; 
         }
    }


//lo que esta adentro del metodo con parentesis(son argumentos dentro del metodo.)
    // ejemplo:
    //public void imprimirEstudiantes(Estudiante[] estudiantes)
 @Override
    public void imprimirEstudiantes() {

       for (int i = 0; i < totalEstudiantes ; i++) {

            System.out.println("nombre" + estudiantes[i].getNombre());
            System.out.println("Edad" + estudiantes[i].getEdad());
            System.out.println("direccion" + estudiantes[i].getDireccion());
        }
    }
    
 @Override
    public boolean actualizarEstudiantes(int i, Estudiante estudiante){
        estudiantes [i] = estudiante;
        return true;
    }
    
    public boolean eliminarEstudiantes(){
        return true;
    }


}
*/