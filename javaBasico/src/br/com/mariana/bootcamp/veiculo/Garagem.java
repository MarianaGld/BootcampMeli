package br.com.mariana.bootcamp.veiculo;

import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> veiculos;

    public Garagem(int id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public int getId() {
        return id;
    }
}
