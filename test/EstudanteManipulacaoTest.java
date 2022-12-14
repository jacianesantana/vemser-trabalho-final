import model.Endereco;
import model.Estudante;
import model.TipoUsuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.EstudanteManipulacao;

public class EstudanteManipulacaoTest {
        private EstudanteManipulacao estudanteManipulacao;
        @BeforeEach
        public void init() {
            estudanteManipulacao = new EstudanteManipulacao();
        }

        @Test
        public void deveTestarCadastrarEstudanteComSucesso(){
                Endereco endereco = new Endereco("Brasil", "SE", "Aracaju",
                        "49000-000", "Avenida Euclides", 321);
                Estudante estudante = new Estudante();
                estudante.setTipoUsuario(TipoUsuario.ESTUDANTE);
                estudante.setNome("jao");
                estudante.setEmail("jao@gmail.com");
                estudante.setTelefone("9 9999-9999");
                estudante.setCpf("999999999");
                estudante.setSenha("1234");
                estudante.setEndereco(endereco);

                boolean retorno = estudanteManipulacao.cadastrar(estudante);

                Assertions.assertTrue(retorno);
        }
        @Test
        public void deveTestarDeletarEstudanteComSucesso()  {

                Endereco enderecoEstudante = new Endereco("Brasil", "SE", "Aracaju",
                        "49000-000", "Avenida Euclides", 321);
                Estudante estudante = new Estudante(TipoUsuario.ESTUDANTE, "Jaciane", enderecoEstudante,
                        "79 9999-9999", "jaciane@gmail", "jaci2468", "012.345.678-90");
                estudanteManipulacao.cadastrar(estudante);
                final Integer INDEX = estudanteManipulacao.listar().indexOf(estudante);

                boolean retorno = estudanteManipulacao.deletar(INDEX);

                Assertions.assertTrue(retorno);
        }

}
