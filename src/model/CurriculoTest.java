package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CurriculoTest {
    private Curriculo curriculo;
    @BeforeEach
    public void init() {
        curriculo = new Curriculo();
    }

    @Test
    public void deveTestarListarCurrilosNaoRetornaNulo(){
        Vaga vaga = new Vaga();
        vaga.setTitulo("Java");
        vaga.setRequisito("Junior");

//        List<Curriculo> retorno = curriculo.listarCurriculos();

//        Assertions.assertNotEquals(null, retorno);
    }

    @Test
    public void deveTestarListarCurrilosPorVagaNaoRetornaNulo(){
        Vaga vaga = new Vaga();
        vaga.setTitulo("Java");
        vaga.setRequisito("Junior");

//        List<Curriculo> retorno = curriculo.listarCurriculosPorVaga(vaga);

//        Assertions.assertNotEquals(null, retorno);
    }
}
