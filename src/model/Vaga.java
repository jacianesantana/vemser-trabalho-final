package model;

import java.util.*;

public class Vaga {
    private String titulo;

    private Empresa empresa;
    private List<String> requisitos = new ArrayList<>();
    private List<Estudante> candidatos = new ArrayList<>();
    private StatusVaga statusvaga;

    public Vaga() {
    }

    public Vaga(String titulo, Empresa empresa, List<String> requisitos) {
        this.titulo = titulo;
        this.empresa = empresa;
        this.requisitos = requisitos;
        this.statusvaga = statusvaga;
        this.statusvaga = StatusVaga.ABERTO;
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
        setStatusvaga(StatusVaga.FECHADO);
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "titulo='" + titulo + '\'' +
                ", empresa=" + empresa +
                ", requisitos=" + requisitos +
                ", candidatos=" + candidatos +
                ", statusvaga=" + statusvaga +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public StatusVaga getStatusvaga() {
        return statusvaga;
    }

    public void setStatusvaga(StatusVaga statusvaga) {
        this.statusvaga = statusvaga;
    }

    public List<Estudante> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Estudante> candidatos) {
        this.candidatos = candidatos;
    }
}
