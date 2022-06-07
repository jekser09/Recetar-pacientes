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
import modelo.Enfermedad;

/**
 *
 * @author johand
 */
public class EnfermedadDao {
    private final String nombreArchivo;
    private BufferedWriter bw;
    private BufferedReader br;

    public EnfermedadDao() {
        this.nombreArchivo="Enfermedad.txt";
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
    
    public List listarEnfermedad(){
        List<Enfermedad> listaEnfermedades=new ArrayList();
        Enfermedad enfermedad;
        String linea="";
        try{
            br=new BufferedReader(new FileReader(nombreArchivo));
            linea=br.readLine();
            while(linea!=null){
                enfermedad=convertirEnfermedad(linea);
                listaEnfermedades.add(enfermedad);
                linea=br.readLine();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Eror de lectura de archivo"+", "+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Se creara el archivo faltante","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,crearArchivo());
        }        
        return listaEnfermedades;
    }
    
    public void guardarEnfermedad(List listaEnfermedades){
        try{
            bw=new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i=0;i<listaEnfermedades.size();i++){
                Enfermedad enfermedad=(Enfermedad) listaEnfermedades.get(i);
                bw.append(enfermedad.datosEnfermedad());
                bw.newLine();
            }
            bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar"+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
        }
    }

    private Enfermedad convertirEnfermedad(String linea) {
        Enfermedad enfermedad=new Enfermedad();
        StringTokenizer st=new StringTokenizer(linea,",");
        enfermedad.setId(Integer.parseInt(st.nextToken()));
        enfermedad.setNombre(st.nextToken());
        enfermedad.setDescripcion(st.nextToken());
        enfermedad.setTipoEnfermedad(st.nextToken());
        return enfermedad;
    }
    
}
