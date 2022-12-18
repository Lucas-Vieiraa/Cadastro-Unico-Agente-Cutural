package dao;

import model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlterarSenhaDao {

    static Connection conexao = null;
    static PreparedStatement alterarSenha = null;

    public void alterarSenha(UsuarioModel usuarioModel) throws ClassNotFoundException, SQLException {
        // CONEXÃO COM O BANCO
        conexao = ConexaoDao.conector();
        // COMANDO SQL 
        String agenteCultural = ("update agente_cultural set senha_agente =? where cpf_cnpj_agente= ?;");
        try {
            /*  AS LINHAS ABAIXO CONSULTAM NO BANCO DE DADOS O QUE FOI DIGITADO 
             *  NAS CAIXAS DE TEXTOS. AS "?" SÃO SUBSTITUÍDAS PELOS CONTEÚDOS DAS 
             *   VARIÁVEIS                                                        */
            alterarSenha = conexao.prepareStatement(agenteCultural);
            alterarSenha.setString(1, usuarioModel.getSenha());
            alterarSenha.setString(2, usuarioModel.getCpf());
            //A LINHA ABAIXO EXECUTA A QUERY E RETORNA O USUÁRIO
            alterarSenha.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close();
        alterarSenha.close();
    }
}
