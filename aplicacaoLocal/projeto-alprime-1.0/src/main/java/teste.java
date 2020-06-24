
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
        SystemInfo si = new SystemInfo();
        GlobalMemory memory = si.getHardware().getMemory();
        System.out.println("Physical Memory: \n " + memory.toString());
        PhysicalMemory[] pmList = memory.getPhysicalMemory();
            for (PhysicalMemory pm : pmList) {
                System.out.println(" " + pm.toString());
            }
    }
}