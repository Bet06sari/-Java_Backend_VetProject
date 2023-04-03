package com.betsa.vet.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betsa.vet.business.abstracts.VetService;
import com.betsa.vet.entities.Vet;

@RestController  //annotation gives information to our program
@RequestMapping("/api/vets")
public class VetsController {
	private VetService vetService;

	@Autowired // take the parameter and search which one is use the vetService
	//and find it, then it use for make new
	public VetsController(VetService vetService) {
		this.vetService = vetService;
	}
	
	@GetMapping("/getall")
	public List<Vet> getAll(){
		return vetService.getAll();
	}
	
	
}
