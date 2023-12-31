package javaswingdev.form;

import inventario_quimico.email;
import static inventario_quimico.login.Correo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static inventario_quimico.login.id;
import java.util.regex.Pattern;
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

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 53)); // NOI18N
        jLabel7.setText("Cosecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(429, Short.MAX_VALUE))
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel10.setText("Fecha");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jDateChooser7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 380, 40));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 380, 38));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel9.setText("Producto");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel11.setText("Cantidad");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jTextField8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 380, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 380, 200));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel12.setText("Descripción");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        jTextField6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 380, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel4.setText("Nombre de la colmena");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jButton4.setText("Guardar");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 220, 70));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1100, 620));
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
            if (fecha_inicial.equals("") || producto.trim().equals("") || descripcion.trim().equals("") || nombre.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Rellena todos los datos");
            } else {
                boolean bandera_colmena = esPalabraValida(nombre);
                boolean bandera_producto = esPalabraValida2(producto);
                boolean bandera_descripcion = esPalabraValida2(descripcion);
                System.out.println(bandera_colmena);
                System.out.println(bandera_producto);
                System.out.println(bandera_descripcion);
                if (bandera_colmena && bandera_producto && bandera_descripcion && nombre.length()<=15
                        && producto.length()<=20 && descripcion.length() <= 100) {
                    int id_colmena = bd.Buscar_Colmena(nombre, id);
                    if (id_colmena != 0) {
                        int bandera = bd.Insertar_Cosecha(id, id_colmena, fecha_inicial, producto, cantidad, descripcion);
                        if (bandera != 0) {
                            JOptionPane.showMessageDialog(null, "Se creo la tarea con exito");
                            email email = new email();
                            String mensaje_principal = "Creación de la tarea de cosecha";
                            String contenido = "Se creo la tarea de manera satisfactoria en la colmena " + nombre + " para la fecha propuesta el dia " + fecha_inicial;
                            email.Mandar_especificaciones(Correo, mensaje_principal, contenido);
                            email.Mandar_Correo();
                        } else {
                            JOptionPane.showMessageDialog(null, "Se produjo un error intentelo mas tarde");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el nombre de la colmena");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El nombre de la colmena o producto no debe de empezar con numeros, espacios o contener caracteres especiales. Tampoco deben de superar los 20 caracteres de longitud");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha o ingrese numeros dentro de los apartados correspondientes");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static boolean esPalabraValida2(String palabra) {
        String patron = "^[a-zA-Z]+(\\s?[a-zA-Z])*$";
        Pattern pattern = Pattern.compile(patron);
        return pattern.matcher(palabra).matches();
    }
    
    public static boolean esPalabraValida(String palabra) {
        String patron = "^[a-zA-Z]+(\\s?[a-zA-Z0-9]+)*$";
        Pattern pattern = Pattern.compile(patron);
        return pattern.matcher(palabra).matches();
    }
    
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
