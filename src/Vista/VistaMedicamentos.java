/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MedicamentoCtrl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author johand
 */
public class VistaMedicamentos extends javax.swing.JPanel {
    
    private MedicamentoCtrl control;
    private boolean add=true;
    private int pos;
    /**
     * Creates new form VistaMedicamentos
     */
    public VistaMedicamentos() {
        initComponents();
        control=new MedicamentoCtrl();
        validarLetras(txtNombre);
        actualizarLista();
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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMedicamento = new javax.swing.JList<>();
        btnNuevo = new javax.swing.JToggleButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        lblError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JToggleButton();
        btnMostrar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        cmbTipoMedicina = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setText("Medicamentos");

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel3.setText("Descripcion:");

        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        txtaDescripcion.setEnabled(false);
        jScrollPane1.setViewportView(txtaDescripcion);

        lstMedicamento.setEnabled(false);
        jScrollPane2.setViewportView(lstMedicamento);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevoMedicamento.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/listarMedicamento.png"))); // NOI18N
        btnRegistrar.setToolTipText("Añadir");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel4.setText("Lista medicina:");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editarMedicamento.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminarMedicamento.png"))); // NOI18N
        btnEliminar.setToolTipText("eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jeringa2.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jeringa1.png"))); // NOI18N

        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarMedicamento.png"))); // NOI18N
        btnGuardarCambios.setEnabled(false);
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mostrarMedicina.png"))); // NOI18N
        btnMostrar.setToolTipText("Ver infomacion");
        btnMostrar.setEnabled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo medicamento");

        cmbTipoMedicina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tipo1", "Tipo2", "Tipo3", "Tipo4", "Tipo5", "Tipo6", "Tipo7", "Tipo8", "Tipo9", "Tipo10", "Tipo11", "Tipo12" }));
        cmbTipoMedicina.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbTipoMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarCambios)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevo)
                                    .addComponent(btnRegistrar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cmbTipoMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnMostrar))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(btnGuardarCambios)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        estadoBotones(false,true);
        estadoCampos(true, true, true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(validarCampos()){
            if(add){
                if(control.verificarDuplicados(txtNombre.getText())){
                    control.adicionarMedicamento(txtNombre.getText(),txtaDescripcion.getText(),
                                                (String)cmbTipoMedicina.getSelectedItem());
                    limpiarCampos();
                    estadoBotones(true,false);
                    estadoCampos(false,false,false);
                    actualizarLista();
                    btnGuardarCambios.setEnabled(true);
                }
            }else{
                control.getListaMedicina().get(pos-1).setNombre("");
                if(control.verificarDuplicados(txtNombre.getText())){
                    control.modificarMedicina(pos-1,txtNombre.getText(),txtaDescripcion.getText(),
                                              (String)cmbTipoMedicina.getSelectedItem());
                    limpiarCampos();
                    estadoBotones(true,false);
                    estadoCampos(false,false,false);
                    actualizarLista();
                    add=true;
                    btnGuardarCambios.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        control.guardarArchivo();
        btnGuardarCambios.setEnabled(false);
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{            
            pos=control.buscarMedicamento(lstMedicamento.getSelectedValue()).getId();
            estadoBotones(false,true);
            estadoCampos(true,true,true);
            add=false;
            lblError.setText("");
            txtNombre.setText(control.buscarMedicamento(lstMedicamento.getSelectedValue()).getNombre());
            txtaDescripcion.setText(control.buscarMedicamento(lstMedicamento.getSelectedValue()).getDescripcion());
            cmbTipoMedicina.setSelectedItem(control.buscarMedicamento(lstMedicamento.getSelectedValue()).getTipo());            
        }catch(NullPointerException npe){
            lblError.setText("No ha seleccionado nada: "+npe.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        try{
            JOptionPane.showMessageDialog(null,"Nombre: "+control.buscarMedicamento(lstMedicamento.getSelectedValue()).getNombre()+"\n"
                                         +"Descripcion: "+control.buscarMedicamento(lstMedicamento.getSelectedValue()).getDescripcion()+"\n"
                                         +"Tipo Medicamento: "+control.buscarMedicamento(lstMedicamento.getSelectedValue()).getTipo(),
                                         "Datos",JOptionPane.INFORMATION_MESSAGE);
            lblError.setText("");
            
        }catch(NullPointerException npe){
            lblError.setText("No ha seleccionado nada: "+npe.getMessage());
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            control.eliminarMedicina(lstMedicamento.getSelectedValue());
            actualizarLista();
            lblError.setText("");
            btnGuardarCambios.setEnabled(true);            
        }catch(NullPointerException npe){
            lblError.setText("No ha seleccionado nada: "+npe.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnGuardarCambios;
    private javax.swing.JToggleButton btnMostrar;
    private javax.swing.JToggleButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbTipoMedicina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblError;
    private javax.swing.JList<String> lstMedicamento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
    
    private void limpiarCampos(){
        txtNombre.setText("");
        txtaDescripcion.setText("");
        cmbTipoMedicina.setSelectedIndex(0);
    }
    
    private void estadoBotones(boolean bnuevo, boolean bregistrar){
        btnNuevo.setEnabled(bnuevo);
        btnRegistrar.setEnabled(bregistrar);
        btnEditar.setEnabled(false);
        btnMostrar.setEnabled(false);
        btnEliminar.setEnabled(false);        
    }
    
    private void estadoCampos(boolean txnombre,boolean txdescripcion,boolean tipo){
        txtNombre.setEnabled(txnombre);
        txtaDescripcion.setEnabled(txdescripcion);
        cmbTipoMedicina.setEnabled(txnombre);
        lstMedicamento.setEnabled(tipo);        
    }
    
    private void estadoLista(){
        if(!control.getListaMedicina().isEmpty()){
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnMostrar.setEnabled(true);
            lstMedicamento.setEnabled(true);            
        }else{
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnMostrar.setEnabled(false);
            lstMedicamento.setEnabled(false);
        }
    }
    
    private boolean validarCampos(){
        if(txtNombre.getText().equals("")||txtaDescripcion.getText().equals("")||cmbTipoMedicina.getSelectedIndex()==0){
            lblError.setText("Complete todos los campos");
            return false;
        }
        lblError.setText("");
        return true;
    }
    
    private void actualizarLista(){
        lstMedicamento.setModel(control.modeloLista());
        lstMedicamento.updateUI();
        estadoLista();
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