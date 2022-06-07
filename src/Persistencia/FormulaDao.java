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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Formula;

/**
 *
 * @author johand
 */
public class FormulaDao {
    private final String nombreArchivo;
    private BufferedWriter bw;
    private BufferedReader br;
    public FormulaDao() {
        this.nombreArchivo="Formulas.txt";
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
    
    public List listarFormula(){
        List<Formula> listaFormulas=new ArrayList();
        Formula formula;
        String linea="";
        try{
            br=new BufferedReader(new FileReader(nombreArchivo));
            linea=br.readLine();
            while(linea!=null){                
                formula=convertirFormula(linea);
                listaFormulas.add(formula);
                linea=br.readLine();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Eror de lectura de archivo"+", "+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Se creara el archivo faltante","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,crearArchivo());
        }        
        return listaFormulas;
    }
    
    public void guardarFormula(List listaFormulas){       
        try{
            bw=new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i=0;i<listaFormulas.size();i++){
            Formula formula=(Formula)listaFormulas.get(i);
            bw.append(formula.datosFormula());
            bw.newLine();
            }
            bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Error al guardar"+ex.getMessage(),"ALERTA",JOptionPane.ERROR_MESSAGE);            
        }
    }   

    private Formula convertirFormula(String linea) {
        Formula formula=new Formula();
        StringTokenizer st=new StringTokenizer(linea,",");
        formula.setId(Integer.parseInt(st.nextToken()));
        formula.setCedulaPaciente(Integer.parseInt(st.nextToken()));
        formula.setDescripcion(st.nextToken());
        formula.setFecha(st.nextToken());
        return formula;
    }
}
