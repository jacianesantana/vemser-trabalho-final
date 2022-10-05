package model;

public class Vaga {
    private String titulo;
    private Empresa empresa;
    private String requisito;
    private int quantidade;

    public Vaga(String titulo, Empresa empresa, String requisito, int quantidade) {
        this.titulo = titulo;
        this.empresa = empresa;
        this.requisito = requisito;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
