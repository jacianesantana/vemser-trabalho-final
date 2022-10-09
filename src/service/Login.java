package service;

import exception.LoginInvalidoException;

public interface Login {
    boolean validarEmail(String email);
    boolean validarSenha(String senha);
    boolean login(String email, String senha) throws  LoginInvalidoException;
}
