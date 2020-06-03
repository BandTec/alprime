/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.telegram;

import com.alprime.bancoDados.ConsultaBD;
import com.alprime.bancoDados.tabelas.Localizacao;
import com.alprime.bancoDados.tabelas.Maquina;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Gabriel Vieira
 */
public class teste {
    public static void main(String[] args) throws IOException, InterruptedException {
        Maquina maquina = ConsultaBD.procurarIdMaquina(1);
        System.out.println(maquina);
        BotTelegram botTelegram = new BotTelegram(maquina);
            botTelegram.enviarMensagem("hm Ta bom");
//        botTelegram.getNovoIdChat();
//        System.out.println(botTelegram);
    }

}
