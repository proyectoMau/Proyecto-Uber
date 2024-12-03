/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import poo.Lecturas;
import poo.ManipulaArchivos;
import poo.Manipulacion;
import poo.Socio;

/**
 *
 * @author Meche}
 */
public class vtnModificaPlaca extends javax.swing.JFrame
{
   
    /**
     * Creates new form vtnModificaPlaca
     */
    public vtnModificaPlaca()
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

        txtNuevaPlaca = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificación de placa");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNuevaPlaca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNuevaPlacaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNuevaPlacaKeyTyped(evt);
            }
        });
        getContentPane().add(txtNuevaPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 115, 115));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("Limpiar campo");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnAceptar.setToolTipText("Actualizar placa");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/ModificaPlaca.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNuevaPlacaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNuevaPlacaKeyPressed
    {//GEN-HEADEREND:event_txtNuevaPlacaKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, txtNuevaPlaca, btnAceptar);
    }//GEN-LAST:event_txtNuevaPlacaKeyPressed

    private void txtNuevaPlacaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNuevaPlacaKeyTyped
    {//GEN-HEADEREND:event_txtNuevaPlacaKeyTyped
        Validaciones.validaAlfanumerico(evt, 10, txtNuevaPlaca.getText());
    }//GEN-LAST:event_txtNuevaPlacaKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        new vtnSocioModificaDatos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
//        VtnPrincipal.s = Manipulacion.modificaPlaca(VtnSocio.pos, VtnPrincipal.s, txtNuevaPlaca.getText());
//        Mensajes.exito(this, Manipulacion.despS(VtnPrincipal.s, VtnSocio.nS));
//        new VtnSocioDashboard().setVisible(true);
//        this.setVisible(false);
        VtnPrincipal.s = Manipulacion.modificaPlaca(VtnSocio.pos, VtnPrincipal.s,
                txtNuevaPlaca.getText());
        VtnPrincipal.tmpSocio = VtnPrincipal.s[VtnSocio.pos-1];
        Mensajes.exito(this, "Modelo del socio actualizado correctamente:\n");
        ManipulaArchivos.guardaS(Socio.getCons(), "foliosS.dat");
        ManipulaArchivos.guardaSA(VtnPrincipal.s, "Socios.dat");
        modificaPlacas ventana = new modificaPlacas();
        ventana.setVisible(true);
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
        CtrlInterfaz.limpia(txtNuevaPlaca);
        CtrlInterfaz.habilita(false, btnAceptar);
        CtrlInterfaz.selecciona(txtNuevaPlaca);
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
            java.util.logging.Logger.getLogger(vtnModificaPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(vtnModificaPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(vtnModificaPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(vtnModificaPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new vtnModificaPlaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNuevaPlaca;
    // End of variables declaration//GEN-END:variables
}
