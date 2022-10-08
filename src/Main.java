import model.*;
import service.CurriculoManipulacao;
import service.EstudanteManipulacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import model.Endereco;
import model.Estudante;
import model.TipoUsuario;

public class Main {
    public static void main(String[] args) {
        //Estudantes
        EstudanteManipulacao estudanteManipulacao = new EstudanteManipulacao();

        Endereco enderecoEstudante0 = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
        Estudante estudante0 = new Estudante(TipoUsuario.ESTUDANTE, "Jaciane", enderecoEstudante0,
                "79 9999-9999", "jaciane@gmail", "jaci2468", "012.345.678-90");

        Endereco enderecoEstudante1 = new Endereco("Brasil", "PI", "Teresina",
                "41000-000", "Rua Teresina", 99);
        Estudante estudante1 = new Estudante(TipoUsuario.ESTUDANTE, "Alain", enderecoEstudante1,
                "71 9999-9999", "alain@gmail", "12345678", "099.999.999-90");

        Endereco enderecoEstudante2 = new Endereco("Brasil", "PR", "Pato Branco",
                "42000-000", "Avenida Euclides", 1010);
        Estudante estudante2 = new Estudante(TipoUsuario.ESTUDANTE, "Jhennyfer", enderecoEstudante2,
                "46 9999-9999", "jhennyfer@gmail", "654321", "022.222.222-20");

        Endereco enderecoEstudante3 = new Endereco("Brasil", "BA", "Salvador",
                "41180-000", "Avenida Silveira Martins", 115);
        Estudante estudante3 = new Estudante(TipoUsuario.ESTUDANTE, "Vitoria", enderecoEstudante3,
                "71 9999-9999", "vitoria@gmail", "vitoria123", "011.111.111-10");

        //Curriculos
        CurriculoManipulacao curriculoManipulacao = new CurriculoManipulacao();

        Curriculo curriculoEstudante0 = new Curriculo(estudante0.getNome(), "PUC", "SI",
                1, "Sem experiência", "Estágio QA",
                Arrays.asList("Testes", "Selenium", "Cypress"));
        estudante0.setCurriculo(curriculoEstudante0);

        Curriculo curriculoEstudante1 = new Curriculo(estudante1.getNome(), "Univ", "Curso",
                1, "Sem experiência", "Dev Backend Junior",
                Arrays.asList("POO", "Java", "Spring"));
        estudante1.setCurriculo(curriculoEstudante1);

        Curriculo curriculoEstudante2 = new Curriculo(estudante2.getNome(), "Univ", "Curso",
                1, "Sem experiência", "Dev Frontend Junior",
                Arrays.asList("Javascript", "HTML", "CSS"));
        estudante2.setCurriculo(curriculoEstudante2);

        // Testes de Estudantes e Curriculos
        estudanteManipulacao.cadastrar(estudante0);
        estudanteManipulacao.cadastrar(estudante1);
        estudanteManipulacao.cadastrar(estudante2);
        estudanteManipulacao.cadastrar(estudante3);
        estudanteManipulacao.listar();
        estudante0.setEmail("jaciane.santata@gamil.com");
        estudanteManipulacao.atualizar(0, estudante0);
        enderecoEstudante1.setRua("Rua Desembargador Pires");
        estudante1.setEndereco(enderecoEstudante1);
        estudanteManipulacao.atualizar(1, estudante1);
        estudanteManipulacao.deletar(3);
        estudanteManipulacao.listar();
        curriculoManipulacao.cadastrar(curriculoEstudante0);
        curriculoManipulacao.cadastrar(curriculoEstudante1);
        curriculoManipulacao.cadastrar(curriculoEstudante2);
        curriculoManipulacao.listar();


    }
}
