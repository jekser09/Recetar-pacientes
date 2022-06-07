/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EnfermedadCtrl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johand
 */
public class VistaEnfermedades extends javax.swing.JPanel {
    
    private final EnfermedadCtrl control;
    private DefaultTableModel modelot;    
    private boolean add=true;
    private int pos;
    /**
     * Creates new form vistaEnfermedades
     */
    public VistaEnfermedades() {
        initComponents();
        control=new EnfermedadCtrl();
        validarLetras(txtNombre);
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbEnfermedades = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoEnfermedad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        btnNuevo = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 0, 0));
        setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Enfermedades");

        jtbEnfermedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtbEnfermedades.setEnabled(false);
        jScrollPane1.setViewportView(jtbEnfermedades);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("Tipo Enfermedad: ");

        cmbTipoEnfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tipo1", "Tipo2", "Tipo3", "Tipo4" }));
        cmbTipoEnfermedad.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        jLabel4.setText("Descripcion");

        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        txtaDescripcion.setEnabled(false);
        jScrollPane2.setViewportView(txtaDescripcion);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevoVirus.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/añadirVirus.png"))); // NOI18N
        btnAñadir.setToolTipText("Añadir");
        btnAñadir.setEnabled(false);
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hacker.png"))); // NOI18N
        btnGuardarCambios.setToolTipText("Guardar Cambios");
        btnGuardarCambios.setEnabled(false);
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editarVirus.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminarVirus.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardarCambios)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbTipoEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNuevo)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addGap(27, 27, 27)
                                                .addComponent(btnAñadir))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminar)
                                        .addGap(60, 60, 60)))))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCambios)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cmbTipoEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(btnNuevo)))
                    .addComponent(btnAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        estadoBotones(false,true);
        estadoCampos(true, true, true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        if(validarCampos()){
            if(add){
                if(control.verificarDuplicados(txtNombre.getText())){
                    control.adicionarEnfermedades(txtNombre.getText(),txtaDescripcion.getText(), 
                                                 (String) cmbTipoEnfermedad.getSelectedItem());
                    limpiarCampos();
                    estadoBotones(true,false);
                    estadoCampos(false,false,false);               
                    actualizarTabla();
                    btnGuardarCambios.setEnabled(true);
                }
            }else{
                control.getListaEnfermedades().get(pos-1).setNombre("");
                if(control.verificarDuplicados(txtNombre.getText())){
                    control.modificarEnfermedades(pos-1,txtNombre.getText(),txtaDescripcion.getText(),
                                                 (String) cmbTipoEnfermedad.getSelectedItem());
                    limpiarCampos();
                    estadoBotones(true,false);
                    estadoCampos(false,false,false);                 
                    actualizarTabla();
                    add=true;
                    btnGuardarCambios.setEnabled(true);
                }        
            }
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        control.guardarEnfermedades();
        btnGuardarCambios.setEnabled(false);
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{    
            modelot=(DefaultTableModel)jtbEnfermedades.getModel();       
            txtNombre.setText((String) modelot.getValueAt(jtbEnfermedades.getSelectedRow(), 1));
            txtaDescripcion.setText((String) modelot.getValueAt(jtbEnfermedades.getSelectedRow(),2));            
            cmbTipoEnfermedad.setSelectedItem(modelot.getValueAt(jtbEnfermedades.getSelectedRow(),3));
            add=false;
            pos=Integer.parseInt(modelot.getValueAt(jtbEnfermedades.getSelectedRow(), 0).toString());            
            lblError.setText("");
            estadoBotones(false,true);
            estadoCampos(true,true,true);
        }catch(Exception e){
            lblError.setText("No a seleccionado nada");
        }    
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            modelot=(DefaultTableModel)jtbEnfermedades.getModel();            
            control.eliminarEnfermedad((String) modelot.getValueAt(jtbEnfermedades.getSelectedRow(), 1));
            estadoTabla();
            actualizarTabla();
            btnGuardarCambios.setEnabled(true);
            lblError.setText("");            
        }catch(Exception e){
            lblError.setText("No a seleccionado nada");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbTipoEnfermedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbEnfermedades;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
        txtNombre.setText("");
        txtaDescripcion.setText("");
        cmbTipoEnfermedad.setSelectedIndex(0);
    }
    
    private void estadoBotones(boolean bnuevo,boolean bañadir){
        btnNuevo.setEnabled(bnuevo);
        btnAñadir.setEnabled(bañadir);        
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);        
    }
    
    private void estadoCampos(boolean txtnombre,boolean txtadescripcion,boolean cmb){
        txtNombre.setEnabled(txtnombre);
        txtaDescripcion.setEnabled(txtadescripcion);
        cmbTipoEnfermedad.setEnabled(cmb);
        jtbEnfermedades.setEnabled(false);
    }
    
    private void estadoTabla(){
        if(!control.getListaEnfermedades().isEmpty()){            
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            jtbEnfermedades.setEnabled(true);            
        }else{
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            jtbEnfermedades.setEnabled(false);
        }
    }
    
    private boolean validarCampos(){
        if(txtNombre.getText().equals("")||txtaDescripcion.getText().equals("")||cmbTipoEnfermedad.getSelectedIndex()==0){
            lblError.setText("Complete todos los campos");
            return false;
        }
        lblError.setText("");
        return true;
    }
    
    private void actualizarTabla(){
        jtbEnfermedades.setModel(control.modeloTabla());
        jtbEnfermedades.updateUI();
        estadoTabla();
    }
    
     private void validarLetras(JTextField t) {
        t.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(Character.isDigit(c)){
                    getToolkit().beep();
                    e.consume();
                }
            }        
        });
    }
}