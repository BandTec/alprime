package com.alprime.GUI;



import com.alprime.bancoDados.ConsultaBD;
import com.alprime.bancoDados.tabelas.Localizacao;
import com.alprime.bancoDados.tabelas.Maquina;
import com.alprime.bancoDados.tabelas.Registro;
import com.alprime.bancoDados.tabelas.RegistroRPA;
import com.alprime.monitoramento.Converssao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class TelaRPA extends javax.swing.JFrame 
{
    private static boolean logado = true;
    private Localizacao localizacao;
    private Maquina maquinaBD;
    private Maquina maquinaAtualizada;
    
    
    
    private Random numAleatorio = new Random();
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
    private Date dataAtual = new Date();
    
    
    public TelaRPA(Integer idMaquina) 
    {
        initComponents();
        //maquinaBD = ConsultaBD.procurarIdMaquina(idMaquina);
        //System.out.println(ConsultaBD.procurarIdMaquina(idMaquina));
        //localizacao = maquinaBD.getLocalizacao();
        //maquinaAtualizada = new Maquina(localizacao);
        //ConsultaBD.atualizarMaquina(idMaquina, maquinaAtualizada);
    }
    
    public void atualizarDados()
    {
        RegistroRPA registro = new RegistroRPA(maquinaBD);
        //ConsultaBD.insertRegistro(registro);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botao50reais = new javax.swing.JButton();
        botao5reais = new javax.swing.JButton();
        botao20reais = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        AdministrativoPalavraLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AdministrativoPalavraLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        AdministrativoPalavraLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AdministrativoPalavraLabel3 = new javax.swing.JLabel();
        AdministrativoPalavraLabel5 = new javax.swing.JLabel();
        AdministrativoPalavraLabel6 = new javax.swing.JLabel();
        saldoAtualLabel = new javax.swing.JLabel();
        valorRecargaLabel = new javax.swing.JLabel();
        lblData2 = new javax.swing.JLabel();
        lblData3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel6.setText("jLabel6");

        lblData1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblData1.setForeground(new java.awt.Color(111, 44, 145));
        lblData1.setText("DD/MM/AAAA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botao50reais.setBackground(new java.awt.Color(204, 204, 204));
        botao50reais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao50reais.setForeground(new java.awt.Color(102, 0, 102));
        botao50reais.setText("R$ 50,00");
        botao50reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao50reaisActionPerformed(evt);
            }
        });
        jPanel2.add(botao50reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 120, 50));

        botao5reais.setBackground(new java.awt.Color(204, 204, 204));
        botao5reais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao5reais.setForeground(new java.awt.Color(102, 0, 102));
        botao5reais.setText("R$ 5,00");
        botao5reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5reaisActionPerformed(evt);
            }
        });
        jPanel2.add(botao5reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 90, 50));

        botao20reais.setBackground(new java.awt.Color(204, 204, 204));
        botao20reais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botao20reais.setForeground(new java.awt.Color(102, 0, 102));
        botao20reais.setText("R$ 20,00");
        botao20reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao20reaisActionPerformed(evt);
            }
        });
        jPanel2.add(botao20reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Outro valor (Digite):");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 30));

        txtValor.setForeground(new java.awt.Color(51, 153, 0));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        jPanel2.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 150, 33));

        btnCarregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCarregar.setForeground(new java.awt.Color(102, 0, 102));
        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 30));

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
        jPanel2.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        AdministrativoPalavraLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdministrativoPalavraLabel.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel.setText("Bem-vindo! ");
        jPanel2.add(AdministrativoPalavraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_editado.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 180, 80));

        AdministrativoPalavraLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdministrativoPalavraLabel2.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel2.setText("Comprovante Eletrônico:");
        jPanel2.add(AdministrativoPalavraLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 280, 30));

        jLabel18.setBackground(new java.awt.Color(111, 44, 145));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(111, 44, 145));
        jLabel18.setText("Linha:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel19.setBackground(new java.awt.Color(111, 44, 145));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(111, 44, 145));
        jLabel19.setText("Estação:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(111, 44, 145));
        lblUsuario.setText("Usuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        lblHora1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHora1.setForeground(new java.awt.Color(111, 44, 145));
        lblHora1.setText("HH:MM");
        jPanel2.add(lblHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        AdministrativoPalavraLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdministrativoPalavraLabel4.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel4.setText("Selecione o valor para recarga:");
        jPanel2.add(AdministrativoPalavraLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 280, 30));

        jPanel3.setLayout(null);

        AdministrativoPalavraLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdministrativoPalavraLabel3.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel3.setText("Valor da Recarga:");
        jPanel3.add(AdministrativoPalavraLabel3);
        AdministrativoPalavraLabel3.setBounds(10, 200, 160, 30);

        AdministrativoPalavraLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdministrativoPalavraLabel5.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel5.setText("Saldo atual:");
        jPanel3.add(AdministrativoPalavraLabel5);
        AdministrativoPalavraLabel5.setBounds(10, 230, 110, 30);

        AdministrativoPalavraLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdministrativoPalavraLabel6.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel6.setText("Data:");
        jPanel3.add(AdministrativoPalavraLabel6);
        AdministrativoPalavraLabel6.setBounds(10, 50, 46, 30);

        saldoAtualLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        saldoAtualLabel.setForeground(new java.awt.Color(111, 44, 145));
        saldoAtualLabel.setText("R$ 00,00");
        jPanel3.add(saldoAtualLabel);
        saldoAtualLabel.setBounds(120, 230, 80, 30);

        valorRecargaLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valorRecargaLabel.setForeground(new java.awt.Color(111, 44, 145));
        valorRecargaLabel.setText("R$ 00,00");
        jPanel3.add(valorRecargaLabel);
        valorRecargaLabel.setBounds(170, 200, 80, 30);

        lblData2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblData2.setForeground(new java.awt.Color(111, 44, 145));
        lblData2.setText("DD/MM/AAAA");
        jPanel3.add(lblData2);
        lblData2.setBounds(70, 50, 90, 30);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 280, 260));

        lblData3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblData3.setForeground(new java.awt.Color(111, 44, 145));
        lblData3.setText("DD/MM/AAAA");
        jPanel2.add(lblData3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void botao5reaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5reaisActionPerformed

        
        double numero = 5;
        valorRecargaLabel.setText(String.valueOf("R$ " +  numero));
        
        List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
        lblData2.setText(dataHora.get(0));
        double valorComprado = 5;
    }//GEN-LAST:event_botao5reaisActionPerformed

    private void botao20reaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao20reaisActionPerformed

        double numero = 20;
        valorRecargaLabel.setText(String.valueOf("R$ " +  numero));
       
        List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
        lblData2.setText(dataHora.get(0));
        double valorComprado = 20;
    }//GEN-LAST:event_botao20reaisActionPerformed

    private void botao50reaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao50reaisActionPerformed
        // TODO add your handling code here:

        double numero = 50;
        valorRecargaLabel.setText(String.valueOf("R$ " +  numero));
        List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
        lblData2.setText(dataHora.get(0));
        double valorComprado = 50;

    }//GEN-LAST:event_botao50reaisActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        // TODO add your handling code here:

        double valor = Double.parseDouble(txtValor.getText());
        valorRecargaLabel.setText(String.valueOf("R$ " +  valor));
       
        List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
        lblData2.setText(dataHora.get(0));

    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaRPA(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministrativoPalavraLabel;
    private javax.swing.JLabel AdministrativoPalavraLabel2;
    private javax.swing.JLabel AdministrativoPalavraLabel3;
    private javax.swing.JLabel AdministrativoPalavraLabel4;
    private javax.swing.JLabel AdministrativoPalavraLabel5;
    private javax.swing.JLabel AdministrativoPalavraLabel6;
    private javax.swing.JButton botao20reais;
    private javax.swing.JButton botao50reais;
    private javax.swing.JButton botao5reais;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblData3;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel saldoAtualLabel;
    private javax.swing.JTextField txtValor;
    private javax.swing.JLabel valorRecargaLabel;
    // End of variables declaration//GEN-END:variables
}
