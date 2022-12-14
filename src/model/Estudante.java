package model;

import java.util.ArrayList;
import java.util.List;

public class Estudante extends Usuario {
    private String cpf;
    private Curriculo curriculo;
    private List<Vaga> vagasInscritas = new ArrayList<>();


    public Estudante() {
    }

    public Estudante(TipoUsuario tipoUsuario,
                     String nome,
                     Endereco endereco,
                     String telefone,
                     String email,
                     String senha,
                     String cpf) {
        super(tipoUsuario, nome, endereco, telefone, email, senha);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "cpf='" + cpf + '\'' +
                ", curriculo=" + curriculo +
                '}';
    }

    public boolean candidatarVaga(Vaga vaga){
        if (vaga != null) {
            vaga.getCandidatos().add(this);
            vagasInscritas.add(vaga);
            return true;
        } else {
            return false;
        }
    }

    public List<Vaga> listaDeVagasInscritas(){
        return vagasInscritas;
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

    public List<Vaga> getVagasInscritas() {
        return vagasInscritas;
    }

    public void setVagasInscritas(List<Vaga> vagasInscritas) {
        this.vagasInscritas = vagasInscritas;
    }
}
