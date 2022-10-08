package service;

import model.Curriculo;

public interface CurriculoCRUD {
    Curriculo cadastrarCurriculo(String nomeDoEstudante, String cpf, String universidade, String curso,
                                 int semestre, String resumoProfissional, String tituloVagaInteresse);

    Curriculo atualizarCurriculo(Curriculo curriculo);

    void buscarCurriculo(String tituloVagaInteresse);

    void deletarCurriculo(String cpf);
}
