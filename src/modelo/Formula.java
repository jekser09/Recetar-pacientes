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
public class Formula {
    private int id;
    private int cedulaPaciente;
    private String descripcion;          
    private String fecha;

    public Formula(int id, int cedulaPaciente, String descripcion, String fecha) {
        this.id = id;
        this.cedulaPaciente = cedulaPaciente;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Formula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(int cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

      
    
    public String datosFormula(){
        return id+","+cedulaPaciente+","+descripcion+","+fecha;
    }
    
}
