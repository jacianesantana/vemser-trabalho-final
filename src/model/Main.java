package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Estudantes
        Endereco enderecoEstudante1 = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
        Estudante estudante1 = new Estudante(TipoUsuario.ESTUDANTE, "Jaciane", enderecoEstudante1,
                "71 9999-9999", "jaciane@gmail", "24680", "012.345.678-90");
        estudante1.cadastrarCurriculo("PUC", "Sistemas de Informação", 1,
                "Sem experiência", "Dev Junior");
        estudante1.imprimir();
        System.out.println("__________");

/*        Endereco enderecoEstudante2 = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
        Estudante estudante2 = new Estudante(TipoUsuario.ESTUDANTE, "Alain", enderecoEstudante2,
                "71 9999-9999", "alain@gmail", "24680", "012.345.678-90",
                "PUC", "Sistemas de Informação", 1);
        estudante2.imprimir();
        System.out.println("__________");

        Endereco enderecoEstudante3 = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
        Estudante estudante3 = new Estudante(TipoUsuario.ESTUDANTE, "Jhennyfer", enderecoEstudante3,
                "71 9999-9999", "jhennyfer@gmail", "24680", "012.345.678-90",
                "PUC", "Sistemas de Informação", 1);
        estudante3.imprimir();
        System.out.println("__________");*/

        //Empresa
        Endereco enderecoEmpresa1 = new Endereco("Brasil", "RS", "POA",
                "77777-777", "sem fim", 1234);
        Empresa empresa1 = new Empresa(TipoUsuario.EMPRESA, "DBC", enderecoEmpresa1,
                "51 98888-8888", "dbc@gmail.com", "123456", "111.111.111.0001-0");
        empresa1.imprimir();

        Vaga desenvolvedor = new Vaga("Estágio frontend", empresa1, "React", 2);
        Vaga QA = new Vaga("Senior QA", empresa1, "Automação de testes", 3);

        estudante1.concorrerVaga(desenvolvedor);
        estudante1.concorrerVaga(QA);

        System.out.println("---------------------- Vagas inscritas ------------");
       estudante1.getVagasInscritas();
    }
}
