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
        if (vaga != null) {
            this.listaDeVagas.add(vaga);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Vaga> listar() {
        return listaDeVagas;
    }

    @Override
    public boolean atualizar(Integer index, Vaga vaga) {
<<<<<<< HEAD
        if (index != null && vaga != null) {
            Vaga vagaIndex = listaDeVagas.get(index);
            vagaIndex.setTitulo(vaga.getTitulo());
            vagaIndex.setRequisitos(vaga.getRequisitos());
            return true;
        } else {
            return false;
        }
=======
        Vaga vagaProcurada = listaDeVagas.get(index);

        vagaProcurada.setTitulo(vaga.getTitulo());
        vagaProcurada.setRequisitos(vaga.getRequisitos());


        vagaProcurada.setTitulo(vagaProcurada.getTitulo());
        vagaProcurada.setRequisitos(vagaProcurada.getRequisitos());

        return false;
>>>>>>> 10ffaa9d3a503994f260d6be910a9c51068aa921
    }

    @Override
    public boolean deletar(Integer index) {
        if (index != null) {
            this.listaDeVagas.remove(index.intValue());
            return true;
        } else {
            return false;
        }
    }
}
