package br.com.gabrielvieira.oshiteste;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.PowerSource;
import oshi.hardware.Sensors;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

public class Teste {
    public static void main(String[] args) {
        SystemInfo teste = new SystemInfo();
        String processador = teste.getHardware().getProcessor().getProcessorIdentifier().getName();
        long[] processadores = teste.getHardware().getProcessor().getCurrentFreq();
        int processosAtivos = teste.getOperatingSystem().getProcessCount();
        OperatingSystem.OSVersionInfo versaoSO = teste.getOperatingSystem().getVersionInfo();
        System.out.println("========= Info do Computador =========");
        System.out.println(String.format("Processador: %s",processador));
        System.out.println(String.format("Sistema Operacional: %s", teste.getOperatingSystem().getFamily()));
        System.out.println("Frequencia Maxima:" + teste.getHardware().getProcessor().getMaxFreq());
        System.out.println("Freq. Processador: " + processadores[0]/1000000000.0 + " GHz");
        System.out.println("Versão do Sistema Operacional: " + versaoSO);
        System.out.println(teste.getOperatingSystem().getThreadCount());

        OSProcess[] listaProcessos = teste.getOperatingSystem().getProcesses();

        for (OSProcess processos: listaProcessos){
            System.out.println(processos.getName());
        }

        PowerSource[] bateria = teste.getHardware().getPowerSources();
        Sensors sensors = teste.getHardware().getSensors();
        System.out.println(sensors);
        System.out.println(bateria[0]);

        System.out.println("====== Estado Atual ======");
        for (Integer i = 0; i < 5; i ++ ) {
            System.out.println("Processos Ativos: " + processosAtivos);
            double memoriaTotal = teste.getHardware().getMemory().getTotal() / 1000000000.0;
            double memoriaSobrando = (teste.getHardware().getMemory().getAvailable() / 1000000000.0) * 100/memoriaTotal;
            double memoriaUtilizada = 100 - memoriaSobrando;
            System.out.println(String.format("Memória Total:%.3f Gb",memoriaTotal));
            System.out.println(String.format("Memória Utilizada:%.3f %%",memoriaUtilizada));
            System.out.println(String.format("Memória Restante:%.3f %%",memoriaSobrando));


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
