package controller;

import controller.helper.CadastroHelper;
import view.CadastroView;
import java.sql.SQLException;

public class CadastroController {

    private final CadastroView view;
    private final CadastroHelper helper;

    public CadastroController(CadastroView view) {
        this.view = view;
        this.helper = new CadastroHelper(view);
    }
    
    public void cadastrar() throws ClassNotFoundException, SQLException{
     // CHAMA O MÉTODO DE CADASTRO DA CLASSE CadastroHelper
    this.helper.cadastrar();
    }
}
