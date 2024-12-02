/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import static Interfaz.VtnClienteDashboard.y;
import static Interfaz.VtnClienteDashboard.monto;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import poo.ManipulaArchivos;
import poo.Manipulacion;
import static poo.Manipulacion.buscarStatus;
import poo.Viaje;

/**
 *
 * @author Meche}
 */
public class VtnSolicitarViaje extends javax.swing.JFrame
{

    public static char status = ' ';

    /**
     * Creates new form VtnSolicitarViaje
     */
    public VtnSolicitarViaje()
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

        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JToggleButton();
        txtFecha = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitar viaje");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOrigen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtOrigenActionPerformed(evt);
            }
        });
        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtOrigenKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtOrigenKeyTyped(evt);
            }
        });
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 220, -1));

        txtDestino.setEnabled(false);
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtDestinoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtDestinoKeyTyped(evt);
            }
        });
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 220, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 115, 115));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        txtFecha.setEnabled(false);
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtFechaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtFechaKeyTyped(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 220, -1));

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
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/SolicitarViaje.png"))); // NOI18N
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jLabel1KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrigenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtOrigenActionPerformed
    {//GEN-HEADEREND:event_txtOrigenActionPerformed

    }//GEN-LAST:event_txtOrigenActionPerformed

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jLabel1KeyPressed
    {//GEN-HEADEREND:event_jLabel1KeyPressed

    }//GEN-LAST:event_jLabel1KeyPressed

    private void txtDestinoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDestinoKeyPressed
    {//GEN-HEADEREND:event_txtDestinoKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, txtDestino, txtFecha);
    }//GEN-LAST:event_txtDestinoKeyPressed

    private void txtFechaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtFechaKeyPressed
    {//GEN-HEADEREND:event_txtFechaKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, txtFecha, btnAceptar);
    }//GEN-LAST:event_txtFechaKeyPressed

    private void txtOrigenKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtOrigenKeyPressed
    {//GEN-HEADEREND:event_txtOrigenKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, txtOrigen, txtDestino);
    }//GEN-LAST:event_txtOrigenKeyPressed

    private void txtOrigenKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtOrigenKeyTyped
    {//GEN-HEADEREND:event_txtOrigenKeyTyped
        Validaciones.validaAlfanumerico(evt, 20, txtOrigen.getText());
    }//GEN-LAST:event_txtOrigenKeyTyped

    private void txtDestinoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDestinoKeyTyped
    {//GEN-HEADEREND:event_txtDestinoKeyTyped
        Validaciones.validaAlfanumerico(evt, 20, txtDestino.getText());
    }//GEN-LAST:event_txtDestinoKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtFechaKeyTyped
    {//GEN-HEADEREND:event_txtFechaKeyTyped
        Validaciones.validaFecha(evt, txtFecha.getText());
    }//GEN-LAST:event_txtFechaKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(txtOrigen, txtDestino, txtFecha);
        CtrlInterfaz.habilita(false, txtDestino, txtFecha);
        CtrlInterfaz.selecciona(txtOrigen);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        String textoStatus = "";
        if (VtnPrincipal.s == null)
        {
            y = 0;
        } else
        {
            y = (int) (Math.random() * VtnPrincipal.s.length);
        }
        System.out.println(y);
        status = buscarStatus(VtnPrincipal.v, VtnPrincipal.s, y);
        VtnPrincipal.tmpVC = new Viaje(VtnCliente.fC, txtOrigen.getText(), txtDestino.getText(),
                status, txtFecha.getText(), monto = (int) (Math.random() * 200));

        if (VtnPrincipal.tmpVC.getStatus() == 'S')
        {
            VtnPrincipal.vC = Manipulacion.insertaViajeC(VtnPrincipal.c, VtnPrincipal.vC,
                    VtnPrincipal.tmpVC, Integer.parseInt(VtnCliente.fC));
            
        } else
        {
            VtnPrincipal.vC = Manipulacion.insertaViajeC(VtnPrincipal.c, VtnPrincipal.vC, VtnPrincipal.tmpVC, Integer.parseInt(VtnCliente.fC));
            VtnPrincipal.v = Manipulacion.insertaViaje(VtnPrincipal.s, VtnPrincipal.v, VtnPrincipal.tmpVC, y);
            Mensajes.exito(this, "Su conductor es " + Manipulacion.despS(VtnPrincipal.s, (y + 1)));

        }
        vtnViajeCreado vtn = new vtnViajeCreado();
        vtn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarKeyPressed
    {//GEN-HEADEREND:event_btnAceptarKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            btnAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
//        ManipulaArchivos.guardaVA(VtnPrincipal.v, "Viajes.dat");
//        ManipulaArchivos.guardaVAC(VtnPrincipal.vC, "ViajesC.dat");
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
            java.util.logging.Logger.getLogger(VtnSolicitarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnSolicitarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnSolicitarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnSolicitarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnSolicitarViaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
