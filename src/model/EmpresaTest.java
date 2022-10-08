package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmpresaTest {

    private Empresa user;
    @BeforeEach
    public void init() {
        user = new Empresa();
    }

    @Test
    public void deveTestarCadastroDeVaga(){
        Vaga vaga = new Vaga();
        vaga.setTitulo("Java");
        vaga.setRequisito("Junior");

        boolean retorno = user.cadastrarVaga(vaga);

        Assertions.assertTrue(retorno);
    }
    @Test
    public void deveTestarListarCandidatosNaoRetornaNulo(){
        Vaga vaga = new Vaga("Java", user.getNome(),"Junior");
        Endereco enderecoEstudante1 = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
        Estudante estudante = new Estudante(TipoUsuario.ESTUDANTE, "Jaciane", enderecoEstudante1,
                "71 9999-9999", "jaciane@gmail", "24680", "012.345.678-90");


//        List<Curriculo> lista = user.(vaga);

//        Assertions.assertNotEquals(null, lista);
    }
}
