package com.alprime.GUI;

import com.alprime.bancoDados.ConsultaBD;
import com.alprime.bancoDados.tabelas.Maquina;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.springframework.dao.EmptyResultDataAccessException;

/**
 * @author Gabriel Vieira
 */
public class TelaInicial2 extends javax.swing.JFrame {

    static Integer idMaquina = 0; 
    static boolean statusTelaInicial = true;

    public TelaInicial2() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo_reduzido.png")));
        lblSucesso.setVisible(false);
        lblErroSenha.setVisible(false);
        lblSucesso.setVisible(false);
        lblErroCodigo.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdMaquina = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblErroSenha = new javax.swing.JLabel();
        lblSucesso = new javax.swing.JLabel();
        lblErroCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(111, 44, 145));
        jLabel1.setText("S T A");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(111, 44, 145));
        jLabel2.setText("Sistema de Totens da Alprime ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        txtIdMaquina.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        txtIdMaquina.setForeground(new java.awt.Color(82, 186, 54));
        txtIdMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMaquinaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, -1));

        txtSenha.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(82, 186, 54));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(111, 44, 145));
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(111, 44, 145));
        jLabel4.setText("Código da Maquina");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao_login.png"))); // NOI18N
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_editado.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 180, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/totenicone.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 20, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadeado.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metro.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cptm.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        lblErroSenha.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        lblErroSenha.setForeground(new java.awt.Color(255, 33, 77));
        lblErroSenha.setText("Erro");
        jPanel1.add(lblErroSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, 30));

        lblSucesso.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        lblSucesso.setForeground(new java.awt.Color(82, 186, 54));
        lblSucesso.setText("Erro");
        jPanel1.add(lblSucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, 20));

        lblErroCodigo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        lblErroCodigo.setForeground(new java.awt.Color(255, 33, 77));
        lblErroCodigo.setText("Erro");
        jPanel1.add(lblErroCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMaquinaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String idMaquinaString = txtIdMaquina.getText();
        try {
            idMaquina = Integer.valueOf(idMaquinaString);
        } catch (NumberFormatException e) {
            lblErroCodigo.setVisible(true);
            lblErroCodigo.setText("Somente Numeros");
            lblErroSenha.setVisible(false);
        }
        if (idMaquina > 0) {
            Maquina maquina = new Maquina();
            try {
                maquina = ConsultaBD.procurarIdMaquina(idMaquina);
                if (maquina.getSenhaMaquina().equals(txtSenha.getText())) {
                    lblSucesso.setText("Login Aceito");
                    lblSucesso.setVisible(true);
                    lblErroSenha.setVisible(false);
                    lblErroCodigo.setVisible(false);
                    statusTelaInicial = false;
                } else {
                    lblErroSenha.setText("Senha Incorreta");
                    lblErroSenha.setVisible(true);
                    lblErroCodigo.setVisible(false);
                }
            } catch (EmptyResultDataAccessException e) {
                lblErroCodigo.setText("Código da maquina inválido");
                lblErroCodigo.setVisible(true);
                lblErroSenha.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static boolean isStatusTelaInicial() {
        return statusTelaInicial;
    }

    public static void setStatusTelaInicial(boolean statusTelaInicial) {
        TelaInicial2.statusTelaInicial = statusTelaInicial;
    }

    public static Integer getIdMaquina() {
        return idMaquina;
    }

    public JTextField getTxtIdMaquina() {
        return txtIdMaquina;
    }

    public void setTxtIdMaquina(JTextField txtIdMaquina) {
        this.txtIdMaquina = txtIdMaquina;
    }

    public JTextField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JTextField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JLabel getLblSucesso() {
        return lblSucesso;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        TelaInicial2 telaLogin = new TelaInicial2();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                telaLogin.setVisible(true);
                Thread loopEntrar = new Thread(this::loopEntrar);
                loopEntrar.start();
            }

            public void loopEntrar() {
                while (true) {
                    if (statusTelaInicial == false) {
                        TelaMonitoramento2 monitoramento = new TelaMonitoramento2(telaLogin.getIdMaquina());
                        monitoramento.setVisible(true);
                        telaLogin.setVisible(false);
                        while (true) {
                            if (monitoramento.isStatusMonitoramento() == false) {
                                monitoramento.setVisible(false);
                                telaLogin.getTxtIdMaquina().setText("");
                                telaLogin.getTxtSenha().setText("");
                                telaLogin.getLblSucesso().setVisible(false);
                                telaLogin.setVisible(true);
                                monitoramento.setStatusMonitoramento(true);

                                break;
                            }
                            System.out.print("");
                        }
                        statusTelaInicial = true;
                    }
                    System.out.print("");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErroCodigo;
    private javax.swing.JLabel lblErroSenha;
    private javax.swing.JLabel lblSucesso;
    private javax.swing.JTextField txtIdMaquina;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
