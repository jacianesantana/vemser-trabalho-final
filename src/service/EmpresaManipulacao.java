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
        if (empresa != null) {
            this.listaDeEmpresas.add(empresa);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public List<Empresa> listar() {
        return  listaDeEmpresas;
    }

    @Override
    public boolean atualizar(Integer index, Empresa empresa) {
        if (index != null && empresa != null) {
            Empresa empresaIndex = listaDeEmpresas.get(index);
            empresaIndex.setCnpj(empresa.getCnpj());
            empresaIndex.setNome(empresa.getNome());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deletar(Integer index) {
        if (index != null) {
            this.listaDeEmpresas.remove(index.intValue());
            return true;
        } else {
            return false;
        }
    }
}
