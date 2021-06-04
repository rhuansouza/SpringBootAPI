package com.cliente.boot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.boot.model.Cliente;
import com.cliente.boot.repository.ClienteRepository;




@RestController
@RequestMapping(value ="/clientes")
public class ClienteController {
	
		@Autowired
		private ClienteRepository clienteRepository;

		@GetMapping
		public List<Cliente>  listar() {
			 return clienteRepository.findAll();
		}
		
		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public Cliente adicionar(@RequestBody Cliente cliente) {
			return clienteRepository.save(cliente);
		}
		
}
