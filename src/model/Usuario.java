package model;

import java.util.List;

abstract public class Usuario {
    private TipoUsuario tipoUsuario;
    private String nome;
    private String identificacaoUsuario;
    private List<Endereco> endereco;
    private String telefone;
    private String email;
    private String senha;

    public void cadastrarUsuario(){
    }

    public Usuario() {
    }

    public Usuario(TipoUsuario tipoUsuario,
                   String nome,
                   String identificacaoUsuario,
                   List<Endereco> endereco,
                   String telefone,
                   String email,
                   String senha) {
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.identificacaoUsuario = identificacaoUsuario;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacaoUsuario() {
        return identificacaoUsuario;
    }

    public void setIdentificacaoUsuario(String identificacaoUsuario) {
        this.identificacaoUsuario = identificacaoUsuario;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
