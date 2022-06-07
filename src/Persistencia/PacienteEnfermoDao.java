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
/**
 *
 * @author johand
 */
public class PacienteEnfermoDao {
    private final String nombreArchivo;    
    private BufferedWriter bw;
    private BufferedReader br;
    public PacienteEnfermoDao() {
        this.nombreArchivo="EnfermedadPaciente.txt";
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
    
    public List listarPacienteEnfermo(){
        List<String> pacienteEnfermo=new ArrayList();
        String linea="";
        try{
            br=new BufferedReader(new FileReader(nombreArchivo));
            linea=br.readLine();
            while(linea!=null){
                pacienteEnfermo.add(linea);                
                linea=br.readLine();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Eror de lectura de archivo"+", "+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Se creara el archivo faltante","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,crearArchivo());
        }        
        return pacienteEnfermo;
    }
    
    public void guardarPaciente(String dato){        
        try{
            bw=new BufferedWriter(new FileWriter(nombreArchivo));           
            bw.append(dato);              
            bw.newLine();           
            bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar"+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
        }
    }   
}
