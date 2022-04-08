package com.example.w5exercicios.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
    public class Romanos {

    public int [] valores = {1000, 100, 50, 10, 5, 1};
    public String [] letras = {"M", "C", "L", "X", "V", "I"};


    @GetMapping("convRomano")
    @ResponseBody
    public String romano(@RequestParam int number) {
        String romano = "";

        for (int i = 0; i < valores.length; i++) {
            while (number >= valores[i]) {
                number -= valores[i];
                romano += letras[i];
            }
        }
        return romano;
    }
}