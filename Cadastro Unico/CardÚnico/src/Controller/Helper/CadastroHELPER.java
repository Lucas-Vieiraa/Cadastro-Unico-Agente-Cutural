/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Dao.CadastroDAO;
import Model.UsuarioMODEL;
import View.CadastroVIEW;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

/**
 *
 * @author lucia
 */
public class CadastroHELPER {

    private final CadastroVIEW View;
    SimpleDateFormat conversorData = new SimpleDateFormat("dd/MM/yyyy");

    public CadastroHELPER(CadastroVIEW View) {
        this.View = View;
    }

    public boolean Cadastrar() throws ClassNotFoundException, SQLException {
        
        try {

            //PEGA AS INFORMAÇÕES DIGITADAS NOS DETERMINADOS CAMPOS DO CadastroVIEW E ARMAZENA EM UMA VARIAVEL 
            String cpf = View.getTxtcpf().getText();
            String nome = View.getTxtnome().getText();
            String descricao = View.getTxtdescricao().getText();
            String senha = View.getTxtsenha().getText();
            String datanascimento = View.getTxtdata().getText();
            String areacultural = View.getTxtareacultural().getText();
            String tipoagente = null;
            // VERIFICA QUAIS BOTÕES FORAM SELECIONADOS NO CadastroVIEW E JOGA O VALOR NAS VARIAVEIS CORRESPONDENTES 
            if (View.getBtnindividual().isSelected()) {
                tipoagente = "individual";
            }
            if (View.getBtncoletivo().isSelected()) {
                tipoagente = "coletivo";
            }

            String sexo = null;
            if (View.getBtnmasculino().isSelected()) {
                sexo = "masculino";
            }
            if (View.getBtnfeminino().isSelected()) {
                sexo = "feminino";
            }

            //INSERE O VALOR DAS VARIAVEIS ACIMA EM CADA CAMPO CORRESPONDENTE DOS SETTERS DO UsuarioMODEL
            UsuarioMODEL usuario = new UsuarioMODEL(cpf, senha, nome, tipoagente, datanascimento, sexo, descricao, descricao);

            usuario.setCpf(cpf);
            usuario.setTipoagente(tipoagente);
            usuario.setNome(nome);
            usuario.setDescricao(descricao);
            usuario.setDatanascimento(datanascimento);
            usuario.setSexo(sexo);
            usuario.setSenha(senha);
            usuario.setAreacultural(areacultural);

            //CHAMA O MÉTODO DE CADASTRO DA CLASSE CadastroDAO
            CadastroDAO user = new CadastroDAO();
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

        // MÉTODO DE LIMPAR A TELA 
        public boolean limparTela() throws ClassNotFoundException {
        View.getTxtcpf().setText("");
        View.getTxtdata().setText("");
        View.getTxtdescricao().setText("");
        View.getTxtareacultural().setText("");
        View.getTxtsenha().setText("");
        View.getBtnmasculino().setAction(null);
        View.getBtnfeminino().setAction(null);
        View.getBtncoletivo().setAction(null);
        View.getBtnindividual().setAction(null);
        CadastroVIEW principal = new CadastroVIEW();
        principal.setVisible(true);
         return true;
        }
  
}
