import exception.LoginInvalidoException;
import model.*;
import service.CurriculoManipulacao;
import service.EmpresaManipulacao;
import service.EstudanteManipulacao;
import service.VagaManipulacao;

import java.util.*;

public class Main {
    public static void main(String[] args) {
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
                1, "Sem experiência", Arrays.asList("Testes", "Selenium", "Cypress","javascript"));
        curriculoEstudante0.setHabilidades(List.of("algoritmo"));
        estudante0.setCurriculo(curriculoEstudante0);
        curriculoManipulacao.cadastrar(curriculoEstudante0);

        Curriculo curriculoEstudante1 = new Curriculo(estudante1.getNome(), "Univ", "Curso",
                1, "Sem experiência", Arrays.asList("POO", "Java", "Spring", "mysql","javascript"));
        curriculoEstudante1.setHabilidades(List.of("java"));
        estudante1.setCurriculo(curriculoEstudante1);
        curriculoManipulacao.cadastrar(curriculoEstudante1);

        Curriculo curriculoEstudante2 = new Curriculo(estudante2.getNome(), "Univ", "Curso",
                1, "Sem experiência", Arrays.asList("Javascript", "HTML", "CSS"));
        curriculoEstudante2.setHabilidades(List.of("java", "mysql"));
        estudante2.setCurriculo(curriculoEstudante2);
        curriculoManipulacao.cadastrar(curriculoEstudante2);
        Curriculo curriculoEstudante3 = new Curriculo(estudante3.getNome(),"Estacio","ADS",2,"Sem Experiencia",List.of("Java","algoritmo","javascript"));
        estudante3.setCurriculo(curriculoEstudante3);
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

        // Vagas
        VagaManipulacao vagaManipulacao = new VagaManipulacao();

        Vaga vaga1 = new Vaga("java senior", empresa1, List.of("java", "mysql"));
        vagaManipulacao.cadastrar(vaga1);
        estudante0.candidatarVaga(vaga1);
        estudante1.candidatarVaga(vaga1);
        estudante2.candidatarVaga(vaga1);
        estudante3.candidatarVaga(vaga1);


        Vaga vaga2 = new Vaga("java junior", empresa2, List.of("algoritimos"));
        vagaManipulacao.cadastrar(vaga2);
        estudante3.candidatarVaga(vaga2);
        estudante2.candidatarVaga(vaga2);
        estudante0.candidatarVaga(vaga2);




        Vaga vaga3 = new Vaga("qa senior", empresa3, List.of("qa", "selenium"));
        vagaManipulacao.cadastrar(vaga3);
        estudante3.candidatarVaga(vaga3);
        estudante2.candidatarVaga(vaga3);
        estudante0.candidatarVaga(vaga3);


        Vaga vaga4 = new Vaga("frontend pleno", empresa4, List.of("javascript", "react"));
        vagaManipulacao.cadastrar(vaga4);
        estudante0.candidatarVaga(vaga4);
        estudante3.candidatarVaga(vaga4);







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
                        Empresa empresaLogada = null;
                        Estudante estudanteLogado = null;
                        System.out.println("----------------- Login --------------------");
                        System.out.println("Digite 1 para Empresa ou digite 2 para Estudante: ");
                        String opcaoTipoLogin = input.nextLine();
                        System.out.println("Digite o email: ");
                        String email = input.nextLine();
                        System.out.println("Digite a senha: ");
                        String senha = input.nextLine();

                        if (opcaoTipoLogin.equals("1")) {
                            try {
                                empresaLogada = empresaManipulacao.login(email,senha);
                            } catch (LoginInvalidoException exception) {
                                System.err.println(exception.getMessage());
                            }
                            opcaoLogin = 4;
                        } else if (opcaoTipoLogin.equals("2")) {
                            try {
                                estudanteLogado = estudanteManipulacao.login(email,senha);
                            } catch (LoginInvalidoException exception) {
                                System.err.println(exception.getMessage());
                            }
                            opcaoLogin = 2;
                        } else {
                            System.err.println("Erro ao fazer login.");
                            break;
                        }

