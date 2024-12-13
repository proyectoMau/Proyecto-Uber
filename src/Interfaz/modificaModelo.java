/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import cjb.ci.Mensajes;
import Interfaz.VtnPrincipal;
import poo.Socio;

/**
 *
 * @author Meche}
 */
public class modificaModelo extends javax.swing.JFrame
{

    /**
     * Creates new form modificaModelo
     */
    public modificaModelo()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        numSocio = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        placas = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos modificados");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numSocio.setEnabled(false);
        getContentPane().add(numSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, -1));

        nombre.setEnabled(false);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, -1));

        placas.setEnabled(false);
        getContentPane().add(placas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 260, -1));

        modelo.setEnabled(false);
        getContentPane().add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 260, -1));

        fecha.setEnabled(false);
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 260, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/modifica-modelo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        if (VtnPrincipal.tmpSocio != null)
        {
            Socio socio = VtnPrincipal.s[Integer.parseInt(VtnSocio.nS)-1];
            numSocio.setText(socio.getNumSocio());
            nombre.setText(socio.getNom());
            placas.setText(socio.getPlacas());
            modelo.setText(socio.getModelo());
            fecha.setText(socio.getFecha());
        } else
        {
            Mensajes.error(this, "No se encontró el socio modificado.");
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        new VtnSocioDashboard().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(modificaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(modificaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(modificaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(modificaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new modificaModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numSocio;
    private javax.swing.JTextField placas;
    // End of variables declaration//GEN-END:variables
}
