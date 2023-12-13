package javaswingdev.form;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import nektli.api;

public class Clima extends javax.swing.JPanel {

    public static int numero = 0;
    public String[][] Informacion;

    public Clima(String name) {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldRound1 = new jtextfieldround.JTextFieldRound();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 53)); // NOI18N
        jLabel7.setText("Clima");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(224, 224, 224)
                .addComponent(jLabel7)
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-19, 0, 1120, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jTextFieldRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 430, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_2.png"))); // NOI18N
        jButton1.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_2.png"))); // NOI18N
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_3.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Buscar_2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 180, 50));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel1.setText("Ingresa el nombre de tu ciudad");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel4.setText("Fecha y hora");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 28)); // NOI18N
        jLabel10.setText("-------");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel5.setText("Temperatura MAX.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 28)); // NOI18N
        jLabel12.setText("-------");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 0, 32)); // NOI18N
        jLabel6.setText("Temperatura MIN.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 28)); // NOI18N
        jLabel14.setText("-------");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel3.setText("Clima general");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 28)); // NOI18N
        jLabel8.setText("Descripción");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel9.setText("Sensación Termica");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 28)); // NOI18N
        jLabel11.setText("-------");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel13.setText("Humedad");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 28)); // NOI18N
        jLabel15.setText("-------");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel16.setText("Descripción");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 28)); // NOI18N
        jLabel17.setText("-------");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("OCR A Extended", 0, 32)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Anterior_1.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Anterior_3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Anterior_2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 160, 50));

        jButton3.setFont(new java.awt.Font("OCR A Extended", 0, 32)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Siguiente_1.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Siguiente_3.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Siguiente_2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 160, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Background.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1100, 730));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1100, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // avanzar
        numero++;
        if (numero <= 39) {
            jLabel8.setText(Informacion[numero][0]);
            jLabel10.setText(Informacion[numero][1]);
            jLabel12.setText(Informacion[numero][2]);
            jLabel14.setText(Informacion[numero][3]);
            jLabel11.setText(Informacion[numero][4]);
            jLabel15.setText(Informacion[numero][5]);
            jLabel17.setText(Informacion[numero][6]);
        } else if (numero >= 40) {
            numero = 39;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static boolean esPalabraValida2(String palabra) {
        String patron = "^[a-zA-Z]+(\\s?[a-zA-Z])*$";
        Pattern pattern = Pattern.compile(patron);
        return pattern.matcher(palabra).matches();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //buscar nombre de la ciudad
        String nombre = jTextFieldRound1.getText();
        boolean bandera_nombre = esPalabraValida2(nombre);
        if (bandera_nombre && nombre.length()<=30) {
            api api = new api();
            Double coordenadas[] = api.Obtener_Coordenas(nombre);
            if (coordenadas[0] == 0 && coordenadas[1] == 0) {
                JOptionPane.showMessageDialog(null, "No se encuentran datos de la ciudad, prueba con otro nombre");
            } else {
                Informacion = new String[40][7];
                Informacion = api.Info_Clima(coordenadas[0], coordenadas[1]);
                jLabel8.setText(Informacion[numero][0]);
                jLabel10.setText(Informacion[numero][1]);
                jLabel12.setText(Informacion[numero][2]);
                jLabel14.setText(Informacion[numero][3]);
                jLabel11.setText(Informacion[numero][4]);
                jLabel15.setText(Informacion[numero][5]);
                jLabel17.setText(Informacion[numero][6]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de la ciudad no debe de empezar con numeros, espacios o tener caracteres especiales. Tampoco puede tener más de 30 caracteres");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // retroceder
        numero--;
        if (numero >= 0) {
            jLabel8.setText(Informacion[numero][0]);
            jLabel10.setText(Informacion[numero][1]);
            jLabel12.setText(Informacion[numero][2]);
            jLabel14.setText(Informacion[numero][3]);
            jLabel11.setText(Informacion[numero][4]);
            jLabel15.setText(Informacion[numero][5]);
            jLabel17.setText(Informacion[numero][6]);
        } else if (numero < 0) {
            numero = 0;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private jtextfieldround.JTextFieldRound jTextFieldRound1;
    // End of variables declaration//GEN-END:variables
}
