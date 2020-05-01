package com.alprime.totem;

import com.alprime.monitoramento.Converssao;
import com.profesorfalken.jsensors.model.components.Cpu;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;
import oshi.util.FormatUtil;

public class InformacoesComputador {

    // Variáveis que os dados vão entrar
    String usuario, hostname, fabricante, modelo, processador, ramTotal, sistemaOperacional;
    Double disco, gpu, cpu;
    HWDiskStore[] ds;
    List<Cpu> cpus;
    int cpuLoad;

    //List<Cpu> cpus;
    // É necessário criar objetos do OSHI para ele pegar os dados, aqui estão estes objetos.
    public final SystemInfo infoSistema = new SystemInfo();
    public final HardwareAbstractionLayer infoHardware = infoSistema.getHardware();
    public final OperatingSystem infoSO = infoSistema.getOperatingSystem();

    // Aqui são fica o nome de todas variáveis a serem puxadas na hora de pegar os dados do PC.
    public InformacoesComputador() {
        usuario = infoSO.getProcess(0).getUser();
        hostname = infoSO.getNetworkParams().getHostName();
        fabricante = infoHardware.getComputerSystem().getManufacturer();
        modelo = infoHardware.getComputerSystem().getModel();
        processador = infoHardware.getProcessor().getName();
        ramTotal = FormatUtil.formatBytes(infoHardware.getMemory().getTotal());
        sistemaOperacional = infoSO.getFamily();
        ds = infoHardware.getDiskStores();
        OSFileStore[] memoria = infoSO.getFileSystem().getFileStores();
        Double totalMemoria = 0.0;

        for (OSFileStore reparticoes : memoria) {
            Double memoriaGB = Double.valueOf(reparticoes.getTotalSpace()) / 1000000000;
            totalMemoria += memoriaGB;
        }
        disco = totalMemoria;
    }

    // Métodos para pegar os dados
    public String getUsuario() {
        return usuario;
    }

    public String getHostname() {
        return hostname;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public String getRamTotal() {
        return ramTotal;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public Double getDisco() {
        return disco;
    }
}
