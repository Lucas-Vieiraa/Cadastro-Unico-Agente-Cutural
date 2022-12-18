/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;

import dao.DadosPessoaisDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.UsuarioModel;
import view.DadosPessoaisView;

/**
 *
 * @author lucia
 */
public class DadosPessoaisHelper {
    
    private final DadosPessoaisView view;
    SimpleDateFormat conversorData = new SimpleDateFormat("dd/MM/yyyy");

    public DadosPessoaisHelper(DadosPessoaisView view) {
        this.view = view;
    }
 
    UsuarioModel usuarioModel = new UsuarioModel();

    String cpf = usuarioModel.getCpf();
    String nome = usuarioModel.getNome();
    String descricao = usuarioModel.getDescricao();
    Date dataNascimento = usuarioModel.getDataNascimento();
    String areaCultural = usuarioModel.getAreaCultural();
    String tipoAgente = usuarioModel.getTipoAgente();
    String sexoAgente = usuarioModel.getSexo();
    
    DadosPessoaisDao dadosPessoaisDao = new DadosPessoaisDao();
}
