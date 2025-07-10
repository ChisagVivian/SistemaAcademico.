/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.profesores;

/**
 *
 * @author Usuario
 */
public interface IProfesores {

    public String agregarProfesor(Profesor profesor);
    public boolean actualizarProfesor(int i,Profesor profesor);
    public boolean eliminarProfesor(int i, Profesor profesor);
    public void imprimirProfesor();
    public void guardarProfesor();
    public void cerrarProfesor();

}
