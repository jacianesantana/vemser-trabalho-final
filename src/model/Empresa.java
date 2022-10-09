package model;

import exception.SenhaInvalidaException;

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
                   String cnpj) throws SenhaInvalidaException {
        super(tipoUsuario, nome, endereco, telefone, email, senha);
        this.cnpj = cnpj;
    }

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
