package com.example.screamatch_api.model;

import java.util.OptionalDouble;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Serie {
    private String titulo;
    private Integer totalTemporadas;
    private String atores;
    private String sinopse;
    private String poster;
    private Categoria genero;
    private Double avaliacao;

    public Serie(DadosSerie dadosSerie) {
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.atores = dadosSerie.atores();
        this.sinopse = dadosSerie.sinopse();
        this.poster = dadosSerie.poster();
        this.genero = ;
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao()))
                                       .orElse(0);
        
    }
}
