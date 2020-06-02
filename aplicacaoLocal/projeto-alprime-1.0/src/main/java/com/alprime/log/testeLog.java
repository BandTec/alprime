package com.alprime.log;

import com.alprime.monitoramento.Converssao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Vieira
 */
public class testeLog {

    public static void main(String[] args) throws IOException {
        Log l = new Log(1,1);
        MensagemLog mensagem = new MensagemLog(1, "Teste Escrita", "INFO");
        FileReader arq = new FileReader(l.getArquivo());
        BufferedReader lerArq = new BufferedReader(arq);
//        while(true){
//            if(l.getArquivo().length() < 300 & l.getNumero() <= 3){
                            l.escrever(mensagem);
//            }else{
//                break;
//            }
//        }
        System.out.println(lerArq.lines().count());
        System.out.println("Tamanho do Arquivo: " + l.getArquivo().length());



    }
}
