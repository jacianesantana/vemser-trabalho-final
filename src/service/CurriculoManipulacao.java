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
        if (curriculo != null) {
            this.listaDeCurriculos.add(curriculo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<Curriculo> listar() {
        return listaDeCurriculos;
    }

    @Override
    public boolean atualizar(Integer index, Curriculo curriculo) {
        if (index != null && curriculo != null) {
            Curriculo curriculoIndex = listaDeCurriculos.get(index);
            curriculoIndex.setNomeDoEstudante(curriculo.getNomeDoEstudante());
            curriculoIndex.setUniversidade(curriculo.getUniversidade());
            curriculoIndex.setCurso(curriculo.getCurso());
            curriculoIndex.setSemestre(curriculo.getSemestre());
            curriculoIndex.setResumoProfissional(curriculo.getResumoProfissional());
            curriculoIndex.setHabilidades(curriculo.getHabilidades());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deletar(Integer index) {
        if (index != null) {
            this.listaDeCurriculos.remove(index.intValue());
            return true;
        } else {
            return false;
        }
    }
}
