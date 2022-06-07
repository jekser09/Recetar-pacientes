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
import modelo.Medicamento;

/**
 *
 * @author johand
 */
public class MedicamentoDao {
    private final String nombreArchivo;
    private BufferedWriter bw;
    private BufferedReader br;

    public MedicamentoDao() {
        this.nombreArchivo = "Medicamento.txt";
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
    
    public List listarMedicamento(){
        List<Medicamento> listaMedicamentos=new ArrayList();
        Medicamento medicamento;
        String linea="";
        try{
            br=new BufferedReader(new FileReader(nombreArchivo));
            linea=br.readLine();
            while(linea!=null){
                medicamento=convertirMedicamentos(linea);
                listaMedicamentos.add(medicamento);
                linea=br.readLine();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Eror de lectura de archivo"+", "+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Se creara el archivo faltante","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,crearArchivo());
        }        
        return listaMedicamentos;
    }
    
    public void guardarMedicamento(List listaMedicamentos){
        try{
            bw=new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i=0;i<listaMedicamentos.size();i++){
                Medicamento medicamento=(Medicamento) listaMedicamentos.get(i);
                bw.append(medicamento.datosMedicamento());
                bw.newLine();
            }
            bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar"+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private Medicamento convertirMedicamentos(String linea) {
        Medicamento medicamento=new Medicamento();
        StringTokenizer st=new StringTokenizer(linea,",");
        medicamento.setId(Integer.parseInt(st.nextToken()));
        medicamento.setNombre(st.nextToken());
        medicamento.setDescripcion(st.nextToken());
        medicamento.setTipo(st.nextToken());
        return medicamento;
    }
    
    
}
