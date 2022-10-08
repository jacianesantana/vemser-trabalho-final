package service;

public interface CRUD<T> {
    void cadastrar(T objeto);
    void listar();
    void atualizar(Integer index, T objeto);
    void deletar(Integer index);
}
