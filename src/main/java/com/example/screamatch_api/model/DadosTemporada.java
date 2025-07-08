package com.example.screamatch_api.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosTemporada {
    @JsonAlias("Season")
    private Integer numero;

    @JsonAlias("Episodes")
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    private List<DadosEpisodio> episodios = new ArrayList<>();

    public List<DadosEpisodio> getEpisodios() {
        return episodios;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setEpisodios(List<DadosEpisodio> episodios) {
        this.episodios = episodios;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}


