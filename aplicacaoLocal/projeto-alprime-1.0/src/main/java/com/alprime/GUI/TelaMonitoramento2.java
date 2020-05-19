/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.GUI;

import com.alprime.bancoDados.ConsultaBD;
import com.alprime.bancoDados.tabelas.Localizacao;
import com.alprime.bancoDados.tabelas.Maquina;
import com.alprime.bancoDados.tabelas.Registro;
import com.alprime.monitoramento.Converssao;
import com.alprime.totem.InformacoesComputador;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gabriel Vieira
 */
public class TelaMonitoramento2 extends javax.swing.JFrame {

    private boolean monitorando = false;
    private static boolean logado = true;
    private boolean statusMonitoramento = true;
    private Localizacao localizacao;
    private Maquina maquinaBD;
    private Maquina maquinaAtualizada;
    private boolean telaProcessos = false;

    public TelaMonitoramento2(Integer idMaquina) {
        initComponents();

        maquinaBD = ConsultaBD.procurarIdMaquina(idMaquina);
        System.out.println(ConsultaBD.procurarIdMaquina(idMaquina));
        localizacao = maquinaBD.getLocalizacao();
        maquinaAtualizada = new Maquina(localizacao);
        ConsultaBD.atualizarMaquina(idMaquina, maquinaAtualizada);

        // Aqui é onde os dados irão na tela de monitoramento
        lblTotalMemoriaRam.setText(String.valueOf(maquinaAtualizada.getRamTotal()));
        lblHD.setText(String.format("%.2f GiB", maquinaAtualizada.getCapacidadeMemoria()));
        lblSistemaOp.setText(maquinaAtualizada.getSistemaOperacional());
        lblUsuarioComputador.setText(maquinaAtualizada.getHostname());
        lblFabricante.setText(maquinaAtualizada.getFabricante());
        lblModelo.setText(maquinaAtualizada.getModelo());
        lblCPU.setText(maquinaAtualizada.getTipoProcessador());
        lblLinha.setText(localizacao.getTipoLinha());
        lblEstacao.setText(localizacao.getNomeLocalizacao());
        lblUsuario.setText(localizacao.getUsuario().getNomeUsuario());

        // Informações de Data e Hora:
        Thread threadDataHora = new Thread(this::atualizarHora);
        threadDataHora.start();
        //Animação de captura de dados
        lblAvisoCapturar.setVisible(false);
        lblReticencias1.setVisible(false);
        lblReticencias2.setVisible(false);
        lblReticencias3.setVisible(false);
    }

    public void atualizarHora() {
        while (true) {
            List<String> dataHora = Converssao.dataHoraFormatoBrasileiro(LocalDateTime.now().toString());
            lblData1.setText(dataHora.get(0));
            lblHora1.setText(dataHora.get(1));
        }
    }

