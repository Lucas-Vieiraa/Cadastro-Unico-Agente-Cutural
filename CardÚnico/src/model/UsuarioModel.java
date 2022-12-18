package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioModel {
//  VARIAVEIS PARA MONTAR O MODELO  DE USUÁRIO 
    private String cpf;
    private String senha;
    private String nome;
    private String tipoAgente;
    private Date dataNascimento;
    private String sexo;
    private String areaCultural;
    private String descricao;

    // CONTRUTOR DO MODELO PARA CADASTRO
    public UsuarioModel(String cpf, String senha, String nome, String tipoagente, String datanascimento, String sexo, String areacultural, String descricao) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.tipoAgente = tipoagente;
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(datanascimento);
        } catch (ParseException ex) {
            Logger.getLogger(UsuarioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.sexo = sexo;
        this.areaCultural = areacultural;
        this.descricao = descricao;
    }
    
    public UsuarioModel(String cpf) {
        this.cpf = cpf;
    }
    
    // CONTRUTOR DO MODELO PARA LOGIN
    public UsuarioModel(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }
    // CONTRUTOR DO MODELO PARA LISTAR DADOS
    public UsuarioModel(String cpf, String nome, String tipoAgente, Date dataNascimento, String sexo, String areaCultural, String descricao) {
        this.cpf = cpf;
        this.nome = nome;
        this.tipoAgente = tipoAgente;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.areaCultural = areaCultural;
        this.descricao = descricao;
    }
       
    public UsuarioModel() {
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

    public String getTipoAgente() {
        return tipoAgente;
    }

    public void setTipoAgente(String tipoAgente) {
        this.tipoAgente = tipoAgente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDatanascimento(String datanascimento) {
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(datanascimento);
        } catch (ParseException ex) {
            Logger.getLogger(UsuarioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAreaCultural() {
        return areaCultural;
    }

    public void setAreaCultural(String areaCultural) {
        this.areaCultural = areaCultural;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}


  