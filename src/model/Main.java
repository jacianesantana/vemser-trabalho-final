package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Endereco enderco1 = new Endereco("Brasil", "Rio Grande", "POA", "77777-777", "sem fim", 1234);
    ArrayList endereco = new ArrayList<>(Arrays.asList(enderco1));

    Empresa empresa1 = new Empresa(null, "DBC", "33333333", endereco, "98888-8888", "empresa@gmail.com", "123456");

    empresa1.imprimir();
  }
}
