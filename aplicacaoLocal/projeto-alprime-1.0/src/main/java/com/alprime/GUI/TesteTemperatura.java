/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.GUI;

import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Cpu;
import java.util.List;

/**
 *
 * @author Gabriel Vieira
 */
public class TesteTemperatura {
    public static void main(String[] args) {
        List<Cpu> cpus = JSensors.get.components().cpus; 
        int cpuSize = cpus.get(0).sensors.temperatures.size();
        Double tempCPU = cpus.get(0).sensors.temperatures.get(cpuSize - 1).value;
        System.out.println("Temperatura Atual:" + tempCPU);
        
        List<Cpu> cpus2 = JSensors.get.components().cpus; 
        int cpuSize2 = cpus2.get(0).sensors.temperatures.size();
        
        Double tempCPU2 = cpus2.get(0).sensors.temperatures.get(cpuSize2 - 1).value;
        System.out.println(tempCPU2);
        
        
        
    }
}
