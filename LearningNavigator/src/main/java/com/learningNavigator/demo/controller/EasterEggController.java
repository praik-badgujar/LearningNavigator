package com.learningNavigator.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EasterEggController {

	 @GetMapping("/hidden-feature/{number}")
	    public ResponseEntity<String> getNumberFact(@PathVariable Integer number) {
	        String url = "http://numbersapi.com/" + number;
	        RestTemplate restTemplate = new RestTemplate();
	        String fact = restTemplate.getForObject(url, String.class);
	        return ResponseEntity.ok(fact);
	    }
}
