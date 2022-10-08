package service;

import model.BancoDeDados;
import model.Endereco;
import model.Estudante;
import model.TipoUsuario;

public interface EstudanteCRUD {
    Estudante cadastrarEstudante(TipoUsuario tipoUsuario, String nome, Endereco endereco, String telefone,
                                 String email, String senha, String cpf, BancoDeDados bancoDeDados);
    Estudante atualizarEstudante(Estudante estudante);
    void imprimirEstudante();
    void deletarEstudante(String cpf, BancoDeDados bancoDeDados);
}
