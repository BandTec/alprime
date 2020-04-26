package com.alprime.monitoramento;

import java.util.ArrayList;
import java.util.List;
import oshi.util.FormatUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Vieira
 */
public class Converssao {

    public static Double bytesParaGigabits(long bytes) {
        String restante = FormatUtil.formatBytes(bytes);
        String[] somenteNumero = restante.split(" ");
        String[] semVirgula = somenteNumero[0].split(",");
        String formatado = String.format("%s.%s", semVirgula[0], semVirgula[1]);
        return Double.valueOf(formatado);
    }

    public static String dataHoraFormatoSQL(String dataHora) {

        String data = dataHora.split("T")[0];
        String hora = dataHora.split("T")[1];
        String horas[] = hora.split(":");
        String segundos[] = horas[2].split("");
        String horaFormatada = String.format("%s:%s:%s%s", horas[0], horas[1], segundos[0],segundos[1]);
        
        return String.format("%s %s",data,horaFormatada);
    }
}
