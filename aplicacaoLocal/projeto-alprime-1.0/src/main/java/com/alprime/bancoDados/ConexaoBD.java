/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.bancoDados;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConexaoBD {

    private BasicDataSource dataSource;

    public ConexaoBD() {
        this.dataSource = new BasicDataSource();
        dataSource​.setDriverClassName("org.h2.Driver");
        dataSource​.setUrl("jdbc:h2:file:~/testdb");
        dataSource​.setUsername("sa");
        dataSource​.setPassword("");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

    public void FazerLogin() {

    }

    public void EnviarDadosBD() {

    }

}
