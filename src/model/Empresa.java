package model;

import java.util.List;

public class Empresa extends Usuario implements Impressao {
    private String cnpj;
    private List<Vaga> vagas;

    public Empresa(TipoUsuario tipoUsuario, String nome, Endereco endereco, String telefone,
                   String email, String senha, String cnpj) {
        super(tipoUsuario, nome, endereco, telefone, email, senha);
        this.cnpj = cnpj;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Tel: " + getTelefone());
    }

    public boolean cadastrarVaga() {
        return false;
    }

    public void listarCurriculos() {

    }
}
