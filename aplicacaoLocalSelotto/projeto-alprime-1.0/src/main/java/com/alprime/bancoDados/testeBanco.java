/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.bancoDados;

import com.alprime.bancoDados.tabelas.Localizacao;
import com.alprime.bancoDados.tabelas.Maquina;
import com.alprime.bancoDados.tabelas.Registro;
import com.alprime.bancoDados.tabelas.Usuario;
import java.util.List;
import java.util.Map;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Gabriel Vieira
 */
public class testeBanco {
    public static void main(String[] args) {
//        List<Maquina> todasMaquinas = ConsultaBD.procurarTodasMaquinas();
//        System.out.println("Todas as maquinas: " + todasMaquinas);
//        
//        List<Registro> todosRegistros = ConsultaBD.procurarTodosRegistros();
//        System.out.println("Todos os registros: " + todosRegistros);
//        
//        List<Usuario> todosUsuarios = ConsultaBD.procurarTodosUsuarios();
//        System.out.println("Todos os usuarios: " + todosUsuarios);
//        
//        List<Localizacao> todosLocalizacoes = ConsultaBD.procurarTodosLocalizacoes();
//        System.out.println("Todos os localizacoes: " + todosLocalizacoes);
//        
        Maquina maquina = ConsultaBD.procurarIdMaquina(1);
//        System.out.println("Maquina com o id = 1: " + maquina);
//        
//        Registro registro = ConsultaBD.procurarIdRegistro(1);
//        System.out.println("Registro com o id = 1: " + registro);
//        
//        Usuario usuario = ConsultaBD.procurarIdUsuario(1);
//        System.out.println("Usuario com o id = 1: " + usuario);
        
        Localizacao localizacao = ConsultaBD.procurarIdLocalizacao(1);
//        System.out.println("Localizacao com o id = 1: " + localizacao);
//        
//        Maquina maquina1 = new Maquina(localizacao);
//        ConsultaBD.inserirMaquina(maquina1);
        
        Registro registro = new Registro(maquina);
        System.out.println(registro);
        ConsultaBD.insertRegistro(registro);
    }
   
}
