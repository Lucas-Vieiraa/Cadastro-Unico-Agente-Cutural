/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Dao.LoginDAO;
import Model.UsuarioMODEL;
import View.LoginVIEW;
import View.TelaPrincipalVIEW;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class LoginHELPER {

    private final LoginVIEW View;

    public LoginHELPER(LoginVIEW View) {
        this.View = View;
    }

    public void Logar() {

        try {
            //PEGA AS INFORMAÇÕES DIGITADAS NOS DETERMINADOS CAMPOS DO LoginVIEW E ARMAZENA EM UMA VARIAVEL 
            String cpf = View.getTxtcpf().getText();
            String senha = View.getTxtsenha().getText();

            //INSERE O VALOR DAS VARIAVEIS ACIMA EM CADA CAMPO CORRESPONDENTE DOS SETTERS DO UsuarioMODEL
            UsuarioMODEL usuario = new UsuarioMODEL(cpf, senha);
            usuario.setCpf(cpf);
            usuario.setSenha(senha);

            //CHAMA O MÉTODO DE Consultar DA CLASSE LoginDAO
            LoginDAO usuariodao = new LoginDAO();
            ResultSet resultado = usuariodao.consultar(usuario);

            //SE O LOGIN OCORRER TUDO OK  ENTRA NA TELA PRINCIPAL
            if (resultado.next()) {
                TelaPrincipalVIEW principal = new TelaPrincipalVIEW();
                principal.setVisible(true);
            } else {
                // SENÃO EXISTIR NENHUM USUÁRIO COM AS INFORMAÇÕES DIGITADAS EXIBE UMA TELA INFORMANDO 
                JOptionPane.showMessageDialog(null, "Cpf/Cnpj Ou Senha Inválidos!");
                limparTela();
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
        }
    }

    // METODO DE LIMPAR A TELA
    public void limparTela() throws ClassNotFoundException {
        View.getTxtcpf().setText("");
        View.getTxtsenha().setText("");
        LoginVIEW principal = new LoginVIEW();
        principal.setVisible(true);
    }

}
