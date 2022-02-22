package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.service.SsaService;

@RestController
public class SSaRestController {

	@Autowired
	private SsaService service;
	
	@GetMapping("/state/{ssn}")
	public ResponseEntity<String> stateName(@PathVariable String ssn){
		String stateName = service.fetchStateName(ssn);
		
		return new ResponseEntity<>(stateName,HttpStatus.OK);
	}
}
