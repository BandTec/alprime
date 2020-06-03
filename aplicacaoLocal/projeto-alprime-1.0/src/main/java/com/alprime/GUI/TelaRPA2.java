package com.alprime.GUI;

import com.alprime.bancoDados.ConsultaBD;
import com.alprime.bancoDados.tabelas.Localizacao;
import com.alprime.bancoDados.tabelas.Maquina;
import com.alprime.bancoDados.tabelas.Usuario;
import com.alprime.bancoDados.tabelas.Venda;
import com.alprime.monitoramento.Converssao;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TelaRPA2 extends javax.swing.JFrame {

    private Venda venda;
    private final Maquina maquina;

    public TelaRPA2(Maquina maquina) {
        this.maquina = maquina;
        initComponents();
        jpnFinalizar.setVisible(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo_alprime_reduzido.png")));
        Thread threadDataHora = new Thread(this::atualizarHora);
        threadDataHora.start();
        lblEstacao.setText(maquina.getLocalizacao().getNomeLocalizacao());
        lblLinha.setText(maquina.getLocalizacao().getTipoLinha());
        lblConfirmacao.setVisible(false);
        btnConfirmar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jpnFinalizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFinalizarCompra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblMensagemFinalizar = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        botao50reais = new javax.swing.JButton();
        botao5reais = new javax.swing.JButton();
        botao20reais = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        AdministrativoPalavraLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblLinha = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        AdministrativoPalavraLabel4 = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        lblConfirmacao = new javax.swing.JLabel();
        btnCarregar = new javax.swing.JButton();
        lblEstacao = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        jpnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        jpnFinalizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(111, 44, 145));
        jLabel2.setText("Não se esqueça de retirar o cartão");
        jpnFinalizar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_editado.png"))); // NOI18N
        jpnFinalizar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 180, 80));

        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao_finalizar.png"))); // NOI18N
        btnFinalizarCompra.setBorderPainted(false);
        btnFinalizarCompra.setContentAreaFilled(false);
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        jpnFinalizar.add(btnFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(111, 44, 145));
        jLabel6.setText("Boa Viagem!");
        jpnFinalizar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        lblMensagemFinalizar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblMensagemFinalizar.setForeground(new java.awt.Color(111, 44, 145));
        lblMensagemFinalizar.setText("Sua recarga de R$ %.2f foi efetuada com sucesso ");
        jpnFinalizar.add(lblMensagemFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jPanel2.add(jpnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtValor.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txtValor.setForeground(new java.awt.Color(51, 153, 0));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 44, 145), 2));
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel2.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 150, 33));

        botao50reais.setBackground(new java.awt.Color(204, 204, 204));
        botao50reais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao50reais.setForeground(new java.awt.Color(102, 0, 102));
        botao50reais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_50_reais.png"))); // NOI18N
        botao50reais.setContentAreaFilled(false);
        botao50reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao50reaisActionPerformed(evt);
            }
        });
        jPanel2.add(botao50reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 140, -1));

        botao5reais.setBackground(new java.awt.Color(204, 204, 204));
        botao5reais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao5reais.setForeground(new java.awt.Color(102, 0, 102));
        botao5reais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_5_reais.png"))); // NOI18N
        botao5reais.setBorderPainted(false);
        botao5reais.setContentAreaFilled(false);
        botao5reais.setOpaque(false);
        botao5reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5reaisActionPerformed(evt);
            }
        });
        jPanel2.add(botao5reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 80));

        botao20reais.setBackground(new java.awt.Color(204, 204, 204));
        botao20reais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao20reais.setForeground(new java.awt.Color(102, 0, 102));
        botao20reais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_20_reais.png"))); // NOI18N
        botao20reais.setBorderPainted(false);
        botao20reais.setContentAreaFilled(false);
        botao20reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao20reaisActionPerformed(evt);
            }
        });
        jPanel2.add(botao20reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, 80));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(111, 44, 145));
        jLabel3.setText("Outro valor:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 30));

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(102, 0, 102));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao_confirmar.png"))); // NOI18N
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, 70));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 57, 83, -1));

        btnFechar.setBackground(new java.awt.Color(111, 44, 145));
        btnFechar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(111, 44, 145));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fechar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setBorder(null);
        btnFechar.setBorderPainted(false);
        btnFechar.setContentAreaFilled(false);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel2.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        AdministrativoPalavraLabel.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        AdministrativoPalavraLabel.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel.setText("    Bem-vindo! ");
        jPanel2.add(AdministrativoPalavraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_editado.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 180, 80));

        jLabel18.setBackground(new java.awt.Color(111, 44, 145));
        jLabel18.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(111, 44, 145));
        jLabel18.setText("Linha:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel19.setBackground(new java.awt.Color(111, 44, 145));
        jLabel19.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(111, 44, 145));
        jLabel19.setText("Estação:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lblLinha.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        lblLinha.setForeground(new java.awt.Color(111, 44, 145));
        lblLinha.setText("Linha");
        jPanel2.add(lblLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        lblHora1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        lblHora1.setForeground(new java.awt.Color(111, 44, 145));
        lblHora1.setText("HH:MM");
        jPanel2.add(lblHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        AdministrativoPalavraLabel4.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        AdministrativoPalavraLabel4.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel4.setText("Selecione o valor para recarga");
        jPanel2.add(AdministrativoPalavraLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 280, 30));

        lblData1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        lblData1.setForeground(new java.awt.Color(111, 44, 145));
        lblData1.setText("DD/MM/AAAA");
        jPanel2.add(lblData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        lblConfirmacao.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblConfirmacao.setForeground(new java.awt.Color(111, 44, 145));
        lblConfirmacao.setText("Sua recarga é de R$ %.0f,00 ?");
        jPanel2.add(lblConfirmacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, 40));

        btnCarregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCarregar.setForeground(new java.awt.Color(102, 0, 102));
        btnCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao_ok.png"))); // NOI18N
        btnCarregar.setContentAreaFilled(false);
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 90, 50));

        lblEstacao.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        lblEstacao.setForeground(new java.awt.Color(111, 44, 145));
        lblEstacao.setText("Estacao");
        jPanel2.add(lblEstacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
    }//GEN-LAST:event_txtValorActionPerformed

    private void botao5reaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5reaisActionPerformed
        double valor = 5;
        List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
        venda = new Venda(null, valor, LocalDateTime.now().toString(), maquina);
        lblConfirmacao.setText(String.format("Sua recarga é de R$ %.0f,00 ?", valor));
        lblConfirmacao.setVisible(true);
        btnConfirmar.setVisible(true);
        System.out.println(venda);
    }//GEN-LAST:event_botao5reaisActionPerformed

    private void botao20reaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao20reaisActionPerformed
        double valor = 20;
        List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
        venda = new Venda(null, valor, LocalDateTime.now().toString(), maquina);
        lblConfirmacao.setText(String.format("Sua recarga é de R$ %.0f,00 ?", valor));
        lblConfirmacao.setVisible(true);
        btnConfirmar.setVisible(true);
        System.out.println(venda);
    }//GEN-LAST:event_botao20reaisActionPerformed

    private void botao50reaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao50reaisActionPerformed
        double valor = 50;
        List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
        venda = new Venda(null, valor, LocalDateTime.now().toString(), maquina);
        lblConfirmacao.setText(String.format("Sua recarga é de R$ %.0f,00 ?", valor));
        lblConfirmacao.setVisible(true);
        btnConfirmar.setVisible(true);
        System.out.println(venda);

    }//GEN-LAST:event_botao50reaisActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        ConsultaBD.insertVenda(venda);
        jpnFinalizar.setVisible(true);
        lblMensagemFinalizar.setText(String.format("Sua recarga de R$ %.2f foi efetuada com sucesso!", venda.getValor()));
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        double valor = Double.parseDouble(txtValor.getText());
        List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
        venda = new Venda(null, valor, LocalDateTime.now().toString(), maquina);
        lblConfirmacao.setText(String.format("Sua recarga é de R$ %.2f ?", valor));
        lblConfirmacao.setVisible(true);
        btnConfirmar.setVisible(true);
        System.out.println(venda);

    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        jpnFinalizar.setVisible(false);
        txtValor.setText("");
        lblConfirmacao.setVisible(false);
        btnConfirmar.setVisible(false);
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    public void atualizarHora() {
        while (true) {
            List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
            lblData1.setText(dataHora.get(0));
            lblHora1.setText(dataHora.get(1));
        }
    }

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
            java.util.logging.Logger.getLogger(TelaRPA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRPA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRPA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRPA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRPA2(ConsultaBD.procurarIdMaquina(1)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministrativoPalavraLabel;
    private javax.swing.JLabel AdministrativoPalavraLabel4;
    private javax.swing.JButton botao20reais;
    private javax.swing.JButton botao50reais;
    private javax.swing.JButton botao5reais;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JPanel jpnFinalizar;
    private javax.swing.JLabel lblConfirmacao;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblEstacao;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblLinha;
    private javax.swing.JLabel lblMensagemFinalizar;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
