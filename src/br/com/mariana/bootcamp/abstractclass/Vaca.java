package br.com.mariana.bootcamp.abstractclass;

public class Vaca extends Animal implements comerPasto {
    @Override
    public void emitirSom(String som) {
        super.emitirSom(som);
    }

    @Override
    public void comerPasto() {
        System.out.println("vaca é herbivoro");
    }
}
