/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.bancoDados;

import java.util.List;
import java.util.Map;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Gabriel Vieira
 */
public class testeBanco {
    public static void main(String[] args) {
        ConexaoBD conexao = new ConexaoBD();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(conexao.getDataSource());
        List resultado = jdbcTemplate.queryForList("select * from registro");
        System.out.println(resultado);
        
    }
   
}
