package br.com.mariana.bootcamp.abstractclass;

public class Cachorro extends Animal implements comerCarne {

    @Override
    public void emitirSom(String som) {
        super.emitirSom(som);
    }

    @Override
    public void comerCarne() {
        System.out.println("cachorro e carnivoro");
    }
}
