import model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Estudantes
        Endereco enderecoEstudante1 = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
        Estudante estudante1 = new Estudante(TipoUsuario.ESTUDANTE, "Jaciane", enderecoEstudante1,
                "71 9999-9999", "jaciane@gmail", "24680", "012.345.678-90");

        Curriculo curriculo2 = new Curriculo();
        curriculo2.cadastrarCurriculo("Jaci","133333-90", "PUC", "Sistemas de Informação", 1,
                "Sem experiência", "QA");

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

        Vaga desenvolvedor = new Vaga("Estágio JAVA", empresa1.getNome(), "React");
        Vaga QA = new Vaga("senior qa", empresa1.getNome(), "QA");
        Vaga desenvolvedor2 = new Vaga("Javascript developer", empresa1.getNome(), "Javascript");

        empresa1.cadastrarVaga(desenvolvedor);
        empresa1.cadastrarVaga(QA);
        empresa1.cadastrarVaga(desenvolvedor2);

        desenvolvedor.getCandidatos().add(estudante1);
        desenvolvedor2.getCandidatos().add(estudante1);
        QA.getCandidatos().add(estudante1);
//        estudante1.concorrerVaga(desenvolvedor);
//        estudante1.concorrerVaga(QA);
//        estudante1.concorrerVaga(backend);
//
//       estudante1.getVagasInscritas();

