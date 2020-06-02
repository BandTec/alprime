/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.telegram;

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
        Maquina m = new Maquina(1,"teste","teste",0.0,"teste",false,"teste","teste","teste","teste",new Localizacao(),new ArrayList<>());
        BotTelegram botTelegram = new BotTelegram(m);
        botTelegram.enviarMensagem("aaaaaaaaa");
        System.out.println(botTelegram);
    }

}
