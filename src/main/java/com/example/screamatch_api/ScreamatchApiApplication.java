package com.example.screamatch_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.screamatch_api.principal.Principal;

@SpringBootApplication
public class ScreamatchApiApplication implements org.springframework.boot.CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreamatchApiApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}

}
