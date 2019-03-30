/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Properties;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DANNY
 */
public class Interfaz_Cliente extends javax.swing.JInternalFrame {

    String barra = File.separator;
    String ubicacion = System.getProperty("user.dir")+barra+"Registros"+barra;
    
    
    public Interfaz_Cliente() {
        initComponents();
    }
    private void Crear(){
        String archivo = jID.getText()+".registros";
        File crea_ubicacion = new File(ubicacion);
        File crea_archivo = new File(ubicacion+archivo);
        
        if(jID.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"No hay ID"); 
        }else{
            
            try{
                if(crea_archivo.exists()){
            JOptionPane.showMessageDialog(rootPane,"El registro ya existe");    
        }else{
            
            crea_ubicacion.mkdirs();
            Formatter crea = new Formatter(ubicacion+archivo) ;
            crea.format("%s\r\n%s\r\n%s","Id="+jID.getText(),
                                         "Nombre="+jNombre.getText(),
                                         "Apellido="+jApellido.getText());
            crea.close();
            JOptionPane.showMessageDialog(rootPane,"Archivo Creado");
            this.dispose();
                    }
                } catch (Exception e){
                 JOptionPane.showMessageDialog(rootPane,"No se ha creado el archivo");   
            }
        
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jrdMasculino = new javax.swing.JRadioButton();
        jrdFemenino = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCiudad = new javax.swing.JComboBox<String>();
        jBarrio = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jColonia = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar clientes");
        setName(""); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombres:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Apellidos:");

        jNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Dirección:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Teléfono:");

        jTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Sexo:");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jrdMasculino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrdMasculino.setText("Masculino");

        jrdFemenino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jrdFemenino.setText("Femenino");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrdMasculino)
                .addGap(18, 18, 18)
                .addComponent(jrdFemenino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdMasculino)
                    .addComponent(jrdFemenino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Fecha de nacimiento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Ciudad");

        jCiudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una ciudad", "San Pedro Sula", "El Progreso", "Villanueva", " ", " " }));
        jCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCiudadItemStateChanged(evt);
            }
        });

        jBarrio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBarrio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un barrio", " " }));
        jBarrio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jBarrioItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Barrio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Colonia");

        jColonia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("ID");

        jID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(65, 65, 65))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Mostrar(){
     File url = new File(ubicacion+Interfaz_Factura.jtxtID.getText()+".registros");
     
     if(Interfaz_Factura.jtxtID.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane,"Indique el ID para mostrar");
    }else{
         if (url.exists()){
             try{
              FileInputStream fis = new FileInputStream(url); 
              Properties mostrar = new Properties();
              mostrar.load(fis);
              
              Interfaz_Factura.jNombre.setText(mostrar.getProperty("Nombre"));
              Interfaz_Factura.jApellido.setText(mostrar.getProperty("Apellido"));
             } catch (Exception e){
             }
         }else{
             JOptionPane.showMessageDialog(rootPane, "Ese registro no existe");
         }
     }
    }    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCiudadItemStateChanged
        if(evt.getStateChange()== ItemEvent.SELECTED)
        {
            if(this.jCiudad.getSelectedIndex()>0){
                this.jBarrio.setModel(new DefaultComboBoxModel(this.getBarrios(this.jCiudad.getSelectedItem().toString())));
            }
        }
        
    }//GEN-LAST:event_jCiudadItemStateChanged

    private void jBarrioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jBarrioItemStateChanged
       if(evt.getStateChange()== ItemEvent.SELECTED)
        {
            if(this.jBarrio.getSelectedIndex()>=0){
                this.jColonia.setModel(new DefaultComboBoxModel(this.getColonias(this.jBarrio.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_jBarrioItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Crear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jdtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jdtAncestorAdded
        
        
    }//GEN-LAST:event_jdtAncestorAdded
    //Arreglos para los barrios de las ciudades
    public String[] getBarrios(String Ciudad){
        String[] barrios = new String[3];
        if(jCiudad.getSelectedItem() == "San Pedro Sula")
        {
          barrios[0] = "Chamelecón";
          barrios[1] = "Medina";
          barrios[2] = "Guamilito";
        }
        if (jCiudad.getSelectedItem()== "El Progreso")
        {
          barrios[0] = "Bo. Cabañas";
          barrios[1] = "Bo. San Minuel";
          barrios[2] = "Bo. San Francisco";
        }
        if (jCiudad.getSelectedItem()== "Villanueva")
        {
          barrios[0] = "Bo. Martin Fajardo";
          barrios[1] = "Bo. Cabañas";
          barrios[2] = "Bo. La Independencia";   
        }
        return barrios;
    }  
    //Arreglos para las colonias de los barrios
    public String[] getColonias(String Colonia){
        String[] colonias = new String[3];
        //Barrio San Pedro Sula
        if(jBarrio.getSelectedItem() == "Chamelecón")
        {
          colonias[0] = "Morales";
          colonias[1] = "Sabillón Cruz";
          colonias[2] = "Ceibita";
        }
        if(jBarrio.getSelectedItem() == "Medina")
        {
          colonias[0] = "15 Calle";
          colonias[1] = "12 Calle";
          colonias[2] = "14 Calle";
        }
        if(jBarrio.getSelectedItem() == "Guamilito")
        {
          colonias[0] = "Santa Monica";
          colonias[1] = "10 Avenida";
          colonias[2] = "9 Avenida";
        }
        //Barrios de El Progreso
        if (jCiudad.getSelectedItem()== "Bo. Cabañas")
        {
          colonias[0] = "Col. Sitraterco";
          colonias[1] = "5 Calle Sur";
          colonias[2] = "3 Avenida Oeste";
        }
        if(jBarrio.getSelectedItem() == "Bo. San Minuel")
        {
          colonias[0] = "4ta Avenida Oeste";
          colonias[1] = "12 Calle Norte";
          colonias[2] = "Col. 2 de Julio";
        }
        if(jBarrio.getSelectedItem() == "Bo. San Francisco")
        {
          colonias[0] = "5 Avenida Oeste";
          colonias[1] = "7 Avenida Oeste";
          colonias[2] = "6 Calle Sur";
        }
        //Barrios de Villanueva
        if (jCiudad.getSelectedItem()== "Bo. Martin Fajardo")
        {
          colonias[0] = "Res. Villareal";
          colonias[1] = "Res. La Gran Villa";
          colonias[2] = "Sibonei";   
        }
        if(jBarrio.getSelectedItem() == "Bo. Cabañas")
        {
          colonias[0] = "Miguel Calvo";
          colonias[1] = "Col Villa del Sol";
          colonias[2] = "Res. Real del Puente";
        }
        if(jBarrio.getSelectedItem() == "Bo. La Independencia")
        {
          colonias[0] = "Res. Buena Vista";
          colonias[1] = "Res. Valle Verde";
          colonias[2] = "Residencial la Masica";
        }
        return colonias;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jApellido;
    private javax.swing.JComboBox<String> jBarrio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCiudad;
    private javax.swing.JComboBox<String> jColonia;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JRadioButton jrdFemenino;
    private javax.swing.JRadioButton jrdMasculino;
    // End of variables declaration//GEN-END:variables
}
