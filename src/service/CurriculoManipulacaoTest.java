package service;

import model.Curriculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CurriculoManipulacaoTest {
    private CurriculoManipulacao curriculoManipulacao;
    @BeforeEach
    public void init() {
        curriculoManipulacao = new CurriculoManipulacao();
    }

    @Test
    public void deveTestarCadastrarCurriculo(){
        Curriculo curriculoEstudante = new Curriculo("Antonio", "Univ", "Curso",
                1, "Sem experiência", "Dev Frontend Junior",
                Arrays.asList("Javascript", "HTML", "CSS"));

        boolean retorno = curriculoManipulacao.cadastrar(curriculoEstudante);;

        Assertions.assertTrue(retorno);
    }
    @Test
    public void deveTestarExcluirCurrilosComSucesso(){
        final Integer INDEX = 0;
        new Curriculo("Antonio", "Univ", "Curso",
                1, "Sem experiência", "Dev Frontend Junior",
                Arrays.asList("Javascript", "HTML", "CSS"));

//        boolean retorno = curriculoManipulacao.deletar(INDEX);

//        Assertions.assertTrue(retorno);
    }

}
