package com.example.screamatch_api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.screamatch_api.principal.Principal;
import com.example.screamatch_api.repository.SerieRepository;

@SpringBootApplication
public class ScreamatchApiApplication implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private SerieRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(ScreamatchApiApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.exibeMenu();
	}

}
