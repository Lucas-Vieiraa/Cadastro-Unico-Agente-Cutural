/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author lucia
 */
public class DadosPessoaisVIEW extends javax.swing.JFrame {

    MaskFormatter data;

    public DadosPessoaisVIEW() {

        try {
            data = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(CadastroVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsair = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtdata = new javax.swing.JFormattedTextField(data);
        txtareacultural = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txttipoagente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescricao = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsair.setBackground(new java.awt.Color(51, 51, 51));
        btnsair.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setText("Sair");
        btnsair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 70, -1));

        btnconsultar.setBackground(new java.awt.Color(51, 51, 51));
        btnconsultar.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnconsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultar.setText("Consultar");
        btnconsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnconsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnconsultarMouseExited(evt);
            }
        });
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 110, 40));

        btnvoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnvoltar.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        btnvoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltar.setText("Voltar");
        btnvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 70, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DADOS PESSOAIS");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 310, 50));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Cinza.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 55));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Cpf /Cnpj :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Data Nascimento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nome Completo / Razão Social:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tipo De Agente:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 100, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Sexo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 40, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Descrição:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Área Cultural:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });
        txtcpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcpfKeyReleased(evt);
            }
        });
        getContentPane().add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 170, 30));

        txtnome.setForeground(new java.awt.Color(51, 51, 51));
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 310, 30));

        txtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdataActionPerformed(evt);
            }
        });
        getContentPane().add(txtdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 120, 30));

        txtareacultural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtareaculturalActionPerformed(evt);
            }
        });
        getContentPane().add(txtareacultural, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 170, 30));

        txtsexo.setForeground(new java.awt.Color(51, 51, 51));
        txtsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsexoActionPerformed(evt);
            }
        });
        getContentPane().add(txtsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 170, 30));

        txttipoagente.setForeground(new java.awt.Color(51, 51, 51));
        txttipoagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoagenteActionPerformed(evt);
            }
        });
        getContentPane().add(txttipoagente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 140, 30));

        txtdescricao.setSelectionColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(txtdescricao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 430, 160));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Branco Top.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 470, 550));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Branco Top.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 560, 550));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Branco Top.jpg"))); // NOI18N
        jLabel16.setText("jLabel2");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 470, 740));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Branco Top.jpg"))); // NOI18N
        jLabel21.setText("jLabel2");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -110, 470, 720));

        setSize(new java.awt.Dimension(525, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtareaculturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtareaculturalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtareaculturalActionPerformed

    private void txtsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsexoActionPerformed

    private void txttipoagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoagenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoagenteActionPerformed

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
        TelaPrincipalVIEW telaPrincipal = null;
        telaPrincipal = new TelaPrincipalVIEW();
        telaPrincipal.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnconsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultarMouseEntered

    private void btnconsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconsultarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultarMouseExited

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed


    }//GEN-LAST:event_btnconsultarActionPerformed

    private void txtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdataActionPerformed

    private void txtcpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyReleased
        // TODO add your handling code here:
        txtcpf.setText(Jm.JMascara.GetJmascaraCpfCnpj(txtcpf.getText()));
    }//GEN-LAST:event_txtcpfKeyReleased

    private void btnsairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsairMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsairMouseEntered

    private void btnsairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsairMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsairMouseExited

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

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
            java.util.logging.Logger.getLogger(DadosPessoaisVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosPessoaisVIEW().setVisible(true);
            }
        });
    }

    public void setTxtareacultural(JTextField txtareacultural) {
        this.txtareacultural = txtareacultural;
    }

    public void setTxtcpf(JTextField txtcpf) {
        this.txtcpf = txtcpf;
    }

    public void setTxtdata(JFormattedTextField txtdata) {
        this.txtdata = txtdata;
    }

    public void setTxtdescricao(JEditorPane txtdescricao) {
        this.txtdescricao = txtdescricao;
    }

    public void setTxtnome(JTextField txtnome) {
        this.txtnome = txtnome;
    }

    public void setTxttipoagente(JTextField txttipoagente) {
        this.txttipoagente = txttipoagente;
    }

    public void setTxtsexo(JTextField txtsexo) {
        this.txtsexo = txtsexo;
    }

    public JTextField getTxtcpf() {
        return txtcpf;
    }

    public JFormattedTextField getTxtdata() {
        return txtdata;
    }

    public JEditorPane getTxtdescricao() {
        return txtdescricao;
    }

    public JTextField getTxtnome() {
        return txtnome;
    }

    public JTextField getTxtsexo() {
        return txtsexo;
    }

    public JTextField getTxttipoagente() {
        return txttipoagente;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtareacultural;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JFormattedTextField txtdata;
    private javax.swing.JEditorPane txtdescricao;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txttipoagente;
    // End of variables declaration//GEN-END:variables

}
