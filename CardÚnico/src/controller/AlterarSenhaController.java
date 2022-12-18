package controller;

import controller.helper.AlterarSenhaHelper;
import view.AlterarSenhaView;

public class AlterarSenhaController {

    private final AlterarSenhaView view;
    private final AlterarSenhaHelper helper;
    
    public AlterarSenhaController(AlterarSenhaView view){
    this.view = view;
    this.helper = new AlterarSenhaHelper(view);
    }
    
    public void AlterarSenha() throws ClassNotFoundException {
    // CHAMA O MÉTODO DE ALTERAR SENHA  DA CLASSE AlterarSenhaHelper
    this.helper.alterarSenha();
    }
}
