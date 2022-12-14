package model;

public class Endereco {
    private String pais;
    private String estado;
    private String cidade;
    private String cep;
    private String rua;
    private int numero;

    public Endereco() {
    }

    public Endereco(String pais,
                    String estado,
                    String cidade,
                    String cep,
                    String rua,
                    int numero) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco {país: " + pais + ", estado: " + estado + ", cidade: " + cidade +
                ", cep: " + cep + ", rua: " + rua + ", numero: " + numero + "}";
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
