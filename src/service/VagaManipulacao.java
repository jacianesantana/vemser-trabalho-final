package service;

import model.Vaga;

import java.util.ArrayList;
import java.util.List;

public class VagaManipulacao implements CRUD<Vaga> {
    private List<Vaga> listaDeVagas;

    @Override
    public void cadastrar(Vaga vaga) {
        this.listaDeVagas = new ArrayList<>();
    }

    @Override
    public void listar() {
        for (int i = 0; i < listaDeVagas.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeVagas.get(i));
        }
    }

    @Override
    public void atualizar(Integer index, Vaga requisito) {
        Vaga vagaProcurada = listaDeVagas.get(index);
        vagaProcurada.setTitulo(vagaProcurada.getTitulo());
        vagaProcurada.setRequisitos(vagaProcurada.getRequisitos());
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeVagas.remove(index.intValue());
    }
}
