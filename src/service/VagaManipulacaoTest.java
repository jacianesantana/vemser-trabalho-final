package service;

import model.Vaga;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.VagaManipulacao;

import java.util.Arrays;
import java.util.List;

public class VagaManipulacaoTest {
    private VagaManipulacao vagaManipulacao;
    @BeforeEach
    public void init() {
        vagaManipulacao = new VagaManipulacao();
    }

    @Test
    public void deveTestarCadastrarVagaComSucesso(){
        Vaga vaga = new Vaga("java senior", "dbc", Arrays.asList("java", "mysql"));

        boolean retorno = vagaManipulacao.cadastrar(vaga);

        Assertions.assertTrue(retorno);
    }

    @Test
    public void deveTestarAtualizarVagaComSucesso(){
        final int INDEX = 0;
        final String TITULO = "estagiario";
        final String NOME_EMPRESA = "google";
        final List<String> REQUISITOS = Arrays.asList("algoritmo", "sql");
        Vaga vaga2 = new Vaga("java junior", "dbc", Arrays.asList("algoritimos"));
        Vaga vaga3 = new Vaga();
//        vaga3.setTitulo(TITULO);
//        vaga3.setRequisitos(REQUISITOS);
        vagaManipulacao.cadastrar(vaga2);

//        boolean retorno = vagaManipulacao.atualizar(INDEX, vaga3);

//        Assertions.assertTrue(retorno);
    }
}
