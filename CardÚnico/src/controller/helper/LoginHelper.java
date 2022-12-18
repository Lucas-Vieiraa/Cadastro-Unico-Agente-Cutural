package controller.helper;

import dao.LoginDao;
import model.UsuarioModel;
import view.LoginView;
import view.TelaPrincipalView;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginHelper {

    private final LoginView view;

    public LoginHelper(LoginView view) {
        this.view = view;
    }

    public void logar() {

        try {
            //PEGA AS INFORMAÇÕES DIGITADAS NOS DETERMINADOS CAMPOS DO LoginView E ARMAZENA EM UMA VARIAVEL 
            String cpf = view.getTxtcpf().getText();
            String senha = view.getTxtsenha().getText();

            //INSERE O VALOR DAS VARIAVEIS ACIMA EM CADA CAMPO CORRESPONDENTE DOS SETTERS DO UsuarioModel
            UsuarioModel usuario = new UsuarioModel(cpf, senha);
            usuario.setCpf(cpf);
            usuario.setSenha(senha);

            //CHAMA O MÉTODO DE Consultar DA CLASSE LoginDao
            LoginDao usuariodao = new LoginDao();
            ResultSet resultado = usuariodao.consultar(usuario);

            //SE O LOGIN OCORRER TUDO OK  ENTRA NA TELA PRINCIPAL
            if (resultado.next()) {
                TelaPrincipalView principal = new TelaPrincipalView();
                principal.setVisible(true);
            } else {
                // SENÃO EXISTIR NENHUM USUÁRIO COM AS INFORMAÇÕES DIGITADAS EXIBE UMA TELA INFORMANDO 
                JOptionPane.showMessageDialog(null, "Cpf/Cnpj Ou Senha Inválidos!");
                limparTela();
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
        }
    }
    public void limparTela() throws ClassNotFoundException {
        view.getTxtcpf().setText("");
        view.getTxtsenha().setText("");
        LoginView principal = new LoginView();
        principal.setVisible(true);
    }
}
