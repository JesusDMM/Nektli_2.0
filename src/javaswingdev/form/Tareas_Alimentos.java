package javaswingdev.form;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static inventario_quimico.login.id;
import nektli.bd;

public class Tareas_Alimentos extends javax.swing.JPanel {

    public Tareas_Alimentos(String name) {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 53)); // NOI18N
        jLabel7.setText("Alimentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(447, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel20.setText("Fecha");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jDateChooser8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jDateChooser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 380, 40));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel17.setText("Cantidad de alimento");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        jTextField10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 380, 40));

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel21.setText("Alimento");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jTextField11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 380, 40));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel13.setText("Nombre de la colmena");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jTextField9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 380, 40));

        jButton7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jButton7.setText("Guardar");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 220, 70));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 380, 160));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel22.setText("Nota");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, 30));

        jTextField7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 380, 40));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel8.setText("Cantidad de dias");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jTextField14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 380, 40));

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel23.setText("Tipo");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 950, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // guardar alimentacion
        try {
            Date selectedDate = jDateChooser8.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicial = sdf.format(selectedDate);
            String tipo = jTextField14.getText();
            String alimentos = jTextField11.getText();
            double cantidad = Double.parseDouble(jTextField10.getText());
            int cantidad_dias = Integer.parseInt(jTextField7.getText());
            String descripcion = jTextArea2.getText();
            String nombre = jTextField9.getText();
            if (fecha_inicial.equals("") || tipo.equals("") || alimentos.equals("") || descripcion.equals("") || nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "No dejes ningun campo sin rellenar");
            } else {
                int id_colmena = bd.Buscar_Colmena(nombre, id);
                if (id_colmena != 0) {
                    //Insertar_alimentacion (int id_Usuario, int id_Colmena, String fecha, String alimento,String tipo, double cantidad, int cantidad_dias
                        //,String descripcion)
                    int bandera = bd.Insertar_alimentacion(id, id_colmena, fecha_inicial, alimentos, tipo, cantidad, cantidad_dias, descripcion);
                    if (bandera != 0) {
                        JOptionPane.showMessageDialog(null, "Se guardo la tarea con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Se produjo un error intentalo despues");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el nombre de la colmena");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
