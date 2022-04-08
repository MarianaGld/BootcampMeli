package com.bootcampmeli.starwarsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonagemRepository {
    private List<Personagem> personagens = new ArrayList<>();

    public List<Personagem> findAll(){
        personagens.addAll(Arrays.asList(
                new Personagem("Luke Skywalker", 172, 77, "blond", "fair", "blue", "19BBY", "male", "Tatooine", "Human"),
                new Personagem("Darth Vader", 202, 136, "none", "white", "yellow", "41.9BBY", "male", "Tatooine", "Human"),
                new Personagem("Leia Organa", 150, 49, "brown", "light", "brown", "19BBY", "female", "Alderaan", "Human"),
                new Personagem("Darth Maul", 175, 80, "none", "red", "yellow", "54BBY", "male", "Dathomir", "Zabrak")
        ));
        return personagens;
    }
}
