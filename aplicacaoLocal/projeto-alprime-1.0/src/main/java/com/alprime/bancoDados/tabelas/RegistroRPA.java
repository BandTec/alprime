/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.bancoDados.tabelas;

import com.alprime.monitoramento.Consumo;
import com.alprime.monitoramento.Converssao;
import java.time.LocalDateTime;


public class RegistroRPA 
{ 
    private Integer idRegistro;
    private Double valorComprado;
    private String dataHora;
    private Maquina maquina;
    
      public RegistroRPA() 
      {
      }
      
      public RegistroRPA(Maquina maquina) 
      {
        this.idRegistro = null;
        this.dataHora = Converssao.dataHoraFormatoSQL(String.valueOf(LocalDateTime.now()));
        this.valorComprado = valorComprado;
        this.maquina = maquina;
    }
      
      
      public RegistroRPA(Integer idRegistro, String dataHora, Double valorComprado) 
      {
        this.idRegistro = idRegistro;
        this.dataHora = dataHora;
        this.valorComprado = valorComprado;
        this.maquina = maquina;
    }
}
