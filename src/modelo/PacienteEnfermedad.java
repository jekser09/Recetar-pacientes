/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author johand
 */
public class PacienteEnfermedad {
    private int cedulaPaciente;
    private String nombreEnfermedad;

    public PacienteEnfermedad(int cedulaPaciente, String nombreEnfermedad) {
        this.cedulaPaciente = cedulaPaciente;
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public PacienteEnfermedad() {
    }

    public int getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(int cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    
    public String pacienteEnfermo(){
        return cedulaPaciente+","+nombreEnfermedad;
    }
    
}
