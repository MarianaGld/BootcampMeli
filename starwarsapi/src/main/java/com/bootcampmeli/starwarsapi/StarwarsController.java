package com.bootcampmeli.starwarsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StarwarsController {

//    @GetMapping("personagem/{nome}")
//    @ResponseBody
//    public List <PersonagemDto> personagemDto(@PathVariable(name = "nome") String nome){
//        return personagem().stream()
//                .map(PersonagemDto::new)
//                .collect(Collectors.toList());
//
//    }



}
