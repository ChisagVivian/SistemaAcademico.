/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.decanos;

/**
 *
 * @author Usuario
 */
public interface IDecanos {
    
    
    public String agregarDecanos(Decano decano);
    public boolean actualizarDecanos(int i, Decano decano);
    public void imprimirDecanos();
    public boolean eliminarDecanos(int i, Decano decano);
    public void guardarDecanos();
    public void cerrarDecanos();
}
