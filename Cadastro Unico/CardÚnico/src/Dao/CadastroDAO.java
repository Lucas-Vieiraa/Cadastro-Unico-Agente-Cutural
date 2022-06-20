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
public class CadastroDAO {

    static Connection conexao = null;
    static PreparedStatement usuario = null;

    @SuppressWarnings("empty-statement")

    public void cadastrar(UsuarioMODEL cadastro) throws ClassNotFoundException, SQLException {
        //COMANDOS SQLS USADOS PARA INSERIR OS VALORES NO BANCO
        String agentecultural = "insert into agente_cultural (cpf_cnpj_agente,senha_agente,nome_agente,datanascimento_agente,tipo_agente,sexo_agente,areacultural_agente,descricao_agente) values (?,?,?,?,?,?,?,?)";

        //CONEXÃO COM O BANCO DE DADOS
        // SETA NOS CAMPOS COM (?) OS VALORES PEGOS EM CADA GET DO USUARIO MODEL
        try {
            conexao = ConexaoDAO.conector();
            usuario = conexao.prepareStatement(agentecultural);
            usuario.setString(1, cadastro.getCpf().trim());
            usuario.setString(2, cadastro.getSenha().trim());
            usuario.setString(3, cadastro.getNome().trim());
            usuario.setTimestamp(4,new java.sql.Timestamp(cadastro.getDatanascimento().getTime()));
            usuario.setString(5, cadastro.getTipoagente().trim());
            usuario.setString(6, cadastro.getSexo().trim());
            usuario.setString(7, cadastro.getAreacultural().trim());
            usuario.setString(8, cadastro.getDescricao().trim());
            usuario.executeUpdate();
            
            // CASO A CONEXÃO COM O BANCO NÃO OCORRA TUDO OK ELE ENTRA NESSA EXCEÇÃO
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        conexao.close();
        usuario.close();
    }
}
