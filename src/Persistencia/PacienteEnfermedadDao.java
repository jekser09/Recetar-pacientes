/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import modelo.PacienteEnfermedad;

/**
 *
 * @author johand
 */
public class PacienteEnfermedadDao {
    private final String nombreArchivo;
    private BufferedWriter bw;
    private BufferedReader br;
    public PacienteEnfermedadDao() {
        this.nombreArchivo="Enfermedad_Paciente.txt";
    }
    
    public String crearArchivo(){
        String mensaje="";
        try{
            bw=new BufferedWriter(new FileWriter(nombreArchivo,true));
            bw.write("");            
            bw.flush();
            bw.close();
            mensaje="archivo creado con exito";
        }catch(IOException ex){
            mensaje="Error al crear archivo"+ex.getMessage();
        }
        return mensaje;
    }
    
    public List listarPacienteEnfermo(){
        List<PacienteEnfermedad> pacientesEnfermos=new ArrayList();
        PacienteEnfermedad pacienteEnfermo;
        String linea="";
        try{
            br=new BufferedReader(new FileReader(nombreArchivo));
            linea=br.readLine();
            while(linea!=null){
                pacienteEnfermo=convertirPacienteEnfermo(linea);
                pacientesEnfermos.add(pacienteEnfermo);
                linea=br.readLine();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Eror de lectura de archivo "+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Se creara el archivo faltante","Informacion",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showConfirmDialog(null,crearArchivo(),"Confirmacion",JOptionPane.PLAIN_MESSAGE);
        }        
        return pacientesEnfermos;
    }
    
    public void guardarPaciente(List listaPacientes){
        try{
            bw=new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i=0;i<listaPacientes.size();i++){
                PacienteEnfermedad pacienteEnfermo=(PacienteEnfermedad) listaPacientes.get(i);
                bw.append(pacienteEnfermo.pacienteEnfermo());
                bw.newLine();
            }
            bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar"+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private PacienteEnfermedad convertirPacienteEnfermo(String linea){
        PacienteEnfermedad pacienteEnfermo=new PacienteEnfermedad();
        StringTokenizer st=new StringTokenizer(linea,",");
        pacienteEnfermo.setCedulaPaciente(Integer.parseInt(st.nextToken()));
        pacienteEnfermo.setNombreEnfermedad(st.nextToken());
        return pacienteEnfermo;
    } 
    
}
