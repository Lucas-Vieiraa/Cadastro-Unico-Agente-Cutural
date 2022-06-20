/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.UsuarioMODEL;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class LoginDAO {

    Connection conexao = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;

    public ResultSet consultar(UsuarioMODEL consultar) throws ClassNotFoundException, SQLException {
        // CONEXÃO COM O BANCO
        conexao = ConexaoDAO.conector();
        // COMANDO SQL DO BANCO
        String sql = "select * from agente_cultural where cpf_cnpj_agente=? and senha_agente=?";
        try {
            /*AS LINHAS ABAIXO CONSULTAM NO BANCO DE DADOS O QUE FOI DIGITADO 
            NAS CAIXAS DE TEXTOS. AS "?" SÃO SUBSTITUÍDAS PELOS CONTEÚDOS DOS GETTERS DAS 
            VARIÁVEIS*/
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, consultar.getCpf());
            consulta.setString(2, consultar.getSenha());
            //A LINHA ABAIXO EXECUTA A QUERY E RETORNA O USUÁRIO
            resultado = consulta.executeQuery();
            return resultado;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        conexao.close();
        consulta.close();
        return null;
    }

 
}
