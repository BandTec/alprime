package com.alprime.GUI;

public class TelaInicial1 extends javax.swing.JFrame {


    public TelaInicial1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        STALabel = new javax.swing.JLabel();
        STATextoLabel = new javax.swing.JLabel();
        SenhaIconeLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JTextField();
        PatrocinioLabel = new javax.swing.JLabel();
        IdIconeLabel = new javax.swing.JLabel();
        SenhaLabel = new javax.swing.JPasswordField();
        LogarBotaoLabel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        STALabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        STALabel.setForeground(new java.awt.Color(0, 0, 0));
        STALabel.setText("STA");
        getContentPane().add(STALabel);
        STALabel.setBounds(240, 30, 80, 30);

        STATextoLabel.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        STATextoLabel.setForeground(new java.awt.Color(0, 0, 0));
        STATextoLabel.setText("Sistema de Totem's da Alprime");
        getContentPane().add(STATextoLabel);
        STATextoLabel.setBounds(190, 70, 190, 16);

        SenhaIconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password.png"))); // NOI18N
        getContentPane().add(SenhaIconeLabel);
        SenhaIconeLabel.setBounds(170, 160, 28, 30);

        LoginLabel.setBackground(new java.awt.Color(255, 255, 255));
        LoginLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(102, 102, 102));
        LoginLabel.setText("Somente números");
        getContentPane().add(LoginLabel);
        LoginLabel.setBounds(210, 120, 130, 27);

        PatrocinioLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patrocinio.png"))); // NOI18N
        getContentPane().add(PatrocinioLabel);
        PatrocinioLabel.setBounds(450, 10, 90, 70);

        IdIconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        getContentPane().add(IdIconeLabel);
        IdIconeLabel.setBounds(170, 120, 27, 30);

        SenhaLabel.setBackground(new java.awt.Color(255, 255, 255));
        SenhaLabel.setForeground(new java.awt.Color(102, 102, 102));
        SenhaLabel.setText("AAAAAA");
        SenhaLabel.setToolTipText("");
        getContentPane().add(SenhaLabel);
        SenhaLabel.setBounds(210, 160, 130, 30);

        LogarBotaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        LogarBotaoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        LogarBotaoLabel.setBorderPainted(false);
        LogarBotaoLabel.setContentAreaFilled(false);
        getContentPane().add(LogarBotaoLabel);
        LogarBotaoLabel.setBounds(180, 230, 180, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) 
    {
     
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaInicial1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdIconeLabel;
    private javax.swing.JButton LogarBotaoLabel;
    private javax.swing.JTextField LoginLabel;
    private javax.swing.JLabel PatrocinioLabel;
    private javax.swing.JLabel STALabel;
    private javax.swing.JLabel STATextoLabel;
    private javax.swing.JLabel SenhaIconeLabel;
    private javax.swing.JPasswordField SenhaLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
