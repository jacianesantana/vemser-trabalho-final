package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Usuario {

    private String cnpj;
    private List<Vaga> vagas = new ArrayList<>();

    public Empresa() {
    }

    public Empresa(TipoUsuario tipoUsuario,
                   String nome,
                   Endereco endereco,
                   String telefone,
                   String email,
                   String senha,
                   String cnpj) {
        super(tipoUsuario, nome, endereco, telefone, email, senha);
        this.cnpj = cnpj;
    }

<<<<<<< HEAD
=======

    public Empresa() {
    }

>>>>>>> 10ffaa9d3a503994f260d6be910a9c51068aa921
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }
}
