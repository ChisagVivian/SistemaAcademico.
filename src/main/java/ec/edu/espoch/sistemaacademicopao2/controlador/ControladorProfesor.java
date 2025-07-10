/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemaacademicopao2.controlador;

import ec.edu.espoch.sistemaacademicopao2.profesores.Escalafon;
import ec.edu.espoch.sistemaacademicopao2.vistaPrincipal.NotificadorMenzajes;
import ec.edu.espoch.sistemaacademicopao2.profesores.Profesor;
import ec.edu.espoch.sistemaacademicopao2.profesores.IProfesores;
import ec.edu.espoch.sistemaacademicopao2.profesores.Profesores;
import ec.edu.espoch.sistemaacademicopao2.vistas.VProfesor;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

public class ControladorProfesor {

    private VProfesor vista;
    private IProfesores profesores;

    public ControladorProfesor(VProfesor vista) {
        this.vista = vista;
        this.profesores = new Profesores(10);
    }

    public void agregarProfesores() {
        try {
            String nivel = vista.getNivel();
            String ID = vista.getId();
            String nombre = vista.getNombre();
            String Cedula =vista.getCedula();
            String CorreoPersonal =vista.getCorreoPersonal();
            String CorreoInstitucional = vista.getCorreoInstitucional();

        } catch (Exception e) {
        }
    }
}
