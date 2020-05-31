/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.telegram;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.UriBuilder;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author matheus.costa
 */
public class BotTelegram {

    private String CHAT_ID;
    private static final String TOKEN = "1218586965:AAGOQlenhj8avnFRx6p43n7HnfwDcv-R-6g";

    public BotTelegram(String CHAT_ID) {
        this.CHAT_ID = CHAT_ID;
    }
    public BotTelegram() {
        this.CHAT_ID = this.getNovoIdChat();
    }
    
    public String enviarMensagem(String mensagem) {
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .version(HttpClient.Version.HTTP_2)
                .build();

        UriBuilder builder = UriBuilder
                .fromUri("https://api.telegram.org")
                .path("/{token}/sendMessage")
                .queryParam("chat_id", CHAT_ID)
                .queryParam("text", mensagem);

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(builder.build("bot" + TOKEN))
                .timeout(Duration.ofSeconds(5))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
                    return response.body();
        } catch (IOException ex) {
            Logger.getLogger(BotTelegram.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (InterruptedException ex) {
            Logger.getLogger(BotTelegram.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String getNovoIdChat(){
        String uri = String.format("https://api.telegram.org/bot1218586965:AAGOQlenhj8avnFRx6p43n7HnfwDcv-R-6g/getUpdates");
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(uri, String.class);
        Gson g = new Gson();
        ApiTelegram bot = g.fromJson(json, ApiTelegram.class);;
        return String.valueOf(bot.getResult().get(bot.getResult().size()-1).getMessage().getChat().getId());
    }

    public String getCHAT_ID() {
        return CHAT_ID;
    }

    public void setCHAT_ID(String CHAT_ID) {
        this.CHAT_ID = CHAT_ID;
    }

    @Override
    public String toString() {
        return "BotTelegram{" + "CHAT_ID=" + CHAT_ID + '}';
    }    
    
}