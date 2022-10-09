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
    public void listar() {
        for (int i = 0; i < listaDeVagas.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeVagas.get(i));
        }
    }

    @Override
    public boolean atualizar(Integer index, Vaga vaga) {
        Vaga vagaProcurada = listaDeVagas.get(index);
        vagaProcurada.setTitulo(vaga.getTitulo());
        vagaProcurada.setRequisitos(vaga.getRequisitos());

        return false;
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeVagas.remove(index.intValue());
    }
}
