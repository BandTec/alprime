package com.alprime.monitoramento;

import com.alprime.totem.InformacoesComputador;
import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.components.Disk;
import java.util.List;
import oshi.util.FormatUtil;

public class Consumo {

     List<Cpu> cpus;
     List<Disk> disco;
     int cpuSize, tamanhoDisco;
     Double cpu, tempCPU, consumoDisco,cpuUso,consumoRAM;

    InformacoesComputador comp = new InformacoesComputador();

    public Consumo() {
        cpus = JSensors.get.components().cpus;
        disco = JSensors.get.components().disks;
        cpuSize = cpus.get(0).sensors.temperatures.size();
        cpuUso = Double.valueOf(cpus.get(0).sensors.loads.size());
        tamanhoDisco = disco.get(0).sensors.loads.size();
        tempCPU = cpus.get(0).sensors.temperatures.get(cpuSize - 1).value;
        consumoDisco = cpus.get(0).sensors.loads.get(tamanhoDisco - 1).value;
        consumoRAM = Converssao.bytesParaGigabits(comp.infoHardware.getMemory().getAvailable());

    }

    public Double getTemperaturaCPU() {
        return tempCPU;
    }

    public Double getConsumoRAM() {
        return consumoRAM;
    }

    public Double getConsumoDisco() {
        return consumoDisco;
    }

    public Double getUsoCpu() {
        return cpuUso;
    }

    // Aqui será necessário criar metódos para enviar dados para o Azure/MySQL
}
