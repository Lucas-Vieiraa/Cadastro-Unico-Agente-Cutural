package controller;

import controller.helper.LoginHelper;
import view.LoginView;

public class LoginController {

    private final LoginView view;
    private final LoginHelper helper;

    public LoginController(LoginView view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
   
    public void logar() throws ClassNotFoundException {
       // CHAMA O MÉTODO DE LOGAR DA CLASSE LoginHelper
        this.helper.logar();
    }
}
