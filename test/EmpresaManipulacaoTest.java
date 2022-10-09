import exception.SenhaInvalidaException;
import model.Empresa;
import model.Endereco;
import model.TipoUsuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.EmpresaManipulacao;

public class EmpresaManipulacaoTest {

    private EmpresaManipulacao empresaManipulacao;
    @BeforeEach
    public void init() {
        empresaManipulacao = new EmpresaManipulacao();
    }

    @Test
    public void deveTestarCadastrarEmpresaComSucesso(){
        Endereco endereco = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
        Empresa empresa = new Empresa();
        empresa.setTipoUsuario(TipoUsuario.EMPRESA);
        empresa.setNome("google");
        empresa.setEmail("google@gmail.com");
        empresa.setTelefone("9 9999-9999");
        empresa.setCnpj("999999999");
        empresa.setSenha("1234");
        empresa.setEndereco(endereco);

        boolean retorno = empresaManipulacao.cadastrar(empresa);

        Assertions.assertTrue(retorno);
    }
    @Test
    public void deveTestarDeletarEmpresaComSucesso() throws SenhaInvalidaException {
        Endereco enderecoEstudante0 = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
       Empresa empresa = new Empresa(TipoUsuario.EMPRESA, "DBC", enderecoEstudante0, "8888-8888", "dbc@company.com", "123456", "9-9999-9999");
       empresaManipulacao.cadastrar(empresa);
       final Integer INDEX = empresaManipulacao.listar().indexOf(empresa);

        boolean retorno = empresaManipulacao.deletar(INDEX);

        Assertions.assertTrue(retorno);
    }
}
