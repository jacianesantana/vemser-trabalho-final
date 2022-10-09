package model;


import exception.LoginInvalidoException;
import exception.SenhaInvalidaException;
import service.Login;


abstract public class Usuario implements Login {
    private TipoUsuario tipoUsuario;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(TipoUsuario tipoUsuario,
                   String nome,
                   Endereco endereco,
                   String telefone,
                   String email,
                   String senha) {
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        try {
            validarSenhaNova(senha);
        } catch (SenhaInvalidaException e) {
            e.printStackTrace();
        }
        this.senha = senha;
    }

    public void validarSenhaNova(String senha) throws SenhaInvalidaException {
        int contNumero = 0;
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isAlphabetic(senha.charAt(i))) {
                contNumero++;
            }
        }
        if (contNumero <= 2) {
            throw new SenhaInvalidaException("");
        }

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "tipoUsuario=" + tipoUsuario +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public boolean validarEmail(String email) {

        if (email.equals(this.email)) {
            return true;
        } else {
            System.out.println("Email inválido, tente novamente");
            return false;
        }
    }

    @Override
    public boolean validarSenha(String senha) {
        if (senha.equals(this.senha)) {
            return true;
        } else {
            System.out.println("Senha inválida, tente novamente");
            return false;
        }
    }

    @Override
    public boolean login(String email, String senha) throws LoginInvalidoException {

        if (validarEmail(email) && validarSenha(senha)) {
            System.out.println("Login efetuado com sucesso");
            return true;
        } else {
            throw new LoginInvalidoException("Senha e email inválido");
        }
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
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
