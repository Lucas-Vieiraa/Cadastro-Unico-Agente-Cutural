/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Dao.AlterarSenhaDAO;
import Model.UsuarioMODEL;
import View.AlterarSenhaVIEW;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class AlterarSenhaHELPER {

    private final AlterarSenhaVIEW View;

    public AlterarSenhaHELPER(AlterarSenhaVIEW View) {
        this.View = View;
    }

    public boolean AlterarSenha() throws ClassNotFoundException {

        try {
            //PEGA AS INFORMAÇÕES DIGITADAS NOS DETERMINADOS CAMPOS DO LoginVIEW E ARMAZENA EM UMA VARIAVEL 
            String cpf = View.getTxtcpf().getText();
            String senha = View.getTxtsenha().getText();

            //INSERE O VALOR DAS VARIAVEIS ACIMA EM CADA CAMPO CORRESPONDENTE DOS SETTERS DO UsuarioMODEL
            UsuarioMODEL usuario = new UsuarioMODEL(cpf, senha);
            usuario.setCpf(cpf);
            usuario.setSenha(senha);

            //CHAMA O MÉTODO DE alterarSenha DA CLASSE LoginDAO
            AlterarSenhaDAO alterarSenhaDAO = new AlterarSenhaDAO();
            alterarSenhaDAO.alterarSenha(usuario);
            //SE A ALTERAÇÃO DA SENHA OCORRER TUDO OK CONTINUA NA TELA DE ALTERAÇÃO E INFORMA SENHA ALTERADA
            JOptionPane.showMessageDialog(null, "Senha Alterada com Sucesso!");
            limparTela();

        } catch (ClassNotFoundException | SQLException ex) {
            limparTela();
            Logger.getLogger(LoginHELPER.class.getName()).log(Level.SEVERE, null, "Alteração de Senha Falhou");
        }
        return true;
    }

    public void limparTela() throws ClassNotFoundException {
        View.getTxtcpf().setText("");
        View.getTxtsenha().setText("");
        AlterarSenhaVIEW principal = new AlterarSenhaVIEW();
        principal.setVisible(true);
    }
}