//        empresa1.getVagas();
//        System.out.println(empresa1.listarCandidatos(desenvolvedor));

        System.out.println("====================== BEM VINDO ============================");
        System.out.println("||          Sistema de oportunidades em tecnologia          ||");
        System.out.println("=============================================================");
        Scanner input = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("1 - Fazer login.");
            System.out.println("2 - Cadastrar Usuário.");
            opcao = input.nextLine();

            switch (opcao) {
                    case "1": {
                        int opcaoLogin = 0;
                        System.out.println("----------------- Login --------------------");
                        System.out.println("Digite o email: ");
//                        String email = input.nextLine();
                        System.out.println("Digite a senha: ");
                        opcaoLogin = input.nextInt();
                        input.nextLine();

                        while(opcaoLogin == 4) {
                            String opcaoEmpresa;
                            System.out.println("-------------------- Logado com " + empresa1.getNome() + "------------------");
                            System.out.println(" Escolha uma opção: ");
                            System.out.println(" 1 - Criar nova vaga; ");
                            System.out.println(" 2 - Listar vagas; ");
                            System.out.println(" 3 - Listar candidadtos por vaga; ");
                            System.out.println(" 4 - Editar vaga. ");
                            System.out.println(" 5 - Excluir vaga. ");
                            System.out.println(" 6 - Configuração da conta. ");
                            System.out.println(" 6 - Sair. ");
                            System.out.println("----------------------------------------------------");
                            opcaoEmpresa = input.nextLine();


                            switch (opcaoEmpresa) {
                                case "1": {
                                    Vaga vaga = new Vaga();
                                    System.out.println("------------- Cadastro de Vaga ------------");
                                    System.out.println(" Titulo da vaga: ");
                                    vaga.setTitulo(input.nextLine());
                                    System.out.println(" Requisito: ");
                                    vaga.setRequisito(input.nextLine());
//                                    vaga.setNomeDaEmpresa();
                                    empresaManipulacao.cadastrarVaga(vaga);
                                    break;
                                }
                                case "2": {
                                    System.out.println("------------- Lista de vagas cadastradas ------------");
                                    empresaManipulacao.getVagas();
                                    break;
                                }
                                case "3": {
                                    System.out.println("Digite o nome da vaga: ");
                                    String opcaoVaga = input.nextLine();
                                    List<Vaga> cadidatosVaga = empresaManipulacao.getVagas().stream()
                                            .filter(vaga -> vaga.getTitulo().toLowerCase().contains(opcaoVaga)).toList();
                                    System.out.println("Cadidatos para a vaga: " + cadidatosVaga.get(0).getCandidatos());
                                    break;
                                }
                                case "4": {
                                    empresa1.getVagas();
                                    System.out.println("Escolha a vaga que quer editar: ");
                                    String index = input.nextLine();

                                    Vaga novaVaga = new Vaga();
                                    System.out.println(" Titulo da vaga: ");
                                    novaVaga.setTitulo(input.nextLine());
                                    System.out.println(" Requisito: ");
                                    novaVaga.setRequisito(input.nextLine());
//                                    System.out.println(" Quantidade: ");
//                                    novaVaga.setQuantidade(input.nextInt());
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
                                    System.out.println("-------------------- Menu de conta ------------------");
                                    System.out.println(" Escolha uma opção: ");
                                    System.out.println(" 1 - Editar conta; ");
                                    System.out.println(" 5 - Excluir conta. ");
                                    System.out.println(" 6 - Sair. ");
                                    System.out.println("----------------------------------------------------");
                                    break;
                                }
                                case "7": {
                                    opcaoLogin = 0;
                                    break;
                                }
                                default: {
                                    System.err.println("---------------------------------------------------");
                                    System.err.println("| Opa entrada inválida, digite o número da opção. |");
                                    System.err.println("---------------------------------------------------");
                                    break;
                                }
                            }
                        } while(opcaoLogin == 2) {
                            // Se ESTUDANTE
                            String opcaoEstudante;
                            System.out.println("-------------------- Logado com " + estudante1.getNome() + " ------------------");
                            System.out.println(" Escolha uma opção: ");
                            System.out.println(" 1 - Criar curriculo; ");
                            System.out.println(" 2 - Editar curriculo; ");
                            System.out.println(" 3 - Listar vagas por empresa ou nome da vaga?; ");
                            System.out.println(" 4 - Excluir curriculo. ");
                            System.out.println(" 5 - Configuração da conta. ");
                            System.out.println(" 6 - Sair. ");
                            System.out.println("----------------------------------------------------");
                            opcaoEstudante = input.nextLine();


                            switch (opcaoEstudante) {
                                case "1": {
                                    Curriculo curriculo = new Curriculo();
                                    System.out.println("------------- Cadastro de Vaga ------------");
                                    System.out.println("Nome: ");
                                    curriculo.setNomeDoEstudante(input.nextLine());
                                    System.out.println("Curso: ");
                                    curriculo.setCurso(input.nextLine());
                                    System.out.println("Universidade: ");
                                    curriculo.setUniversidade(input.nextLine());
                                    input.nextLine();
                                    System.out.println("Resumo Profissional: ");
                                    curriculo.setResumoProfissional(input.nextLine());
                                    input.nextLine();
                                    curriculoManipulacao.criar
                                    break;
                                }
                                case "2": {
                                    System.out.println("Editar curriculo: ");

                                    Curriculo novoCurriculo = new Curriculo();
                                    System.out.println("Nome: ");
                                    novoCurriculo.setNomeDoEstudante(input.nextLine());
                                    System.out.println("Curso: ");
                                    novoCurriculo.setCurso(input.nextLine());
                                    System.out.println("Universidade: ");
                                    novoCurriculo.setUniversidade(input.nextLine());
                                    System.out.println("Resumo Profissional: ");
                                    novoCurriculo.setResumoProfissional(input.nextLine());
                                    curriculoManipulacao.atualizarCurriculo(novoCurriculo);
                                    break;
                                }
                                case "3": {
                                    curriculoManipulacao.listar
                                    break;
                                }
                                case "4":{
                                    System.out.println("Deseja mesmo excluir o curriculo? ");
                                    System.out.println("Digite 1 para SIM;");
                                    System.out.println("Digite 2 para NÂO;");
                                    String opcaoExcluirCurriculo = input.nextLine();
                                    if(opcaoExcluirCurriculo.equals("1")){
                                        curriculoManipulacao.removerCurriculo();
                                        break;
                                    }else{
                                        break;
                                    }
                                }
                                case "5": {
                                    System.out.println("-------------------- Menu de conta ------------------");
                                    System.out.println(" Escolha uma opção: ");
                                    System.out.println(" 1 - Editar conta; ");
                                    System.out.println(" 5 - Excluir conta. ");
                                    System.out.println(" 6 - Sair. ");
                                    System.out.println("----------------------------------------------------");
                                    break;
                                }
                                case "6": {
                                    opcaoLogin = 0;
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("----------------------Menu de cadastro ---------------------");
                        System.out.println("Tipo de usuário: 1- Empresa, 2- Estudante");
                        String opcaoTipo = input.nextLine();
                        if(opcaoTipo.equals("1")){
                            Usuario user = new Empresa();
                            user.setTipoUsuario(TipoUsuario.EMPRESA);
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
                                empresaManipulacao.cadastrarEmpresa
                                System.out.println("Cadastrado com sucesso!!!");
                            } else {
                                System.err.println("Senhas não batem.");
                            }
                        }else{
                            Usuario user = new Estudante();
                           user.setTipoUsuario(TipoUsuario.ESTUDANTE);
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
                                estudanteManipulacao.cadastrar
                                System.out.println("Cadastrado com sucesso!!!");
                                break;
                            } else {
                                System.err.println("Senhas não batem.");
                            }
                        }
                        break;
                    }
                    default: {
                        System.err.println("---------------------------------------------------");
                        System.err.println("| Opa entrada inválida, digite o número da opção. |");
                        System.err.println("---------------------------------------------------");
                        break;
                    }
                }
        }while(true);
    }

}
