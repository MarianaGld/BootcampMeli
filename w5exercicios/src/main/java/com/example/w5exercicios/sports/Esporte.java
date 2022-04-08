package com.example.w5exercicios.sports;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Esporte {
    private String name;
    private Integer nivel;


    @Override
    public String toString() {
        return "Esporte{" +
                "name='" + name + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
