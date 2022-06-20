package Controller;

import Controller.Helper.LoginHELPER;
import View.AlterarSenhaVIEW;
import View.LoginVIEW;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucia
 */
public class LoginCONTROLLER {

    private final LoginVIEW View;
    private final LoginHELPER Helper;

    public LoginCONTROLLER(LoginVIEW View) {
        this.View = View;
        this.Helper = new LoginHELPER(View);
    }
   
    public void Logar() throws ClassNotFoundException {
       // CHAMA O MÉTODO DE LOGAR DA CLASSE LoginHELPER
        this.Helper.Logar();
    }
    // Obs: Talvez Dê Erro Nesse Método 
 
}
