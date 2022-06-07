/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Persistencia.MedicamentoDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Medicamento;

/**
 *
 * @author johand
 */
public class MedicamentoCtrl {
    private Medicamento medicamento;
    private MedicamentoDao medicamentoDao;
    private List<Medicamento> listaMedicina;
    
    public MedicamentoCtrl(){
        medicamentoDao=new MedicamentoDao();
        listaMedicina=medicamentoDao.listarMedicamento();
        if(listaMedicina.isEmpty())
            listaMedicina=new ArrayList();
    }
    
    public void adicionarMedicamento(String nombre,String descripcion,String tipo){
        medicamento=new Medicamento(listaMedicina.size()+1, nombre, descripcion,tipo);
        listaMedicina.add(medicamento);
        JOptionPane.showMessageDialog(null,"Medicamento adicionado","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void guardarArchivo(){
        medicamentoDao.guardarMedicamento(listaMedicina);
        JOptionPane.showMessageDialog(null,"Archivo de datos actualizado","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Medicamento buscarMedicamento(String nombre){
        medicamento=null;
        for(Medicamento medicina: listaMedicina){
            if(medicina.getNombre().equals(nombre)){
                medicamento=medicina;
                break;
            }
        }
        return medicamento;
    }
    
    public void modificarMedicina(int posicion,String nombre,String descripcion,String tipo){
        medicamento=listaMedicina.get(posicion);
        medicamento.setNombre(nombre);
        medicamento.setDescripcion(descripcion);
        medicamento.setTipo(tipo);
        JOptionPane.showMessageDialog(null,"Dato modificado","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void eliminarMedicina(String nombre){
        for(int i=0;i<listaMedicina.size();i++){
            if(listaMedicina.get(i).getNombre().equals(nombre)){
                listaMedicina.remove(i);
                for(int j=i;j<listaMedicina.size();j++){
                    listaMedicina.get(j).setId(j+1);
                }
            }
        }
    }
    
    public DefaultListModel modeloLista(){
        DefaultListModel modelo=new DefaultListModel();
        for(int i=0;i<listaMedicina.size();i++){
            modelo.addElement(listaMedicina.get(i).getNombre());
        }
        return modelo;      
    }
    
    public boolean verificarInfo(){
        if(listaMedicina.size()==medicamentoDao.listarMedicamento().size()){
            return false;
        }
        JOptionPane.showMessageDialog(null,"Ha modificado la informacion: Recuerde guardar los cambios","Alerta",JOptionPane.WARNING_MESSAGE);
        return true;
    }
    
    public boolean verificarDuplicados(String nombre){
        for(Medicamento medicina: listaMedicina){
            if(medicina.getNombre().equals(nombre)){
                JOptionPane.showMessageDialog(null,"Este nombre: "+nombre+" ya existe","Advertencia",JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public List<Medicamento> getListaMedicina() {
        return listaMedicina;
    }
    
        
}
