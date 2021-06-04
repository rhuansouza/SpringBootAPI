package com.consumindo.boot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.consumindo.boot.model.Cliente;

@RestController
public class ConsumerWebService {
	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/template/clientes")
    public String getClienteList() {
    	
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange("http://localhost:8082/clientes", HttpMethod.GET, entity, String.class).getBody();
    }
	
	
	@RequestMapping(value = "/template/clientes", method = RequestMethod.POST)
	   public String createProducts(@RequestBody Cliente cliente) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<Cliente> entity = new HttpEntity<Cliente>(cliente,headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8082/clientes", HttpMethod.POST, entity, String.class).getBody();
	   }
	
}
