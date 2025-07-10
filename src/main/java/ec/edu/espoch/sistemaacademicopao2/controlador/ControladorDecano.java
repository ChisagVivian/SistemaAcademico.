/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.controlador;

import ec.edu.espoch.sistemaacademicopao2.decanos.Decano;
import ec.edu.espoch.sistemaacademicopao2.vistaPrincipal.NotificadorMenzajes;
import ec.edu.espoch.sistemaacademicopao2.decanos.Decanos;
import ec.edu.espoch.sistemaacademicopao2.decanos.IDecanos;
import ec.edu.espoch.sistemaacademicopao2.vistas.VDecanos;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class ControladorDecano {

    private VDecanos vista;
    private IDecanos decanos;

    public ControladorDecano(VDecanos vista) {
        this.vista = vista;
        this.decanos = new Decanos(10);
    }

    public void agregarDecano() {
        try {
            String nivel = vista.getNivel();
            String ID = vista.getId();
            String nombre = vista.getNombre();
            String Cedula =vista.getCedula();
            String CorreoPersonal =vista.getCorreoPersonal();
            String CorreoInstitucional = vista.getCorreoInstitucional();
            String Sueldo =vista.getSueldo ();
            boolean respuesta;
            respuesta = IDecanos.agregarDecanos(nivel,ID, nombre,Cedula,CorreoPersonal, CorreoInstitucional,Sueldo);
            
            if (respuesta) {
                System.out.println("Decano Agregado correctamente");
            }else{
                System.out.println("No se pudo agregar correctamente el ID.decano");
            }
        } catch (Exception e) {
           
            System.out.println("Error");
        }
        
        }
    
    private void ActualizarTabla(){
        DefaultTableModel modeloTabla = VDecanos.;
    }

    }
