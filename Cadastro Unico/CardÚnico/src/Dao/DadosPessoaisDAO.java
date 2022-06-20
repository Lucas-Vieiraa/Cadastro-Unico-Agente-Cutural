/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Model.UsuarioMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author lucia
 */
public class DadosPessoaisDAO {

    Connection conexao = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;

    public UsuarioMODEL consultar(String consultaCpf) throws ClassNotFoundException, SQLException {
        //CONEXÃO COM O BANCO
        conexao = ConexaoDAO.conector();
        // COMANDO SQL DO BANCO
        
        String sql = "select * from agente_cultural where cpf_cnpj_agente=?";
        try {
            /*AS LINHAS ABAIXO CONSULTAM NO BANCO DE DADOS O QUE FOI DIGITADO 
            NAS CAIXAS DE TEXTOS. AS "?" SÃO SUBSTITUÍDAS PELOS CONTEÚDOS DAS 
            VARIÁVEIS*/
            consulta = conexao.prepareStatement(sql);
            consulta.setString(1, consultaCpf);
            //A LINHA ABAIXO EXECUTA A QUERY E RETORNA O USUÁRIO
            resultado = consulta.executeQuery();
            
            if(resultado.next()){
             UsuarioMODEL usuario = new UsuarioMODEL();
             usuario.setNome(resultado.getString("nome_agente"));
             usuario.setDatanascimento(resultado.getDate("datanascimento_agente").toString());
             usuario.setTipoagente(resultado.getString("tipo_agente"));
             usuario.setSexo(resultado.getString("sexo_agente"));
             usuario.setAreacultural(resultado.getString("areacultural_agente"));
             usuario.setDescricao(resultado.getString("descricao"));
             return usuario;
            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DadosPessoaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close();
        consulta.close();
        return null;
    }

}
