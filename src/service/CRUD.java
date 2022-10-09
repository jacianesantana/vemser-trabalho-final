package service;

import java.util.List;

public interface CRUD<T> {
    boolean cadastrar(T objeto);
    List<T> listar();
    boolean atualizar(Integer index, T objeto);
    boolean deletar(Integer index);
}
