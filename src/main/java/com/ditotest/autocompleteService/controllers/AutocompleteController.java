package com.ditotest.autocompleteService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ditotest.autocompleteService.dto.RequestDto;
import com.ditotest.autocompleteService.repositories.RequestRepository;

@RestController
@RequestMapping("/autocomplete")
public class AutocompleteController {

	@Autowired
	RequestRepository requestRepository;
	
	@GetMapping
	public List<String> autocompleteForm(@RequestBody RequestDto request){
		
		return requestRepository.findByEvent(request.getEvent());
	}
	
}
