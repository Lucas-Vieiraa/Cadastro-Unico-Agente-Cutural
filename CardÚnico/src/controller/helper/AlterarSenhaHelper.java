package controller.helper;

import dao.AlterarSenhaDao;
import model.UsuarioModel;
import view.AlterarSenhaView;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlterarSenhaHelper {

    private final AlterarSenhaView view;

    public AlterarSenhaHelper(AlterarSenhaView view) {
        this.view = view;
    }

    public boolean alterarSenha() throws ClassNotFoundException {

        try {
            //PEGA AS INFORMAÇÕES DIGITADAS NOS DETERMINADOS CAMPOS DO LoginVIEW E ARMAZENA EM UMA VARIAVEL 
            String cpf = view.getTxtcpf().getText();
            String senha = view.getTxtsenha().getText();

            //INSERE O VALOR DAS VARIAVEIS ACIMA EM CADA CAMPO CORRESPONDENTE DOS SETTERS DO UsuarioModel
            UsuarioModel usuario = new UsuarioModel(cpf, senha);
            usuario.setCpf(cpf);
            usuario.setSenha(senha);
            
            //CHAMA O MÉTODO DE alterarSenha DA CLASSE LoginDAO
            AlterarSenhaDao alterarSenhaDAO = new AlterarSenhaDao();
            alterarSenhaDAO.alterarSenha(usuario);
            
            //SE A ALTERAÇÃO DA SENHA OCORRER TUDO OK CONTINUA NA TELA DE ALTERAÇÃO E INFORMA SENHA ALTERADA
            JOptionPane.showMessageDialog(null, "Senha Alterada com Sucesso!");
            limparTela();
            
        } catch (ClassNotFoundException | SQLException ex) {
            limparTela();
            Logger.getLogger(LoginHelper.class.getName()).log(Level.SEVERE, null, "Alteração de Senha Falhou");
        }
        return true;
    }
    public void limparTela() throws ClassNotFoundException {
        view.getTxtcpf().setText("");
        view.getTxtsenha().setText("");
        AlterarSenhaView principal = new AlterarSenhaView();
        principal.setVisible(true);
    }
}
