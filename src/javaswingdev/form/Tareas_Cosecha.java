package javaswingdev.form;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static inventario_quimico.login.id;
import nektli.bd;

public class Tareas_Cosecha extends javax.swing.JPanel {

    public Tareas_Cosecha(String name) {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 53)); // NOI18N
        jLabel7.setText("Cosecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(466, Short.MAX_VALUE))
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1021, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel10.setText("Fecha");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jDateChooser7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 380, 40));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 380, 38));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel9.setText("Producto");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel11.setText("Cantidad");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jTextField8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 380, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 380, 200));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel12.setText("Descripción");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jTextField6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 380, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel4.setText("Nombre de la colmena");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jButton4.setText("Guardar");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 220, 70));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 590));
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
                JOptionPane.showMessageDialog(null, "Rellena todos los datos");
            } else {
                //Insertar_Cosecha (int id_Usuario, int id_Colmena, String fecha, String producto, double cantidad, String descripcion)
                int id_colmena = bd.Buscar_Colmena(nombre, id);
                if (id_colmena != 0) {
                    int bandera = bd.Insertar_Cosecha(id, id_colmena, fecha_inicial, producto, cantidad, descripcion);
                    if (bandera != 0) {
                        JOptionPane.showMessageDialog(null, "Se creo la tarea con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Se produjo un error intentelo mas tarde");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el nombre de la colmena");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
