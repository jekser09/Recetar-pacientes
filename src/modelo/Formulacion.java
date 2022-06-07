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
public class Formulacion {
    private int id;
    private String descripcion;
    private String fecha;

    public Formulacion(int id, String descripcion, String fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Formulacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return id+","+descripcion+","+fecha;
    }
    
}
