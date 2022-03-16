package br.com.mariana.bootcamp.veiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("Ford", "Fiesta", 1000.0));
        veiculos.add(new Veiculo("Ford", "Focus", 1200.0));
        veiculos.add(new Veiculo("Ford", "Explorer", 2500.0));
        veiculos.add(new Veiculo("Fiat", "Uno", 500.0));
        veiculos.add(new Veiculo("Fiat", "Cronos", 1000.0));
        veiculos.add(new Veiculo("Fiat", "Torino", 1250.0));
        veiculos.add(new Veiculo("Chevrolet", "Aveo", 1250.0));
        veiculos.add(new Veiculo("Chevrolet", "Spin", 2500.0));
        veiculos.add(new Veiculo("Toyota", "Corola", 1200.0));
        veiculos.add(new Veiculo("Toyota", "Fortuner", 3000.0));
        veiculos.add(new Veiculo("Renault", "Logan", 950.0));

        Garagem garagem = new Garagem(1, veiculos);

        System.out.println(veiculos.toString());


        List<Veiculo> precos = garagem.getVeiculos().stream()
                .sorted(Comparator.comparingDouble(Veiculo::getPreco))
                .collect(Collectors.toList());

        precos.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        List<Veiculo> marcas = garagem.getVeiculos().stream()
                .sorted(Comparator.comparing(Veiculo::getMarca))
                .collect(Collectors.toList());

        marcas.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        List<Veiculo> precosMenor = garagem.getVeiculos().stream()
                .filter(veiculo -> veiculo.getPreco()<1000.0)
                .collect(Collectors.toList());

        precosMenor.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        List<Veiculo> precosMaior = garagem.getVeiculos().stream()
                .filter(veiculo -> veiculo.getPreco()>=1000.0)
                .collect(Collectors.toList());

        precosMaior.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        OptionalDouble media = garagem.getVeiculos().stream().mapToDouble(Veiculo::getPreco).average();

        System.out.println(media);



    }
}