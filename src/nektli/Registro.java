/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nektli;

import inventario_quimico.Confirmar_Correo;
import inventario_quimico.email;
import inventario_quimico.login;
import java.util.Random;
import javax.swing.ImageIcon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 52811
 */
public class Registro extends javax.swing.JFrame {

    public static int numero_Random = 0;
    public static String Nombre = "";
    public static String Ocupacion = "";
    public static String Contraseña = "";
    public static String Correo = "";
    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        ImageIcon icono = new ImageIcon("C:\\Users\\Jaime Tec\\Documents\\TecMante\\Roberto\\Nektli\\src\\recursos\\icono.png");

        // Establecer el ícono en la ventana
        setIconImage(icono.getImage());
    }

    public boolean verificar_email(String correo) {
        String regx = "^[a-zA-Z][a-zA-Z0-9_\\.]*@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(correo);
        if (matcher.matches()) {
            String dominio = correo.split("@")[1];
            if (dominioPermitido(dominio)) {
                return true;
            }
        }
        return false;
    }

    public static boolean dominioPermitido(String dominio) {
        String[] dominiosPermitidos = {
            "gmail.com",
            "itsmante.edu.mx",
            "outlook.com",
            "hotmail.com"
        };
        for (String dominioPermitido : dominiosPermitidos) {
            if (dominio.endsWith(dominioPermitido)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldRoundBeanInfo1 = new jtextfieldround.JTextFieldRoundBeanInfo();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 430, 30));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aficionado", "Intermedio", "Experto" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 430, 30));

        jTextField2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 430, 30));

        jPasswordField1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 430, 30));

        jPasswordField2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 430, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Registra tu cuenta");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 230, 60));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 23)); // NOI18N
        jLabel11.setText("Confirma tu contraseña");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 23)); // NOI18N
        jLabel10.setText("Crea una contraseña");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 23)); // NOI18N
        jLabel9.setText("Escribe tu correo ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 23)); // NOI18N
        jLabel8.setText("Selecciona tu nivel");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 23)); // NOI18N
        jLabel6.setText("Escribe tu nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(213, 159, 0));
        jLabel7.setText("  registrar tu cuenta");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(213, 159, 0));
        jLabel5.setText("Ingresa la información para ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 50)); // NOI18N
        jLabel4.setText("¡Registrate!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Registro 2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 620, 690));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Trazado 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 720));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Trazadooorre.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 720));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    public static boolean esStringValido(String cadena) {
        //patron para permitir solo la primera letra sea una letra luego solo letras numeros guiones bajos y espacios pero no al final
        String patron = "^[a-zA-Z][a-zA-Z0-9_\\s]*$";
        Pattern pattern = Pattern.compile(patron);
        return pattern.matcher(cadena).matches();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().trim().equals("") || jTextField2.getText().trim().equals("")
                || jPasswordField1.getText().trim().equals("") || jPasswordField2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "No dejes ningún campo en blanco.");
        } else {
            Nombre = jTextField2.getText();
            boolean bandera_nombre = esStringValido(Nombre);
            if (bandera_nombre == true && Nombre.length()<=15) {
                if (jPasswordField1.getText().equals(jPasswordField2.getText())) {
                    Contraseña = jPasswordField1.getText();
                    boolean bandera_contraseña = esStringValido(jPasswordField1.getText());
                    if (bandera_contraseña && Contraseña.length()<=15) {
                        bd bd = new bd();
                        Object Seleccion = jComboBox1.getSelectedItem();
                        Ocupacion = Seleccion.toString();
                        Correo = jTextField1.getText();
                        boolean verificacion_correo = verificar_email(Correo);
                        if (verificacion_correo == true) {
                            boolean bandera_correo = bd.Buscar_Correo_Usuario(Correo);
                            if (bandera_correo == true) {
                                JOptionPane.showMessageDialog(rootPane, "El correo ya fue usado en otra cuenta, utiliza otro correo");
                            } else {
                                email correo = new email();
                                String titulo = "Comprobación de correo";

                                Random random = new Random();
                                numero_Random = random.nextInt(9999 - 1500 + 1) + 1500;
                                String numero = numero_Random + "";

                                String contenido = "El codigo de confirmación de correo es el siguiente:  " + numero;
                                correo.Mandar_especificaciones(jTextField1.getText(), titulo, contenido);
                                correo.Mandar_Correo();

                                Confirmar_Correo pestaña = new Confirmar_Correo ();
                                pestaña.setVisible(true);

                                /**/
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Ingrese un correo válido.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "La contraseña no debe empezar con números, guiones bajos, espacios o contener caracteres especiales. La contraseña debe ser de solo 15 caracteres");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Las contraseñas deben coincidir");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El nombre de usuario no debe empezar con números, guiones bajos, espacios o contener caracteres especiales. El nombre debe ser de solo 15 caracteres");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private jtextfieldround.JTextFieldRoundBeanInfo jTextFieldRoundBeanInfo1;
    // End of variables declaration//GEN-END:variables
}
