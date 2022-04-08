package br.com.mariana.bootcamp.abstractclass;

public class Test {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom("auau");
        cachorro.comerCarne();
        System.out.println("-----------------");

        Vaca vaca = new Vaca();
        vaca.emitirSom("mu");
        vaca.comerPasto();
        System.out.println("-----------------");

        Gato gato = new Gato();
        gato.emitirSom("miau");
        gato.comerCarne();
    }

}
