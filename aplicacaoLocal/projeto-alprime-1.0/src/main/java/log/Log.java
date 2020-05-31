/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import com.alprime.monitoramento.Converssao;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Vieira
 */
public class Log {

    private LocalDateTime dataHora;
    private String idMaquina;
    private List<MensagemLog> mensagens;
    private String caminhoArquivo;
    private File arquivo;
    private Integer numero;
    
    public Log(String idMaquina, String caminhoArquivo, Integer numero) {
        LocalDateTime tempo = LocalDateTime.now();
        this.mensagens = new ArrayList<>();
        this.idMaquina = idMaquina;
        this.dataHora = tempo;
        this.numero = numero;
        String titulo = String.format("alprime_%s_%s_%d", this.idMaquina, Converssao.dataHoraLog(tempo),this.numero);
        String caminhoArquivoCompleto = String.format("%s\\%s.txt", caminhoArquivo, titulo);
        this.caminhoArquivo = caminhoArquivoCompleto;
        File file = new File(caminhoArquivoCompleto);
        try {
            file.createNewFile(); // aqui ele só cria o arquivo no diretório ja definido acima
        } catch (IOException e) {
        }
        this.arquivo = file;
    }
    
    public Log(String idMaquina, String caminhoDiretorio, String nomeArquivo) {
        LocalDateTime tempo = LocalDateTime.now();
        this.mensagens = new ArrayList<>();
        this.idMaquina = idMaquina;
        this.dataHora = tempo;
        String caminhoArquivoCompleto = String.format("%s\\%s.txt", caminhoDiretorio, nomeArquivo);
        this.caminhoArquivo = caminhoArquivoCompleto;
        File file = new File(caminhoArquivoCompleto);
        this.arquivo = file;
    }

    public void escrever(MensagemLog mensagem) {
        mensagens.add(mensagem);
        try {
            FileWriter escreverArquivo = new FileWriter(this.arquivo,true);
            PrintWriter gravarArq = new PrintWriter(escreverArquivo);
            gravarArq.println(mensagem.toString());
            gravarArq.close();
            System.out.println("Teste Gravado com sucesso");
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }

    @Override
    public String toString() {
        return "Log{" + "dataHora=" + dataHora + ", idMaquina=" + idMaquina + ", mensagens=" + mensagens + ", caminhoArquivo=" + caminhoArquivo + '}';
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

    public List<MensagemLog> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<MensagemLog> mensagens) {
        this.mensagens = mensagens;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

}
