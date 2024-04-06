/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import javax.swing.JFrame;
import InterfazGrafica.register;
import Utilitario.UtilitarioVentana;

/**
 *
 * @author ME1
 */
public class login extends javax.swing.JFrame {

    static JFrame Ventana;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        TxtUsuario.setBackground(new java.awt.Color(0, 0, 0, 1));
        TxtContra.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LblEquis = new javax.swing.JLabel();
        LblLogin = new javax.swing.JLabel();
        LblBienvenida = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        LbUsario = new javax.swing.JLabel();
        LblUsuarioIcon = new javax.swing.JLabel();
        LblContra = new javax.swing.JLabel();
        TxtContra = new javax.swing.JPasswordField();
        LbContra = new javax.swing.JLabel();
        LblOcultar = new javax.swing.JLabel();
        LblMostrar = new javax.swing.JLabel();
        BtnInicioSesion = new javax.swing.JButton();
        LblRegistro = new javax.swing.JLabel();
        LblTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Chef.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 500, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        jPanel2.setBackground(new java.awt.Color(0, 57, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblEquis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LblEquis.setForeground(new java.awt.Color(255, 255, 255));
        LblEquis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblEquis.setText("X");
        LblEquis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblEquis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblEquisMouseClicked(evt);
            }
        });
        jPanel2.add(LblEquis, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 29));

        LblLogin.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        LblLogin.setForeground(new java.awt.Color(255, 255, 255));
        LblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblLogin.setText("Inicio de Sesión");
        jPanel2.add(LblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 420, 41));

        LblBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        LblBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        LblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblBienvenida.setText("Hola! Bienvenido a Fastify");
        jPanel2.add(LblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 420, -1));

        LblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        LblUsuario.setForeground(new java.awt.Color(199, 226, 255));
        LblUsuario.setText("Usuario");
        jPanel2.add(LblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 341, -1));

        TxtUsuario.setFont(TxtUsuario.getFont().deriveFont(TxtUsuario.getFont().getSize()+2f));
        TxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsuario.setBorder(null);
        jPanel2.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 140, 240, 30));

        LbUsario.setForeground(new java.awt.Color(255, 255, 255));
        LbUsario.setText("_________________________________________");
        jPanel2.add(LbUsario, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 147, 290, 39));

        LblUsuarioIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblUsuarioIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(LblUsuarioIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 147, 40, 39));

        LblContra.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        LblContra.setForeground(new java.awt.Color(199, 226, 255));
        LblContra.setText("Contraseña");
        jPanel2.add(LblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 341, -1));

        TxtContra.setFont(TxtContra.getFont().deriveFont(TxtContra.getFont().getSize()+2f));
        TxtContra.setForeground(new java.awt.Color(255, 255, 255));
        TxtContra.setBorder(null);
        TxtContra.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(TxtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 30));

        LbContra.setForeground(new java.awt.Color(255, 255, 255));
        LbContra.setText("_________________________________________");
        jPanel2.add(LbContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 216, 290, 40));

        LblOcultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png"))); // NOI18N
        LblOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblOcultarMouseClicked(evt);
            }
        });
        jPanel2.add(LblOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 216, 40, 40));

        LblMostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png"))); // NOI18N
        LblMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMostrarMouseClicked(evt);
            }
        });
        jPanel2.add(LblMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 216, 40, 40));

        BtnInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        BtnInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnInicioSesion.setForeground(new java.awt.Color(0, 57, 114));
        BtnInicioSesion.setText("Iniciar Sesión");
        BtnInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioSesionActionPerformed(evt);
            }
        });
        jPanel2.add(BtnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 341, 40));

        LblRegistro.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        LblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        LblRegistro.setText("Registrarse");
        LblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblRegistroMouseClicked(evt);
            }
        });
        jPanel2.add(LblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 122, -1));

        LblTexto.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        LblTexto.setForeground(new java.awt.Color(199, 226, 255));
        LblTexto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblTexto.setText("No posees una cuenta ? ");
        jPanel2.add(LblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 213, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 420, 440));

        setSize(new java.awt.Dimension(916, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LblEquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblEquisMouseClicked
        UtilitarioVentana.fadeOutAndExit(this);
    }//GEN-LAST:event_LblEquisMouseClicked

    private void LblOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblOcultarMouseClicked
        TxtContra.setEchoChar((char) 0);
        LblOcultar.setVisible(false);
        LblOcultar.setEnabled(false);
        LblMostrar.setEnabled(true);
        LblMostrar.setEnabled(true);
    }//GEN-LAST:event_LblOcultarMouseClicked

    private void LblMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMostrarMouseClicked
        TxtContra.setEchoChar((char) 8226);
        LblOcultar.setVisible(true);
        LblOcultar.setEnabled(true);
        LblMostrar.setEnabled(false);
        LblMostrar.setEnabled(false);
    }//GEN-LAST:event_LblMostrarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        UtilitarioVentana.centrarVentanaJFrame(this, false);
        UtilitarioVentana.fade(this);
    }//GEN-LAST:event_formWindowOpened

    private void BtnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInicioSesionActionPerformed

    private void LblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblRegistroMouseClicked
        UtilitarioVentana.centrarVentanaJFrame(this.Ventana = new register(), false);
    }//GEN-LAST:event_LblRegistroMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicioSesion;
    private javax.swing.JLabel LbContra;
    private javax.swing.JLabel LbUsario;
    private javax.swing.JLabel LblBienvenida;
    private javax.swing.JLabel LblContra;
    private javax.swing.JLabel LblEquis;
    private javax.swing.JLabel LblLogin;
    private javax.swing.JLabel LblMostrar;
    private javax.swing.JLabel LblOcultar;
    private javax.swing.JLabel LblRegistro;
    private javax.swing.JLabel LblTexto;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JLabel LblUsuarioIcon;
    private javax.swing.JPasswordField TxtContra;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
