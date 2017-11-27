/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import modelo.Usuario;
import vista.apoderado.panel_listado_apoderado;
import vista.familiares.panel_listado_familiar;
import vista.usuarios.panel_listado;

/**
 *
 * @author Lucas
 */
public class interfaz_administracion extends javax.swing.JFrame {

    /**
     * Creates new form interfaz_administracion
     */
    public interfaz_administracion() {
        initComponents();
    }
    public static int ModuloActivo = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_cambiante = new javax.swing.JPanel();
        panel_administracion = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        panel_opciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_panel_familiar = new javax.swing.JButton();
        btn_panel_alumno = new javax.swing.JButton();
        btn_panel_apooderado = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_formulario_ingreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panel_cambianteLayout = new javax.swing.GroupLayout(panel_cambiante);
        panel_cambiante.setLayout(panel_cambianteLayout);
        panel_cambianteLayout.setHorizontalGroup(
            panel_cambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        panel_cambianteLayout.setVerticalGroup(
            panel_cambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_titulo.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        lbl_titulo.setText("OPCION ELEGIDA EN EL MENU");

        javax.swing.GroupLayout panel_administracionLayout = new javax.swing.GroupLayout(panel_administracion);
        panel_administracion.setLayout(panel_administracionLayout);
        panel_administracionLayout.setHorizontalGroup(
            panel_administracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_administracionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panel_administracionLayout.setVerticalGroup(
            panel_administracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_administracionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_titulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setText("              ELEGIR OPCION DE DESPLIEGUE");

        btn_panel_familiar.setText("MANTENEDOR FAMILIARES");
        btn_panel_familiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_panel_familiarActionPerformed(evt);
            }
        });

        btn_panel_alumno.setText("MANTENEDOR ALUMNOS");
        btn_panel_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_panel_alumnoActionPerformed(evt);
            }
        });

        btn_panel_apooderado.setText("MANTENEDOR APODERADOS");
        btn_panel_apooderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_panel_apooderadoActionPerformed(evt);
            }
        });

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_formulario_ingreso.setText("FORMULARIO INGRESO");
        btn_formulario_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formulario_ingresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_opcionesLayout = new javax.swing.GroupLayout(panel_opciones);
        panel_opciones.setLayout(panel_opcionesLayout);
        panel_opcionesLayout.setHorizontalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_opcionesLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_formulario_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_panel_alumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_panel_apooderado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_panel_familiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
        );
        panel_opcionesLayout.setVerticalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_panel_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_panel_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_panel_apooderado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btn_formulario_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panel_cambiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_administracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_cambiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panel_administracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 635, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_panel_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_panel_alumnoActionPerformed
        lbl_titulo.setText("Mantenedor de Alumnos");
        Usuario usuario = new Usuario();
        panel_listado panel_usuario=new panel_listado();
        panel_usuario.setSize(1000,600);
        panel_usuario.setLocation(0,0);
        panel_cambiante.removeAll();
        panel_cambiante.add(panel_usuario,BorderLayout.CENTER);
        panel_cambiante.revalidate();
        panel_cambiante.repaint();
        usuario.obtener_listado_alumnos("",1);
    }//GEN-LAST:event_btn_panel_alumnoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_panel_familiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_panel_familiarActionPerformed
        lbl_titulo.setText("Mantenedor de Familiares");
        panel_listado_familiar panel_listado_familiar=new panel_listado_familiar();
        panel_listado_familiar.setSize(1000,500);
        panel_listado_familiar.setLocation(0,0);
        panel_cambiante.removeAll();
        panel_cambiante.add(panel_listado_familiar,BorderLayout.CENTER);
        panel_cambiante.revalidate();
        panel_cambiante.repaint();
    }//GEN-LAST:event_btn_panel_familiarActionPerformed

    private void btn_panel_apooderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_panel_apooderadoActionPerformed
        lbl_titulo.setText("Mantenedor de Apoderados");
        panel_listado_apoderado panel_listado_apoderado =new panel_listado_apoderado();
        panel_listado_apoderado.setSize(1000,500);
        panel_listado_apoderado.setLocation(0,0);
        panel_cambiante.removeAll();
        panel_cambiante.add(panel_listado_apoderado,BorderLayout.CENTER);
        panel_cambiante.revalidate();
        panel_cambiante.repaint();
    }//GEN-LAST:event_btn_panel_apooderadoActionPerformed

    private void btn_formulario_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formulario_ingresoActionPerformed
    interfaz_ingreso ii = new interfaz_ingreso();
    ii.setEnabled(true);
    ii.setLocationRelativeTo(null);
    ii.setVisible(true);
    }//GEN-LAST:event_btn_formulario_ingresoActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz_administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz_administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz_administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz_administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_formulario_ingreso;
    private javax.swing.JButton btn_panel_alumno;
    private javax.swing.JButton btn_panel_apooderado;
    private javax.swing.JButton btn_panel_familiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel panel_administracion;
    private javax.swing.JPanel panel_cambiante;
    private javax.swing.JPanel panel_opciones;
    // End of variables declaration//GEN-END:variables
}