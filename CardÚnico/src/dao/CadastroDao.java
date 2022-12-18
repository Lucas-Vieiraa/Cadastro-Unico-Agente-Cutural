package dao;

import model.UsuarioModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class CadastroDao {

    static Connection conexao = null;
    static PreparedStatement usuario = null;

    public void cadastrar(UsuarioModel usuarioModel) throws ClassNotFoundException, SQLException {
        //COMANDOS SQLS USADOS PARA INSERIR OS VALORES NO BANCO
        String agenteCultural = "insert into agente_cultural (cpf_cnpj_agente,senha_agente,nome_agente,datanascimento_agente,tipo_agente,sexo_agente,areacultural_agente,descricao_agente) values (?,?,?,?,?,?,?,?)";

        //CONEXÃO COM O BANCO DE DADOS
        // SETA NOS CAMPOS COM (?) OS VALORES PEGOS EM CADA GET DO USUARIO MODEL
        try {
            conexao = ConexaoDao.conector();
            usuario = conexao.prepareStatement(agenteCultural);
            usuario.setString(1, usuarioModel.getCpf().trim());
            usuario.setString(2, usuarioModel.getSenha().trim());
            usuario.setString(3, usuarioModel.getNome().trim());
            usuario.setTimestamp(4,new java.sql.Timestamp(usuarioModel.getDataNascimento().getTime()));
            usuario.setString(5, usuarioModel.getTipoAgente().trim());
            usuario.setString(6, usuarioModel.getSexo().trim());
            usuario.setString(7, usuarioModel.getAreaCultural().trim());
            usuario.setString(8, usuarioModel.getDescricao().trim());
            usuario.executeUpdate();
            // CASO A CONEXÃO COM O BANCO NÃO OCORRA TUDO OK ELE ENTRA NESSA EXCEÇÃO
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        conexao.close();
        usuario.close();
    }
}
