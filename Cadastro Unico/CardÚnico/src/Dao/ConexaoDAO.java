/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.*;

public class ConexaoDAO {

    // MÉTODO  RESPONSÁVEL POR ESTABELECER A CONEXÃO COM O BANCO 
    public static Connection conector() throws ClassNotFoundException {
        Connection conexao ;
        // LINHA ABAIXO "CHAMA" O DRIVER DE CONEXÃO IMPORTADO PARA A BIBLIOTECA
        String driver = "com.mysql.jdbc.Driver";
        // ARMAZENANDO INFORMAÇÕES REFERENTE AO BANCO DE DADOS
        String url = "jdbc:mysql://localhost:3306/cadastro";
        String user = "root";
        String password = "";
        // ESTABELECENDO CONEXÃO COM O BANCO DE DADOS 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (SQLException erro) {
            System.out.println(erro);
            return null;  
        }  
    }
}