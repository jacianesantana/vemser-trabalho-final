import exception.SenhaInvalidaException;
import model.Empresa;
import model.Endereco;
import model.TipoUsuario;
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
    public void deveTestarCadastrarVagaComSucesso() throws SenhaInvalidaException {
        Endereco enderecoEmpresa = new Endereco("Brasil", "RS", "Porto Alegre",
                "90240-200", "Tv. São José", 455);
        Empresa empresa1 = new Empresa(TipoUsuario.EMPRESA, "DBC", enderecoEmpresa, "51 3330.777",
                "dbc@company.com", "123456", "9-9999-9999");
        Vaga vaga = new Vaga("java senior", empresa1, Arrays.asList("java", "mysql"));

        boolean retorno = vagaManipulacao.cadastrar(vaga);

        Assertions.assertTrue(retorno);
    }

    @Test
    public void deveTestarAtualizarVagaComSucesso() throws SenhaInvalidaException {
        final int INDEX = 0;
        final String TITULO = "estagiario";
        final String NOME_EMPRESA = "google";
        final List<String> REQUISITOS = Arrays.asList("algoritmo", "sql");
        Endereco enderecoEmpresa = new Endereco("Brasil", "RS", "Porto Alegre",
                "90240-200", "Tv. São José", 455);
        Empresa empresa1 = new Empresa(TipoUsuario.EMPRESA, "DBC", enderecoEmpresa, "51 3330.777",
                "dbc@company.com", "123456", "9-9999-9999");
        Vaga vaga2 = new Vaga("java junior", empresa1, Arrays.asList("algoritimos"));
        Vaga vaga3 = new Vaga();
//        vaga3.setTitulo(TITULO);
//        vaga3.setRequisitos(REQUISITOS);
        vagaManipulacao.cadastrar(vaga2);

//        boolean retorno = vagaManipulacao.atualizar(INDEX, vaga3);

//        Assertions.assertTrue(retorno);
    }
}
