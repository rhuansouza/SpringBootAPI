package com.consumindocep.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumindocep.boot.model.Endereco;
import com.consumindocep.boot.util.CepService;

@RestController
@RequestMapping("/listarcep")
public class CepRestService {

	
	@Autowired
	private CepService cepService;

	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {
		
		Endereco endereco = cepService.buscaEnderecoPorCep(cep);
		
		return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
	}
	
}
