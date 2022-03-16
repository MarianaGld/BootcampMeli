package br.com.mariana.bootcamp.veiculo;

public class Veiculo {
    private String marca;
    private String modelo;
    private double preco;

    public Veiculo(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return " Veiculo  ----- " + " marca= " + marca +
                " modelo= " + modelo +
                " preco= " + preco + "\n";
    }


}
