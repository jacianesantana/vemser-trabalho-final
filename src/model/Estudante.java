package model;

public class Estudante extends Usuario {
    private String cpf;
    private Curriculo meuCurriculo;
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
                ", curriculo=" + meuCurriculo +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Curriculo getCurriculo() {
        return meuCurriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.meuCurriculo = curriculo;
    }
}