    public void reticencias() {
        while (monitorando) {
            lblAvisoCapturar.setVisible(true);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblReticencias1.setVisible(true);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblReticencias2.setVisible(true);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblReticencias3.setVisible(true);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblReticencias1.setVisible(false);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblReticencias2.setVisible(false);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            lblReticencias3.setVisible(false);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
        lblAvisoCapturar.setVisible(false);
        lblReticencias1.setVisible(false);
        lblReticencias2.setVisible(false);
        lblReticencias3.setVisible(false);
    }

    public void atualizarDados() {
        Integer valor = Integer.valueOf(spnAtualizacao.getValue().toString());
        Integer tempo = (valor - 5) * 1000;
        while (monitorando) {
            Registro registro = new Registro(maquinaBD);
            ConsultaBD.insertRegistro(registro);

//Uso do Disco e uso da CPU estão errados
            lblUsoProcessador.setText(String.valueOf(registro.getPorcProcessador()));
//        pgbTempCPU.setValue(registro.getPorcProcessador().intValue());
            pgbTempCPU.setValue(registro.getTempCpu().intValue());
            lblTempCPU.setText(String.valueOf(registro.getTempCpu().intValue()) + "º Celsius");
            lblUsoRAM.setText(String.format("%.2f %%", registro.getPorcRam()));
            pgbUsoRAM.setValue(registro.getPorcRam().intValue());
            pgbUsoCpu.setValue(registro.getPorcProcessador().intValue());
            lblUsoProcessador.setText(String.format("%.2f %%", registro.getPorcProcessador()));
            pgbUsoDisco.setValue(registro.getPorcDisco().intValue());
            lblUsoDisco.setText(String.format("%.2f %%", registro.getPorcDisco()));
            pgbUsoMemoria.setValue(registro.getPorcMemoria().intValue());
            lblUsoMemoria.setText(String.format("%.2f %%", registro.getPorcMemoria()));
            try {
                Thread.sleep(tempo);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lblLinha = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblEstacao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFabricante = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCPU = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblHD = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblTotalMemoriaRam = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSistemaOp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUsuarioComputador = new javax.swing.JLabel();
        AdministrativoPalavraLabel = new javax.swing.JLabel();
        ClientesPalavraLabel = new javax.swing.JLabel();
        MediaMensalPalavraLabel = new javax.swing.JLabel();
        PDiaPalavraLabel = new javax.swing.JLabel();
        LucroMensalPalavraLabel = new javax.swing.JLabel();
        GastoMensalPalavraLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblTempCPU = new javax.swing.JLabel();
        lblUsoProcessador = new javax.swing.JLabel();
        lblUsoMemoria = new javax.swing.JLabel();
        lblUsoDisco = new javax.swing.JLabel();
        pgbUsoMemoria = new javax.swing.JProgressBar();
        pgbUsoCpu = new javax.swing.JProgressBar();
        pgbTempCPU = new javax.swing.JProgressBar();
        jLabel24 = new javax.swing.JLabel();
        pgbUsoDisco = new javax.swing.JProgressBar();
        lblUsoRAM = new javax.swing.JLabel();
        pgbUsoRAM = new javax.swing.JProgressBar();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        spnAtualizacao = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        btnMonitorar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnProcessos = new javax.swing.JButton();
        lblAvisoCapturar = new javax.swing.JLabel();
        lblReticencias1 = new javax.swing.JLabel();
        lblReticencias3 = new javax.swing.JLabel();
        lblReticencias2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_editado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 180, 80));

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(111, 44, 145));
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        btnSair.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnSair.setForeground(new java.awt.Color(111, 44, 145));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("");
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha_lilas.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 545, 102));

        lblData1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblData1.setForeground(new java.awt.Color(111, 44, 145));
        lblData1.setText("DD/MM/AAAA");
        jPanel1.add(lblData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        lblHora1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHora1.setForeground(new java.awt.Color(111, 44, 145));
        lblHora1.setText("HH:MM");
        jPanel1.add(lblHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

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
        jPanel1.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        jLabel18.setBackground(new java.awt.Color(111, 44, 145));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(111, 44, 145));
        jLabel18.setText("Linha:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        lblLinha.setBackground(new java.awt.Color(111, 44, 145));
        lblLinha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblLinha.setForeground(new java.awt.Color(111, 44, 145));
        lblLinha.setText("Linha");
        jPanel1.add(lblLinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel19.setBackground(new java.awt.Color(111, 44, 145));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(111, 44, 145));
        jLabel19.setText("Estação:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        lblEstacao.setBackground(new java.awt.Color(111, 44, 145));
        lblEstacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblEstacao.setForeground(new java.awt.Color(111, 44, 145));
        lblEstacao.setText("Estação");
        jPanel1.add(lblEstacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(111, 44, 145));
        jLabel3.setText("Sistema");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(111, 44, 145));
        jLabel4.setText("Fabricante:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lblFabricante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFabricante.setForeground(new java.awt.Color(111, 44, 145));
        lblFabricante.setText("Fabricante");
        jPanel1.add(lblFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(111, 44, 145));
        jLabel5.setText("Modelo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        lblModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(111, 44, 145));
        lblModelo.setText("Modelo");
        jPanel1.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(111, 44, 145));
        jLabel8.setText("CPU:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        lblCPU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCPU.setForeground(new java.awt.Color(111, 44, 145));
        lblCPU.setText("CPU");
        jPanel1.add(lblCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(111, 44, 145));
        jLabel14.setText("Tamanho do Disco");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        lblHD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblHD.setForeground(new java.awt.Color(111, 44, 145));
        lblHD.setText("Tamanho do Disco");
        jPanel1.add(lblHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(111, 44, 145));
        jLabel12.setText("Memoria Ram Total:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        lblTotalMemoriaRam.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTotalMemoriaRam.setForeground(new java.awt.Color(111, 44, 145));
        lblTotalMemoriaRam.setText("Total de Memoria Ram");
        jPanel1.add(lblTotalMemoriaRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(111, 44, 145));
        jLabel7.setText("Sistema Op:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        lblSistemaOp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSistemaOp.setForeground(new java.awt.Color(111, 44, 145));
        lblSistemaOp.setText("S.O");
        jPanel1.add(lblSistemaOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(111, 44, 145));
        jLabel6.setText("Computador:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        lblUsuarioComputador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsuarioComputador.setForeground(new java.awt.Color(111, 44, 145));
        lblUsuarioComputador.setText("Computador");
        jPanel1.add(lblUsuarioComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        AdministrativoPalavraLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdministrativoPalavraLabel.setForeground(new java.awt.Color(111, 44, 145));
        AdministrativoPalavraLabel.setText("Administrativo");
        jPanel1.add(AdministrativoPalavraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 170, 30));

        ClientesPalavraLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ClientesPalavraLabel.setForeground(new java.awt.Color(111, 44, 145));
        ClientesPalavraLabel.setText("Clientes atendidos no dia:");
        jPanel1.add(ClientesPalavraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 230, 20));

        MediaMensalPalavraLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MediaMensalPalavraLabel.setForeground(new java.awt.Color(111, 44, 145));
        MediaMensalPalavraLabel.setText("Média mensal de clientes:");
        jPanel1.add(MediaMensalPalavraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 230, 20));

        PDiaPalavraLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PDiaPalavraLabel.setForeground(new java.awt.Color(111, 44, 145));
        PDiaPalavraLabel.setText("p/ dia");
        jPanel1.add(PDiaPalavraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 50, 20));

        LucroMensalPalavraLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LucroMensalPalavraLabel.setForeground(new java.awt.Color(111, 44, 145));
        LucroMensalPalavraLabel.setText("Lucro mensal: ");
        jPanel1.add(LucroMensalPalavraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 140, 30));

        GastoMensalPalavraLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        GastoMensalPalavraLabel.setForeground(new java.awt.Color(111, 44, 145));
        GastoMensalPalavraLabel.setText("Gasto mensal: ");
        jPanel1.add(GastoMensalPalavraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 140, 20));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(111, 44, 145));
        jLabel20.setText("Temperatura da CPU");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        lblTempCPU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTempCPU.setForeground(new java.awt.Color(111, 44, 145));
        lblTempCPU.setText("0%");
        jPanel1.add(lblTempCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        lblUsoProcessador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsoProcessador.setForeground(new java.awt.Color(111, 44, 145));
        lblUsoProcessador.setText("0%");
        jPanel1.add(lblUsoProcessador, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        lblUsoMemoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsoMemoria.setForeground(new java.awt.Color(111, 44, 145));
        lblUsoMemoria.setText("0%");
        jPanel1.add(lblUsoMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        lblUsoDisco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsoDisco.setForeground(new java.awt.Color(111, 44, 145));
        lblUsoDisco.setText("0%");
        jPanel1.add(lblUsoDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, -1, -1));

        pgbUsoMemoria.setForeground(new java.awt.Color(111, 44, 145));
        jPanel1.add(pgbUsoMemoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        pgbUsoCpu.setForeground(new java.awt.Color(111, 44, 145));
        jPanel1.add(pgbUsoCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        pgbTempCPU.setForeground(new java.awt.Color(111, 44, 145));
        jPanel1.add(pgbTempCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(111, 44, 145));
        jLabel24.setText("Uso de RAM");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        pgbUsoDisco.setForeground(new java.awt.Color(111, 44, 145));
        jPanel1.add(pgbUsoDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        lblUsoRAM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsoRAM.setForeground(new java.awt.Color(111, 44, 145));
        lblUsoRAM.setText("0%");
        jPanel1.add(lblUsoRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        pgbUsoRAM.setForeground(new java.awt.Color(111, 44, 145));
        jPanel1.add(pgbUsoRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(111, 44, 145));
        jLabel21.setText("Uso de Memoria");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, 21));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(111, 44, 145));
        jLabel22.setText("Uso do Disco");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(111, 44, 145));
        jLabel25.setText("Monitoramento");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(111, 44, 145));
        jLabel26.setText("Uso da CPU");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(111, 44, 145));
        jLabel31.setText("segundos");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, 30));

        spnAtualizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(spnAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 49, 30));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(111, 44, 145));
        jLabel32.setText("Tempo de atualização:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, 30));

        btnMonitorar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao_monitorar.png"))); // NOI18N
        btnMonitorar.setBorderPainted(false);
        btnMonitorar.setContentAreaFilled(false);
        btnMonitorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMonitorar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 82, 40));

        btnParar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao_parar.png"))); // NOI18N
        btnParar.setBorderPainted(false);
        btnParar.setContentAreaFilled(false);
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });
        jPanel1.add(btnParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 75, 40));

        btnProcessos.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        btnProcessos.setForeground(new java.awt.Color(111, 44, 145));
        btnProcessos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/processos.png"))); // NOI18N
        btnProcessos.setText("Processos");
        btnProcessos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(111, 44, 145), 1, true));
        btnProcessos.setContentAreaFilled(false);
        btnProcessos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessosActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcessos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 190, 90));

        lblAvisoCapturar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblAvisoCapturar.setForeground(new java.awt.Color(111, 44, 145));
        lblAvisoCapturar.setText("Capturando informações");
        jPanel1.add(lblAvisoCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 30));

        lblReticencias1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblReticencias1.setForeground(new java.awt.Color(111, 44, 145));
        lblReticencias1.setText(".");
        jPanel1.add(lblReticencias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        lblReticencias3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblReticencias3.setForeground(new java.awt.Color(111, 44, 145));
        lblReticencias3.setText(".");
        jPanel1.add(lblReticencias3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 10, -1));

        lblReticencias2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        lblReticencias2.setForeground(new java.awt.Color(111, 44, 145));
        lblReticencias2.setText(".");
        jPanel1.add(lblReticencias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spnAtualizacaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnAtualizacaoPropertyChange
    }//GEN-LAST:event_spnAtualizacaoPropertyChange

    private void spnAtualizacaoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_spnAtualizacaoInputMethodTextChanged
    }//GEN-LAST:event_spnAtualizacaoInputMethodTextChanged

    private void spnAtualizacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnAtualizacaoMouseClicked
    }//GEN-LAST:event_spnAtualizacaoMouseClicked

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnMonitorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorarActionPerformed
        Integer valor = Integer.valueOf(spnAtualizacao.getValue().toString());
        if (!monitorando) {
            if (valor < 6) {
                spnAtualizacao.setValue(6);
            } else {
                Thread threadMonitoramento = new Thread(this::atualizarDados);
                Thread threadReticencias = new Thread(this::reticencias);

                threadMonitoramento.start();
                threadReticencias.start();

                monitorando = true;
            }
        }
    }//GEN-LAST:event_btnMonitorarActionPerformed

    private void btnProcessosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessosActionPerformed
            TelaProcessos2 janelaProcessos = new TelaProcessos2();
            janelaProcessos.setVisible(true);
    }//GEN-LAST:event_btnProcessosActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        monitorando = false;
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        statusMonitoramento = false;
    }//GEN-LAST:event_btnSairActionPerformed

    public static boolean isLogin() {
        return logado;
    }

    public void setStatusMonitoramento(boolean statusMonitoramento) {
        this.statusMonitoramento = statusMonitoramento;
    }

    public boolean isStatusMonitoramento() {
        return statusMonitoramento;
    }

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
            java.util.logging.Logger.getLogger(TelaMonitoramento2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMonitoramento2(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdministrativoPalavraLabel;
    private javax.swing.JLabel ClientesPalavraLabel;
    private javax.swing.JLabel GastoMensalPalavraLabel;
    private javax.swing.JLabel LucroMensalPalavraLabel;
    private javax.swing.JLabel MediaMensalPalavraLabel;
    private javax.swing.JLabel PDiaPalavraLabel;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMonitorar;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnProcessos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAvisoCapturar;
    private javax.swing.JLabel lblCPU;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblEstacao;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblHD;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblLinha;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblReticencias1;
    private javax.swing.JLabel lblReticencias2;
    private javax.swing.JLabel lblReticencias3;
    private javax.swing.JLabel lblSistemaOp;
    private javax.swing.JLabel lblTempCPU;
    private javax.swing.JLabel lblTotalMemoriaRam;
    private javax.swing.JLabel lblUsoDisco;
    private javax.swing.JLabel lblUsoMemoria;
    private javax.swing.JLabel lblUsoProcessador;
    private javax.swing.JLabel lblUsoRAM;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioComputador;
    private javax.swing.JProgressBar pgbTempCPU;
    private javax.swing.JProgressBar pgbUsoCpu;
    private javax.swing.JProgressBar pgbUsoDisco;
    private javax.swing.JProgressBar pgbUsoMemoria;
    private javax.swing.JProgressBar pgbUsoRAM;
    private javax.swing.JSpinner spnAtualizacao;
    // End of variables declaration//GEN-END:variables
}
