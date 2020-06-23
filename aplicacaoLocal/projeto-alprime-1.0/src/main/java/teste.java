
import com.alprime.monitoramento.Consumo;
import com.alprime.monitoramento.InformacoesComputador;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Sensors;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Vieira
 */
public class teste {
    public static void main(String[] args) {
        SystemInfo INFO_SISTEMA = new SystemInfo();
        HardwareAbstractionLayer INFO_HARDWARE = INFO_SISTEMA.getHardware();
        Sensors INFO_SENSORES = INFO_HARDWARE.getSensors();
        System.out.println(INFO_SISTEMA.getHardware().getSensors().getCpuTemperature());
    }
}
