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
        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource​.setUrl("jdbc:mysql://localhost:3306/alprime?useTimezone=true&serverTimezone=UTC&useSSL=false");
        dataSource​.setUsername("root");
        dataSource​.setPassword("bandtec");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
