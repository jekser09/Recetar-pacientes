/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Persistencia.PacienteEnfermedadDao;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import modelo.PacienteEnfermedad;

/**
 *
 * @author Sala_02
 */
public class PacienteEnfermedadCtrl {
    private PacienteEnfermedad pacienteEn;
    private PacienteEnfermedadDao peDao;
    private List<PacienteEnfermedad> pacienteEnfermo;
    private StringTokenizer st;
    public PacienteEnfermedadCtrl(){
        peDao=new PacienteEnfermedadDao();
        pacienteEnfermo=peDao.listarPacienteEnfermo();
        if(pacienteEnfermo.isEmpty()){
            pacienteEnfermo=new ArrayList();
        }
    }
    
    public void guardarEnfermedadxPaciente(){
        peDao.guardarPaciente(pacienteEnfermo);
        JOptionPane.showConfirmDialog(null,"Archivos de datos actualizado","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void adicionarPacienteEnfermo(int cedula,String nombreEnfermedad){
        if(validarDuplicados(nombreEnfermedad)){
        pacienteEn=new PacienteEnfermedad(cedula, nombreEnfermedad);
        pacienteEnfermo.add(pacienteEn);       
        }
    }
    
    public String buscarEnfermedadxPaciente(int ced){
        String enfermedades="";
        for(int i=0;i<pacienteEnfermo.size();i++){            
            st=new StringTokenizer(pacienteEnfermo.get(i).pacienteEnfermo(),",");
            if(st.nextToken().equals(ced)){
                enfermedades=enfermedades+","+st.nextToken();
            }
        }
        return enfermedades;
    }
    
    public void eliminarEnfermedad(int ced){
        for(int i=0;i<pacienteEnfermo.size();i++){            
            st=new StringTokenizer(pacienteEnfermo.get(i).pacienteEnfermo(),",");
            if(st.nextToken().equals(ced)){
                pacienteEnfermo.remove(i);
            }
        }
    }   
    
    public boolean validarDuplicados(String dato){
        for(int i=0;i<pacienteEnfermo.size();i++){
            if(pacienteEnfermo.get(i).getNombreEnfermedad().equals(dato)){
                return false;
            }
        }
        return true;
    }
}
