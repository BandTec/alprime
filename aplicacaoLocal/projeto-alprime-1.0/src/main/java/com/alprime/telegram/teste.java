/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.telegram;

import java.io.IOException;
/**
 *
 * @author Gabriel Vieira
 */
public class teste {
    public static void main(String[] args) throws IOException, InterruptedException {
        BotTelegram botTelegram = new BotTelegram();
        botTelegram.enviarMensagem("engraçaralho");
        System.out.println(botTelegram);
    }

}
