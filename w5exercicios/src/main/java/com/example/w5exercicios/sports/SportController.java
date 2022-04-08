package com.example.w5exercicios.sports;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SportController {

    private static List<Esporte> esportes = new ArrayList<>();
    private static List<Pessoa> pessoa = new ArrayList<>();

    static {
        Pessoa p1 = new Pessoa("Mari", "Galdino", 29, new Esporte("crossfit", 4));
        Pessoa p2 = new Pessoa("Jackson", "Ramalho", 31, new Esporte("natacao", 7));
        Pessoa p3 = new Pessoa("Januario", "Leite", 20, new Esporte("musculacao", 3));

        esportes.add(p1.getEsporte());
        esportes.add(p2.getEsporte());
        esportes.add(p3.getEsporte());

        pessoa.add(p1);
        pessoa.add(p2);
        pessoa.add(p3);


    }
    @GetMapping("/findSport") // listar todos os esportes
    @ResponseBody
    public List<Esporte> nomeEsporte(){
        return esportes;

    }

    @GetMapping("/findSport/{esporte}") // listar esporte e nivel buscando pelo nome
    @ResponseBody
    public List<Esporte> nomeEsporte(@PathVariable(name = "esporte") String name){

        return esportes.stream()
                .filter(esporte -> esporte.getName().equals(name))
                .collect(Collectors.toList());

    }

    @GetMapping("/findSportPersons") // listar todos os atletas
    @ResponseBody
    public List <PessoaDto> atleta(){
          return pessoa.stream()
          .map(PessoaDto::new)
          .collect(Collectors.toList());


    }




}
