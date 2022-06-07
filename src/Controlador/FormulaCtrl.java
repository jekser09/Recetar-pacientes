/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Persistencia.EnfermedadDao;
import Persistencia.FormulaDao;
import Persistencia.MedicamentoDao;
import Persistencia.MedicamentoFormulaDao;
import Persistencia.PacienteDao;
import Persistencia.PacienteEnfermoDao;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Enfermedad;
import modelo.Formula;
import modelo.Medicamento;
import modelo.Paciente;

/**
 *
 * @author johand
 */
public class FormulaCtrl {
    
    private Formula formula;
    private FormulaDao formulaDao;
    private List<Formula> listaFormulas;
    StringTokenizer st;
    
    public FormulaCtrl(){
        formula=new Formula();
        formulaDao=new FormulaDao();
        listaFormulas=formulaDao.listarFormula();       
    }   
    
    public void adicionarFormula(int cedulaPaciente,String descripcion,String fecha){
        formula=new Formula(listaFormulas.size()+1, cedulaPaciente, descripcion, fecha);
        listaFormulas.add(formula);
        JOptionPane.showMessageDialog(null,"Formula adicionada","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void guardarFormulas(){
        formulaDao.guardarFormula(listaFormulas);
        JOptionPane.showMessageDialog(null,"Archivo de datos actualizado");        
    }
    
     public List<Formula> getListaFormulas() {
        return listaFormulas;
    }
     
    /*public String buscarFormulas(int ced){       
        String datosCompletos="";       
        for(Formula formula1:listaFormulas){
            if(formula1.getCedulaPaciente()==ced){
                datosCompletos=Integer.toString(formula1.getId())+","
                               +Integer.toString(formula1.getCedulaPaciente())+","
                               +formula1.getDescripcion()+","+formula1.getFecha()+","
                               +buscarPaciente(ced).getNombre()+","
                               +buscarPaciente(ced).getEdad()+","
                               +buscarPaciente(ced).getGenero()+","
                               +buscarPaciente(ced).getFoto()
                               +buscarEnfermedadxPaciente(ced)+","
                               +buscarMedicamentoxFormula(formula1.getId());
                break;
            }
        }
        
        return datosCompletos;
    }*/   
}
