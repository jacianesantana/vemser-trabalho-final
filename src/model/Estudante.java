package model;

import service.EstudanteCRUD;

public class Estudante extends Usuario implements EstudanteCRUD {
    private String cpf;
    private Curriculo curriculo;
    //private List<Vaga> vagasInscritas = new ArrayList<>();


    public Estudante() {
    }

    public Estudante(TipoUsuario tipoUsuario,
                     String nome,
                     Endereco endereco,
                     String telefone,
                     String email,
                     String senha,
                     String cpf) {
        super(tipoUsuario, nome, endereco, telefone, email, senha);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "cpf='" + cpf + '\'' +
                ", curriculo=" + curriculo +
                '}';
    }

    @Override
    public Estudante cadastrarEstudante(TipoUsuario tipoUsuario, String nome, Endereco endereco, String telefone,
                                        String email, String senha, String cpf) {
        Estudante estudante = new Estudante(tipoUsuario, nome, endereco, telefone, email, senha, cpf);
        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.estudantes.add(estudante);
        return estudante;
    }

    @Override
    public Estudante atualizarEstudante(Estudante estudante) {
        this.setNome(estudante.getNome());
        this.setEndereco(estudante.getEndereco());
        this.setTelefone(estudante.getTelefone());
        this.setEmail(estudante.getEmail());
        this.setSenha(estudante.getSenha());
        return estudante;
    }

    @Override
    public void imprimirEstudante() {
        System.out.println(getTipoUsuario() + ", Nome: " + getNome() + ", CPF: " + cpf +
                ", Endereço: " + getEndereco() + ", Telefone: " + getTelefone() +
                "Email: " + getEmail() + "}");
    }

    @Override
    public void deletarEstudante(String cpf) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        int estudanteIndex = bancoDeDados.estudantes.stream()
                .map(estudante -> estudante.cpf)
                .toList()
                .indexOf(cpf);
        bancoDeDados.estudantes.remove(estudanteIndex);
    }

    /*    public boolean concorrerVaga(Vaga vaga){

        vaga.setCadidatos(this.getCurriculo());
        vagasInscritas.add(vaga);
        return true;
    }*/

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }
}
