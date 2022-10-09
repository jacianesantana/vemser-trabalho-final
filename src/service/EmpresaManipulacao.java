package service;

import model.Empresa;
import java.util.ArrayList;
import java.util.List;

public class EmpresaManipulacao implements CRUD<Empresa> {
    private List<Empresa> listaDeEmpresas;

    public EmpresaManipulacao(){
        this.listaDeEmpresas = new ArrayList<>();
    }
    @Override
    public boolean cadastrar(Empresa empresa) {
        this.listaDeEmpresas.add(empresa);
        return false;
    }
    @Override
    public void listar() {
        for (int i = 0; i < listaDeEmpresas.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeEmpresas.get(i));
        }
    }

    @Override
    public boolean atualizar(Integer index, Empresa empresa) {
        Empresa empresaProcurada = listaDeEmpresas.get(index);
        empresaProcurada.setCnpj(empresa.getCnpj());
        empresaProcurada.setNome(empresa.getNome());
        return false;
    }

    @Override
    public void deletar(Integer index) {
        this.listaDeEmpresas.remove(index.intValue());
    }
}
