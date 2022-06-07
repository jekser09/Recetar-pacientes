package modelo;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johand Esteban Castro Rodriguez 
 */
public class Paciente {
    private int id;
    private int cedula;
    private String nombre;
    private int edad;
    private String genero;
    private String foto;
    
    public Paciente(int id, int cedula, String nombre,int edad, String genero, String foto) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.foto = foto;
    }

    public Paciente() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String datosPaciente(){
        return id+","+cedula+","+nombre+","+edad+","+genero+","+foto;
    }
}
