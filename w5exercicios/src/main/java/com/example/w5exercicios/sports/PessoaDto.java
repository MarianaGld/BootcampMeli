package com.example.w5exercicios.sports;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PessoaDto {

    private String name;
    private String lastName;
    private EsporteDto esporte;

    public PessoaDto(Pessoa pessoa){
        this.name = pessoa.getName();
        this.lastName = pessoa.getLastName();
        this.esporte = pessoa.getEsporteDto();
    }

}
