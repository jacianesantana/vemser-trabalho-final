import model.Curriculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CurriculoManipulacao;

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
                1, "Sem experiência",
                Arrays.asList("Javascript", "HTML", "CSS"));

        boolean retorno = curriculoManipulacao.cadastrar(curriculoEstudante);;

        Assertions.assertTrue(retorno);
    }
    @Test
    public void deveTestarExcluirCurrilosComSucesso(){
        Curriculo estudante = new Curriculo("Antonio", "Univ", "Curso",
                1, "Sem experiência",
                Arrays.asList("Javascript", "HTML", "CSS"));
        curriculoManipulacao.cadastrar(estudante);
        final Integer INDEX = curriculoManipulacao.listar().indexOf(estudante);

        boolean retorno = curriculoManipulacao.deletar(INDEX);

        Assertions.assertTrue(retorno);
    }

}
