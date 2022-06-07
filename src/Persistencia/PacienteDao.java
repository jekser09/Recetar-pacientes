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
import modelo.Paciente;

/**
 *
 * @author johand
 */
public class PacienteDao {
    private final String nombreArchivo;
    private BufferedWriter bw;
    private BufferedReader br;
    public PacienteDao() {
        this.nombreArchivo="Paciente.txt";
    }
    
    public String crearArchivo(){
        String mensaje="";
        try{
            bw=new BufferedWriter(new FileWriter(nombreArchivo,true));
            bw.write("");            
            bw.flush();
            bw.close();
            mensaje="Archivo creado con exito";
        }catch(IOException ex){
            mensaje="Error al crear archivo"+ex.getMessage();
        }
        return mensaje;
    }
    
    public List listarPaciente(){
        List<Paciente> listaPacientes=new ArrayList();
        Paciente paciente;
        String linea="";
        try{
            br=new BufferedReader(new FileReader(nombreArchivo));
            linea=br.readLine();
            while(linea!=null){
                paciente=convertirPaciente(linea);
                listaPacientes.add(paciente);
                linea=br.readLine();
            }
        }catch(IOException ex){            
            JOptionPane.showMessageDialog(null,"Eror de lectura de archivo"+", "+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Se creara el archivo faltante","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,crearArchivo());                  
        }        
        return listaPacientes;
    }
    
    public void guardarPaciente(List listaPacientes){
        try{
            bw=new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i=0;i<listaPacientes.size();i++){
                Paciente paciente=(Paciente) listaPacientes.get(i);
                bw.append(paciente.datosPaciente());
                bw.newLine();
            }
            bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar"+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private Paciente convertirPaciente(String linea){
        Paciente paciente=new Paciente();
        StringTokenizer st=new StringTokenizer(linea,",");
        paciente.setId(Integer.parseInt(st.nextToken()));
        paciente.setCedula(Integer.parseInt(st.nextToken()));
        paciente.setNombre(st.nextToken());
        paciente.setEdad(Integer.parseInt(st.nextToken()));
        paciente.setGenero(st.nextToken());
        paciente.setFoto(st.nextToken());        
        return paciente;
    } 
}
