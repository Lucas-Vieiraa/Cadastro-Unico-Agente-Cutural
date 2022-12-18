package controller.helper;

import dao.CadastroDao;
import model.UsuarioModel;
import view.CadastroView;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class CadastroHelper {

    private final CadastroView view;
    SimpleDateFormat conversorData = new SimpleDateFormat("dd/MM/yyyy");

    public CadastroHelper(CadastroView view) {
        this.view = view;
    }
    
    public boolean cadastrar() throws ClassNotFoundException, SQLException {
        
        try {
            //PEGA AS INFORMAÇÕES DIGITADAS NOS DETERMINADOS CAMPOS DO CadastroView E ARMAZENA EM UMA VARIAVEL 
            String cpf = view.getTxtcpf().getText();
            String nome = view.getTxtnome().getText();
            String descricao = view.getTxtdescricao().getText();
            String senha = view.getTxtsenha().getText();
            String datanascimento = view.getTxtdata().getText();
            String areacultural = view.getTxtareacultural().getText();
            String tipoagente = null;
            // VERIFICA QUAIS BOTÕES FORAM SELECIONADOS NO CadastroView E JOGA O VALOR NAS VARIAVEIS CORRESPONDENTES 
            if (view.getBtnindividual().isSelected()) {
                tipoagente = "individual";
            }
            if (view.getBtncoletivo().isSelected()) {
                tipoagente = "coletivo";
            }

            String sexo = null;
            if (view.getBtnmasculino().isSelected()) {
                sexo = "masculino";
            }
            if (view.getBtnfeminino().isSelected()) {
                sexo = "feminino";
            }
            //INSERE O VALOR DAS VARIAVEIS ACIMA EM CADA CAMPO CORRESPONDENTE DOS SETTERS DO UsuarioModel
            UsuarioModel usuario = new UsuarioModel(cpf, senha, nome, tipoagente, datanascimento, sexo, descricao, descricao);

            usuario.setCpf(cpf);
            usuario.setTipoAgente(tipoagente);
            usuario.setNome(nome);
            usuario.setDescricao(descricao);
            usuario.setDatanascimento(datanascimento);
            usuario.setSexo(sexo);
            usuario.setSenha(senha);
            usuario.setAreaCultural(areacultural);

            //CHAMA O MÉTODO DE CADASTRO DA CLASSE CadastroDao
            CadastroDao user = new CadastroDao();
            user.cadastrar(usuario);
            //SE O CADASTRO OCORRER TUDO OK É EXIBIDO UMA TELA INFORMANDO E DEPOIS LIMPA A TELA
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado Com Sucesso!!");
            limparTela();
            // CASO OCORRA ALGUM ERRO ENTRA DENTRO DA EXCEÇÃO MOSTRANDO O ERRO NA TELA 
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return true;
    }
    public boolean limparTela() throws ClassNotFoundException {
        view.getTxtcpf().setText("");
        view.getTxtdata().setText("");
        view.getTxtdescricao().setText("");
        view.getTxtareacultural().setText("");
        view.getTxtsenha().setText("");
        view.getBtnmasculino().setAction(null);
        view.getBtnfeminino().setAction(null);
        view.getBtncoletivo().setAction(null);
        view.getBtnindividual().setAction(null);
        CadastroView principal = new CadastroView();
        principal.setVisible(true);
         return true;
    }
}
