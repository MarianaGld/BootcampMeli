package br.com.mariana.bootcamp;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Pessoa {

    private String nome;
    private int idade;
    private String ID;
    private Double peso;
    private Double altura;


    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;

    }

    public Pessoa(String nome, int idade, String ID, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;

    }

    public Double calculoImc(Double peso, Double altura) {
        return peso / (altura * altura);
    }

    public void avaliacaoIMC (Double IMC){
        if(IMC < 20){
            System.out.println("Abaixo do peso");
        }else if (IMC >= 20 && IMC <= 25){
            System.out.println("Peso Saudavel");
        }else if (IMC > 25){
            System.out.println("Sobrepeso");
        }
    }

    public boolean ehMaiorIdade(int idade) {
        return idade >= 18;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ID='" + ID + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}


