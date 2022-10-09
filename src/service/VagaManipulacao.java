package service;

import model.Vaga;

import java.util.ArrayList;
import java.util.List;

public class VagaManipulacao implements CRUD<Vaga> {
    private List<Vaga> listaDeVagas;

    public VagaManipulacao() {
        this.listaDeVagas = new ArrayList<>();
    }

    @Override
    public boolean cadastrar(Vaga vaga) {
        this.listaDeVagas.add(vaga);
        return false;
    }

    @Override
    public List<Vaga> listar() {
        return listaDeVagas;
    }

    @Override
    public boolean atualizar(Integer index, Vaga vaga) {
        Vaga vagaProcurada = listaDeVagas.get(index);

        vagaProcurada.setTitulo(vaga.getTitulo());
        vagaProcurada.setRequisitos(vaga.getRequisitos());


        vagaProcurada.setTitulo(vagaProcurada.getTitulo());
        vagaProcurada.setRequisitos(vagaProcurada.getRequisitos());

        return false;
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeVagas.remove(index.intValue());
    }
}
