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

    public static Categoria fromString(String text) {
        for (Categoria cat : Categoria.values()) {
            if (cat.categoriaOmdb.equalsIgnoreCase(text)) {
                return cat;
            }
        }
        throw new IllegalArgumentException("Categoria não encontrada: " + text);
    }
}
