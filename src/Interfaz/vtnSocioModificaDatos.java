/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author Meche}
 */
public class vtnSocioModificaDatos extends javax.swing.JFrame
{

    /**
     * Creates new form vtnSocioModificaDatos
     */
    public vtnSocioModificaDatos()
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

        btnPlaca = new javax.swing.JToggleButton();
        btnModelo = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificación de datos");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/placaIcono.png"))); // NOI18N
        btnPlaca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btnModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/MarcaIcono.png"))); // NOI18N
        btnModelo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModeloActionPerformed(evt);
            }
        });
        getContentPane().add(btnModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/vtnModificaDatosSocio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        new VtnSocioDashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void btnPlacaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPlacaActionPerformed
    {//GEN-HEADEREND:event_btnPlacaActionPerformed
       vtnModificaPlaca vtn = new vtnModificaPlaca();
        vtn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPlacaActionPerformed

    private void btnModeloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModeloActionPerformed
    {//GEN-HEADEREND:event_btnModeloActionPerformed
        vtnModificaModelo vtn = new vtnModificaModelo();
        vtn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModeloActionPerformed

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
            java.util.logging.Logger.getLogger(vtnSocioModificaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(vtnSocioModificaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(vtnSocioModificaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(vtnSocioModificaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new vtnSocioModificaDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnModelo;
    private javax.swing.JToggleButton btnPlaca;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
