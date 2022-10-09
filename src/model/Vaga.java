package model;

import java.util.*;

public class Vaga {
    private String titulo;
    private String nomeDaEmpresa;
    private List<String> requisitos = new ArrayList<>();
    private List<Estudante> candidatos = new ArrayList<>();
    private StatusVaga statusVaga;

    public Vaga() {
    }

    public Vaga(String titulo, String nomeDaEmpresa, List<String> requisitos) {
        this.titulo = titulo;
        this.nomeDaEmpresa = nomeDaEmpresa;
        this.requisitos = requisitos;
        this.statusVaga = StatusVaga.ABERTO;
    }

    public Map<Estudante, Long> candidatoComMaisRequisitos() {
        HashMap<Estudante, Long> estudantesComQtdRequistos = new HashMap<>();
        candidatos.forEach(estudante -> {
            long count = estudante
                    .getCurriculo()
                    .getHabilidades()
                    .stream()
                    .filter(habilidade -> this.requisitos.contains(habilidade))
                    .count();
            estudantesComQtdRequistos.put(estudante, count);
        });
        return estudantesComQtdRequistos;
    }

    //UsuarioEmpresa digita nome candidato e recebe o cpf para fechar a vaga
    public String candidatoSelecionado(String candidatoSelecionado) {
        Optional<String> cpfCandidadoSelecionado = candidatos.stream()
                .filter(estudante -> estudante.getNome()
                        .equals(candidatoSelecionado))
                .map(Estudante::getCpf).findFirst();
        return cpfCandidadoSelecionado.get();
    }

    //usuarioEmpresa digita cpf e fecha a vaga
    public void fecharVaga(String cpfCandidatoSelecionado) {
        Optional<Estudante> estudanteSelecionado = candidatos.stream()
                .filter(estudante -> estudante.getCpf().equals(cpfCandidatoSelecionado))
                .findFirst();
        setStatusVaga(StatusVaga.FECHADO);
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "titulo='" + titulo + '\'' +
                ", nomeDaEmpresa='" + nomeDaEmpresa + '\'' +
                ", requisitos=" + requisitos +
                ", candidatos=" + candidatos +
                ", statusVaga=" + statusVaga +
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

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public List<Estudante> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Estudante> candidatos) {
        this.candidatos = candidatos;
    }

    public StatusVaga getStatusVaga() {
        return statusVaga;
    }

    public void setStatusVaga(StatusVaga statusVaga) {
        this.statusVaga = statusVaga;
    }
}
