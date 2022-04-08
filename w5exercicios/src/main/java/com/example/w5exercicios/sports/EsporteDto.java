package com.example.w5exercicios.sports;

import lombok.Data;

@Data
public class EsporteDto {
    private String name;

    public EsporteDto(String name){
        this.name = name;
    }

}
