package service;

public interface CRUD<T> {
    boolean cadastrar(T objeto);
    void listar();
    boolean atualizar(Integer index, T objeto);
    boolean deletar(Integer index);
}
