package model;

import java.util.ArrayList;
import java.util.List;

public class Estudante extends Usuario implements Impressao {
    private String cpf;
    private Curriculo curriculo;
    private List<Vaga> vagasInscritas = new ArrayList<>();

    public Estudante() {

    }

    public List<Vaga> getVagasInscritas() {
        vagasInscritas.stream()
        .forEach(vaga -> System.out.println(vaga.getTitulo()));

        return vagasInscritas;
    }

    public void setVagasInscritas(List<Vaga> vagasInscritas) {
        this.vagasInscritas = vagasInscritas;
    }

    public Estudante(TipoUsuario tipoUsuario, String nome, Endereco endereco, String telefone,
                     String email, String senha, String cpf) {
        super(tipoUsuario, nome, endereco, telefone, email, senha);
        this.cpf = cpf;
    }

    @Override
    public void imprimir() {
        System.out.println(getTipoUsuario() + ", Nome: " + getNome() + ", CPF: " + cpf + ", Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone() + ", " + getEndereco());
        System.out.println("Curriculo: " + curriculo);
    }

    public void cadastrarCurriculo(String nome, String universidade, String curso, int semestre,
                                   String resumoProfissional, String vagaInteresse) {
        curriculo = new Curriculo(nome, universidade, curso, semestre, resumoProfissional, vagaInteresse);
    }

    public boolean concorrerVaga(Vaga vaga){

        vaga.setCadidatos(this.getCurriculo());
        vagasInscritas.add(vaga);
        return true;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }
}
