package javaswingdev.form;

import inventario_quimico.email;
import static inventario_quimico.login.Correo;
import static inventario_quimico.login.id;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static nektli.Tareas.ID;
import nektli.bd;

public class Tareas_Movimientos extends javax.swing.JPanel {

    public Tareas_Movimientos(String name) {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 53)); // NOI18N
        jLabel7.setText("Movimientos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel8.setText("Fecha llegada");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel26.setText("Fecha Salida");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel27.setText("Ciudad de salida");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel28.setText("Ciudad de llegada");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel29.setText("Motivo");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        jDateChooser9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel2.add(jDateChooser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 380, 40));

        jDateChooser10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel2.add(jDateChooser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 380, 40));

        jTextField16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 13)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 380, 40));

        jTextField17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 380, 40));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 380, 40));

        jButton11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jButton11.setText("Guardar");
        jButton11.setOpaque(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 220, 70));

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel30.setText("Nombre de la colmena");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jTextField18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 380, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1100, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // guardar
        try {
            Date selectedDate = jDateChooser9.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_salida = sdf.format(selectedDate);
            String ciudad = jTextField16.getText();
            selectedDate = jDateChooser10.getDate();
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_llegada = sdf.format(selectedDate);
            String ciudad_llegada = jTextField17.getText();
            String motivo = jTextArea3.getText();
            String nombre = jTextField18.getText();
            if (fecha_salida.equals("") || ciudad.equals("") || fecha_llegada.equals("") || ciudad_llegada.equals("") || motivo.equals("") || nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingresa todos los datos");
            } else {
                int id_colmena = bd.Buscar_Colmena(nombre, id);
                if (id_colmena != 0) {
                    //Insertar_Movimiento (int id_Usuario, int id_Colmena, String fecha_salida, String ciudad_salida, String fecha_llegada
                    //, String ciudad_llegada, String motivo
                    int bandera = bd.Insertar_Movimiento(id, id_colmena, fecha_salida, ciudad, fecha_llegada, ciudad_llegada, motivo);
                    if (bandera != 0) {
                        JOptionPane.showMessageDialog(null, "Se guardo la tarea con exito");
                        email email = new email();
                        String mensaje_principal = "Creacion de la tarea movimientos";
                        String contenido = "Se creo la tarea de moviemiento en la colemena " + nombre + " y se espera llegar en la fecha : "+fecha_llegada;
                        email.Mandar_especificaciones(Correo, mensaje_principal, contenido);
                        email.Mandar_Correo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Se produjo un error intentalo despues");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro el nombre de la colmena");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa todos los datos correctamente");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    // End of variables declaration//GEN-END:variables
}
