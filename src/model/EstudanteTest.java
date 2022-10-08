package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudanteTest {
        private Estudante user;
        @BeforeEach
        public void init() {
            user = new Estudante();
        }

        @Test
        public void deveTestarConcorrerVaga(){
            Vaga vaga = new Vaga();
            vaga.setTitulo("Java");
            vaga.setRequisito("Junior");
            vaga.setQuantidade(3);

            boolean retorno = user.concorrerVaga(vaga);

            Assertions.assertTrue(retorno);
        }

        @Test
        public void deveTestarCadastrarCurriculoComSucesso(){
            Curriculo curriculo = new Curriculo("Jaci", "PUC", "Sistemas de Informação", 1,
                    "Sem experiência", "Dev Junior");

//            boolean retorno = user.cadastrarCurriculo(curriculo);

//            Assertions.assertTrue(retorno);

        }

}
