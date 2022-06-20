/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author lucia
 */
public class UsuarioMODEL {
//  VARIAVEIS PARA MONTAR O MODELO  DE USUÁRIO 
    private String cpf;
    private String senha;
    private String nome;
    private String tipoagente;
    private Date datanascimento;
    private String sexo;
    private String areacultural;
    private String descricao;

    // CONTRUTOR DO MODELO PARA CADASTRO
    public UsuarioMODEL(String cpf, String senha, String nome, String tipoagente, String datanascimento, String sexo, String areacultural, String descricao) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.tipoagente = tipoagente;
        try {
            this.datanascimento = new SimpleDateFormat("dd/MM/yyyy").parse(datanascimento);
        } catch (ParseException ex) {
            Logger.getLogger(UsuarioMODEL.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.sexo = sexo;
        this.areacultural = areacultural;
        this.descricao = descricao;
    }

    public UsuarioMODEL(String cpf) {
        this.cpf = cpf;
    }
    


    // CONTRUTOR DO MODELO PARA LOGIN
    public UsuarioMODEL(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public UsuarioMODEL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoagente() {
        return tipoagente;
    }

    public void setTipoagente(String tipoagente) {
        this.tipoagente = tipoagente;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        try {
            this.datanascimento = new SimpleDateFormat("dd/MM/yyyy").parse(datanascimento);
        } catch (ParseException ex) {
            Logger.getLogger(UsuarioMODEL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAreacultural() {
        return areacultural;
    }

    public void setAreacultural(String areacultural) {
        this.areacultural = areacultural;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}


  