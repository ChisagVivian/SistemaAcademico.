/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.controlador;
 
import ec.edu.espoch.sistemaacademicopao2.trabajadores.Trabajadores;
import ec.edu.espoch.sistemaacademicopao2.vistaPrincipal.NotificadorMenzajes;
import ec.edu.espoch.sistemaacademicopao2.trabajadores.ITrabajadores;
import ec.edu.espoch.sistemaacademicopao2.vistas.VTrabajador;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

public class ControladorTrabajador {
    
     private VTrabajador vista;
  private ITrabajadores trabajadores;

    public ControladorTrabajador(VTrabajador vista) {
        this.vista = vista;
        this.trabajadores = new Trabajadores (10);
    }
    
    public void agregarTravajador(){
        try {
            String gremio = vista.getGremio();
            
        } catch (Exception e) {
        }
    }
    
}
