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

/*        //Empresas
        Endereco enderecoEmpresa1 = new Endereco("Brasil", "RS", "POA",
                "77777-777", "sem fim", 1234);
        Empresa empresa1 = new Empresa(TipoUsuario.EMPRESA, "DBC", enderecoEmpresa1,
                "51 98888-8888", "dbc@gmail.com", "123456", "111.111.111.0001-0");
        empresa1.imprimir();

        Vaga desenvolvedor = new Vaga("Estágio frontend", empresa1, "React", 2);
        Vaga QA = new Vaga("Senior QA", empresa1, "Automação de testes", 3);
        Vaga backend = new Vaga("Java", empresa1, "Java", 3);

        empresa1.cadastrarVaga(desenvolvedor);

        estudante1.concorrerVaga(desenvolvedor);
        estudante1.concorrerVaga(QA);
        estudante1.concorrerVaga(backend);

        System.out.println("---------------------- Vagas inscritas ----------------------------");
       estudante1.getVagasInscritas();

        empresa1.getVagas();
        System.out.println(empresa1.listarCandidatos(desenvolvedor));

        Scanner input = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("----------- Menu ------------------");
            System.out.println("1 - Fazer login.");
            System.out.println("2 - Cadastrar Usuário.");
            opcao = input.nextLine();

                switch (opcao) {
                    case "1": {
                        int opcaoLogin = 1;
//                System.out.println("----------------- Login --------------------");
//                System.out.println("Digite o email: ");
//                System.out.println("Digite a senha: ");
//                opcaoLogin = input.nextInt();
//                input.nextLine();

                        if (opcaoLogin == 1) {
                            String opcaoEmpresa;
                            System.out.println("-------------------- Logado com " + empresa1.getNome() + "------------------");
                            System.out.println(" Escolha uma opção: ");
                            System.out.println(" 1 - Cadastrar nova vaga; ");
                            System.out.println(" 2 - Listar vagas; ");
                            System.out.println(" 3 - Listar candidadtos por vaga; ");
                            System.out.println(" 4 - Editar vaga. ");
                            System.out.println(" 5 - Excluir vaga. ");
                            System.out.println(" 6 - Sair. ");
                            opcaoEmpresa = input.nextLine();


                            switch (opcaoEmpresa) {
                                case "1": {
                                    Vaga vaga = new Vaga();
                                    System.out.println("------------- Cadastro de Vaga ------------");
                                    System.out.println(" Titulo da vaga: ");
                                    vaga.setTitulo(input.nextLine());
                                    System.out.println(" Requisito: ");
                                    vaga.setRequisito(input.nextLine());
                                    System.out.println(" Quantidade: ");
                                    vaga.setQuantidade(input.nextInt());
                                    input.nextLine();
                                    empresa1.cadastrarVaga(vaga);
                                    System.out.println("------------- Lista de vagas cadastradas ------------");
                                    empresa1.getVagas();
                                    break;
                                }
                                case "2": {
                                    System.out.println("------------- Lista de vagas cadastradas ------------");
                                    empresa1.getVagas();
                                    break;
                                }
                                case "3": {
                                    //digite a vaga
                                    List<Vaga> cadidatosVaga = empresa1.getVagas().stream()
                                            .filter(vaga -> vaga.getTitulo().toLowerCase().contains("qa")).toList();
                                    System.out.println("Cadidatos para a vaga: " + cadidatosVaga.get(0).getCadidatos());
                                    break;
                                }
                                case "4": {
                                    empresa1.getVagas();
                                    System.out.println("Escolha a vaga que quer editar: ");
                                    int index = input.nextInt();
                                    input.nextLine();

                                    Vaga novaVaga = new Vaga();
                                    System.out.println(" Titulo da vaga: ");
                                    novaVaga.setTitulo(input.nextLine());
                                    System.out.println(" Requisito: ");
                                    novaVaga.setRequisito(input.nextLine());
                                    System.out.println(" Quantidade: ");
                                    novaVaga.setQuantidade(input.nextInt());
//                            empresa1.editarVaga(index, novaVaga);
                                    break;
                                }
                                case "5": {
                                    System.out.println("Escolha a vaga que deseja excluir: ");
                                    empresa1.getVagas();
                                    int id = input.nextInt();
//                            empresa1.removerVaga(id);
                                    break;
                                }
                                case "6": {
                                    break;
                                }
                                default: {
                                    System.err.println("2 Opa entrada inválida, digite o número da opção. ");
                                    break;
                                }
                            }
                        } else {
                            // Se ESTUDANTE
                            System.out.println("-------------------- Logado com " + estudante1.getNome() + " ------------------");
                            System.out.println(" Escolha uma opção: ");
                            System.out.println(" 1 - Cadastrar curriculo; ");
                            System.out.println(" 2 - Listar vagas; ");
                            System.out.println(" 3 - Listar vagas por empresa ou nome da vaga?; ");
                            System.out.println(" 4 - Configurações. ");
                            System.out.println(" 5 - Voltar ao Menu Principal. ");
                            System.out.println(" 6 - Sair. ");
                        }
                        break;
                    }
                    case "2": {
                        Usuario user = new Empresa(); // new Estudante();
                        System.out.println("----------------------Menu de cadastro ---------------------");
                        System.out.println("Tipo de usuário: 1- Empresa, 2- Estudante");
                        int opcaoTipo = input.nextInt();
                        input.nextLine();

                        //Se EMPRESA
                        System.out.println("Digite Nome: ");
                        user.setNome(input.nextLine());
                        System.out.println("Digite um email: ");
                        user.setEmail(input.nextLine());
                        System.out.println("Digite a senha: ");
                        String senha = input.nextLine();
                        System.out.println("Digite a senha novamente: ");
                        String senhaCopia = input.nextLine();
                        if (senhaCopia.equals(senha)) {
                            user.setSenha(input.nextLine());

                        } else {
                            System.err.println("Senhas não batem.");
                        }

                        //Se ESTUDANTE
                        //Usuario user = new Estudante();
                        break;
                    }
                    default: {
                        System.err.println("Opa entrada inválida, digite o número da opção. ");
                        break;
                    }

                }
        }while(true);*/
    }
}
