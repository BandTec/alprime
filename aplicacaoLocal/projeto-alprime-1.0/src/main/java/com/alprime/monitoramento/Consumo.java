package com.alprime.monitoramento;

import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.components.Disk;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;
import oshi.util.Util;

public class Consumo {

    private List<Cpu> cpus;
    private List<Disk> disco;
    private int cpuSize, tamanhoDisco;
    private Double cpu, tempCPU, consumoDisco, cpuUso, consumoRAM;
    private Double consumoMemoria;
    private InformacoesComputador comp = new InformacoesComputador();
    private static final SystemInfo INFO_SISTEMA = new SystemInfo();
    private static final HardwareAbstractionLayer INFO_HARDWARE = INFO_SISTEMA.getHardware();
    private static final CentralProcessor PROCESSOR = INFO_HARDWARE.getProcessor();
    private static final OperatingSystem INFO_SO = INFO_SISTEMA.getOperatingSystem();

    public Consumo() {
        cpus = JSensors.get.components().cpus;
        disco = JSensors.get.components().disks;
        cpuSize = cpus.get(0).sensors.temperatures.size();
        cpuUso = Consumo.pegarCpu();
        tamanhoDisco = disco.get(0).sensors.loads.size();
        tempCPU = cpus.get(0).sensors.temperatures.get(cpuSize - 1).value;
        consumoDisco = cpus.get(0).sensors.loads.get(tamanhoDisco - 1).value;
        consumoRAM = Consumo.monitorarRam();
        consumoMemoria = Consumo.monitorarMemoria();
    }

    public static Double monitorarRam() {
        List<Disk> disco = JSensors.get.components().disks;
        Double ramTotal = Converssao.bytesParaGigabits(INFO_HARDWARE.getMemory().getTotal());
        Double ramDisponivel = Converssao.bytesParaGigabits(INFO_HARDWARE.getMemory().getAvailable());
        Double ramRestante = ramTotal - ramDisponivel;
        return ramRestante * 100 / ramTotal;
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

    public Double getConsumoMemoria() {
        return consumoMemoria;
    }

    public void setConsumoMemoria(Double consumoMemoria) {
        this.consumoMemoria = consumoMemoria;
    }

    private static Double pegarCpu() {

        long[] prevTicks = PROCESSOR.getSystemCpuLoadTicks();
        long[][] prevProcTicks = PROCESSOR.getProcessorCpuLoadTicks();
        // Wait a second...
        Util.sleep(1000);
        long[] ticks = PROCESSOR.getSystemCpuLoadTicks();
        long user = ticks[CentralProcessor.TickType.USER.getIndex()] - prevTicks[CentralProcessor.TickType.USER.getIndex()];
        long nice = ticks[CentralProcessor.TickType.NICE.getIndex()] - prevTicks[CentralProcessor.TickType.NICE.getIndex()];
        long sys = ticks[CentralProcessor.TickType.SYSTEM.getIndex()] - prevTicks[CentralProcessor.TickType.SYSTEM.getIndex()];
        long idle = ticks[CentralProcessor.TickType.IDLE.getIndex()] - prevTicks[CentralProcessor.TickType.IDLE.getIndex()];
        long iowait = ticks[CentralProcessor.TickType.IOWAIT.getIndex()] - prevTicks[CentralProcessor.TickType.IOWAIT.getIndex()];
        long irq = ticks[CentralProcessor.TickType.IRQ.getIndex()] - prevTicks[CentralProcessor.TickType.IRQ.getIndex()];
        long softirq = ticks[CentralProcessor.TickType.SOFTIRQ.getIndex()] - prevTicks[CentralProcessor.TickType.SOFTIRQ.getIndex()];
        long steal = ticks[CentralProcessor.TickType.STEAL.getIndex()] - prevTicks[CentralProcessor.TickType.STEAL.getIndex()];
        long totalCpu = user + nice + sys + idle + iowait + irq + softirq + steal;

        double usoCpu = INFO_SISTEMA.getHardware().getProcessor().getSystemCpuLoadBetweenTicks(prevTicks);
        return usoCpu * 100;
    }

    public static Double monitorarMemoria() {
        OSFileStore[] memoria = INFO_SO.getFileSystem().getFileStores();
        Double memoriaRestante = 0.0;
        Double memoriaTotal = 0.0;
        for (OSFileStore reparticoes : memoria) {
            memoriaRestante += Converssao.bytesParaGigabits(reparticoes.getFreeSpace());
            memoriaTotal += Converssao.bytesParaGigabits(reparticoes.getTotalSpace());
        }
        Double memoriaUsada = memoriaTotal - memoriaRestante;
        return memoriaUsada * 100 / memoriaTotal;
    }
}
