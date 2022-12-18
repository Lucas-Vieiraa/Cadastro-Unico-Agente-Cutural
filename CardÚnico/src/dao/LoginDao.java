package dao;

import model.UsuarioModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginDao {

    Connection conexao = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;

    public ResultSet consultar(UsuarioModel usuarioModel) throws ClassNotFoundException, SQLException {
        // CONEXÃO COM O BANCO
        conexao = ConexaoDao.conector();
        // COMANDO SQL DO BANCO
        String agenteCultural = "select * from agente_cultural where cpf_cnpj_agente=? and senha_agente=?";
        try {
            /*AS LINHAS ABAIXO CONSULTAM NO BANCO DE DADOS O QUE FOI DIGITADO 
            NAS CAIXAS DE TEXTOS. AS "?" SÃO SUBSTITUÍDAS PELOS CONTEÚDOS DOS GETTERS DAS 
            VARIÁVEIS*/
            consulta = conexao.prepareStatement(agenteCultural);
            consulta.setString(1, usuarioModel.getCpf());
            consulta.setString(2, usuarioModel.getSenha());
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
