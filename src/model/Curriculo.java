package model;

import service.CurriculoCRUD;

import java.util.List;

public class Curriculo implements CurriculoCRUD {
    private String nomeDoEstudante;
    private String cpf;
    private String universidade;
    private String curso;
    private int semestre;
    private String resumoProfissional;
    private String tituloVagaInteresse;

    public Curriculo() {
    }

    public Curriculo(String nomeDoEstudante,
                     String cpf,
                     String universidade,
                     String curso,
                     int semestre,
                     String resumoProfissional,
                     String tituloVagaInteresse) {
        this.nomeDoEstudante = nomeDoEstudante;
        this.cpf = cpf;
        this.universidade = universidade;
        this.curso = curso;
        this.semestre = semestre;
        this.resumoProfissional = resumoProfissional;
        this.tituloVagaInteresse = tituloVagaInteresse;
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

    @Override
    public Curriculo cadastrarCurriculo(String nomeDoEstudante, String cpf, String universidade, String curso,
                                        int semestre, String resumoProfissional, String tituloVagaInteresse) {
        Curriculo curriculo = new Curriculo(nomeDoEstudante, cpf, universidade, curso, semestre,
                resumoProfissional, tituloVagaInteresse);
        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.curriculos.add(curriculo);
        return curriculo;
    }

    public Curriculo atualizarCurriculo(Curriculo curriculo) {
        if (curriculo.getCpf().equals(this.cpf)) {
            this.setNomeDoEstudante(curriculo.getNomeDoEstudante());
            this.setUniversidade(curriculo.getUniversidade());
            this.setCurso(curriculo.getCurso());
            this.setSemestre(curriculo.getSemestre());
            this.setResumoProfissional(curriculo.getResumoProfissional());
            this.setTituloVagaInteresse(curriculo.getTituloVagaInteresse());
            return curriculo;
        }
        throw new RuntimeException("Usuário não autorizado"); //tratar exception
    }

    public void buscarCurriculo(String tituloVagaInteresse) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        List<Curriculo> curriculosComTituloVagaInteresse = bancoDeDados.curriculos.stream()
                .filter(c -> c.getTituloVagaInteresse().equals(tituloVagaInteresse))
                .toList();
        if (curriculosComTituloVagaInteresse.isEmpty()) {
            System.out.println("Nenhum currículo encontrado");
        }
        curriculosComTituloVagaInteresse.forEach(System.out::println);
    }

    public void deletarCurriculo(String cpf) {
        if (cpf.equals(this.cpf)) {
            BancoDeDados bancoDeDados = new BancoDeDados();
            int curriculoIndex = bancoDeDados.curriculos.stream()
                    .map(curriculo -> curriculo.cpf)
                    .toList()
                    .indexOf(cpf);
            bancoDeDados.curriculos.remove(curriculoIndex);
            System.out.println("Currículo removido");
        }
        System.out.println("Nenhum currículo encontrado");
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
}
