package com.challenge.components_injections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponentsInjectionsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ComponentsInjectionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		
	}

}
