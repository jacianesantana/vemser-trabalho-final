package service;

public interface CRUD<T> {
    boolean cadastrar(T objeto);
    void listar();
    boolean atualizar(Integer index, T objeto);
    void deletar(Integer index);
}
