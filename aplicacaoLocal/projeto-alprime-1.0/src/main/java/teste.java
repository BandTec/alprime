
import com.alprime.monitoramento.Consumo;
import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.sensors.Temperature;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.PhysicalMemory;
import oshi.hardware.VirtualMemory;

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
//        SystemInfo si = new SystemInfo();;
//        GlobalMemory memory = si.getHardware().getMemory();
//        System.out.println("Physical Memory: \n " + memory.toString());
//        PhysicalMemory[] pmList = memory.getPhysicalMemory();
//            for (PhysicalMemory pm : pmList) {
//                System.out.println(" " + pm.toString());
//            }
        System.out.println("Pegando temperatura...");
       for(int i = 0;i<20;i++){
        Cpu cpu = JSensors.get.components().cpus.get(0);
        if (cpu.sensors.temperatures != null && cpu.sensors.temperatures.size() > 0){
            
            List<Temperature> temperaturas = cpu.sensors.temperatures;
            System.out.println(cpu.sensors.temperatures.get(temperaturas.size()-1).name);
            System.out.println(cpu.sensors.temperatures.get(temperaturas.size()-1).value);
        }else{
        System.out.println("Deu ruim");
            }
       }
    }
}
