/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.profesores;

/**
 *
 * @author Usuario
 */
public class Profesores implements IProfesores {

private final Profesor[] profesores;
    private int totalProfesores;

    public Profesores(int dimension) {
        profesores = new Profesor[dimension];
        totalProfesores = 0;
    }

    public String agregarProfesor(Profesor profesor) {
        if (totalProfesores == profesores.length) {
            return "Error";
        } else {
            profesores[totalProfesores] = profesor;
            totalProfesores = totalProfesores + 1;
            return "Agregado con exito profesor";
        }
    }

    public boolean actualizarProfesor(int i,Profesor profesor) {
       profesores[i] = profesor;
       return true;
    }

    public boolean eliminarProfesor(int i,Profesor profesor) {
        profesores[i] = profesor;
       return false;
    }
    public void imprimirProfesor(){
        for (int i = 0; i < totalProfesores; i++) {
            System.out.println("ID"+profesores[i].getId());
            System.out.println("cedula "+profesores[i].getNombre());
            System.out.println("correo personal "+profesores[i].getCorreopersonal());
            System.out.println("Nombre "+profesores[i].getNombre());
        }
    }
    public void guardarProfesor() {
        System.out.println("lista de estudiantes: ");
         for (int i = 0; i < totalProfesores; i++) {
             System.out.println(profesores[i]);
             
        }
    }

    public void cerrarProfesor() {
        System.out.println("Proceso finalizado. recursos liberados");

    }
}
