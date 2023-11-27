package javaswingdev.form;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static nektli.Tareas.ID;
import nektli.bd;

public class Movimiento_Salida extends javax.swing.JPanel {

    public Movimiento_Salida(String name) {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        update_tab = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 53)); // NOI18N
        jLabel7.setText("Salidas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 960, -1));

        update_tab.setBackground(new java.awt.Color(255, 255, 255));
        update_tab.setBorder(new javax.swing.border.MatteBorder(null));
        update_tab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        update_tab.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 140, 50));

        jButton5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        update_tab.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 140, 50));

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        update_tab.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 140, 50));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel9.setText("Fecha ");
        update_tab.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jDateChooser9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        update_tab.add(jDateChooser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 380, 40));

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel26.setText("Ciudad");
        update_tab.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jTextField17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        update_tab.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 380, 40));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel27.setText("Latitud");
        update_tab.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jTextField18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        update_tab.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 380, 40));

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel28.setText("Longitud");
        update_tab.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jTextField19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        update_tab.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 380, 40));

        add(update_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // guardar cosechas
        try {
            Date selectedDate = jDateChooser7.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicial = sdf.format(selectedDate);
            String producto = jTextField1.getText();
            double cantidad = Double.parseDouble(jTextField8.getText());
            String descripcion = jTextArea1.getText();
            String nombre = jTextField6.getText();
            if (fecha_inicial.equals("") || producto.equals("") || descripcion.equals("") || nombre.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Rellena todos los datos");
            } else {
                //Insertar_Cosecha (int id_Usuario, int id_Colmena, String fecha, String producto, double cantidad, String descripcion)
                int id_colmena = bd.Buscar_Colmena(nombre, ID);
                if (id_colmena != 0) {
                    int bandera = bd.Insertar_Cosecha(ID, id_colmena, fecha_inicial, producto, cantidad, descripcion);
                    if (bandera != 0) {
                        JOptionPane.showMessageDialog(rootPane, "Se creo la tarea con exito");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Se produjo un error intentelo mas tarde");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se encontro el nombre de la colmena");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese los datos correctamente");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JPanel update_tab;
    // End of variables declaration//GEN-END:variables
}
