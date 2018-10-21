/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import Clases.Analisis;
import Manager.ManagerAnalisis;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fede_
 */
public class Principal extends javax.swing.JFrame {

    DefaultTableModel modeloTablaAnalisis;
    ManagerAnalisis ma = new ManagerAnalisis();

    /**
     * Creates new form Principal
     */
    public Principal() {
        modeloTablaAnalisis = new DefaultTableModel(null, ma.recuperarColumnas());
        initComponents();
        jTable_Analisis.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        cargarTablaAnalisis();
        

    }
    
    

   
    // metodo para cargar la tabla de analisis.
    public void cargarTablaAnalisis(){
        ManagerAnalisis ma = new ManagerAnalisis();
        ArrayList<Analisis> datos = ma.recuperarFilas();
        int fila= 0;
        for (Analisis i: datos){
            modeloTablaAnalisis.addRow(new Object [6]);
            jTable_Analisis.setValueAt(i.getCodigo(),fila, 0);
            jTable_Analisis.setValueAt(i.getNombre(),fila, 1);
            jTable_Analisis.setValueAt(i.getIndicacionesPrevias(),fila, 2);
            jTable_Analisis.setValueAt(i.getCantidadUnidadesB(),fila, 3);
            jTable_Analisis.setValueAt(i.getConsentimiento(),fila, 4);
            jTable_Analisis.setValueAt(i.getCostoDescartables(),fila, 5);
            fila++;
            
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_sexo = new javax.swing.ButtonGroup();
        jFrame_ListadoAnalisis = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Analisis = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane_menuPestañas = new javax.swing.JTabbedPane();
        jPanel_menuPestañas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fecha_CargarOrden = new javax.swing.JLabel();
        Medico_cargarOrden = new javax.swing.JLabel();
        jTextField_Medico_CargarOrden = new javax.swing.JTextField();
        datosPaciente_CargarOrden = new javax.swing.JLabel();
        jButton_ListadoPaciente_CargarOrden = new javax.swing.JButton();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Apellido = new javax.swing.JTextField();
        jTextField_dni = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        fecha_CargarOrden1 = new javax.swing.JLabel();
        fecha_CargarOrden2 = new javax.swing.JLabel();
        datosAnalisis_CargarOrden1 = new javax.swing.JLabel();
        jButton_Analisis_CargarOrden1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 450), new java.awt.Dimension(0, 450), new java.awt.Dimension(32767, 450));
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton_Femenino = new javax.swing.JButton();

        jFrame_ListadoAnalisis.setTitle("Listado de Analisis");
        jFrame_ListadoAnalisis.setAlwaysOnTop(true);

