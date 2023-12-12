package javaswingdev.form;

import inventario_quimico.email;
import static inventario_quimico.login.Correo;
import static inventario_quimico.login.id;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static nektli.Tareas.ID;
import nektli.bd;
/*import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;*/

public class Reportes extends javax.swing.JPanel {

    public Reportes(String name) {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 53)); // NOI18N
        jLabel7.setText("Reportes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(668, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(111, 111, 111)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 80));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1100, 610));
    }// </editor-fold>//GEN-END:initComponents

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
    // Grafico de pastel
        /*private DefaultPieDataset datosmiel = new DefaultPieDataset();
        
        int n1 = Integer.parseInt(jTextField1.getText());
        int n2 = Integer.parseInt(jTextField2.getText());
        int n3 = Integer.parseInt(jTextField3.getText());
        int n4 = Integer.parseInt(jTextField4.getText());

         // Actualiza los valores en el conjunto de datos
        datosmiel.setValue (

        "ISC", n1);
        datosmiel.setValue (

        "IQ", n2);
        datosmiel.setValue (

        "IGE", n3);
        
        datosmiel.setValue (
        "IND", n4);

        // Crea un nuevo gráfico con el conjunto de datos actualizado
        JFreeChart grafico_circulo = ChartFactory.createPieChart(
            "Porcentaje de miel por colmena",
            datosmiel,
            true,
            true,
            false
        );

        ChartPanel panelm = new ChartPanel(grafico_circulo);

        panelm.setMouseWheelEnabled (

        true);
        panelm.setPreferredSize (

        new Dimension(400, 200));

        jPanel3.setLayout (

        new BorderLayout());
        jPanel3.add (panelm, BorderLayout.NORTH);
     

        this.setVisible(
        false);
        this.setVisible(
        true);
    
    // Grafico de barras 1 
        private DefaultCategoryDataset datoscosecha = new DefaultCategoryDataset();
        
        int c1 = Integer.parseInt(jTextField1.getText());
        int c2 = Integer.parseInt(jTextField2.getText());
        int c3 = Integer.parseInt(jTextField3.getText());
        int c4 = Integer.parseInt(jTextField4.getText());
        
        
        datoscosecha.setValue(c1);
        datoscosecha.setValue(c2);
        datoscosecha.setValue(c3);
        datoscosecha.setValue(c4);
        
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
        "Cantidad de cosechas", //nombre del grafico
        "Numero de cosechas", //nombre de las barras o columnas
        "Cosechas", //nombre de la numeración
        datoscosecha, //datos del grafico
        PlotOrientation.VERTICAL, //orientación
        true, //legenda de barras individuales por color
        true, //herramientas
        false //url del grafico
        );
        
        ChartPanel panelc = new ChartPanel(grafico_barras);
        panelc.setMouseWheelEnabled(true);
        panelc.setPreferredSize(new Dimension(400,200));
        
        jPanel4.setLayout(new BorderLayout());
        jPanel4.add(panelc,BorderLayout.NORTH);
        
        
        this.setVisible(false);
        this.setVisible(true);
        
    // Grafico de barras 2
        private DefaultCategoryDataset datosalimento = new DefaultCategoryDataset();
        
        int b1 = Integer.parseInt(jTextField1.getText());
        int b2 = Integer.parseInt(jTextField2.getText());
        int b3 = Integer.parseInt(jTextField3.getText());
        int b4 = Integer.parseInt(jTextField4.getText());
        
        
        datosalimento.setValue();
        datosalimento.setValue();
        datosalimento.setValue();
        datosalimento.setValue();
        
        JFreeChart graficobarras = ChartFactory.createBarChart3D(
        "Cantidad de cosechas", //nombre del grafico
        "Numero de cosechas", //nombre de las barras o columnas
        "Cosechas", //nombre de la numeración
        datosalimento, //datos del grafico
        PlotOrientation.VERTICAL, //orientación
        true, //legenda de barras individuales por color
        true, //herramientas
        false //url del grafico
        );
        
        ChartPanel panela = new ChartPanel(grafico_barras);
        panela.setMouseWheelEnabled(true);
        panela.setPreferredSize(new Dimension(400,200));
        
        jPanel5.setLayout(new BorderLayout());
        jPanel5.add(panela,BorderLayout.NORTH);

        this.setVisible(false);
        this.setVisible(true);
        
        // Grafico de lineas
        
            private DefaultCategoryDataset datostratamiento = new DefaultCategoryDataset();
    
        int d1 = Integer.parseInt(jTextField1.getText());
        int d2 = Integer.parseInt(jTextField2.getText());
        int d3 = Integer.parseInt(jTextField3.getText());
        int d4 = Integer.parseInt(jTextField4.getText());
        
        
        datostratamiento.setValue(n1,"Alumnos","ISC");
        datostratamiento.setValue(n2,"Alumnos","IQ");
        datostratamiento.setValue(n3, "Alumnos", "IGE");
        datostratamiento.setValue(n4, "Alumnos", "IND");
        
        JFreeChart grafico_lineas=ChartFactory.createLineChart(
        "Inscripción de alumnos por carrera",
        "Numero de tratamiento",
        "Fecha",
        datostratamiento,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
        ); 
        
        ChartPanel panelt = new ChartPanel(grafico_lineas);
        panelt.setMouseWheelEnabled(true);
        panelt.setPreferredSize(new Dimension(400,200));
        
        jPanel6.setLayout(new BorderLayout());
        jPanel6.add(panelt,BorderLayout.NORTH);
        
        
        this.setVisible(
        false);
        this.setVisible(
        true);
        */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
