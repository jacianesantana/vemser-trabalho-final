package model;

import java.util.List;

public class Empresa extends Usuario implements Impressão {
  


public Empresa(TipoUsuario tipoUsuario, String nome, String identificacaoUsuario, List<Endereco> endereco,
      String telefone, String email, String senha) {
    super(tipoUsuario, nome, identificacaoUsuario, endereco, telefone, email, senha);
  }

public Empresa() {
  }

public boolean cadastrarVaga(){
  return false;
}

public void listarCurriculos(){

}

@Override
public void imprimir() {
  System.out.println("Nome: " + getNome());
  System.out.println("CNPJ: " + getIdentificacaoUsuario());
  System.out.println("Email: " + getEmail());
  System.out.println("Endereço: " + getEndereco().get(0).getCidade());
  System.out.println("Tel: " + getTelefone());  
}



}
