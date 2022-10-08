package service;

import model.Curriculo;

import java.util.ArrayList;
import java.util.List;

public class CurriculoManipulacao implements CRUD<Curriculo> {
    private List<Curriculo> listaDeCurriculos;

    public CurriculoManipulacao() {
        this.listaDeCurriculos = new ArrayList<>();
    }

    @Override
    public void cadastrar(Curriculo curriculo) {
        this.listaDeCurriculos.add(curriculo);
    }

    @Override
    public void listar() {
        for (int i = 0; i < listaDeCurriculos.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeCurriculos.get(i));
        }
    }

    @Override
    public void atualizar(Integer index, Curriculo curriculo) {
        Curriculo curriculoIndex = listaDeCurriculos.get(index);
        curriculoIndex.setNomeDoEstudante(curriculo.getNomeDoEstudante());
        curriculoIndex.setCpf(curriculo.getCpf());
        curriculoIndex.setUniversidade(curriculo.getUniversidade());
        curriculoIndex.setCurso(curriculo.getCurso());
        curriculoIndex.setSemestre(curriculo.getSemestre());
        curriculoIndex.setResumoProfissional(curriculo.getResumoProfissional());
        curriculoIndex.setTituloVagaInteresse(curriculo.getTituloVagaInteresse());
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeCurriculos.remove(index.intValue());
    }
}
