package com.Api.Dnd.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Spell {

    private String nome;

    @JsonProperty("escola")
    private String escola;

    private int level;
    private String range;

    @JsonProperty("Ritual")
    private String ritual;

    @JsonProperty("Casting")
    private String casting;

    @JsonProperty("Components")
    private String components;

    @JsonProperty("Duration")
    private String duration;

    @JsonProperty("Concentracao")
    private String concentracao;

    @JsonProperty("Descricao")
    private String descricao;

    @JsonProperty("Classes")
    private String classes;

    @JsonProperty("Subclass")
    private String subclass;
}