        jTable_Analisis.setBackground(new java.awt.Color(204, 204, 204));
        jTable_Analisis.setModel(modeloTablaAnalisis);
        jTable_Analisis.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(jTable_Analisis);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        jLabel2.setText("Analisis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(563, 595, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jFrame_ListadoAnalisis.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 0));

        jLabel1.setFont(new java.awt.Font("Ebrima", 3, 18)); // NOI18N
        jLabel1.setText("Ingrese los datos de la Orden");

        fecha_CargarOrden.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        fecha_CargarOrden.setText("Fecha");

        Medico_cargarOrden.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        Medico_cargarOrden.setText("Medico");

        jTextField_Medico_CargarOrden.setText("nombremedico");

        datosPaciente_CargarOrden.setFont(new java.awt.Font("Ebrima", 3, 18)); // NOI18N
        datosPaciente_CargarOrden.setText("Datos Paciente");

        jButton_ListadoPaciente_CargarOrden.setBackground(java.awt.Color.darkGray);
        jButton_ListadoPaciente_CargarOrden.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        jButton_ListadoPaciente_CargarOrden.setText("Listado de Pacientes");
        jButton_ListadoPaciente_CargarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListadoPaciente_CargarOrdenActionPerformed(evt);
            }
        });

        jTextField_Nombre.setText("Nombre");

        jTextField_Apellido.setText("Apellido");

        jTextField_dni.setText("DNI");

        jTextField_telefono.setText("Telefono");

        fecha_CargarOrden1.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        fecha_CargarOrden1.setText("Fecha de Nacimieto");

        fecha_CargarOrden2.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        fecha_CargarOrden2.setText("Sexo");

        datosAnalisis_CargarOrden1.setFont(new java.awt.Font("Ebrima", 3, 18)); // NOI18N
        datosAnalisis_CargarOrden1.setText("Datos Análisis");

        jButton_Analisis_CargarOrden1.setBackground(java.awt.Color.darkGray);
        jButton_Analisis_CargarOrden1.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        jButton_Analisis_CargarOrden1.setText("Análisis");
        jButton_Analisis_CargarOrden1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Analisis_CargarOrden1ActionPerformed(evt);
            }
        });

        jTable1.setModel(modeloTablaAnalisis);
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        buttonGroup_sexo.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        jRadioButton1.setText("Masculino");

        buttonGroup_sexo.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        jRadioButton2.setText("Femenino");

        javax.swing.GroupLayout jPanel_menuPestañasLayout = new javax.swing.GroupLayout(jPanel_menuPestañas);
        jPanel_menuPestañas.setLayout(jPanel_menuPestañasLayout);
        jPanel_menuPestañasLayout.setHorizontalGroup(
            jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                .addGroup(jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha_CargarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                                .addComponent(Medico_cargarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Medico_CargarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                                .addComponent(datosPaciente_CargarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_ListadoPaciente_CargarOrden))
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(fecha_CargarOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha_CargarOrden2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                        .addComponent(datosAnalisis_CargarOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(jButton_Analisis_CargarOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_menuPestañasLayout.setVerticalGroup(
            jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                .addGroup(jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datosAnalisis_CargarOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Analisis_CargarOrden1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                        .addComponent(fecha_CargarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Medico_cargarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Medico_CargarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_menuPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosPaciente_CargarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ListadoPaciente_CargarOrden))
                .addGap(7, 7, 7)
                .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(fecha_CargarOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(fecha_CargarOrden2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(113, 113, 113))
            .addGroup(jPanel_menuPestañasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_menuPestañas.addTab("Cargar Orden", jPanel_menuPestañas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jTabbedPane_menuPestañas.addTab("Cargar Resultados", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jTabbedPane_menuPestañas.addTab("Imprimir Resultados", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton_Femenino.setText("Iniciar Sesion");
        jPanel4.add(jButton_Femenino, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_menuPestañas)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane_menuPestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Analisis_CargarOrden1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Analisis_CargarOrden1ActionPerformed
        jFrame_ListadoAnalisis.setVisible(true);
        jFrame_ListadoAnalisis.setLocationRelativeTo(jButton_Analisis_CargarOrden1);
        jFrame_ListadoAnalisis.setSize(800,450);
    }//GEN-LAST:event_jButton_Analisis_CargarOrden1ActionPerformed

    private void jButton_ListadoPaciente_CargarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListadoPaciente_CargarOrdenActionPerformed

    }//GEN-LAST:event_jButton_ListadoPaciente_CargarOrdenActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Medico_cargarOrden;
    private javax.swing.ButtonGroup buttonGroup_sexo;
    private javax.swing.JLabel datosAnalisis_CargarOrden1;
    private javax.swing.JLabel datosPaciente_CargarOrden;
    private javax.swing.JLabel fecha_CargarOrden;
    private javax.swing.JLabel fecha_CargarOrden1;
    private javax.swing.JLabel fecha_CargarOrden2;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton_Analisis_CargarOrden1;
    private javax.swing.JButton jButton_Femenino;
    private javax.swing.JButton jButton_ListadoPaciente_CargarOrden;
    private javax.swing.JFrame jFrame_ListadoAnalisis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_menuPestañas;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane_menuPestañas;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_Analisis;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Medico_CargarOrden;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
