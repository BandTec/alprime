/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.telegram;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Scanner;
import javax.ws.rs.core.UriBuilder;

/**
 *
 * @author matheus.costa
 */
public class MsgTelegram{
  private static final String CHAT_ID = "-417931401";
  private static final String TOKEN = "1218586965:AAGOQlenhj8avnFRx6p43n7HnfwDcv-R-6g";
  private static Integer temp = 0;
  private static String message;
  
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o valor da temperatura atual ?");
        temp = leitor.nextInt();
        
        if(temp < 0){
            message = "Computador desligado!!";
        } else if(temp >=0 && temp < 35 ){
            message = "Temperatura do computador agradável!!";
        } else if(temp >=35 && temp < 60){
            message = "Temperatura do computador começando a ficar alta!";
        } else if(temp >=60 && temp < 100 ){
            message = "Computador está muito quente!";
        } else if(temp > 100){
            message = "TEMPERATURA NO TALO!!";
        }
           
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .version(HttpClient.Version.HTTP_2)
                .build();
 
        UriBuilder builder = UriBuilder
                .fromUri("https://api.telegram.org")
                .path("/{token}/sendMessage")
                .queryParam("chat_id", CHAT_ID)
                .queryParam("text", message);
 
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(builder.build("bot" + TOKEN))
                .timeout(Duration.ofSeconds(5))
                .build();
 
        HttpResponse<String> response = client
          .send(request, HttpResponse.BodyHandlers.ofString());
 
        System.out.println(response.body());
    }
  }
