package com.alprime.GUI;


import com.alprime.totem.InformacoesComputador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import oshi.hardware.GlobalMemory;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;


public class Processos 
{
    InformacoesComputador comp = new InformacoesComputador();

    List<OSProcess> listaProcessos;
    OSProcess procs;
    Integer pid;
    String nomeProcesso;
    Integer prioridadeProcesso;
    String usuarioProc;
    String estadoProcesso;
    Double cpuPercentual;
    GlobalMemory memoria;

    
    public Processos() 
    {

        listaProcessos = Arrays.asList(comp.infoSO.getProcesses());
    }
    
    
    public static boolean matarProcesso(String processo) 
    {
        try {
            String line;
            Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) 
            {
                if (!line.trim().equals("")) {
                    if (line.substring(1, line.indexOf("\"", 1)).equalsIgnoreCase(processo)) {
                        Runtime.getRuntime().exec("taskkill /F /IM " + line.substring(1, line.indexOf("\"", 1)));
                        return true;
                    }
                }
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
        return false;
    }

    public List<OSProcess> getListaProcessos() {
        return listaProcessos;
    }
    
    public static void matar(int pid) throws IOException{
        Runtime rt = Runtime.getRuntime();
        String comando = String.format("taskkill /PID %d",pid);
  if (System.getProperty("os.name").toLowerCase().indexOf("windows") > -1) 
     rt.exec(comando);
    }
}    
    
    
