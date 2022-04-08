package com.bootcampmeli.starwarsapi;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonagemService {
    public List <PersonagemDto> personagemDto(){
        return personagem().stream()
                .map(PersonagemDto::new)
                .collect(Collectors.toList());

    }


}
