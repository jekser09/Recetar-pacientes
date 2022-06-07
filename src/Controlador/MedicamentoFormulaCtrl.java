/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Persistencia.MedicamentoFormulaDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.MedicamentoFormula;

/**
 *
 * @author Sala_02
 */
public class MedicamentoFormulaCtrl {    
    private MedicamentoFormula mediFormula;
    private MedicamentoFormulaDao medDao;
    private List<MedicamentoFormula> medicamentoXformula;
    
    
    public MedicamentoFormulaCtrl(){
        medDao=new MedicamentoFormulaDao();
        medicamentoXformula=medDao.listarFormulaMedicamento();        
        if(medicamentoXformula==null){
            medicamentoXformula=new ArrayList();
        }                
    }
    
    public void adicionarMedicamento(String cedula,String nombreMedicamento){
        mediFormula=new MedicamentoFormula(cedula, nombreMedicamento);
        medicamentoXformula.add(mediFormula);        
    }
    
    public String buscarMedixFor(String cedula){
        String medicamento="";
        for(int i=0;i<medicamentoXformula.size();i++){
            if(medicamentoXformula.get(i).getCedula().equals(cedula)){
                medicamento=medicamentoXformula.get(i).getMedicamento();
                break;
            }
        }
        return medicamento;
    }
    
    public void eliminarMedicamento(String cedula){
        for(int i=0;i<medicamentoXformula.size();i++){
            if(medicamentoXformula.get(i).getCedula().equals(cedula)){
                medicamentoXformula.remove(i);
                break;
            }
        }
    }
    
    public void guardarMedicamentoxFormula(){
        medDao.guardarFormulaEnfermedad(medicamentoXformula);
    }       
}
