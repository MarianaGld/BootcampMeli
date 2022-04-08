package com.example.w5exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Idade {

    @GetMapping(path = "{dia}/{mes}/{ano}")
        public int conta ( @PathVariable Integer ano){
            LocalDate localDate = LocalDate.now();
            return localDate.getYear() - ano;
        }

}