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
import javax.swing.JOptionPane;
import modelo.MedicamentoFormula;

/**
 *
 * @author johand
 */
public class MedicamentoFormulaDao {
    private final String nombreArchivo;
    private BufferedWriter bw;
    private BufferedReader br;
    public MedicamentoFormulaDao() {
        this.nombreArchivo = "Formulacion_Medicamento.txt";
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
            mensaje="Error al crearArchivo"+ex.getMessage();
        }
        return mensaje;
    }
    
    public List listarFormulaMedicamento(){
        List<String> formulasMedicamentos=new ArrayList();        
        String linea="";
        try{
            br=new BufferedReader(new FileReader(nombreArchivo));
            linea=br.readLine();
            while(linea!=null){                
                formulasMedicamentos.add(linea);
                linea=br.readLine();
            }
            br.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Eror de lectura de archivo"+", "+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Se creara el archivo faltante","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,crearArchivo());
        }        
        return formulasMedicamentos;
    }
    
    public void guardarFormulaEnfermedad(List listaMedicamento){        
        try{            
            bw=new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i=0;i<listaMedicamento.size();i++){              
                MedicamentoFormula medicamento=(MedicamentoFormula) listaMedicamento.get(i);
                bw.append(medicamento.datoFormulaMedicamento());
                bw.newLine();           
            }
            bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar"+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
        }
    }    
}
