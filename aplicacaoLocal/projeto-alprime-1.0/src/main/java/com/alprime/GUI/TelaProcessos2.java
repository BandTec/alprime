/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.GUI;

import java.awt.Toolkit;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Vieira
 */
public class TelaProcessos2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaProcessos2
     */
    public TelaProcessos2() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo_reduzido.png")));
        ProcessosTableModel model = new ProcessosTableModel();
        tblProcessos.setModel(model);
        lblAtualizar.setVisible(false);
        lblAviso4.setVisible(false);

        Thread threadAtualizar = new Thread(this::atualizar);
        threadAtualizar.start();

        Thread threadDados = new Thread(this::atualizarDados);
        threadDados.start();
    }

    public void atualizarDados() {
        while (true) {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
            }
            ProcessosTableModel model2 = new ProcessosTableModel();
            tblProcessos.setModel(model2);

        }
    }

    public void mostrarAviso() {
        lblAviso4.setVisible(true);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
        }
        lblAviso4.setVisible(false);

    }

    public void atualizar() {
        while (true) {

            lblAtualizar.setVisible(true);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblAtualizando.setVisible(true);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblAtualizando2.setVisible(true);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblAtualizando3.setVisible(true);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblAtualizando.setVisible(false);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblAtualizando2.setVisible(false);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblAtualizando3.setVisible(false);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblAtualizar.setVisible(false);
            lblAtualizando.setVisible(false);
            lblAtualizando2.setVisible(false);
            lblAtualizando3.setVisible(false);
            try {
                Thread.sleep(4600);
            } catch (InterruptedException e) {
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAtualizando3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcessos = new javax.swing.JTable();
        btnFinalizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblAtualizar = new javax.swing.JLabel();
        lblAtualizando = new javax.swing.JLabel();
        lblAtualizando2 = new javax.swing.JLabel();
        lblAviso4 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAtualizando3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 8)); // NOI18N
        lblAtualizando3.setForeground(new java.awt.Color(111, 44, 145));
        lblAtualizando3.setText("o");
        jPanel1.add(lblAtualizando3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 20, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_editado.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 180, 80));

        tblProcessos.setAutoCreateRowSorter(true);
        tblProcessos.setFont(new java.awt.Font("Dubai", 1, 11)); // NOI18N
        tblProcessos.setForeground(new java.awt.Color(111, 45, 145));
        tblProcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProcessos.setDoubleBuffered(true);
        tblProcessos.setDragEnabled(true);
        tblProcessos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProcessos.setShowGrid(true);
        tblProcessos.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tblProcessos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 520, 270));

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao_finalizar_processo.png"))); // NOI18N
        btnFinalizar.setBorderPainted(false);
        btnFinalizar.setContentAreaFilled(false);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dubai Light", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(111, 44, 145));
        jLabel3.setText("Gerenciamento de processos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 230, -1));

        lblAtualizar.setFont(new java.awt.Font("Dubai Light", 3, 12)); // NOI18N
        lblAtualizar.setForeground(new java.awt.Color(111, 44, 145));
        lblAtualizar.setText("     Atualizando ");
        jPanel1.add(lblAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 100, 40));

        lblAtualizando.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 8)); // NOI18N
        lblAtualizando.setForeground(new java.awt.Color(111, 44, 145));
        lblAtualizando.setText("o");
        jPanel1.add(lblAtualizando, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 10, 10));

        lblAtualizando2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 8)); // NOI18N
        lblAtualizando2.setForeground(new java.awt.Color(111, 44, 145));
        lblAtualizando2.setText("o");
        jPanel1.add(lblAtualizando2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 10, -1));

        lblAviso4.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        lblAviso4.setForeground(new java.awt.Color(176, 47, 0));
        lblAviso4.setText("Selecione um processo");
        jPanel1.add(lblAviso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 110, 30));

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
        jPanel1.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        int coluna = tblProcessos.getSelectedColumn();
        int linha = tblProcessos.getSelectedRow();
        if (linha < 0) {
            Thread threadAviso = new Thread(this::mostrarAviso);
            threadAviso.start();
        } else {
            Object valor = tblProcessos.getValueAt(linha, 1);
            try {
                Processos.matar(Integer.valueOf(valor.toString()));
            } catch (IOException ex) {
                Logger.getLogger(TelaProcessos2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(TelaProcessos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProcessos2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtualizando;
    private javax.swing.JLabel lblAtualizando2;
    private javax.swing.JLabel lblAtualizando3;
    private javax.swing.JLabel lblAtualizar;
    private javax.swing.JLabel lblAviso4;
    private javax.swing.JTable tblProcessos;
    // End of variables declaration//GEN-END:variables
}