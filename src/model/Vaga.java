package model;

import java.util.*;

public class Vaga {
    private String titulo;
    private Estudante estudanteSelecionado;
    private Empresa empresa;
    private List<String> requisitos = new ArrayList<>();
    private List<Estudante> candidatos = new ArrayList<>();
    private StatusVaga statusVaga;

    public Vaga() {
    }

    public Vaga(String titulo, Empresa empresa, List<String> requisitos) {
        this.titulo = titulo;
        this.empresa = empresa;
        this.requisitos = requisitos;
        this.statusVaga = StatusVaga.ABERTO;
    }
    public Map<Estudante, Long> candidatoComMaisRequisitos() {
        HashMap<Estudante, Long> estudantesComQtdRequistos = new HashMap<>();
        candidatos.forEach(estudante -> {
            if (estudante.getCurriculo() != null) {
                long count = estudante
                        .getCurriculo()
                        .getHabilidades()
                        .stream()
                        .filter(habilidade -> this.requisitos.contains(habilidade))
                        .count();
                estudantesComQtdRequistos.put(estudante, count);
            }
        });
        return estudantesComQtdRequistos;
    }
    public void fecharVaga(String cpfCandidatoSelecionado) {
        Optional<Estudante> estudanteSelecionado = candidatos.stream()
                .filter(estudante -> estudante.getCpf().equals(cpfCandidatoSelecionado))
                .findFirst();
        if (estudanteSelecionado.isPresent()) {
            setStatusVaga(StatusVaga.FECHADO);
            this.estudanteSelecionado = estudanteSelecionado.get();
            System.out.println("Vaga " + this.titulo + " Fechada para o candidato " + estudanteSelecionado.get().getNome());
        }
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "titulo='" + titulo + '\'' +
                ", empresa='" + empresa + '\'' +
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

    public List<Estudante> getCandidatos() {
        return candidatos;
    }

    public String candidatoSelecionado(String candidatoSelecionado) {
        Optional<String> cpfCandidadoSelecionado = candidatos.stream()
                .filter(estudante -> estudante.getNome()
                        .equals(candidatoSelecionado))
                .map(Estudante::getCpf).findFirst();
        return cpfCandidadoSelecionado.get();
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