                        if (empresaLogada != null) {
                            while (opcaoLogin == 4) {
                                String opcaoEmpresa;
                                System.out.println("-------------------- Logado com " + empresaLogada.getNome() + " ------------------");
                                System.out.println(" Escolha uma opção: ");
                                System.out.println(" 1 - Criar nova vaga; ");
                                System.out.println(" 2 - Listar vagas; ");
                                System.out.println(" 3 - Fechar vaga.");
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
                                        vaga.setEmpresa(empresaLogada);
                                        vagaManipulacao.cadastrar(vaga);
                                        break;
                                    }
                                    case "2": {
                                        System.out.println("------------- Lista de vagas cadastradas ------------");
                                        Empresa finalEmpresaLogada = empresaLogada;
                                        List<Vaga> vagas = vagaManipulacao.listar().stream().filter(vaga -> {
                                            return vaga.getEmpresa().getNome().equals(finalEmpresaLogada.getNome());
                                        }).toList();
                                        vagas.stream().forEach(vaga -> {
                                            System.out.println("Nome da vaga: " + vaga.getTitulo() +", Requisitos: " + vaga.getRequisitos());
                                        });
                                        break;
                                    }
                                    case "3": {
                                        vagaManipulacao.listar().forEach(vaga -> System.out.println("Vaga: " + vaga.getTitulo() + " Status: " + vaga.getStatusVaga()));
                                        System.out.println("Digite a vaga que deseja fechar: ");
                                        String nomeVaga = input.nextLine();
                                        Optional<Vaga> vagaSelecionada = vagaManipulacao.listar().stream()
                                                .filter(vaga -> vaga.getTitulo().equalsIgnoreCase(nomeVaga)).findFirst();
                                        if (vagaSelecionada.isPresent()) {
                                            vagaSelecionada.get().candidatoComMaisRequisitos()
                                                    .forEach((estudante, quantRequisito) -> System.out.println("Estudante: " + estudante.getNome() + " Cpf: " + estudante.getCpf() + " Quantidade de requisitos:" + quantRequisito));
                                            System.out.println("Digite o cpf de estudante selecionado");
                                            String cpfEstudanteSelecionado = input.nextLine();
                                            vagaSelecionada.get().fecharVaga(cpfEstudanteSelecionado);
                                        }
                                        break;
                                    }
                                    case "4": {

                                        Empresa finalEmpresaLogada = empresaLogada;
                                        List<Vaga> vagas = vagaManipulacao.listar().stream().filter(vaga -> {
                                            return vaga.getEmpresa().getNome().equals(finalEmpresaLogada.getNome());
                                        }).toList();
                                        vagas.stream().forEach(vaga -> {
                                            System.out.println("Indice: "+ vagas.indexOf(vaga) +", Nome da vaga: " + vaga.getTitulo() +", Requisitos: " + vaga.getRequisitos());
                                        });
                                        System.out.println("Digite o indice da vaga que quer editar: ");
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
                                        Empresa finalEmpresaLogada = empresaLogada;
                                        List<Vaga> vagas = vagaManipulacao.listar().stream().filter(vaga -> {
                                            return vaga.getEmpresa().getNome().equals(finalEmpresaLogada.getNome());
                                        }).toList();
                                        vagas.stream().forEach(vaga -> {
                                            System.out.println("Indice: "+ vagas.indexOf(vaga) +", Nome da vaga: " + vaga.getTitulo() +", Requisitos: " + vaga.getRequisitos());
                                        });
                                        if(!vagas.isEmpty()){
                                            System.out.println("Digite o número da vaga que deseja excluir: ");
                                            int id = input.nextInt();
                                            input.nextLine();
                                            vagaManipulacao.deletar(id);
                                            System.out.println("Vaga de id=" + id + " deletada com sucesso");
                                            break;
                                        }else{
                                            System.out.println("Não há vagas cadastradas.");
                                            break;
                                        }

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
                                                Empresa user = new Empresa();
                                                user.setTipoUsuario(TipoUsuario.EMPRESA);
                                                System.out.println("Digite Nome: ");
                                                user.setNome(input.nextLine());
                                                System.out.println("Digite um telefone: ");
                                                user.setEmail(input.nextLine());
                                                System.out.println("Digite um email: ");
                                                user.setEmail(input.nextLine());
                                                user.setEndereco(menuCadastroEndereco());
                                                System.out.println("Digite a senha: ");

                                                String senha2 = input.nextLine();

                                                System.out.println("Digite a senha novamente: ");
                                                String senhaCopia = input.nextLine();
                                                if (senhaCopia.equals(senha2)) {
                                                    user.setSenha(senha2);
                                                    Integer index = empresaManipulacao.listar().indexOf(empresaLogada);
                                                    empresaManipulacao.atualizar(index, user);
                                                    System.out.println("Atualizado com sucesso!!!");
                                                    break;
                                                } else {
                                                    System.err.println("Senhas não batem.");
                                                }
                                                break;
                                            }
                                            case "2": {
                                                System.out.println("Deseja mesmo excluir a conta? ");
                                                System.out.println("Digite 1 para SIM;");
                                                System.out.println("Digite 2 para NÂO;");
                                                String opcaoExcluirConta = input.nextLine();
                                                if (opcaoExcluirConta.equals("1")) {
                                                    Integer index = empresaManipulacao.listar().indexOf(empresaLogada);
                                                    empresaManipulacao.deletar(index);
                                                    System.out.println("Conta excluida com sucesso!!");
                                                    opcaoLogin = 0;
                                                    break;
                                                } else {
                                                    break;
                                                }
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
                        }
                        if (estudanteLogado != null) {
                            while (opcaoLogin == 2) {
                                // Se ESTUDANTE
                                String opcaoEstudante;
                                System.out.println("-------------------- Logado com " + estudanteLogado.getNome() + " ------------------");
                                System.out.println(" Escolha uma opção: ");
                                System.out.println(" 1 - Criar curriculo; ");
                                System.out.println(" 2 - Editar curriculo; ");
                                System.out.println(" 3 - Listar curriculos; ");
                                System.out.println(" 4 - Excluir curriculo. ");
                                System.out.println(" 5 - Configuração da conta. ");
                                System.out.println(" 6 - Candidatar-se para vaga. ");
                                System.out.println(" 7 - Listar vagas inscritas. ");
                                System.out.println(" 8 - Sair. ");
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
                                        Estudante finalEstudanteLogado = estudanteLogado;
                                        List<Curriculo> curriculos = curriculoManipulacao.listar().stream().filter(curriculo -> {
                                            return curriculo.getNomeDoEstudante().equals(finalEstudanteLogado.getNome());
                                        }).toList();
                                        curriculos.stream().forEach(curriculo -> {
                                            System.out.println("Indice: "+ curriculos.indexOf(curriculo) +", Nome do curso: " + curriculo.getCurso() +", Universidade: " + curriculo.getUniversidade());
                                        });
                                        if(!curriculos.isEmpty()){
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
                                            curriculoManipulacao.atualizar(index, novoCurriculo);
                                            break;
                                        }else{
                                            System.out.println("Não há curriculos para editar.");
                                        }
                                    }
                                    case "3": {
                                        Estudante finalEstudanteLogado = estudanteLogado;
                                        List<Curriculo> curriculos = curriculoManipulacao.listar().stream().filter(curriculo -> {
                                            return curriculo.getNomeDoEstudante().equals(finalEstudanteLogado.getNome());
                                        }).toList();
                                        curriculos.stream().forEach(curriculo -> {
                                            System.out.println("Indice: "+ curriculos.indexOf(curriculo) +", Nome do curso: " + curriculo.getCurso() +", Universidade: " + curriculo.getUniversidade());
                                        });
                                        if(curriculos.isEmpty()){
                                            System.out.println("Não há curriculos para listar.");
                                        }
                                        break;
                                    }
                                    case "4": {
                                        Estudante finalEstudanteLogado = estudanteLogado;
                                        List<Curriculo> curriculos = curriculoManipulacao.listar().stream().filter(curriculo -> {
                                            return curriculo.getNomeDoEstudante().equals(finalEstudanteLogado.getNome());
                                        }).toList();
                                        curriculos.stream().forEach(curriculo -> {
                                            System.out.println("Indice: "+ curriculos.indexOf(curriculo) +", Nome do curso: " + curriculo.getCurso() +", Universidade: " + curriculo.getUniversidade());
                                        });
                                        if(!curriculos.isEmpty()) {
                                            System.out.println("Digite o numero do curriculo que deseja excluir: ");
                                            Integer opcaoDeletarCurriculo = input.nextInt();
                                            input.nextLine();
                                            System.out.println("Deseja mesmo excluir o curriculo? ");
                                            System.out.println("Digite 1 para SIM;");
                                            System.out.println("Digite 2 para NÂO;");
                                            String opcaoExcluirCurriculo = input.nextLine();
                                            if (opcaoExcluirCurriculo.equals("1")) {
                                                curriculoManipulacao.deletar(opcaoDeletarCurriculo);
                                                System.out.println("Curriculo deletado com sucesso!!");
                                                break;
                                            } else {
                                                break;
                                            }
                                        }else{
                                            System.out.println("Não há curriculos para excluir.");
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
                                                Estudante user = new Estudante();
                                                user.setTipoUsuario(TipoUsuario.ESTUDANTE);
                                                System.out.println("Digite Nome: ");
                                                user.setNome(input.nextLine());
                                                System.out.println("Digite um telefone: ");
                                                user.setEmail(input.nextLine());
                                                System.out.println("Digite um email: ");
                                                user.setEmail(input.nextLine());
                                                user.setEndereco(menuCadastroEndereco());
                                                System.out.println("Digite a senha: ");

                                                String senha3 = input.nextLine();

                                                System.out.println("Digite a senha novamente: ");
                                                String senhaCopia = input.nextLine();
                                                if (senhaCopia.equals(senha3)) {
                                                    user.setSenha(senha3);
                                                    Integer index = estudanteManipulacao.listar().indexOf(estudanteLogado);
                                                    estudanteManipulacao.atualizar(index, user);
                                                    System.out.println("Atualizado com sucesso!!!");
                                                    break;
                                                } else {
                                                    System.err.println("Senhas não batem.");
                                                    break;
                                                }
                                            }
                                            case "2": {
                                                System.out.println("Deseja mesmo excluir a conta? ");
                                                System.out.println("Digite 1 para SIM;");
                                                System.out.println("Digite 2 para NÂO;");
                                                String opcaoExcluirConta = input.nextLine();
                                                if (opcaoExcluirConta.equals("1")) {
                                                    Integer index = estudanteManipulacao.listar().indexOf(estudanteLogado);
                                                    estudanteManipulacao.deletar(index);
                                                    System.out.println("Conta excluida com sucesso!!");
                                                    break;
                                                } else {
                                                    break;
                                                }
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
                                        Estudante finalEstudanteLogado1 = estudanteLogado;
                                        vagaManipulacao.listar().stream().forEach(vaga -> {
                                            if(!vaga.getCandidatos().contains(finalEstudanteLogado1)) {
                                                System.out.println("Indice: " + vagaManipulacao.listar().indexOf(vaga) + ", Nome da vaga: " + vaga.getTitulo() + ", Requisitos: " + vaga.getRequisitos());
                                            }
                                        });
                                        boolean retorno = vagaManipulacao.listar().stream()
                                                .filter(vaga -> vaga.getCandidatos().equals(finalEstudanteLogado1)).findFirst().isPresent();
                                        if(!retorno){
                                            System.out.println("Digite o indice da vaga para qual quer se candidatar: ");
                                            Integer index = input.nextInt();
                                            input.nextLine();
                                            Vaga vaga = vagaManipulacao.listar().get(index);
                                            if(estudanteLogado.candidatarVaga(vaga)){
                                                System.out.println("Inscrito na vaga com sucesso!!");
                                            }
                                        }else{
                                            System.out.println("Não há vagas.");
                                        }
                                        break;
                                    }
                                    case "7": {
                                        Estudante finalEstudanteLogado1 = estudanteLogado;
                                        vagaManipulacao.listar().stream().forEach(vaga -> {
                                            if(!vaga.getCandidatos().contains(finalEstudanteLogado1)) {
                                                System.out.println("Indice: " + vagaManipulacao.listar().indexOf(vaga) + ", Nome da vaga: " + vaga.getTitulo() + ", Requisitos: " + vaga.getRequisitos());
                                            }
                                        });
                                        break;
                                    }
                                    case "8": {
                                        opcaoLogin = 0;
                                        break;
                                    }
                                    default: {
                                        erroOpcao();
                                        break;
                                    }
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
                            user.setEndereco(menuCadastroEndereco());
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
                            user.setEndereco(menuCadastroEndereco());
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

    private static Endereco menuCadastroEndereco() {
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

}
