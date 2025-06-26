package com.example.screamatch_api.model;

import java.util.OptionalDouble;

import com.example.screamatch_api.service.ConsultaChatGPT;



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
        this.sinopse = ConsultaChatGPT.obterTraducao(dadosSerie.sinopse()).trim();
        this.poster = dadosSerie.poster();
        this.genero = Categoria.fromString(dadosSerie.genero().split(",") [0].trim());
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao()))
                                       .orElse(0);

    }

    public String getTitulo() {
        return titulo;
    }
    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }
    public String getAtores() {
        return atores;
    }
    public String getSinopse() {
        return sinopse;
    }
    public String getPoster() {
        return poster;
    }
    public Categoria getGenero() {
        return genero;
    }
    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }
    public void setAtores(String atores) {
        this.atores = atores;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public void setGenero(Categoria genero) {
        this.genero = genero;
    }
    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return
        "genero=" + genero +
         ", titulo='" + titulo + '\'' +
                ", totalTemporadas=" + totalTemporadas +
                ", atores='" + atores + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", poster='" + poster + '\'' +
                
                ", avaliacao=" + avaliacao;
    }
}
