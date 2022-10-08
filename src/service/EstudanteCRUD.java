package service;

import model.Endereco;
import model.Estudante;
import model.TipoUsuario;

public interface EstudanteCRUD {
    Estudante cadastrarEstudante(TipoUsuario tipoUsuario, String nome, Endereco endereco, String telefone,
                                 String email, String senha, String cpf);
    Estudante atualizarEstudante(Estudante estudante);
    void imprimirEstudante();
    void deletarEstudante(String cpf);
}
