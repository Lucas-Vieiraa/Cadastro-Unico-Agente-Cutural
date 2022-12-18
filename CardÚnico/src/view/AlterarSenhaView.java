package view;

import controller.AlterarSenhaController;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import Jm.JMascara;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AlterarSenhaView extends javax.swing.JFrame {
    private final AlterarSenhaController controller;
  
    public  AlterarSenhaView() {
        initComponents();
        controller = new AlterarSenhaController(this);
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnalterarsenha = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        txtfundo1 = new javax.swing.JLabel();
        txtfundo4 = new javax.swing.JLabel();
        txtfundo2 = new javax.swing.JLabel();
        txtfundo = new javax.swing.JLabel();
        txtfundo5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtfundobranco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnalterarsenha.setBackground(new java.awt.Color(51, 51, 51));
        btnalterarsenha.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnalterarsenha.setForeground(new java.awt.Color(255, 255, 255));
        btnalterarsenha.setText("Alterar Senha");
        btnalterarsenha.setToolTipText("");
        btnalterarsenha.setActionCommand("Login");
        btnalterarsenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnalterarsenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnalterarsenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnalterarsenhaMouseExited(evt);
            }
        });
        btnalterarsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnalterarsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 110, 50));

        btnvoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnvoltar.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnvoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltar.setText("Voltar");
        btnvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnvoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnvoltarMouseExited(evt);
            }
        });
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        txtfundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cinza.jpg"))); // NOI18N
        getContentPane().add(txtfundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 300));

        txtfundo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cinza.jpg"))); // NOI18N
        getContentPane().add(txtfundo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 160, 40));

        txtfundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cinza.jpg"))); // NOI18N
        getContentPane().add(txtfundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 60, 300));

        txtfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cinza.jpg"))); // NOI18N
        getContentPane().add(txtfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 410, 50));

        txtfundo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cinza.jpg"))); // NOI18N
        getContentPane().add(txtfundo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 270, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Cpf/Cnpj:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 50));

        txtcpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcpfKeyReleased(evt);
            }
        });
        getContentPane().add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 30));
        getContentPane().add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nova Senha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 50));

        txtfundobranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Branco Top.jpg"))); // NOI18N
        txtfundobranco.setText("jLabel4");
        getContentPane().add(txtfundobranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 310));

        setSize(new java.awt.Dimension(485, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvoltarMouseEntered
        // TODO add your handling code here:
        btnvoltar.setBackground(new Color(153, 153, 153));
        btnvoltar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnvoltarMouseEntered

    private void btnvoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvoltarMouseExited
        // TODO add your handling code here:
        btnvoltar.setBackground(new Color(51, 51, 51));
        btnvoltar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnvoltarMouseExited

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        // TODO add your handling code here:
        LoginView telaLogin = null;
        try {
            telaLogin = new LoginView();
            telaLogin.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnalterarsenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalterarsenhaMouseEntered
        // TODO add your handling code here:
        btnalterarsenha.setBackground(new Color(153, 153, 153));
        btnalterarsenha.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnalterarsenhaMouseEntered

    private void btnalterarsenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalterarsenhaMouseExited
        // TODO add your handling code here:
        btnalterarsenha.setBackground(new Color(51, 51, 51));
        btnalterarsenha.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnalterarsenhaMouseExited

    private void btnalterarsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarsenhaActionPerformed
        try {
            controller.AlterarSenha();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlterarSenhaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnalterarsenhaActionPerformed

    private void txtcpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyReleased
        // TODO add your handling code here:
        txtcpf.setText(JMascara.GetJmascaraCpfCnpj(txtcpf.getText()));
    }//GEN-LAST:event_txtcpfKeyReleased

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
            java.util.logging.Logger.getLogger(AlterarSenhaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarSenhaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarSenhaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarSenhaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarSenhaView().setVisible(true);
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
    private javax.swing.JButton btnalterarsenha;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JLabel txtfundo;
    private javax.swing.JLabel txtfundo1;
    private javax.swing.JLabel txtfundo2;
    private javax.swing.JLabel txtfundo4;
    private javax.swing.JLabel txtfundo5;
    private javax.swing.JLabel txtfundobranco;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
