package model;

public class Curriculo {
    private String nome;
    private String universidade;
    private String curso;
    private int semestre;
    private String resumoProfissional;
    private String vagaInteresse;

    public Curriculo(String nome, String universidade, String curso, int semestre, String resumoProfissional,
            String vagaInteresse) {
        this.nome = nome;
        this.universidade = universidade;
        this.curso = curso;
        this.semestre = semestre;
        this.resumoProfissional = resumoProfissional;
        this.vagaInteresse = vagaInteresse;
    }

    public Curriculo() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curriculo{" + "Nome='" + nome +
                "', universidade='" + universidade + '\'' +
                ", curso='" + curso + '\'' +
                ", semestre=" + semestre +
                ", resumoProfissional='" + resumoProfissional + '\'' +
                ", vagaInteresse='" + vagaInteresse + '\'' +
                '}';
    }

    public void listarCurriculos() {

    }

    public void listarCurriculosPorVaga() {

    }

    public void listarCurriculosPorEmpresa() {

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

    public String getVagaInteresse() {
        return vagaInteresse;
    }

    public void setVagaInteresse(String vagaInteresse) {
        this.vagaInteresse = vagaInteresse;
    }
}
