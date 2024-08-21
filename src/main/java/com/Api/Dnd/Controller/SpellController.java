package com.Api.Dnd.Controller;

import com.Api.Dnd.Model.Spell;
import com.Api.Dnd.Service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/spells")
public class SpellController {

    @Autowired
    private SpellService spellService;

    @GetMapping
    public List<Spell> getAllSpells(){
        return spellService.getAllSpells();
    }

    @GetMapping("/{name}")
    public Spell getSpellByName(@PathVariable String name){
        return spellService.getSpeelByName(name);
    }
}
