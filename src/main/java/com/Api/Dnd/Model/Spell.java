package com.Api.Dnd.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.beans.ConstructorProperties;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Spell {

    String nome;
    Integer level;
    String Casting;
    String Components;
    String Duration;
    String Concentracao;
    String Descricao;
    String Classes;
    String Subclass;
}
