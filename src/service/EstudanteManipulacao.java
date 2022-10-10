package service;

import exception.LoginInvalidoException;
import model.Empresa;
import model.Estudante;
import model.Vaga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EstudanteManipulacao implements CRUD<Estudante> {
    private List<Estudante> listaDeEstudantes;

    public EstudanteManipulacao() {
        this.listaDeEstudantes = new ArrayList<>();
    }

    @Override
    public boolean cadastrar(Estudante estudante) {
        if (estudante != null) {
            this.listaDeEstudantes.add(estudante);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Estudante> listar() {
        return listaDeEstudantes;
    }

    @Override
    public boolean atualizar(Integer index, Estudante estudante) {
        if (index != null && estudante != null) {
            Estudante estudanteIndex = listaDeEstudantes.get(index);
            estudanteIndex.setNome(estudante.getNome());
            estudanteIndex.setEndereco(estudante.getEndereco());
            estudanteIndex.setTelefone(estudante.getTelefone());
            estudanteIndex.setEmail(estudante.getEmail());
            estudanteIndex.setCpf(estudante.getCpf());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deletar(Integer index) {
        if (index != null) {
            this.listaDeEstudantes.remove(index.intValue());
            return true;
        } else {
            return false;
        }
    }
    public Estudante login(String email, String senha) throws LoginInvalidoException {
        Optional<Estudante> estudanteOptional = this.listar().stream()
                .filter(estudante -> estudante.getEmail().equals(email) && estudante.getSenha().equals(senha))
                .findFirst();
        if (estudanteOptional.isPresent()) {
            return estudanteOptional.get();
        } else {
            throw new LoginInvalidoException("senha e email inválido");
        }
    }
}
