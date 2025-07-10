/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.trabajadores;


public interface ITrabajadores {

    public String agregarTrabajadores(Trabajador trabajador);
    public boolean actualizarTrabajadores(int i,Trabajador trabajador);
    public boolean eliminarTrabajadores(int i,Trabajador trabajador);
    public void imprimirTrabajador();
    public void guardarTrabajadores();
    public void cerrarTrabajadores();

}
