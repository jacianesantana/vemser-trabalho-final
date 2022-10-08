package service;

public interface CRUD<T> {
    void cadastrar(T objeto);
    void listar();
    void atualizar(int index, T objeto);
    void deletar(int index);
}
