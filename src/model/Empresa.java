package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa extends Usuario {
    private String cnpj;
    private List<Vaga> vagas = new ArrayList<>();

    public Empresa(TipoUsuario tipoUsuario, String nome, Endereco endereco, String telefone,
                   String email, String senha, String cnpj) {
        super(tipoUsuario, nome, endereco, telefone, email, senha);
        this.cnpj = cnpj;
    }

    public Empresa() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Vaga> getVagas() {
        vagas.stream()
        .forEach(vaga -> System.out.println(vaga.getTitulo()));
        return vagas;
    }
    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public boolean cadastrarVaga(Vaga vaga) {
        if(vaga != null){
            this.vagas.add(vaga);
            return true;
        }else{
            return false;
        }
    }

/*    public List<Curriculo> listarCandidatos(Vaga vaga){
       return vaga.getCandidatos();
    }*/

}
