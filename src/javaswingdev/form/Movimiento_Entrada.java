package javaswingdev.form;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static nektli.Tareas.ID;
import nektli.bd;

public class Movimiento_Entrada extends javax.swing.JPanel {

    public Movimiento_Entrada(String name) {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add_tab = new javax.swing.JPanel();
        fill_label = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 53)); // NOI18N
        jLabel7.setText("Entradas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(472, Short.MAX_VALUE))
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

        add_tab.setBackground(new java.awt.Color(255, 255, 255));
        add_tab.setBorder(new javax.swing.border.MatteBorder(null));
        add_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fill_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_tab.add(fill_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add_tab.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 140, 50));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add_tab.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 140, 50));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.setOpaque(false);
        add_tab.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 140, 50));
        add_tab.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 380, 40));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel14.setText("Fecha ");
        add_tab.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        add_tab.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 380, 40));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel3.setText("Ciudad");
        add_tab.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel18.setText("Latitud");
        add_tab.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel6.setText("Longitud");
        add_tab.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));
        add_tab.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 380, 40));
        add_tab.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 380, 40));

        add(add_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Tratamiento Guardar
        try {
            /*int id_Usuario, int id_Colmena, String fecha_inicial, String fecha_final,
            String enfermedad, String producto, double dosis,int repeticiones, String persona*/
            Date selectedDate = jDateChooser2.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicial = sdf.format(selectedDate);
            selectedDate = jDateChooser1.getDate();
            String fecha_final = sdf.format(selectedDate);
            String enfermedad = jTextField3.getText();
            String producto = jTextField12.getText();
            int repeticiones = Integer.parseInt(jTextField13.getText());
            double dosis = Double.parseDouble(jTextField5.getText());
            String encargado = jTextField4.getText();
            String nombre = jTextField2.getText();

            if (fecha_inicial.equals("") || fecha_final.equals("")
                || enfermedad.equals("") || producto.equals("") || encargado.equals("") || nombre.equals("")) {

            } else {
                int id_colmena = bd.Buscar_Colmena(nombre, ID);
                if (id_colmena != 0) {
                    int bandera = bd.Ingresar_Tratamiento(ID, id_colmena, fecha_inicial, fecha_final, enfermedad, producto, dosis, repeticiones, encargado);
                    if (bandera == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Se guardo la tarea con exito");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Hubo un error intentalo mas tarde");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se encontro ninguna colmena con ese nombre");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese los datos correctamente");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_tab;
    private javax.swing.JLabel fill_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
