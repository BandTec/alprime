/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.bancoDados.tabelas;

import com.alprime.totem.InformacoesComputador;
import java.util.List;

/**
 *
 * @author Gabriel Vieira
 */
public class Maquina {
    private Integer idMaquina;
    private String senhaMaquina;
    private String tipoProcessador;
    private Double capacidadeMemoria;
    private String sistemaOperacional;
    private boolean status;
    private String hostname;
    private String fabricante;
    private String modelo;
    private String ramTotal;
    private Localizacao localizacao;
    private List<Registro> registros;

    public Maquina() {
    }

    public Maquina(Integer idMaquina, String senhaMaquina, String tipoProcessador, Double capacidadeMemoria, String sistemaOperacional, boolean status, String hostname, String fabricante, String modelo, String ramTotal, Localizacao localizacao, List<Registro> registros) {
        this.idMaquina = idMaquina;
        this.senhaMaquina = senhaMaquina;
        this.tipoProcessador = tipoProcessador;
        this.capacidadeMemoria = capacidadeMemoria;
        this.sistemaOperacional = sistemaOperacional;
        this.status = status;
        this.hostname = hostname;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ramTotal = ramTotal;
        this.localizacao = localizacao;
        this.registros = registros;
    }
    
    
    public Maquina(Localizacao localizacao){
        InformacoesComputador computador = new InformacoesComputador();
        this.idMaquina = null;
        this.senhaMaquina = null;
        this.tipoProcessador = computador.getProcessador();
        this.capacidadeMemoria = computador.getDisco();
        this.sistemaOperacional = computador.getSistemaOperacional();
        this.status = true;
        this.hostname = computador.getHostname();
        this.fabricante = computador.getFabricante();
        this.modelo = computador.getModelo();
        this.ramTotal = computador.getRamTotal();
        this.localizacao = localizacao;
        this.registros = null;
    }

    public Integer getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(Integer idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getSenhaMaquina() {
        return senhaMaquina;
    }

    public void setSenhaMaquina(String senhaMaquina) {
        this.senhaMaquina = senhaMaquina;
    }

    public String getTipoProcessador() {
        return tipoProcessador;
    }

    public void setTipoProcessador(String tipoProcessador) {
        this.tipoProcessador = tipoProcessador;
    }

    public Double getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(Double capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRamTotal() {
        return ramTotal;
    }

    public void setRamTotal(String ramTotal) {
        this.ramTotal = ramTotal;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    @Override
    public String toString() {
        return "Maquina{" + "idMaquina=" + idMaquina + ", senhaMaquina=" + senhaMaquina + ", tipoProcessador=" + tipoProcessador + ", capacidadeMemoria=" + capacidadeMemoria + ", sistemaOperacional=" + sistemaOperacional + ", status=" + status + ", hostname=" + hostname + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ramTotal=" + ramTotal + ", localizacao=" + localizacao + ", registros=" + registros + '}';
    }

    
    
}
