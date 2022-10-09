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
    public boolean cadastrar(Curriculo curriculo) {
        this.listaDeCurriculos.add(curriculo);
        return false;
    }

    @Override
    public List<Curriculo> listar() {
        return listaDeCurriculos;
    }

    @Override
    public boolean atualizar(Integer index, Curriculo curriculo) {
        Curriculo curriculoIndex = listaDeCurriculos.get(index);
        curriculoIndex.setNomeDoEstudante(curriculo.getNomeDoEstudante());
        curriculoIndex.setUniversidade(curriculo.getUniversidade());
        curriculoIndex.setCurso(curriculo.getCurso());
        curriculoIndex.setSemestre(curriculo.getSemestre());
        curriculoIndex.setResumoProfissional(curriculo.getResumoProfissional());
        //curriculoIndex.setTituloVagaInteresse(curriculo.getTituloVagaInteresse());
        curriculoIndex.setHabilidades(curriculo.getHabilidades());
        return false;
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeCurriculos.remove(index.intValue());
    }
}
