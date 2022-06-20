/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.UsuarioMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucia
 */
public class AlterarSenhaDAO {

    static Connection conexao = null;
    static PreparedStatement AlterarSenha = null;

    public void alterarSenha(UsuarioMODEL alterar) throws ClassNotFoundException, SQLException {
        // CONEXÃO COM O BANCO
        conexao = ConexaoDAO.conector();
        // COMANDO SQL 
        String sql = ("update agente_cultural set senha_agente =? where cpf_cnpj_agente= ?;");
        try {
            /*AS LINHAS ABAIXO CONSULTAM NO BANCO DE DADOS O QUE FOI DIGITADO 
            NAS CAIXAS DE TEXTOS. AS "?" SÃO SUBSTITUÍDAS PELOS CONTEÚDOS DAS 
            VARIÁVEIS*/

            AlterarSenha = conexao.prepareStatement(sql);
            AlterarSenha.setString(1, alterar.getSenha());
            AlterarSenha.setString(2, alterar.getCpf());
            //A LINHA ABAIXO EXECUTA A QUERY E RETORNA O USUÁRIO
            AlterarSenha.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close();
        AlterarSenha.close();
    }

}
