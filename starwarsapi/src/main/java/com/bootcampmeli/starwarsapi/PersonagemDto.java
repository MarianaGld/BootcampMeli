package com.bootcampmeli.starwarsapi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonagemDto {
    private String name;
    private Integer height;
    private Integer mass;
    private String gender;
    private String homeworld;
    private String species;

    public PersonagemDto(Personagem personagem){
        this.name = personagem.getName();
        this.height = personagem.getHeight();
        this.mass = personagem.getMass();
        this.gender = personagem.getGender();
        this.homeworld = personagem.getHomeworld();
        this.species = personagem.getSpecies();
    }
}
