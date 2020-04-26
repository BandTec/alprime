
package com.alprime.GUI;

import com.alprime.bancoDados.ConsultaBD;
import com.alprime.bancoDados.tabelas.Localizacao;
import com.alprime.bancoDados.tabelas.Maquina;
import com.alprime.bancoDados.tabelas.Registro;
import com.alprime.monitoramento.Consumo;
import com.alprime.monitoramento.Monitorar;
import com.alprime.totem.InformacoesComputador;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TelaMonitoramento1 extends javax.swing.JFrame 
{


    public TelaMonitoramento1() 
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BemVindoLabel = new javax.swing.JLabel();
        IdLogadoIconLabel = new javax.swing.JLabel();
        LocalLogadoIconLabel = new javax.swing.JLabel();
        IdTotemLabel = new javax.swing.JLabel();
        LocalTotemLabel = new javax.swing.JLabel();
        PainelSistema = new javax.swing.JPanel();
        ProcessadorPalavraLabel = new javax.swing.JLabel();
        UsoPalavraLabel = new javax.swing.JLabel();
        RAMLabel = new javax.swing.JLabel();
        UsoRAMLabel = new javax.swing.JLabel();
        RamPalavraLabel = new javax.swing.JLabel();
        UsoRamPalavraLabel = new javax.swing.JLabel();
        UsoCPULabel = new javax.swing.JProgressBar();
        ProcessadorTempLabel = new javax.swing.JLabel();
        SistemaPalavraLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernamePalavraLabel = new javax.swing.JLabel();
        SistemaIconLabel = new javax.swing.JLabel();
        ProcessadorIconLabel = new javax.swing.JLabel();
        ProcessadorTempIconLabel = new javax.swing.JLabel();
        RAMIconLabel = new javax.swing.JLabel();
        UsoRamIconLabel = new javax.swing.JLabel();
        UsernameIconLabel = new javax.swing.JLabel();
        SOPalavraLabel1 = new javax.swing.JLabel();
        FabricantePalavraLabel1 = new javax.swing.JLabel();
        FabricantePalavraLabel2 = new javax.swing.JLabel();
        SOLabel = new javax.swing.JLabel();
        FabricanteLabel = new javax.swing.JLabel();
        ModeloLabel = new javax.swing.JLabel();
        SOIconLabel1 = new javax.swing.JLabel();
        FabricanteIconLabel1 = new javax.swing.JLabel();
        ModeloIconLabel1 = new javax.swing.JLabel();
        UsoPalavraLabel1 = new javax.swing.JLabel();
        ProcessadorUsoIconLabel1 = new javax.swing.JLabel();
        ProcessadorLabel = new javax.swing.JLabel();
        PainelAdministrativo = new javax.swing.JPanel();
        MediaMensalLabel = new javax.swing.JLabel();
        LucroMensalPalavraLabel = new javax.swing.JLabel();
        GastoMensalLabel = new javax.swing.JLabel();
        AdministrativoPalavraLabel = new javax.swing.JLabel();
        LucroMensalLabel = new javax.swing.JLabel();
        GastoMensalIconLabel = new javax.swing.JLabel();
        MediaMensalIconLabel = new javax.swing.JLabel();
        LucroMensalIconLabel = new javax.swing.JLabel();
        ClientesPalavraLabel = new javax.swing.JLabel();
        AdministrativoIconLabel = new javax.swing.JLabel();
        ClientesAtendidosLabel = new javax.swing.JLabel();
        PDiaPalavraLabel = new javax.swing.JLabel();
        MediaMensalPalavraLabel = new javax.swing.JLabel();
        ClientesAtendidosIconLabel = new javax.swing.JLabel();
        GastoMensalPalavraLabel = new javax.swing.JLabel();
        DesligarPalavraLabel = new javax.swing.JLabel();
        AtualizarPalavraLabel1 = new javax.swing.JLabel();
        ProcessosPalavraLabel = new javax.swing.JLabel();
        DesligarBotao = new javax.swing.JButton();
        AtualizarBotao = new javax.swing.JButton();
        ProcessosBotao = new javax.swing.JButton();
        DeslogarPalavraLabel = new javax.swing.JLabel();
        DeslogarBotao1 = new javax.swing.JButton();
        UsoHDPalavraLabel = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        HDUsoLabel = new javax.swing.JProgressBar();
        HDPalavraLabel = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        HDLabel = new javax.swing.JLabel();
        DataLabel = new javax.swing.JLabel();
        DataAtualizacaoTextoLabel = new javax.swing.JLabel();
        WallpaperLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BemVindoLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BemVindoLabel.setForeground(new java.awt.Color(255, 255, 255));
        BemVindoLabel.setText("Bem-vindo!");
        getContentPane().add(BemVindoLabel);
        BemVindoLabel.setBounds(430, 20, 140, 30);

        IdLogadoIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        getContentPane().add(IdLogadoIconLabel);
        IdLogadoIconLabel.setBounds(20, 20, 30, 30);

        LocalLogadoIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapa icone.png"))); // NOI18N
        getContentPane().add(LocalLogadoIconLabel);
        LocalLogadoIconLabel.setBounds(20, 60, 30, 30);

        IdTotemLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IdTotemLabel.setForeground(new java.awt.Color(255, 255, 255));
        IdTotemLabel.setText("ID do Totem ");
        getContentPane().add(IdTotemLabel);
        IdTotemLabel.setBounds(60, 20, 220, 30);

        LocalTotemLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LocalTotemLabel.setForeground(new java.awt.Color(255, 255, 255));
        LocalTotemLabel.setText("Local do Totem");
        getContentPane().add(LocalTotemLabel);
        LocalTotemLabel.setBounds(60, 60, 220, 30);

        PainelSistema.setOpaque(false);
        PainelSistema.setLayout(null);

        ProcessadorPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ProcessadorPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProcessadorPalavraLabel.setText("CPU:");
        PainelSistema.add(ProcessadorPalavraLabel);
        ProcessadorPalavraLabel.setBounds(10, 180, 50, 30);

        UsoPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsoPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsoPalavraLabel.setText("Temp. da CPU:");
        PainelSistema.add(UsoPalavraLabel);
        UsoPalavraLabel.setBounds(10, 260, 140, 30);

        RAMLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RAMLabel.setForeground(new java.awt.Color(255, 255, 255));
        RAMLabel.setText("___________");
        PainelSistema.add(RAMLabel);
        RAMLabel.setBounds(140, 310, 400, 30);

        UsoRAMLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsoRAMLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsoRAMLabel.setText("___________");
        PainelSistema.add(UsoRAMLabel);
        UsoRAMLabel.setBounds(150, 350, 320, 30);

        RamPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RamPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        RamPalavraLabel.setText("RAM Total:");
        PainelSistema.add(RamPalavraLabel);
        RamPalavraLabel.setBounds(10, 310, 96, 30);

        UsoRamPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsoRamPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsoRamPalavraLabel.setText("Uso em MB:");
        PainelSistema.add(UsoRamPalavraLabel);
        UsoRamPalavraLabel.setBounds(10, 350, 120, 30);

        UsoCPULabel.setForeground(new java.awt.Color(51, 204, 0));
        UsoCPULabel.setToolTipText("0");
        UsoCPULabel.setPreferredSize(new java.awt.Dimension(146, 24));
        PainelSistema.add(UsoCPULabel);
        UsoCPULabel.setBounds(150, 230, 100, 20);

        ProcessadorTempLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ProcessadorTempLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProcessadorTempLabel.setText("___________");
        PainelSistema.add(ProcessadorTempLabel);
        ProcessadorTempLabel.setBounds(170, 260, 400, 30);

        SistemaPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SistemaPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        SistemaPalavraLabel.setText("SISTEMA");
        PainelSistema.add(SistemaPalavraLabel);
        SistemaPalavraLabel.setBounds(160, 0, 80, 30);

        UsernameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("___________");
        PainelSistema.add(UsernameLabel);
        UsernameLabel.setBounds(200, 90, 290, 30);

        UsernamePalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsernamePalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernamePalavraLabel.setText("Nome do Usuário:");
        PainelSistema.add(UsernamePalavraLabel);
        UsernamePalavraLabel.setBounds(10, 90, 160, 30);

        SistemaIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema.png"))); // NOI18N
        PainelSistema.add(SistemaIconLabel);
        SistemaIconLabel.setBounds(250, 0, 30, 30);

        ProcessadorIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CPU.png"))); // NOI18N
        PainelSistema.add(ProcessadorIconLabel);
        ProcessadorIconLabel.setBounds(60, 180, 30, 30);

        ProcessadorTempIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/temperatura.png"))); // NOI18N
        PainelSistema.add(ProcessadorTempIconLabel);
        ProcessadorTempIconLabel.setBounds(140, 260, 30, 30);

        RAMIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ram.png"))); // NOI18N
        PainelSistema.add(RAMIconLabel);
        RAMIconLabel.setBounds(110, 310, 30, 30);

        UsoRamIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ram usage.png"))); // NOI18N
        PainelSistema.add(UsoRamIconLabel);
        UsoRamIconLabel.setBounds(120, 350, 30, 30);

        UsernameIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/username.png"))); // NOI18N
        PainelSistema.add(UsernameIconLabel);
        UsernameIconLabel.setBounds(170, 90, 30, 30);

        SOPalavraLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SOPalavraLabel1.setForeground(new java.awt.Color(255, 255, 255));
        SOPalavraLabel1.setText("SO:");
        PainelSistema.add(SOPalavraLabel1);
        SOPalavraLabel1.setBounds(10, 120, 40, 30);

        FabricantePalavraLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        FabricantePalavraLabel1.setForeground(new java.awt.Color(255, 255, 255));
        FabricantePalavraLabel1.setText("Fabricante:");
        PainelSistema.add(FabricantePalavraLabel1);
        FabricantePalavraLabel1.setBounds(10, 30, 100, 30);

        FabricantePalavraLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        FabricantePalavraLabel2.setForeground(new java.awt.Color(255, 255, 255));
        FabricantePalavraLabel2.setText("Modelo:");
        PainelSistema.add(FabricantePalavraLabel2);
        FabricantePalavraLabel2.setBounds(10, 60, 71, 30);

        SOLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SOLabel.setForeground(new java.awt.Color(255, 255, 255));
        SOLabel.setText("___________");
        PainelSistema.add(SOLabel);
        SOLabel.setBounds(80, 120, 390, 30);

        FabricanteLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        FabricanteLabel.setForeground(new java.awt.Color(255, 255, 255));
        FabricanteLabel.setText("___________");
        PainelSistema.add(FabricanteLabel);
        FabricanteLabel.setBounds(140, 30, 350, 30);

        ModeloLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ModeloLabel.setForeground(new java.awt.Color(255, 255, 255));
        ModeloLabel.setText("___________");
        PainelSistema.add(ModeloLabel);
        ModeloLabel.setBounds(110, 60, 360, 30);

        SOIconLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OS.png"))); // NOI18N
        PainelSistema.add(SOIconLabel1);
        SOIconLabel1.setBounds(50, 120, 30, 30);

        FabricanteIconLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fabricante.png"))); // NOI18N
        PainelSistema.add(FabricanteIconLabel1);
        FabricanteIconLabel1.setBounds(110, 30, 30, 30);

        ModeloIconLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo.png"))); // NOI18N
        PainelSistema.add(ModeloIconLabel1);
        ModeloIconLabel1.setBounds(80, 60, 30, 30);

        UsoPalavraLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsoPalavraLabel1.setForeground(new java.awt.Color(255, 255, 255));
        UsoPalavraLabel1.setText("Uso da CPU:");
        PainelSistema.add(UsoPalavraLabel1);
        UsoPalavraLabel1.setBounds(10, 220, 130, 30);

        ProcessadorUsoIconLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CPU Usage.png"))); // NOI18N
        PainelSistema.add(ProcessadorUsoIconLabel1);
        ProcessadorUsoIconLabel1.setBounds(120, 220, 30, 30);

        ProcessadorLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ProcessadorLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProcessadorLabel.setText("___________");
        PainelSistema.add(ProcessadorLabel);
        ProcessadorLabel.setBounds(90, 180, 400, 30);

        getContentPane().add(PainelSistema);
        PainelSistema.setBounds(0, 130, 500, 500);

        PainelAdministrativo.setOpaque(false);
        PainelAdministrativo.setLayout(null);

        MediaMensalLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MediaMensalLabel.setForeground(new java.awt.Color(255, 255, 255));
        MediaMensalLabel.setText("___________");
        PainelAdministrativo.add(MediaMensalLabel);
        MediaMensalLabel.setBounds(260, 90, 120, 30);

        LucroMensalPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LucroMensalPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        LucroMensalPalavraLabel.setText("Lucro mensal: ");
        PainelAdministrativo.add(LucroMensalPalavraLabel);
        LucroMensalPalavraLabel.setBounds(0, 140, 140, 30);

        GastoMensalLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GastoMensalLabel.setForeground(new java.awt.Color(255, 255, 255));
        GastoMensalLabel.setText("___________");
        PainelAdministrativo.add(GastoMensalLabel);
        GastoMensalLabel.setBounds(170, 180, 190, 30);

        AdministrativoPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AdministrativoPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        AdministrativoPalavraLabel.setText("ADMINISTRATIVO");
        PainelAdministrativo.add(AdministrativoPalavraLabel);
        AdministrativoPalavraLabel.setBounds(150, 10, 170, 30);

        LucroMensalLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LucroMensalLabel.setForeground(new java.awt.Color(255, 255, 255));
        LucroMensalLabel.setText("___________");
        PainelAdministrativo.add(LucroMensalLabel);
        LucroMensalLabel.setBounds(160, 130, 190, 30);

        GastoMensalIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prejuizo.png"))); // NOI18N
        PainelAdministrativo.add(GastoMensalIconLabel);
        GastoMensalIconLabel.setBounds(140, 180, 30, 30);

        MediaMensalIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media.png"))); // NOI18N
        PainelAdministrativo.add(MediaMensalIconLabel);
        MediaMensalIconLabel.setBounds(230, 90, 30, 30);

        LucroMensalIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucro.png"))); // NOI18N
        PainelAdministrativo.add(LucroMensalIconLabel);
        LucroMensalIconLabel.setBounds(130, 130, 30, 30);

        ClientesPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientesPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClientesPalavraLabel.setText("Clientes atendidos no dia:");
        PainelAdministrativo.add(ClientesPalavraLabel);
        ClientesPalavraLabel.setBounds(0, 50, 230, 30);

        AdministrativoIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administration.png"))); // NOI18N
        PainelAdministrativo.add(AdministrativoIconLabel);
        AdministrativoIconLabel.setBounds(320, 10, 30, 30);

        ClientesAtendidosLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientesAtendidosLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClientesAtendidosLabel.setText("___________");
        PainelAdministrativo.add(ClientesAtendidosLabel);
        ClientesAtendidosLabel.setBounds(260, 50, 190, 30);

        PDiaPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PDiaPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        PDiaPalavraLabel.setText("p/ dia");
        PainelAdministrativo.add(PDiaPalavraLabel);
        PDiaPalavraLabel.setBounds(390, 90, 50, 30);

        MediaMensalPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MediaMensalPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        MediaMensalPalavraLabel.setText("Média mensal de clientes:");
        PainelAdministrativo.add(MediaMensalPalavraLabel);
        MediaMensalPalavraLabel.setBounds(0, 90, 230, 30);

        ClientesAtendidosIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes atendidos.png"))); // NOI18N
        PainelAdministrativo.add(ClientesAtendidosIconLabel);
        ClientesAtendidosIconLabel.setBounds(230, 50, 30, 30);

        GastoMensalPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GastoMensalPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        GastoMensalPalavraLabel.setText("Gasto mensal: ");
        PainelAdministrativo.add(GastoMensalPalavraLabel);
        GastoMensalPalavraLabel.setBounds(0, 180, 140, 30);

        getContentPane().add(PainelAdministrativo);
        PainelAdministrativo.setBounds(510, 120, 470, 240);

        DesligarPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DesligarPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        DesligarPalavraLabel.setText("Desligar");
        getContentPane().add(DesligarPalavraLabel);
        DesligarPalavraLabel.setBounds(890, 580, 80, 30);

        AtualizarPalavraLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        AtualizarPalavraLabel1.setForeground(new java.awt.Color(255, 255, 255));
        AtualizarPalavraLabel1.setText("Atualizar");
        getContentPane().add(AtualizarPalavraLabel1);
        AtualizarPalavraLabel1.setBounds(540, 580, 80, 30);

        ProcessosPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ProcessosPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProcessosPalavraLabel.setText("Processos");
        getContentPane().add(ProcessosPalavraLabel);
        ProcessosPalavraLabel.setBounds(650, 580, 100, 30);

        DesligarBotao.setForeground(new java.awt.Color(255, 255, 255));
        DesligarBotao.setBorderPainted(false);
        DesligarBotao.setContentAreaFilled(false);
        DesligarBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesligarBotaoMouseClicked(evt);
            }
        });
        getContentPane().add(DesligarBotao);
        DesligarBotao.setBounds(900, 530, 50, 40);

        AtualizarBotao.setForeground(new java.awt.Color(255, 255, 255));
        AtualizarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atualizar.png"))); // NOI18N
        AtualizarBotao.setBorderPainted(false);
        AtualizarBotao.setContentAreaFilled(false);
        AtualizarBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtualizarBotaoMouseClicked(evt);
            }
        });
        AtualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(AtualizarBotao);
        AtualizarBotao.setBounds(550, 530, 50, 40);

        ProcessosBotao.setForeground(new java.awt.Color(255, 255, 255));
        ProcessosBotao.setBorderPainted(false);
        ProcessosBotao.setContentAreaFilled(false);
        getContentPane().add(ProcessosBotao);
        ProcessosBotao.setBounds(670, 530, 50, 40);

        DeslogarPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DeslogarPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        DeslogarPalavraLabel.setText("Deslogar");
        getContentPane().add(DeslogarPalavraLabel);
        DeslogarPalavraLabel.setBounds(780, 580, 80, 30);

        DeslogarBotao1.setForeground(new java.awt.Color(255, 255, 255));
        DeslogarBotao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deslogar.png"))); // NOI18N
        DeslogarBotao1.setBorderPainted(false);
        DeslogarBotao1.setContentAreaFilled(false);
        getContentPane().add(DeslogarBotao1);
        DeslogarBotao1.setBounds(790, 530, 50, 40);

        UsoHDPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        UsoHDPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsoHDPalavraLabel.setText("Uso do HD:");
        getContentPane().add(UsoHDPalavraLabel);
        UsoHDPalavraLabel.setBounds(10, 560, 100, 30);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HD Usage.png"))); // NOI18N
        getContentPane().add(jLabel37);
        jLabel37.setBounds(110, 560, 30, 30);

        HDUsoLabel.setBackground(new java.awt.Color(255, 255, 255));
        HDUsoLabel.setForeground(new java.awt.Color(255, 0, 51));
        HDUsoLabel.setToolTipText("0");
        HDUsoLabel.setBorderPainted(false);
        HDUsoLabel.setPreferredSize(new java.awt.Dimension(146, 24));
        getContentPane().add(HDUsoLabel);
        HDUsoLabel.setBounds(140, 570, 110, 20);

        HDPalavraLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        HDPalavraLabel.setForeground(new java.awt.Color(255, 255, 255));
        HDPalavraLabel.setText("Hard Disk (HD):");
        getContentPane().add(HDPalavraLabel);
        HDPalavraLabel.setBounds(10, 520, 140, 30);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hd.png"))); // NOI18N
        getContentPane().add(jLabel36);
        jLabel36.setBounds(150, 520, 30, 30);

        HDLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        HDLabel.setForeground(new java.awt.Color(255, 255, 255));
        HDLabel.setText("___________");
        getContentPane().add(HDLabel);
        HDLabel.setBounds(180, 520, 310, 30);

        DataLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DataLabel.setForeground(new java.awt.Color(255, 255, 255));
        DataLabel.setText("00/00/0000 ás 00:00:00");
        getContentPane().add(DataLabel);
        DataLabel.setBounds(780, 80, 240, 30);

        DataAtualizacaoTextoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DataAtualizacaoTextoLabel.setForeground(new java.awt.Color(255, 255, 255));
        DataAtualizacaoTextoLabel.setText("Data da última atualização:");
        getContentPane().add(DataAtualizacaoTextoLabel);
        DataAtualizacaoTextoLabel.setBounds(540, 80, 240, 30);

        WallpaperLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper.png"))); // NOI18N
        WallpaperLabel.setText("jLabel2");
        getContentPane().add(WallpaperLabel);
        WallpaperLabel.setBounds(0, 0, 1050, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtualizarBotaoMouseClicked

        pegarInformacoes();
    }//GEN-LAST:event_AtualizarBotaoMouseClicked

    private void DesligarBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesligarBotaoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_DesligarBotaoMouseClicked

    private void AtualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtualizarBotaoActionPerformed
   
    public void pegarInformacoes(){
        // Primeiro é necessário criar objetos
        InformacoesComputador comp = new InformacoesComputador();
        Localizacao localizacao = new Localizacao();
        Maquina maquina = new Maquina(localizacao); 
        ConsultaBD.inserirMaquina(maquina);
        Registro registro = new Registro(maquina);
        ConsultaBD.insertRegistro(registro);
        // Aqui é onde os dados irão na tela de monitoramento
        ProcessadorLabel.setText(String.valueOf(registro.getPorcProcessador()));
        RAMLabel.setText(String.valueOf(comp.getRamTotal()));
        HDLabel.setText(String.valueOf(comp.getDisco()));
        SOLabel.setText(maquina.getSistemaOperacional());
        UsernameLabel.setText(maquina.getHostname());
        FabricanteLabel.setText(maquina.getFabricante());
        ModeloLabel.setText(maquina.getModelo());
        UsoCPULabel.setValue(registro.getPorcProcessador().intValue());
        UsoRAMLabel.setText(String.valueOf(registro.getPorcRam()));
        ProcessadorTempLabel.setText(String.valueOf(registro.getTempCpu())+ " Celsius");
        HDUsoLabel.setValue(registro.getPorcDisco().intValue());
        
        // Informações de Data e Hora:
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date dataAtual = new Date();
        DataLabel.setText(dateFormat.format(dataAtual));
    }

    public static void main(String args[]) 
    {
      
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaMonitoramento1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministrativoIconLabel;
    private javax.swing.JLabel AdministrativoPalavraLabel;
    private javax.swing.JButton AtualizarBotao;
    private javax.swing.JLabel AtualizarPalavraLabel1;
    private javax.swing.JLabel BemVindoLabel;
    private javax.swing.JLabel ClientesAtendidosIconLabel;
    private javax.swing.JLabel ClientesAtendidosLabel;
    private javax.swing.JLabel ClientesPalavraLabel;
    private javax.swing.JLabel DataAtualizacaoTextoLabel;
    private javax.swing.JLabel DataLabel;
    private javax.swing.JButton DesligarBotao;
    private javax.swing.JLabel DesligarPalavraLabel;
    private javax.swing.JButton DeslogarBotao1;
    private javax.swing.JLabel DeslogarPalavraLabel;
    private javax.swing.JLabel FabricanteIconLabel1;
    private javax.swing.JLabel FabricanteLabel;
    private javax.swing.JLabel FabricantePalavraLabel1;
    private javax.swing.JLabel FabricantePalavraLabel2;
    private javax.swing.JLabel GastoMensalIconLabel;
    private javax.swing.JLabel GastoMensalLabel;
    private javax.swing.JLabel GastoMensalPalavraLabel;
    private javax.swing.JLabel HDLabel;
    private javax.swing.JLabel HDPalavraLabel;
    private javax.swing.JProgressBar HDUsoLabel;
    private javax.swing.JLabel IdLogadoIconLabel;
    private javax.swing.JLabel IdTotemLabel;
    private javax.swing.JLabel LocalLogadoIconLabel;
    private javax.swing.JLabel LocalTotemLabel;
    private javax.swing.JLabel LucroMensalIconLabel;
    private javax.swing.JLabel LucroMensalLabel;
    private javax.swing.JLabel LucroMensalPalavraLabel;
    private javax.swing.JLabel MediaMensalIconLabel;
    private javax.swing.JLabel MediaMensalLabel;
    private javax.swing.JLabel MediaMensalPalavraLabel;
    private javax.swing.JLabel ModeloIconLabel1;
    private javax.swing.JLabel ModeloLabel;
    private javax.swing.JLabel PDiaPalavraLabel;
    private javax.swing.JPanel PainelAdministrativo;
    private javax.swing.JPanel PainelSistema;
    private javax.swing.JLabel ProcessadorIconLabel;
    private javax.swing.JLabel ProcessadorLabel;
    private javax.swing.JLabel ProcessadorPalavraLabel;
    private javax.swing.JLabel ProcessadorTempIconLabel;
    private javax.swing.JLabel ProcessadorTempLabel;
    private javax.swing.JLabel ProcessadorUsoIconLabel1;
    private javax.swing.JButton ProcessosBotao;
    private javax.swing.JLabel ProcessosPalavraLabel;
    private javax.swing.JLabel RAMIconLabel;
    private javax.swing.JLabel RAMLabel;
    private javax.swing.JLabel RamPalavraLabel;
    private javax.swing.JLabel SOIconLabel1;
    private javax.swing.JLabel SOLabel;
    private javax.swing.JLabel SOPalavraLabel1;
    private javax.swing.JLabel SistemaIconLabel;
    private javax.swing.JLabel SistemaPalavraLabel;
    private javax.swing.JLabel UsernameIconLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel UsernamePalavraLabel;
    private javax.swing.JProgressBar UsoCPULabel;
    private javax.swing.JLabel UsoHDPalavraLabel;
    private javax.swing.JLabel UsoPalavraLabel;
    private javax.swing.JLabel UsoPalavraLabel1;
    private javax.swing.JLabel UsoRAMLabel;
    private javax.swing.JLabel UsoRamIconLabel;
    private javax.swing.JLabel UsoRamPalavraLabel;
    private javax.swing.JLabel WallpaperLabel;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    // End of variables declaration//GEN-END:variables

    private String getSistemaOperacional() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
