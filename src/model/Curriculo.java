package model;

import java.util.ArrayList;
import java.util.List;

public class Curriculo {
    private String nomeDoEstudante;
    private String cpf;
    private String universidade;
    private String curso;
    private int semestre;
    private String resumoProfissional;
    private String tituloVagaInteresse;

    private List<String> habilidades = new ArrayList<>();

    public Curriculo() {
    }


    public Curriculo(String nomeDoEstudante,
                     String cpf,
                     String universidade,
                     String curso,
                     int semestre,
                     String resumoProfissional,
                     String tituloVagaInteresse,
                     List<String> habilidades
                    ) {
        this.nomeDoEstudante = nomeDoEstudante;
        this.cpf = cpf;
        this.universidade = universidade;
        this.curso = curso;
        this.semestre = semestre;
        this.resumoProfissional = resumoProfissional;
        this.tituloVagaInteresse = tituloVagaInteresse;
        this.habilidades = habilidades;

    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nomeDoEstudante='" + nomeDoEstudante + '\'' +
                ", universidade='" + universidade + '\'' +
                ", curso='" + curso + '\'' +
                ", semestre=" + semestre +
                ", resumoProfissional='" + resumoProfissional + '\'' +
                ", tituloVagaInteresse='" + tituloVagaInteresse + '\'' +
                '}';
    }

    public void listarCurriculos() {

    }

    public void listarCurriculosPorVaga() {

    }

    public void listarCurriculosPorEmpresa() {

    }

    public String getNomeDoEstudante() {
        return nomeDoEstudante;
    }

    public void setNomeDoEstudante(String nomeDoEstudante) {
        this.nomeDoEstudante = nomeDoEstudante;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getResumoProfissional() {
        return resumoProfissional;
    }

    public void setResumoProfissional(String resumoProfissional) {
        this.resumoProfissional = resumoProfissional;
    }

    public String getTituloVagaInteresse() {
        return tituloVagaInteresse;
    }



    public void setTituloVagaInteresse(String tituloVagaInteresse) {
        this.tituloVagaInteresse = tituloVagaInteresse;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }
}
