/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import static Interfaz.VtnPrincipal.c;
import cjb.ci.BtnEntero;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import poo.Cliente;
import poo.ManipulaArchivos;
import poo.Manipulacion;
import poo.Socio;

/**
 *
 * @author Meche}
 */
public class VtnRegistroCliente extends javax.swing.JFrame
{

    /**
     * Creates new form VtnRegistroCliente
     */
    public VtnRegistroCliente()
    {
        initComponents();
        jdcFecha.setMinSelectableDate(new Date());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        formaPago = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JToggleButton();
        btnAceptar = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        txtFechaC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setToolTipText("Nombre del cliente");
        txtNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, -1));

        formaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecciona-", "Tarjeta", "Efectivo" }));
        formaPago.setToolTipText("Forma de pago");
        formaPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        formaPago.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                formaPagoActionPerformed(evt);
            }
        });
        formaPago.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                formaPagoKeyPressed(evt);
            }
        });
        getContentPane().add(formaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 260, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 115, 115));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(151, 247, 185));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/Aceptar.png"))); // NOI18N
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
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        jdcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                jdcFechaPropertyChange(evt);
            }
        });
        jdcFecha.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jdcFechaKeyPressed(evt);
            }
        });
        getContentPane().add(jdcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 40, -1));

        txtFechaC.setEditable(false);
        txtFechaC.setEnabled(false);
        txtFechaC.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtFechaCActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagenes/RegistroClientes.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyPressed
    {//GEN-HEADEREND:event_txtNombreKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, txtNombre, btnAceptar);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void formaPagoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_formaPagoActionPerformed
    {//GEN-HEADEREND:event_formaPagoActionPerformed

    }//GEN-LAST:event_formaPagoActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombreKeyTyped
    {//GEN-HEADEREND:event_txtNombreKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, txtNombre.getText());
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(txtNombre, txtFechaC);
        CtrlInterfaz.habilita(false, txtFechaC, btnAceptar);
        CtrlInterfaz.selecciona(txtNombre);
        formaPago.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formaPagoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_formaPagoKeyPressed
    {//GEN-HEADEREND:event_formaPagoKeyPressed

    }//GEN-LAST:event_formaPagoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        ManipulaArchivos.guardaC(Cliente.getCons(), "foliosC.dat");
        ManipulaArchivos.guardaCA(VtnPrincipal.c, "Clientes.dat");
        new VtnCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNombreActionPerformed
    {//GEN-HEADEREND:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed

        if (txtFechaC.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty() || formaPago.getSelectedItem() == null)
        {
            Mensajes.error(this, "Ingrese todos los datos para poder registrar");
            if (txtNombre.getText().trim().isEmpty())
            {
                txtNombre.requestFocus();
            } else if (formaPago.getSelectedItem() == null)
            {
                formaPago.requestFocus();
            } else
            {
                txtFechaC.requestFocus();
            }
            return;
        }
        //String formaPagoSeleccionada = (String) formaPago.getSelectedItem();
        char formaPagoChar = 0;
        if (formaPago.getSelectedItem().equals("-Selecciona-"))
        {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un metodo de pago");
        } else
        {
            if (formaPago.getSelectedItem() == "Efectivo")
            {
                formaPagoChar = 'E';
            }
            if (formaPago.getSelectedItem() == "Tarjeta")
            {
                formaPagoChar = 'T';
            }
            Cliente nuevoCliente = new Cliente(
                    txtNombre.getText(),
                    formaPagoChar,
                    txtFechaC.getText()
            );
            VtnPrincipal.c = Manipulacion.insertaCliente(VtnPrincipal.c, nuevoCliente);
            VtnPrincipal.tmpCliente = nuevoCliente;
            clienteRegistrado ventana = new clienteRegistrado();
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarKeyPressed
    {//GEN-HEADEREND:event_btnAceptarKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            btnAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void txtFechaCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtFechaCActionPerformed
    {//GEN-HEADEREND:event_txtFechaCActionPerformed

    }//GEN-LAST:event_txtFechaCActionPerformed

    private void jdcFechaPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_jdcFechaPropertyChange
    {//GEN-HEADEREND:event_jdcFechaPropertyChange
        /* if (evt.getOldValue() != null) //verifica que no tenga datos 
        {
            SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
            txtFechaC.setText(ff.format(jdcFecha.getCalendar().getTime()));
        } else
        {
            
        }*/
        if ("date".equals(evt.getPropertyName())) { // Detecta cambios en la propiedad "date"
        if (jdcFecha.getDate() != null) { // Asegúrate de que haya una fecha seleccionada
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Define el formato de fecha
            String formattedDate = dateFormat.format(jdcFecha.getDate()); // Formatea la fecha seleccionada
            txtFechaC.setText(formattedDate); // Actualiza el JTextField con la fecha
        }
    }
    }//GEN-LAST:event_jdcFechaPropertyChange

    private void jdcFechaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jdcFechaKeyPressed
    {//GEN-HEADEREND:event_jdcFechaKeyPressed
        //Validaciones.enterCadenaNoVacia(this, evt, jdcFecha, btnAceptar);
    }//GEN-LAST:event_jdcFechaKeyPressed

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
            java.util.logging.Logger.getLogger(VtnRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnRegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> formaPago;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTextField txtFechaC;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
