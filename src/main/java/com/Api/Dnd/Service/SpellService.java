package com.Api.Dnd.Service;

import com.Api.Dnd.Model.Spell;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class SpellService {
    private List<Spell> speels;

    @PostConstruct
    public void loadSpeels() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        InputStream inputStream = getClass().getResourceAsStream("/spells.json");

        speels = mapper.readValue(inputStream, new TypeReference<List<Spell>>() {
        });
    }

    public List<Spell> getAllSpells(){
        return speels;
    }

    public Spell getSpeelByName(String name){
        return speels.stream().filter(spell -> spell.getNome().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
