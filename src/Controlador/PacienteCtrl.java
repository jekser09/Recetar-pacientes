/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Persistencia.PacienteDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Paciente;

/**
 *
 * @author johand
 */
public class PacienteCtrl {
    private Paciente paciente;
    private PacienteDao pacienteDao;
    private List<Paciente> listaPacientes;    

    public PacienteCtrl(){
        pacienteDao=new PacienteDao();
        listaPacientes=pacienteDao.listarPaciente();               
        if(listaPacientes.isEmpty())
           listaPacientes=new ArrayList();
    }  
    
    public void adicionarPacientes(int cedula,String nombre,int edad,String genero, String foto){
        paciente=new Paciente(listaPacientes.size()+1,cedula, nombre, edad, genero, foto);
        listaPacientes.add(paciente);        
        JOptionPane.showMessageDialog(null,"Paciente adicionado","Informacion",JOptionPane.INFORMATION_MESSAGE);        
    }
    
    public void guardarPacientes(){
        pacienteDao.guardarPaciente(listaPacientes);
        JOptionPane.showMessageDialog(null,"Archivo de datos actualizado","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Paciente buscarPaciente(int cedula){
        paciente=null;
        for(Paciente paciente1: listaPacientes){
            if(paciente1.getCedula()==cedula){
                paciente=paciente1;
                break;
            }
        }
        return paciente;        
    }
    
    public void modificarPaciente(int posicion,int cedula,String nombre,int edad,String genero,String foto){
        paciente=listaPacientes.get(posicion);
        paciente.setCedula(cedula);        
        paciente.setNombre(nombre);
        paciente.setEdad(edad);
        paciente.setGenero(genero);
        paciente.setFoto(foto);
        JOptionPane.showMessageDialog(null,"Paciente modificado","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void eliminarPaciente(int cedula){
        for(int i=0;i<listaPacientes.size();i++){
            if(listaPacientes.get(i).getCedula()==cedula){             
                listaPacientes.remove(i);
                for(int j=i;j<listaPacientes.size();j++){
                    listaPacientes.get(j).setId(j+1);
                }
                JOptionPane.showMessageDialog(null,"Paciente eliminado","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public DefaultListModel modeloPacientes(){
        DefaultListModel modelo=new DefaultListModel();
        for(int i=0;i<listaPacientes.size();i++){
            modelo.addElement(listaPacientes.get(i).getNombre()+","+listaPacientes.get(i).getCedula());
        }
        return modelo;
    }   
    
    public boolean verificarDuplicados(int cedula){
        for(int i=0;i<listaPacientes.size();i++){
            if(listaPacientes.get(i).getCedula()==cedula){
                JOptionPane.showMessageDialog(null,"Esta cedula: "+cedula+" ya existe","Informacion",JOptionPane.INFORMATION_MESSAGE);                
                return false;                
            }
        } 
        return true;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }   
}
