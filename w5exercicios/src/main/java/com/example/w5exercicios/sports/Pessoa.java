package com.example.w5exercicios.sports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pessoa {
    private String name;
    private String lastName;
    private Integer idade;
    private Esporte esporte;


    public Pessoa(String name, String lastName, Integer idade, Esporte esporte) {
        this.name = name;
        this.lastName = lastName;
        this.idade = idade;
        this.esporte = esporte;
    }

}
