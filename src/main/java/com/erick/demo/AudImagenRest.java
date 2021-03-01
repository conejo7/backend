package com.erick.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AudImagenRest {

	@Autowired
	private AudImagenService audImagenService;
	
	@GetMapping
	private ResponseEntity<List<AudImagen>> getAllAudImagenes(){
		return ResponseEntity.ok(audImagenService.findAll());
	}
	

	
	
}
