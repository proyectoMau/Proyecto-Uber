/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import poo.Lecturas;
import poo.Manipulacion;

/**
 *
 * @author Meche}
 */
public class vtnModificaModelo extends javax.swing.JFrame
{

    /**
     * Creates new form vtnModificaMarca
     */
    public vtnModificaModelo()
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

        txtNuevoModelo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificación de modelo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNuevoModelo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNuevoModeloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNuevoModeloKeyTyped(evt);
            }
        });
        getContentPane().add(txtNuevoModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 115, 115));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(151, 247, 185));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/Aceptar.png"))); // NOI18N
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnAceptarKeyPressed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/ModificaMarca.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNuevoModeloKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNuevoModeloKeyPressed
    {//GEN-HEADEREND:event_txtNuevoModeloKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, txtNuevoModelo, btnAceptar);
    }//GEN-LAST:event_txtNuevoModeloKeyPressed

    private void txtNuevoModeloKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNuevoModeloKeyTyped
    {//GEN-HEADEREND:event_txtNuevoModeloKeyTyped
        Validaciones.validaAlfanumerico(evt, 10, txtNuevoModelo.getText());
    }//GEN-LAST:event_txtNuevoModeloKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        new vtnSocioModificaDatos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        VtnPrincipal.s = Manipulacion.modificaModelo(VtnSocio.pos, VtnPrincipal.s, txtNuevoModelo.getText());
        Mensajes.exito(this, Manipulacion.despS(VtnPrincipal.s, VtnSocio.nS));
        new VtnSocioDashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarKeyPressed
    {//GEN-HEADEREND:event_btnAceptarKeyPressed
        if (evt.getKeyChar()== '\n')
        {
            btnAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(txtNuevoModelo);
        CtrlInterfaz.habilita(false, btnAceptar);
        CtrlInterfaz.selecciona(txtNuevoModelo);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(vtnModificaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(vtnModificaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(vtnModificaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(vtnModificaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new vtnModificaModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNuevoModelo;
    // End of variables declaration//GEN-END:variables
}
