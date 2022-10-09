import exception.LoginInvalidoException;
import model.*;
import service.CurriculoManipulacao;
import service.EmpresaManipulacao;
import service.EstudanteManipulacao;
import service.VagaManipulacao;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LoginInvalidoException {
        //Estudantes
        EstudanteManipulacao estudanteManipulacao = new EstudanteManipulacao();

        Endereco enderecoEstudante0 = new Endereco("Brasil", "SE", "Aracaju",
                "49000-000", "Avenida Euclides", 321);
        Estudante estudante0 = new Estudante(TipoUsuario.ESTUDANTE, "Jaciane", enderecoEstudante0,
                "79 9999-9999", "jaciane@gmail", "jaci2468", "012.345.678-90");
        estudanteManipulacao.cadastrar(estudante0);

        Endereco enderecoEstudante1 = new Endereco("Brasil", "PI", "Teresina",
                "41000-000", "Rua Teresina", 99);
        Estudante estudante1 = new Estudante(TipoUsuario.ESTUDANTE, "Alain", enderecoEstudante1,
                "71 9999-9999", "alain@gmail", "12345678", "099.999.999-90");
        estudanteManipulacao.cadastrar(estudante1);

        Endereco enderecoEstudante2 = new Endereco("Brasil", "PR", "Pato Branco",
                "42000-000", "Avenida Euclides", 1010);
        Estudante estudante2 = new Estudante(TipoUsuario.ESTUDANTE, "Jhennyfer", enderecoEstudante2,
                "46 9999-9999", "jhennyfer@gmail", "654321", "022.222.222-20");
        estudanteManipulacao.cadastrar(estudante2);

        Endereco enderecoEstudante3 = new Endereco("Brasil", "BA", "Salvador",
                "41180-000", "Avenida Silveira Martins", 115);
        Estudante estudante3 = new Estudante(TipoUsuario.ESTUDANTE, "Vitoria", enderecoEstudante3,
                "71 9999-9999", "vitoria@gmail", "vitoria123", "011.111.111-10");
        estudanteManipulacao.cadastrar(estudante3);

        //Curriculos
        CurriculoManipulacao curriculoManipulacao = new CurriculoManipulacao();

        Curriculo curriculoEstudante0 = new Curriculo(estudante0.getNome(), "PUC", "SI",
                1, "Sem experiência", Arrays.asList("Testes", "Selenium", "Cypress"));
        curriculoEstudante0.setHabilidades(List.of("algoritmo"));
        estudante0.setCurriculo(curriculoEstudante0);
        curriculoManipulacao.cadastrar(curriculoEstudante0);

        Curriculo curriculoEstudante1 = new Curriculo(estudante1.getNome(), "Univ", "Curso",
                1, "Sem experiência", Arrays.asList("POO", "Java", "Spring", "mysql"));
        curriculoEstudante1.setHabilidades(List.of("java"));
        estudante1.setCurriculo(curriculoEstudante1);
        curriculoManipulacao.cadastrar(curriculoEstudante1);

        Curriculo curriculoEstudante2 = new Curriculo(estudante2.getNome(), "Univ", "Curso",
                1, "Sem experiência", Arrays.asList("Javascript", "HTML", "CSS"));
        curriculoEstudante2.setHabilidades(List.of("java", "mysql"));
        estudante2.setCurriculo(curriculoEstudante2);
        curriculoManipulacao.cadastrar(curriculoEstudante2);

        //Empresas
        EmpresaManipulacao empresaManipulacao = new EmpresaManipulacao();

        Endereco enderecoEmpresa1 = new Endereco("Brasil", "RS", "Porto Alegre",
                "90000-000", "Instituto Caldeira", 1010);
        Empresa empresa1 = new Empresa(TipoUsuario.EMPRESA, "DBC", enderecoEmpresa1, "8888-8888",
                "dbc@company.com", "dbc123456", "011.999.999.0001-00");
        empresaManipulacao.cadastrar(empresa1);

        Endereco enderecoEmpresa2 = new Endereco("Brasil", "RS", "Porto Alegre",
                "90000-000", "Avenida Carlos Gomes", 1010);
        Empresa empresa2 = new Empresa(TipoUsuario.EMPRESA, "CWI", enderecoEmpresa2, "8888-8888",
                "cwi@com", "cwi123456", "011.999.999.0001-00");
        empresaManipulacao.cadastrar(empresa2);

        Endereco enderecoEmpresa3 = new Endereco("Brasil", "RS", "Porto Alegre",
                "2350-260", "TV Sao Joao", 23);
        Empresa empresa3 = new Empresa(TipoUsuario.EMPRESA, "Tech", enderecoEmpresa3, "51 1230.1050",
                "tech@company.com", "213890", "2-2222-2222");
        empresaManipulacao.cadastrar(empresa3);

        Endereco enderecoEmpresa4 = new Endereco("Brasil", "RS", "Porto Alegre",
                "2350-260", "AV Brasil", 45);
        Empresa empresa4 = new Empresa(TipoUsuario.EMPRESA, "System", enderecoEmpresa4, "51 1098.1200",
                "ace@company.com", "09874", "3-3333-3333");
        empresaManipulacao.cadastrar(empresa4);
<<<<<<< HEAD
=======

>>>>>>> 10ffaa9d3a503994f260d6be910a9c51068aa921

        // Vagas
        VagaManipulacao vagaManipulacao = new VagaManipulacao();

        Vaga vaga1 = new Vaga("java senior", empresa1, List.of("java", "mysql"));
        vagaManipulacao.cadastrar(vaga1);
        estudante0.candidatarVaga(vaga1);
        estudante1.candidatarVaga(vaga1);

        Vaga vaga2 = new Vaga("java junior", empresa2, List.of("algoritimos"));
        vagaManipulacao.cadastrar(vaga2);
<<<<<<< HEAD
        estudante3.candidatarVaga(vaga2);
        
        vaga1.candidatoComMaisRequisitos();
        vaga1.candidatoSelecionado(estudante1.getNome());
=======
        estudante3.candidatarvaga(vaga2);
>>>>>>> 10ffaa9d3a503994f260d6be910a9c51068aa921


        Vaga vaga3 = new Vaga("qa senior", empresa3, List.of("qa", "selenium"));
        vagaManipulacao.cadastrar(vaga3);

        Vaga vaga4 = new Vaga("frontend pleno", empresa4, List.of("javascript", "react"));
        vagaManipulacao.cadastrar(vaga4);

        vaga1.setRequisitos(List.of("java", "algoritmo"));
        vaga1.candidatoComMaisRequisitos();
        //pegar cpf do metodo candidado selecionado
        vaga1.candidatoSelecionado(estudante1.getNome());
        //fechar vaga com o cpf
        vaga1.fecharVaga(vaga1.candidatoSelecionado(estudante1.getNome()));


        //  Estudante
        estudante1.login("jaciane@gmail", "jaci2468");
        //estudante candidatar vaga
        estudante1.candidatarvaga(vaga1);
        //pesquisando lista de vagas inscritas
        estudante1.listaDeVagasInscritas();

        empresa1.login("dbc@company.com", "123456");


        // MENU INTERATIVO
        System.out.println("====================== BEM VINDO ============================");
        System.out.println("||          Sistema de oportunidades em tecnologia          ||");
        System.out.println("=============================================================");
        Scanner input = new Scanner(System.in);
        String opcao;

        boolean rodar = true;
        do {
            try {
                System.out.println("1 - Fazer login.");
                System.out.println("2 - Cadastrar Usuário.");
                System.out.println("3 - Sair.");
                opcao = input.nextLine();

                switch (opcao) {
                    case "1": {
                        int opcaoLogin = 0;
                        Usuario usuarioLogado;
                        //logar com empresa ou estudante?
                        System.out.println("----------------- Login --------------------");
                        System.out.println("Digite 1 para Empresa ou digite 2 para Estudante: ");
                        String opcaoTipoLogin = input.nextLine();
                        System.out.println("Digite o email: ");
                        String email = input.nextLine();
                        System.out.println("Digite a senha: ");
                        String senha = input.nextLine();
                        if (opcaoTipoLogin.equals("1")) {
                            usuarioLogado = contaLogin(TipoUsuario.EMPRESA, email, senha);
                        } else if (opcaoTipoLogin.equals("2")) {
                            usuarioLogado = contaLogin(TipoUsuario.EMPRESA, email, senha);
                        } else {
                            System.err.println("Erro ao fazer login.");
                            break;
                        }

                        opcaoLogin = input.nextInt();
                        input.nextLine();

                        while (opcaoLogin == 4) {
                            String opcaoEmpresa;
                            System.out.println("-------------------- Logado ------------------");
                            System.out.println(" Escolha uma opção: ");
                            System.out.println(" 1 - Criar nova vaga; ");
                            System.out.println(" 2 - Listar vagas; ");
                            System.out.println(" 3 -  ");
                            System.out.println(" 4 - Editar vaga. ");
                            System.out.println(" 5 - Excluir vaga. ");
                            System.out.println(" 6 - Configuração da conta. ");
                            System.out.println(" 7 - Sair. ");
                            System.out.println("----------------------------------------------------");
                            opcaoEmpresa = input.nextLine();


                            switch (opcaoEmpresa) {
                                case "1": {
                                    Vaga vaga = new Vaga();
                                    System.out.println("------------- Cadastro de Vaga ------------");
                                    System.out.println(" Titulo da vaga: ");
                                    vaga.setTitulo(input.nextLine());
                                    System.out.println(" Digite o requisito 1: ");
                                    String requisito1 = input.nextLine();
                                    System.out.println(" Digite o requisito 2: ");
                                    String requisito2 = input.nextLine();
                                    vaga.getRequisitos().add(requisito1);
                                    vaga.getRequisitos().add(requisito2);
                                    vagaManipulacao.cadastrar(vaga);
                                    break;
                                }
                                case "2": {
                                    System.out.println("------------- Lista de vagas cadastradas ------------");
                                    vagaManipulacao.listar();
                                    break;
                                }
                                case "3": {
                                    break;
                                }
                                case "4": {
                                    vagaManipulacao.listar();
                                    System.out.println("Escolha a vaga que quer editar: ");
                                    Integer index = input.nextInt();
                                    input.nextLine();
                                    Vaga novaVaga = new Vaga();
                                    System.out.println(" Titulo da vaga: ");
                                    novaVaga.setTitulo(input.nextLine());
                                    System.out.println("Digite o requisito 1: ");
                                    String requisito1 = input.nextLine();
                                    novaVaga.getRequisitos().add(requisito1);
                                    System.out.println("Digite o requisito 2: ");
                                    String requisito2 = input.nextLine();
                                    novaVaga.getRequisitos().add(requisito2);
                                    vagaManipulacao.atualizar(index, novaVaga);
                                    System.out.println("Vaga de id=" + index + " atualizada com sucesso");
                                    break;
                                }
                                case "5": {
                                    vagaManipulacao.listar();
                                    System.out.println("Digite o número da vaga que deseja excluir: ");
                                    int id = input.nextInt();
                                    input.nextLine();
                                    vagaManipulacao.deletar(id);
                                    System.out.println("Vaga de id=" + id + " deletada com sucesso");
                                    break;
                                }
                                case "6": {
                                    System.out.println("-------------------- Menu de conta ------------------");
                                    System.out.println(" Escolha uma opção: ");
                                    System.out.println(" 1 - Editar conta; ");
                                    System.out.println(" 2 - Excluir conta. ");
                                    System.out.println(" 3 - Sair. ");
                                    System.out.println("----------------------------------------------------");
                                    String opcaoMenuConta = input.nextLine();
                                    switch (opcaoMenuConta) {
                                        case "1": {
                                            Usuario user = new Empresa();
                                            user.setTipoUsuario(TipoUsuario.EMPRESA);
                                            System.out.println("Digite Nome: ");
                                            user.setNome(input.nextLine());
                                            System.out.println("Digite um telefone: ");
                                            user.setEmail(input.nextLine());
                                            System.out.println("Digite um email: ");
                                            user.setEmail(input.nextLine());
                                            user.setEndereco(menuCadastroEndereço());
                                            System.out.println("Digite a senha: ");

                                            String senha2 = input.nextLine();

                                            System.out.println("Digite a senha novamente: ");
                                            String senhaCopia = input.nextLine();
                                            if (senhaCopia.equals(senha2)) {
                                                user.setSenha(input.nextLine());
//                                            empresaManipulacao.atualizar(index, user);
                                                System.out.println("Atualizado com sucesso!!!");
                                                break;
                                            } else {
                                                System.err.println("Senhas não batem.");
                                            }
                                            break;
                                        }
                                        case "2": {
//                                        empresaManipulacao.deletar(index);
                                            break;
                                        }
                                        case "3": {
                                            break;
                                        }
                                        default: {
                                            erroOpcao();
                                            break;
                                        }

                                    }
                                    break;
                                }
                                case "7": {
                                    opcaoLogin = 0;
                                    break;
                                }
                                default: {
                                    erroOpcao();
                                    break;
                                }
                            }
                        }
                        while (opcaoLogin == 2) {
                            // Se ESTUDANTE
                            String opcaoEstudante;
                            System.out.println("-------------------- Logado ------------------");
                            System.out.println(" Escolha uma opção: ");
                            System.out.println(" 1 - Criar curriculo; ");
                            System.out.println(" 2 - Editar curriculo; ");
                            System.out.println(" 3 - Listar curriculos; ");
                            System.out.println(" 4 - Excluir curriculo. ");
                            System.out.println(" 5 - Configuração da conta. ");
                            System.out.println(" 6 - Sair. ");
                            System.out.println("----------------------------------------------------");
                            opcaoEstudante = input.nextLine();


                            switch (opcaoEstudante) {
                                case "1": {
                                    Curriculo curriculo = new Curriculo();
                                    System.out.println("------------- Cadastro de Curriculo ------------");
                                    System.out.println("Nome Estudante: ");
                                    curriculo.setNomeDoEstudante(input.nextLine());
                                    System.out.println("Curso: ");
                                    curriculo.setCurso(input.nextLine());
                                    System.out.println("Universidade: ");
                                    curriculo.setUniversidade(input.nextLine());
                                    input.nextLine();
                                    System.out.println("Resumo Profissional: ");
                                    curriculo.setResumoProfissional(input.nextLine());
                                    input.nextLine();
                                    curriculoManipulacao.cadastrar(curriculo);
                                    break;
                                }
                                case "2": {
                                    curriculoManipulacao.listar();
                                    System.out.println("Digite o numero do curriculo que deseja editar: ");
                                    Integer index = input.nextInt();
                                    input.nextLine();
                                    Curriculo novoCurriculo = new Curriculo();
                                    System.out.println("Nome Estudante: ");
                                    novoCurriculo.setNomeDoEstudante(input.nextLine());
                                    System.out.println("Universidade: ");
                                    novoCurriculo.setUniversidade(input.nextLine());
                                    System.out.println("Curso: ");
                                    novoCurriculo.setCurso(input.nextLine());
                                    System.out.println("Digite o numero do Semestre: ");
                                    novoCurriculo.setSemestre(input.nextInt());
                                    input.nextLine();
                                    System.out.println("Resumo Profissional: ");
                                    novoCurriculo.setResumoProfissional(input.nextLine());
                                    System.out.println("Vaga de interesse: ");
                                    // novoCurriculo.setTituloVagaInteresse(input.nextLine());
                                    curriculoManipulacao.atualizar(index, novoCurriculo);
                                    break;
                                }
                                case "3": {
                                    curriculoManipulacao.listar();
                                    break;
                                }
                                case "4": {
                                    curriculoManipulacao.listar();
                                    System.out.println("Digite o numero do curriculo que deseja excluir: ");
                                    Integer opcaoDeletarCurriculo = input.nextInt();
                                    input.nextLine();
                                    System.out.println("Deseja mesmo excluir o curriculo? ");
                                    System.out.println("Digite 1 para SIM;");
                                    System.out.println("Digite 2 para NÂO;");
                                    String opcaoExcluirCurriculo = input.nextLine();
                                    if (opcaoExcluirCurriculo.equals("1")) {
                                        curriculoManipulacao.deletar(opcaoDeletarCurriculo);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                case "5": {
                                    System.out.println("-------------------- Menu de conta ------------------");
                                    System.out.println(" Escolha uma opção: ");
                                    System.out.println(" 1 - Editar conta; ");
                                    System.out.println(" 2 - Excluir conta. ");
                                    System.out.println(" 6 - Sair. ");
                                    System.out.println("----------------------------------------------------");
                                    String opcaoMenuConta = input.nextLine();
                                    switch (opcaoMenuConta) {
                                        case "1": {
                                            Usuario user = new Estudante();
                                            user.setTipoUsuario(TipoUsuario.ESTUDANTE);
                                            System.out.println("Digite Nome: ");
                                            user.setNome(input.nextLine());
                                            System.out.println("Digite um telefone: ");
                                            user.setEmail(input.nextLine());
                                            System.out.println("Digite um email: ");
                                            user.setEmail(input.nextLine());
                                            user.setEndereco(menuCadastroEndereço());
                                            System.out.println("Digite a senha: ");

                                            String senha3 = input.nextLine();

                                            System.out.println("Digite a senha novamente: ");
                                            String senhaCopia = input.nextLine();
                                            if (senhaCopia.equals(senha3)) {
                                                user.setSenha(input.nextLine());
//                                            estudanteManipulacao.atualizar(index, user);
                                                System.out.println("Atualizado com sucesso!!!");
                                                break;
                                            } else {
                                                System.err.println("Senhas não batem.");
                                                break;
                                            }
                                        }
                                        case "2": {
//                                        estudanteManipulacao.deletar(index);
                                            break;
                                        }
                                        case "3": {
                                            break;
                                        }
                                        default: {
                                            erroOpcao();
                                            break;
                                        }
                                    }
                                }
                                case "6": {
                                    opcaoLogin = 0;
                                    break;
                                }
                                default: {
                                    erroOpcao();
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
                        if (opcaoTipo.equals("1")) {
                            Empresa user = new Empresa();
                            user.setTipoUsuario(TipoUsuario.EMPRESA);
                            System.out.println("Digite Nome: ");
                            user.setNome(input.nextLine());
                            System.out.println("Digite um email: ");
                            user.setEmail(input.nextLine());
                            System.out.println("Digite cnpj: ");
                            user.setCnpj(input.nextLine());
                            user.setEndereco(menuCadastroEndereço());
                            System.out.println("Digite a senha: ");
                            String senha = input.nextLine();
                            System.out.println("Digite a senha novamente: ");
                            String senhaCopia = input.nextLine();
                            if (senhaCopia.equals(senha)) {
                                user.setSenha(senha);
                                empresaManipulacao.cadastrar(user);
                                System.out.println("Cadastrado com sucesso!!!");
                            } else {
                                System.err.println("Senhas não batem.");
                            }
                        } else if (opcaoTipo.equals("2")) {
                            Estudante user = new Estudante();
                            user.setTipoUsuario(TipoUsuario.ESTUDANTE);
                            System.out.println("Digite Nome: ");
                            user.setNome(input.nextLine());
                            System.out.println("Digite um email: ");
                            user.setEndereco(menuCadastroEndereço());
                            user.setEmail(input.nextLine());
                            System.out.println("Digite a senha: ");
                            String senha = input.nextLine();
                            System.out.println("Digite a senha novamente: ");
                            String senhaCopia = input.nextLine();
                            if (senhaCopia.equals(senha)) {
                                user.setSenha(senha);
                                estudanteManipulacao.cadastrar(user);
                                System.out.println("Cadastrado com sucesso!!!");
                                break;
                            } else {
                                System.err.println("Senhas não batem.");
                            }
                        } else {
                            erroOpcao();
                        }
                        break;
                    }
                    case "3": {
                        rodar = false;
                        break;
                    }
                    default: {
                        erroOpcao();
                        break;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.err.println("---------------------------------------------------");
                System.err.println("Dado não encontrado.");
                System.err.println("Tente novamente.");
                System.err.println("---------------------------------------------------");
            } catch (Exception e) {
                System.out.println("Tente novamente.");
            }
        } while (rodar);
    }

    private static void erroOpcao() {
        System.err.println("---------------------------------------------------");
        System.err.println("| Opa entrada inválida, digite o número da opção. |");
        System.err.println("---------------------------------------------------");

    }

    private static Endereco menuCadastroEndereço() {
        Scanner input = new Scanner(System.in);
        Endereco endereco = new Endereco();

        System.out.println("---------- Cadastro de endereço --------------- ");
        System.out.println("Digite o pais: ");
        endereco.setPais(input.nextLine());
        System.out.println("Digite o estado: ");
        endereco.setPais(input.nextLine());
        System.out.println("Digite a cidade: ");
        endereco.setPais(input.nextLine());
        System.out.println("Digite o cep: ");
        endereco.setPais(input.nextLine());
        System.out.println("Digite a rua: ");
        endereco.setPais(input.nextLine());
        System.out.println("Digite o numero: ");
        endereco.setNumero(input.nextInt());
        input.nextLine();
        System.out.println("Endereço cadastrado com sucesso ");
        return endereco;
    }

    private static Usuario contaLogin(TipoUsuario tipo, String email, String senha) {
        EstudanteManipulacao estudanteManipulacao = new EstudanteManipulacao();
        EmpresaManipulacao empresaManipulacao = new EmpresaManipulacao();
        if (tipo == TipoUsuario.EMPRESA) {
            Empresa retornoEmpresa = empresaManipulacao.listar().stream()
                    .filter(empresa -> empresa.getEmail().equals(email) && empresa.getSenha().equals(senha))
                    .findFirst().get();
            return retornoEmpresa;
        } else {
            Estudante retornoEstudante = estudanteManipulacao.listar().stream()
                    .filter(estudante -> estudante.getEmail().equals(email) && estudante.getSenha().equals(senha))
                    .findFirst().get();
            return retornoEstudante;
        }
    }
}
