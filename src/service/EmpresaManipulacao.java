package service;

import model.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaManipulacao implements CRUD<Empresa> {
    private List<Empresa> listaDeEmpresas;

    public EmpresaManipulacao(List<Empresa> listaDeEmpresa) {
        this.listaDeEmpresas = listaDeEmpresa;
    }

    @Override
    public void cadastrar(Empresa objeto) {
        this.listaDeEmpresas = new ArrayList<>();
    }

    @Override
    public void listar() {
        for (int i = 0; i < listaDeEmpresas.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeEmpresas.get(i));
        }
    }

    @Override
    public void atualizar(Integer index, Empresa empresa) {
        Empresa empresaProcurada = listaDeEmpresas.get(index);
        empresaProcurada.setCnpj(empresa.getCnpj());
        empresaProcurada.setNome(empresa.getNome());
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeEmpresas.remove(index.intValue());
    }
}
