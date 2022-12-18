package view;

import controller.LoginController;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Jm.JMascara;

public class LoginView extends javax.swing.JFrame {

    private final LoginController controller;

    public LoginView() throws ClassNotFoundException {
        initComponents();
        controller = new LoginController(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsair = new javax.swing.JButton();
        txtsenha = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        txtfundo = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btncadastro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnesqueceusenha = new javax.swing.JLabel();
        txtfundobranco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsair.setText("Sair");
        btnsair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsairMouseExited(evt);
            }
        });
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, -1));
        getContentPane().add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 140, 30));

        btnlogin.setBackground(new java.awt.Color(51, 51, 51));
        btnlogin.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Entrar");
        btnlogin.setToolTipText("");
        btnlogin.setActionCommand("Login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginMouseExited(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, 50));

        txtfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cinza.jpg"))); // NOI18N
        getContentPane().add(txtfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 270, 310));

        txtcpf.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtcpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcpfMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtcpfMouseReleased(evt);
            }
        });
        txtcpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcpfKeyReleased(evt);
            }
        });
        getContentPane().add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 140, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel1.setText("CPF/CNPJ:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 20));

        btncadastro.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btncadastro.setText("Cadastre-se");
        btncadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncadastroMouseClicked(evt);
            }
        });
        getContentPane().add(btncadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 90, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel2.setText("SENHA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 14));

        btnesqueceusenha.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnesqueceusenha.setText("Esqueceu a senha ?");
        btnesqueceusenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnesqueceusenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnesqueceusenhaMouseClicked(evt);
            }
        });
        getContentPane().add(btnesqueceusenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 20));

        txtfundobranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Branco Top.jpg"))); // NOI18N
        txtfundobranco.setText("jLabel4");
        getContentPane().add(txtfundobranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 320));

        setSize(new java.awt.Dimension(537, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        try {
            controller.logar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseEntered
        // TODO add your handling code here:
        btnlogin.setBackground(new Color(153, 153, 153));
        btnlogin.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnloginMouseEntered

    private void btnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseExited
        // TODO add your handling code here:
        btnlogin.setBackground(new Color(51, 51, 51));
        btnlogin.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnloginMouseExited

    private void txtcpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcpfMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtcpfMouseClicked

    private void txtcpfMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcpfMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfMouseReleased

    private void btncadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncadastroMouseClicked
        // TODO add your handling code here:
        CadastroView telaDeCadastro = new CadastroView();
        telaDeCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncadastroMouseClicked

    private void txtcpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyReleased
        // TODO add your handling code here:
        txtcpf.setText(JMascara.GetJmascaraCpfCnpj(txtcpf.getText()));
    }//GEN-LAST:event_txtcpfKeyReleased

    private void btnesqueceusenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnesqueceusenhaMouseClicked
        // TODO add your handling code here:
        AlterarSenhaView telaDeAlterarSenha = new AlterarSenhaView();
        telaDeAlterarSenha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnesqueceusenhaMouseClicked

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnsairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsairMouseEntered
        // TODO add your handling code here:
        btnsair.setBackground(new Color(153, 153, 153));
        btnsair.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnsairMouseEntered

    private void btnsairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsairMouseExited
        // TODO add your handling code here:
        btnsair.setBackground(new Color(51, 51, 51));
        btnsair.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnsairMouseExited

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new LoginView().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public JTextField getTxtcpf() {
        return txtcpf;
    }

    public void setTxtcpf(JTextField txtcpf) {
        this.txtcpf = txtcpf;
    }

    public JPasswordField getTxtsenha() {
        return txtsenha;
    }

    public void setTxtsenha(JPasswordField txtsenha) {
        this.txtsenha = txtsenha;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncadastro;
    private javax.swing.JLabel btnesqueceusenha;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JLabel txtfundo;
    private javax.swing.JLabel txtfundobranco;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
