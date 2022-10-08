package service;

import model.Estudante;
import service.CRUD;

import java.util.ArrayList;
import java.util.List;

public class EstudanteManipulacao implements CRUD<Estudante> {
    private List<Estudante> listaDeEstudantes;

    public EstudanteManipulacao() {
        this.listaDeEstudantes = new ArrayList<>();
    }

    @Override
    public void cadastrar(Estudante estudante) {
        this.listaDeEstudantes.add(estudante);
    }

    @Override
    public void listar() {
        for (int i = 0; i < listaDeEstudantes.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeEstudantes.get(i));
        }
    }

    @Override
    public void atualizar(Integer index, Estudante estudante) {
        Estudante estudanteIndex = listaDeEstudantes.get(index);
        estudanteIndex.setNome(estudante.getNome());
        estudanteIndex.setEndereco(estudante.getEndereco());
        estudanteIndex.setTelefone(estudante.getTelefone());
        estudanteIndex.setEmail(estudante.getEmail());//não ta mudando nada
        estudanteIndex.setCpf(estudante.getCpf());//não ta mudando nada
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeEstudantes.remove(index.intValue());
    }
}
