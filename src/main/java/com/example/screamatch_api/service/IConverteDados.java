package com.example.screamatch_api.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
