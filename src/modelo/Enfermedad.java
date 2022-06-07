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
public class Enfermedad {
    private int id;
    private String nombre;
    private String descripcion;
    private String tipoEnfermedad;

    public Enfermedad(int id, String nombre, String descripcion, String tipoEnfermedad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoEnfermedad = tipoEnfermedad;
    }

    public Enfermedad() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(String tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }
    
    public String datosEnfermedad(){
        return id+","+nombre+","+descripcion+","+tipoEnfermedad;
    }
}
