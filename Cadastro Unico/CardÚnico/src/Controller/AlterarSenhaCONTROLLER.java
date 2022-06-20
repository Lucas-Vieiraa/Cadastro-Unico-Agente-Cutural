/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AlterarSenhaHELPER;
import View.AlterarSenhaVIEW;

/**
 *
 * @author lucia
 */
public class AlterarSenhaCONTROLLER {

    private final AlterarSenhaVIEW View;
    private final AlterarSenhaHELPER Helper;
    
       public AlterarSenhaCONTROLLER(AlterarSenhaVIEW View){
        this.View = View;
       this.Helper = new AlterarSenhaHELPER(View);
    }
       
          public void AlterarSenha() {
        // CHAMA O MÉTODO DE ALTERAR SENHA  DA CLASSE LoginHELPER
        this.Helper.AlterarSenha();
    }
}
