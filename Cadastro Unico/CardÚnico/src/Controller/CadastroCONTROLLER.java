/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.CadastroHELPER;
import View.CadastroVIEW;
import java.sql.SQLException;


/**
 *
 * @author lucia
 */
public class CadastroCONTROLLER {

    private final CadastroVIEW View;
    private final CadastroHELPER Helper;
    
   
   

    public CadastroCONTROLLER(CadastroVIEW View) {
        this.View = View;
        this.Helper = new CadastroHELPER(View);
    }
    
    public void Cadastrar() throws ClassNotFoundException, SQLException{
      // CHAMA O MÉTODO DE CADASTRO DA CLASSE CadastroHELPER
       this.Helper.Cadastrar();

    }


}
