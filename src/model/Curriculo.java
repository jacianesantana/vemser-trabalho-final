package model;

import java.util.ArrayList;
import java.util.List;

public class Curriculo {
    private String nomeDoEstudante;
    private String universidade;
    private String curso;
    private int semestre;
    private String resumoProfissional;


    private List<String> habilidades = new ArrayList<>();

    public Curriculo() {
    }

    public Curriculo(String nomeDoEstudante,
                     String universidade,
                     String curso,
                     int semestre,
                     String resumoProfissional,
                     List<String> habilidades
                    ) {
        this.nomeDoEstudante = nomeDoEstudante;
        this.universidade = universidade;
        this.curso = curso;
        this.semestre = semestre;
        this.resumoProfissional = resumoProfissional;

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
                '}';
    }


    public String getNomeDoEstudante() {
        return nomeDoEstudante;
    }

    public void setNomeDoEstudante(String nomeDoEstudante) {
        this.nomeDoEstudante = nomeDoEstudante;
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




    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }
}
