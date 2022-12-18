package dao;

import model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DadosPessoaisDao {

    Connection conexao = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;

    public UsuarioModel consultar(String consultarCpf) throws ClassNotFoundException, SQLException {
        //CONEXÃO COM O BANCO
        conexao = ConexaoDao.conector();
        // COMANDO SQL DO BANCO
        String agenteCultural = "select * from agente_cultural where cpf_cnpj_agente=?";
        try {
            /*AS LINHAS ABAIXO CONSULTAM NO BANCO DE DADOS O QUE FOI DIGITADO 
            NAS CAIXAS DE TEXTOS. AS "?" SÃO SUBSTITUÍDAS PELOS CONTEÚDOS DAS 
            VARIÁVEIS*/
            consulta = conexao.prepareStatement(agenteCultural);
            consulta.setString(1, consultarCpf);
            //A LINHA ABAIXO EXECUTA A QUERY E RETORNA O USUÁRIO
            resultado = consulta.executeQuery();
            
            if(resultado.next()){
             UsuarioModel usuario = new UsuarioModel();
             usuario.setNome(resultado.getString("nome_agente"));
             usuario.setDatanascimento(resultado.getDate("datanascimento_agente").toString());
             usuario.setTipoAgente(resultado.getString("tipo_agente"));
             usuario.setSexo(resultado.getString("sexo_agente"));
             usuario.setAreaCultural(resultado.getString("areacultural_agente"));
             usuario.setDescricao(resultado.getString("descricao"));
             return usuario;
            }else{
                return null;
            }   
        } catch (SQLException ex) {
            Logger.getLogger(DadosPessoaisDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close();
        consulta.close();
        return null;
    }
}
