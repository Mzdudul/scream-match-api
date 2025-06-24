package com.example.screamatch_api.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("Actors") String atores,
                         @JsonAlias("Plot") String sinopse,
                         @JsonAlias("Poster") String poster,
                         @JsonAlias("Genre") String genero,
                         @JsonAlias("imdbRating") String avaliacao) {
}
