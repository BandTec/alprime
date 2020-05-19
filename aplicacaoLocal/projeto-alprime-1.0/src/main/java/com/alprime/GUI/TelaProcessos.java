package com.alprime.GUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.table.DefaultTableModel;


public class TelaProcessos extends javax.swing.JFrame 
{
    Processos processos = new Processos();
    int idSwing[] = new int[21];
    String nomeSwing[] = new String[21];
    int prioridadeSwing[] = new int[21];
    
    public void enviarTabelaProcessos()
    {
//        processos.enviarProcessos(idSwing, nomeSwing, prioridadeSwing);
        DefaultTableModel model = (DefaultTableModel) tabelaProcessos.getModel();
        
        String[] cols = {"Nome do Processo", "PID", "Prioridade"};
        String[][] data = 
        {
            {(nomeSwing[1]), String.valueOf(idSwing[1]), String.valueOf(prioridadeSwing[1])},
            {nomeSwing[2], String.valueOf(idSwing[2]), String.valueOf(prioridadeSwing[2])},
            {nomeSwing[3], String.valueOf(idSwing[3]), String.valueOf(prioridadeSwing[3])},
            {nomeSwing[4], String.valueOf(idSwing[4]), String.valueOf(prioridadeSwing[4])},
            {nomeSwing[5], String.valueOf(idSwing[5]), String.valueOf(prioridadeSwing[5])},
            {nomeSwing[6], String.valueOf(idSwing[6]), String.valueOf(prioridadeSwing[6])},
            {nomeSwing[7], String.valueOf(idSwing[7]), String.valueOf(prioridadeSwing[7])},
            {nomeSwing[8], String.valueOf(idSwing[8]), String.valueOf(prioridadeSwing[8])},
            {nomeSwing[9], String.valueOf(idSwing[9]), String.valueOf(prioridadeSwing[9])},
            {nomeSwing[10], String.valueOf(idSwing[10]), String.valueOf(prioridadeSwing[10])},
            {nomeSwing[11], String.valueOf(idSwing[11]), String.valueOf(prioridadeSwing[11])},
            {nomeSwing[12], String.valueOf(idSwing[12]), String.valueOf(prioridadeSwing[12])},
            {nomeSwing[13], String.valueOf(idSwing[13]), String.valueOf(prioridadeSwing[13])},
            {nomeSwing[14], String.valueOf(idSwing[14]), String.valueOf(prioridadeSwing[14])},
            {nomeSwing[15], String.valueOf(idSwing[15]), String.valueOf(prioridadeSwing[15])},
            {nomeSwing[16], String.valueOf(idSwing[16]), String.valueOf(prioridadeSwing[16])},
            {nomeSwing[17], String.valueOf(idSwing[17]), String.valueOf(prioridadeSwing[17])},
            {nomeSwing[18], String.valueOf(idSwing[18]), String.valueOf(prioridadeSwing[18])},
            {nomeSwing[19], String.valueOf(idSwing[19]), String.valueOf(prioridadeSwing[19])},
            {nomeSwing[20], String.valueOf(idSwing[20]), String.valueOf(prioridadeSwing[20])}
        };
        
        model.setDataVector(data, cols);
        
        
    }
    
    
    

    public TelaProcessos() 
    {
        initComponents();
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProcessos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(110, 42, 182));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(77, 166, 53));
        jButton1.setForeground(new java.awt.Color(77, 166, 53));
        jButton1.setText("Monitorar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 160, -1));

        jButton2.setBackground(new java.awt.Color(77, 166, 53));
        jButton2.setForeground(new java.awt.Color(77, 166, 53));
        jButton2.setText("Finalizar tarefa(s) selecionadas");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 230, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabelaProcessos.setBackground(new java.awt.Color(255, 255, 255));
        tabelaProcessos.setForeground(new java.awt.Color(0, 0, 0));
        tabelaProcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome do Processo", "PID", "Prioridade"
            }
        ));
        tabelaProcessos.setGridColor(new java.awt.Color(77, 166, 53));
        tabelaProcessos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelaProcessos.setSelectionForeground(new java.awt.Color(77, 166, 53));
        tabelaProcessos.setShowGrid(false);
        jScrollPane1.setViewportView(tabelaProcessos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        enviarTabelaProcessos();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //int row = table.getSelectedRow();
        //int column = table.getSelectedColumn();
        //ObjectType o = (ObjectType)target.getValueAt(row, column) );
        //int matarProc = tabelaProcessos.getValueAt(int row, int column)
        //processos.matarProcesso(matarProc + ".exe");
    }//GEN-LAST:event_jButton2MouseClicked

    public static void main(String args[]) 
    {
   
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
            java.util.logging.Logger.getLogger(TelaProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaProcessos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaProcessos;
    // End of variables declaration//GEN-END:variables
}
