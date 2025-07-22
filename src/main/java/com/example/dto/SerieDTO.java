package com.example.dto;

import com.example.screamatch_api.model.Categoria;

public record SerieDTO(Long id, String titulo, Integer totalTemporadas, Double avaliacao, Categoria genero, String atores, String poster, String sinopse) {
    
}
