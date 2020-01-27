/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorMascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Mascota;

/**
 *
 * @author Rodrigo
 */
public class VentanaNuevaMascota extends javax.swing.JFrame {

    /**
     * Creates new form VentanaNuevaMascota
     */
    public VentanaNuevaMascota() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_edad = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        sp_edad = new javax.swing.JSpinner();
        lbl_anios = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        cmb_tipo = new javax.swing.JComboBox<>();
        chk_atencionesPrevias = new javax.swing.JCheckBox();
        lbl_cantidad = new javax.swing.JLabel();
        sp_cantidadAtenciones = new javax.swing.JSpinner();
        chk_prop = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txt_nombreProp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        btn_guardar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconpet.png"))); // NOI18N
        jLabel1.setText("Nueva Mascota");

        lbl_nombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lbl_nombre.setText("Nombre:");

        lbl_edad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_edad.setText("Edad:");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sp_edad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sp_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 150, 1));

        lbl_anios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_anios.setText("años");

        lbl_tipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_tipo.setText("Tipo:");

        cmb_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)", "Perro", "Gato", "Tortuga" }));

        chk_atencionesPrevias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chk_atencionesPrevias.setText(" ¿Posee atenciones previas?");
        chk_atencionesPrevias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_atencionesPreviasActionPerformed(evt);
            }
        });

        lbl_cantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_cantidad.setText("Cantidad:");

        sp_cantidadAtenciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sp_cantidadAtenciones.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sp_cantidadAtenciones.setEnabled(false);

        chk_prop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chk_prop.setText(" ¿Posee dueño?");
        chk_prop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_propActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Nombre Dueño:");

        txt_nombreProp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nombreProp.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Descripción:");

        txt_descripcion.setColumns(20);
        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion);

        btn_guardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset.png"))); // NOI18N
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 169, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chk_prop)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombreProp, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre)
                            .addComponent(lbl_tipo))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_edad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_anios))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_cantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sp_cantidadAtenciones, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chk_atencionesPrevias))))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(lbl_edad)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_anios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo)
                    .addComponent(cmb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_atencionesPrevias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantidad)
                    .addComponent(sp_cantidadAtenciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_prop)
                    .addComponent(jLabel7)
                    .addComponent(txt_nombreProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk_atencionesPreviasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_atencionesPreviasActionPerformed
        if (chk_atencionesPrevias.isSelected()){
            sp_cantidadAtenciones.setEnabled(true);
        }else{
            sp_cantidadAtenciones.setEnabled(false);
        }
    }//GEN-LAST:event_chk_atencionesPreviasActionPerformed

    private void chk_propActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_propActionPerformed
        
        if (chk_prop.isSelected()){
            txt_nombreProp.setEnabled(true);
        }else{
            txt_nombreProp.setEnabled(false);
        }
    }//GEN-LAST:event_chk_propActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        Mascota mascota = new Mascota();
        ControladorMascota ctrlMascota = new ControladorMascota();
        
        mascota.setNom_mascota(txt_nombre.getText());
        mascota.setEdad_mascota((int)sp_edad.getValue());
        mascota.setTipo_mascota(cmb_tipo.getSelectedItem().toString());
        
        if (chk_atencionesPrevias.isSelected()){
            mascota.setAte_hist_mascota(chk_atencionesPrevias.isSelected());
            mascota.setCant_ate_mascota((int)sp_cantidadAtenciones.getValue());
        }else{
            mascota.setAte_hist_mascota(false);
            mascota.setCant_ate_mascota(0);
        }
        
        if (chk_prop.isSelected()){
            mascota.setProp_mascota(chk_prop.isSelected());
            mascota.setNom_prop(txt_nombreProp.getText());
        }else{
            mascota.setProp_mascota(false);
            mascota.setNom_prop("");
        }
        
        mascota.setDesc_mascota(txt_descripcion.getText());
        
        
        
        ctrlMascota.mascotaAlmacenar(mascota);
        
        
        
        
        
        
        JOptionPane.showMessageDialog(rootPane, "MASCOTA ALMACENADA CORRECTAMENTE");
        
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        
        txt_nombre.setText("");
        txt_descripcion.setText("");
        txt_nombreProp.setText("");
        sp_edad.setValue(0);
        cmb_tipo.setSelectedIndex(0);
        chk_atencionesPrevias.setSelected(false);
        if (chk_atencionesPrevias.isSelected()){
            sp_cantidadAtenciones.setEnabled(true);
        }else{
            sp_cantidadAtenciones.setEnabled(false);
        }
        sp_cantidadAtenciones.setValue(0);
        chk_prop.setSelected(false);
        if (chk_prop.isSelected()){
            txt_nombreProp.setEnabled(true);
        }else{
            txt_nombreProp.setEnabled(false);
        }
        txt_nombreProp.setText("");
        txt_descripcion.setText("");
        txt_nombre.requestFocus();
        
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaNuevaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaNuevaMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JCheckBox chk_atencionesPrevias;
    private javax.swing.JCheckBox chk_prop;
    private javax.swing.JComboBox<String> cmb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_anios;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JSpinner sp_cantidadAtenciones;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreProp;
    // End of variables declaration//GEN-END:variables
}
