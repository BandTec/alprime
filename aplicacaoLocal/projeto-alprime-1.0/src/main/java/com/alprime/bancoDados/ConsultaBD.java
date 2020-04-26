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
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Gabriel Vieira
 */
public class ConsultaBD {

    private static final ConexaoBD conexao = new ConexaoBD();
    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(conexao.getDataSource());

    public static List<Maquina> procurarTodasMaquinas() {
        List<Maquina> resultado = jdbcTemplate.query("select * from maquina",
                new BeanPropertyRowMapper(Maquina.class));
        return resultado;
    }
    
    public static List<Registro> procurarTodosRegistros() {
        List<Registro> resultado = jdbcTemplate.query("select * from registro",
                new BeanPropertyRowMapper(Registro.class));
        return resultado;
    }
    
     public static List<Localizacao> procurarTodosLocalizacoes() {
        List<Localizacao> resultado = jdbcTemplate.query("select * from localizacao",
                new BeanPropertyRowMapper(Localizacao.class));
        return resultado;
    }
    
     public static List<Usuario> procurarTodosUsuarios() {
        List<Usuario> resultado = jdbcTemplate.query("select * from usuario",
                new BeanPropertyRowMapper(Usuario.class));
        return resultado;
    }
    
    public static Maquina procurarIdMaquina(Integer idMaquina) {
        Maquina resultado = jdbcTemplate.queryForObject("select * from maquina where id_maquina = ?",
                                         new BeanPropertyRowMapper<Maquina>(Maquina.class),idMaquina);
        return resultado;
    }
     
    public static Registro procurarIdRegistro(Integer idRegistro) {
        Registro resultado = jdbcTemplate.queryForObject("select * from registro where id_registro = ?",
                                         new BeanPropertyRowMapper<Registro>(Registro.class),idRegistro);
        return resultado;
    }
    
    public static Localizacao procurarIdLocalizacao(Integer idLocalizacao) {
        Localizacao resultado = jdbcTemplate.queryForObject("select * from localizacao where id_localizacao= ?",
                                         new BeanPropertyRowMapper<Localizacao>(Localizacao.class),idLocalizacao);
        return resultado;
    }
    
    public static Usuario procurarIdUsuario(Integer idUsuario) {
        Usuario resultado = jdbcTemplate.queryForObject("select * from usuario where id_usuario= ?",
                                         new BeanPropertyRowMapper<Usuario>(Usuario.class),idUsuario);
        return resultado;
    }
    
    
    public static void inserirMaquina(Maquina maquina) {
        jdbcTemplate.update("insert into maquina values (?,?,?,?,?,?,?,?,?,?,?)",
                                           null,maquina.getSenhaMaquina(),maquina.getTipoProcessador(),
                                           maquina.getCapacidadeMemoria(),maquina.getSistemaOperacional(),
                                           maquina.isStatus(),maquina.getHostname(), maquina.getFabricante(),
                                           maquina.getModelo(),maquina.getRamTotal(), maquina.getLocalizacao().getIdLocalizacao());
    }
    
    public static void insertRegistro(Registro registro){
        jdbcTemplate.update("insert into registro values (?,?,?,?,?,?,?,?)",
                            null, registro.getDataHora(),registro.getPorcProcessador(),registro.getPorcDisco(),
                            registro.getPorcMemoria(), registro.getTempCpu(), registro.getPorcRam(),
                            registro.getMaquina().getIdMaquina());
        
    } 
}
