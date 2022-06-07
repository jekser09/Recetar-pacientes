/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Persistencia.EnfermedadDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modelo.Enfermedad;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johand
 */
public class EnfermedadCtrl {
    private Enfermedad enfermedad;
    private EnfermedadDao enfermedadDao;
    private List<Enfermedad> listaEnfermedades;
    
    public EnfermedadCtrl(){
        enfermedadDao=new EnfermedadDao();
        listaEnfermedades=enfermedadDao.listarEnfermedad();
        if(listaEnfermedades.isEmpty())
           listaEnfermedades=new ArrayList();           
        modeloTabla();
    }
    
    public void adicionarEnfermedades(String nombre,String descripcion,String tipoEnfermedad){
        enfermedad=new Enfermedad(listaEnfermedades.size()+1, nombre, descripcion, tipoEnfermedad);
        listaEnfermedades.add(enfermedad);
        JOptionPane.showMessageDialog(null,"Enfermedad añadida con exito","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void guardarEnfermedades(){
        enfermedadDao.guardarEnfermedad(listaEnfermedades);
        JOptionPane.showMessageDialog(null,"Archivo de datos actualizado","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Enfermedad buscarEnfermedades(String nombre){        
        enfermedad=null;
        for(Enfermedad enfermedad1: listaEnfermedades){
            if(enfermedad1.getNombre().equals(nombre))
                enfermedad=enfermedad1;            
        }
        return enfermedad;
    }
    
    public void eliminarEnfermedad(String nombre){        
        for(int i=0;i<listaEnfermedades.size();i++){
            if(listaEnfermedades.get(i).getNombre().equals(nombre)){                
                listaEnfermedades.remove(i);
                for(int j=i;j<listaEnfermedades.size();j++){
                    listaEnfermedades.get(j).setId(j+1);
                }
                JOptionPane.showMessageDialog(null,"Dato elimado con exito","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public void modificarEnfermedades(int posicion,String nombre,String descripcion,String tipoEnfermedad){
        enfermedad=listaEnfermedades.get(posicion);
        enfermedad.setNombre(nombre);
        enfermedad.setDescripcion(descripcion);
        enfermedad.setTipoEnfermedad(tipoEnfermedad);
        JOptionPane.showMessageDialog(null,"Datos modificado con exito","Informacion",JOptionPane.INFORMATION_MESSAGE);
    }    
    
    
    public boolean verificarDuplicados(String nombre){
        for(Enfermedad enfermedad1: listaEnfermedades){
            if(enfermedad1.getNombre().equals(nombre)){
                return false;
            }
        }
        return true;
    }

    public List<Enfermedad> getListaEnfermedades() {
        return listaEnfermedades;
    }
    
    public DefaultTableModel modeloTabla(){
        DefaultTableModel modelo=new DefaultTableModel();
        String []datos=new String[4];
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("TIPO");
        for(int i=0;i<listaEnfermedades.size();i++){
            datos[0]=Integer.toString(listaEnfermedades.get(i).getId());
            datos[1]=listaEnfermedades.get(i).getNombre();
            datos[2]=listaEnfermedades.get(i).getDescripcion();
            datos[3]=listaEnfermedades.get(i).getTipoEnfermedad();
            modelo.addRow(datos);
        }        
        return modelo;
    }
    
    public DefaultListModel modeliLista(){
        DefaultListModel modelo=new DefaultListModel();
        for(int i=0;i<listaEnfermedades.size();i++){
            modelo.addElement(listaEnfermedades.get(i).getNombre());
        }
        return modelo;
    }   
}
