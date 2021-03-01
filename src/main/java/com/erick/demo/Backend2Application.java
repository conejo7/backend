package com.erick.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Backend2Application implements CommandLineRunner{

	@Autowired
	private AudImagenRepository audImagenRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Backend2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<AudImagen> audImagenes = audImagenRepository.findAll();
		audImagenes.forEach(System.out :: println);
		
	}

}
