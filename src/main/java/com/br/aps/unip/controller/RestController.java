package com.br.aps.unip.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.br.aps.unip.model.RequestInfo;
import com.br.aps.unip.model.ResponseInfo;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

	
	@GetMapping(value="info")
	private ResponseEntity<ResponseInfo> getInformacoes() {
		
		RestTemplate restTemplate = new RestTemplate();
		RequestInfo request = restTemplate.getForObject("http://api.weatherapi.com/v1/current.json?key=b3a3e43a20334c3f8a1235239212408&q=Sao Paulo&aqi=yes&lang=pt", RequestInfo.class);
		
		ResponseInfo response = new ResponseInfo(request);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
