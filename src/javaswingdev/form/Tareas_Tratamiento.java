package javaswingdev.form;

import inventario_quimico.email;
import static inventario_quimico.login.Correo;
import static inventario_quimico.login.id;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static nektli.Tareas.ID;
import nektli.bd;

public class Tareas_Tratamiento extends javax.swing.JPanel {

    public Tareas_Tratamiento(String name) {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 53)); // NOI18N
        jLabel7.setText("Tratamientos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(668, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 380, 40));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel14.setText("Fecha inicial");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jDateChooser2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 380, 40));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel15.setText("Fecha final");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel16.setText("Enfermedad");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jTextField3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 380, 40));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel5.setText("Encargado");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jTextField4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 380, 40));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel18.setText("Producto");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jTextField12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 380, 40));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel6.setText("Dosis");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        jTextField5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 380, 40));

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel19.setText("Veces al día");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        jTextField13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 380, 40));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel1.setText("Nombre de la colmena");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 13)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 380, 40));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 220, 70));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1100, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //tratameintos
         try {
            /*int id_Usuario, int id_Colmena, String fecha_inicial, String fecha_final,
    String enfermedad, String producto, double dosis,int repeticiones, String persona*/
            Date selectedDate = jDateChooser2.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicial = sdf.format(selectedDate);
            selectedDate = jDateChooser4.getDate();
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
                int id_colmena = bd.Buscar_Colmena(nombre, id);
                if (id_colmena != 0) {
                    int bandera = bd.Ingresar_Tratamiento(id, id_colmena, fecha_inicial, fecha_final, enfermedad, producto, dosis, repeticiones, encargado);
                    if (bandera == 1) {
                        JOptionPane.showMessageDialog(null, "Se guardo la tarea con exito");
                        email email = new email();
                        String mensaje_principal = "Creacion de la tarea Tratamientos";
                        String contenido = "Se creo la tarea de tratamiento en la colemena " + nombre + ", recuerda que el tratamiendo es cada : "+repeticiones + " y que la fecha final es "
                                + fecha_final;
                        email.Mandar_especificaciones(Correo, mensaje_principal, contenido);
                        email.Mandar_Correo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error intentalo mas tarde");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro ninguna colmena con ese nombre");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
