/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alprime.bancoDados;

//import com.microsoft.sqlserver.jdbc.SQLServerXADataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConexaoBD {

    private BasicDataSource dataSource;

    public ConexaoBD() {
        this.dataSource = new BasicDataSource();
        this.dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.dataSource.setUrl("jdbc:sqlserver://alprime.database.windows.net:1433;database=alprime;user=alprimeadmin@alprime;password=#Gfgrupo9;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        this.dataSource.setUsername("alprimeadmin");
        this.dataSource.setPassword("#Gfgrupo9");

    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    
}
