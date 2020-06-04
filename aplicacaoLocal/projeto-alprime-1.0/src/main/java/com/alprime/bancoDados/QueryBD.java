/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.bancoDados;

import com.alprime.alerta.TemperaturaAlerta;
import com.alprime.bancoDados.tabelas.Localizacao;
import com.alprime.bancoDados.tabelas.Maquina;
import com.alprime.bancoDados.tabelas.Registro;
import com.alprime.bancoDados.tabelas.Usuario;
import com.alprime.bancoDados.tabelas.Venda;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Gabriel Vieira
 */
public class QueryBD {

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
                new BeanPropertyRowMapper<Maquina>(Maquina.class), idMaquina);
        Localizacao localizacao = jdbcTemplate.queryForObject("select localizacao.* from maquina, localizacao where fk_localizacao = id_localizacao AND id_maquina = ?",
                new BeanPropertyRowMapper<Localizacao>(Localizacao.class), idMaquina);
        Usuario usuario = jdbcTemplate.queryForObject("select usuario.* from maquina, localizacao, usuario where maquina.fk_localizacao = id_localizacao AND usuario.fk_localizacao = id_localizacao AND id_maquina = ?",
                new BeanPropertyRowMapper<Usuario>(Usuario.class), idMaquina);
        localizacao.setUsuario(usuario);
        resultado.setLocalizacao(localizacao);
        usuario.setLocalizacao(localizacao);
        return resultado;
    }

    public static Registro procurarIdRegistro(Integer idRegistro) {
        Registro resultado = jdbcTemplate.queryForObject("select * from registro where id_registro = ?",
                new BeanPropertyRowMapper<Registro>(Registro.class), idRegistro);
        return resultado;
    }

    public static Localizacao procurarIdLocalizacao(Integer idLocalizacao) {
        Localizacao resultado = jdbcTemplate.queryForObject("select * from localizacao where id_localizacao= ?",
                new BeanPropertyRowMapper<Localizacao>(Localizacao.class), idLocalizacao);
        return resultado;
    }

    public static Usuario procurarIdUsuario(Integer idUsuario) {
        Usuario resultado = jdbcTemplate.queryForObject("select * from usuario where id_usuario= ?",
                new BeanPropertyRowMapper<Usuario>(Usuario.class), idUsuario);
        return resultado;
    }

    public static void inserirMaquina(Maquina maquina) {
        jdbcTemplate.update("insert into maquina values (?,?,?,?,?,?,?,?,?,?,?)",
                null, maquina.getSenhaMaquina(), maquina.getTipoProcessador(),
                maquina.getCapacidadeMemoria(), maquina.getSistemaOperacional(),
                maquina.isStatus(), maquina.getHostname(), maquina.getFabricante(),
                maquina.getModelo(), maquina.getRamTotal(), maquina.getLocalizacao().getIdLocalizacao());
    }

    public static void insertRegistro(Registro registro) {
        jdbcTemplate.update("insert into registro values (?,?,?,?,?,?,?,?)",
                null, registro.getDataHora(), registro.getPorcProcessador(), registro.getPorcDisco(),
                registro.getPorcMemoria(), registro.getTempCpu(), registro.getPorcRam(),
                registro.getMaquina().getIdMaquina());
    }

    public static void insertVenda(Venda venda) {
        jdbcTemplate.update("insert into venda values (?,?,?,?)",
                null, venda.getValor(), venda.getDataHora(), venda.getMaquina().getIdMaquina());
    }

    public static void atualizarMaquina(Integer idMaquina, Maquina maquina) {
        jdbcTemplate.update("update maquina set tipo_processador = ?, capacidade_memoria = ?, "
                + "sistema_operacional = ?, status = ?, hostname= ?, fabricante = ?, "
                + "modelo = ?, ram_total = ? where id_maquina = ?;",
                maquina.getTipoProcessador(), maquina.getCapacidadeMemoria(),
                maquina.getSistemaOperacional(), maquina.isStatus(), maquina.getHostname(), maquina.getFabricante(),
                maquina.getModelo(), maquina.getRamTotal(), idMaquina);
    }

    public static void updateChatId(Usuario usuario, String chatId) {
        jdbcTemplate.update("update usuario set chat_id = ? where id_usuario = ?",
                chatId, usuario.getIdUsuario());
    }

    public static TemperaturaAlerta mediaTemperatura(Maquina maquina) {
        return jdbcTemplate.queryForObject("select avg(temp_cpu) as tempMedia, avg(temp_cpu) * 1.2 as tempAtencao, avg(temp_cpu) * 1.5 as tempPerigo from registro where fk_maquina = ?;",
                new BeanPropertyRowMapper<TemperaturaAlerta>(TemperaturaAlerta.class), maquina.getIdMaquina());
    }
}
