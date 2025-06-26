package com.example.screamatch_api.model;

public enum Categoria {
    ACAO("Action"),
    AVENTURA("Adventure"),
    COMEDIA("Comedy"),
    DRAMA ("Drama"),
    CRIME("Crime"),
    ROMANCE ("Romance"),
    TERROR ("Horror"),
    ANIMACAO ("Animation"),
    DOCUMENTARIO ("Documentary");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }
}
