package service;

import model.Estudante;

import java.util.ArrayList;
import java.util.List;

public class EstudanteManipulacao implements CRUD<Estudante> {
    private List<Estudante> listaDeEstudantes;

    public EstudanteManipulacao() {
        this.listaDeEstudantes = new ArrayList<>();
    }

    @Override
    public boolean cadastrar(Estudante estudante) {
        this.listaDeEstudantes.add(estudante);
        return false;
    }

    @Override
    public List<Estudante> listar() {
        return listaDeEstudantes;
    }

    @Override
    public boolean atualizar(Integer index, Estudante estudante) {
        Estudante estudanteIndex = listaDeEstudantes.get(index);
        estudanteIndex.setNome(estudante.getNome());
        estudanteIndex.setEndereco(estudante.getEndereco());
        estudanteIndex.setTelefone(estudante.getTelefone());
        estudanteIndex.setEmail(estudante.getEmail());
        estudanteIndex.setCpf(estudante.getCpf());
        return false;
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeEstudantes.remove(index.intValue());
    }
}
