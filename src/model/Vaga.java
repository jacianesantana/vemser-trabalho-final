package model;

import java.util.ArrayList;
import java.util.List;

public class Vaga {
    private String titulo;
    private String nomeDaEmpresa;
    private String requisito;
    private List<Estudante> candidatos = new ArrayList<>();

    public Vaga() {
    }

    public Vaga(String titulo, String nomeDaEmpresa, String requisito) {
        this.titulo = titulo;
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.requisito = requisito;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "titulo='" + titulo + '\'' +
                ", nomeDaEmpresa='" + nomeDaEmpresa + '\'' +
                ", requisito='" + requisito + '\'' +
                ", candidatos=" + candidatos +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public List<Estudante> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Estudante> candidatos) {
        this.candidatos = candidatos;
    }
}
