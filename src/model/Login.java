package model;

public interface Login {
    boolean validarEmail(String email);
    boolean validarSenha(String senha);
    boolean login(String email, String senha);
}
