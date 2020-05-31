/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import com.alprime.monitoramento.Converssao;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Vieira
 */
public class MensagemLog {
    private LocalDateTime dataHora;
    private String idMaquina;
    private String mensagem;
    private String tipo;

    public MensagemLog(String idMaquina, String mensagem, String tipo) {
        this.dataHora = LocalDateTime.now();
        this.idMaquina = idMaquina;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(String idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return Converssao.dataHoraLog(dataHora) + ";" + idMaquina + ";" + mensagem + ";" + tipo + ';';
    }
 
    
    
}
