package com.betsa.vet.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betsa.vet.business.abstracts.VetService;
import com.betsa.vet.business.requests.CreateVetRequest;
import com.betsa.vet.business.responses.GetAllVetsResponse;
import com.betsa.vet.dataAccess.abstracts.VetRepository;
import com.betsa.vet.entities.Vet;

@Service
public class VetManager implements VetService{
	private VetRepository vetRepository;

	@Autowired
	public VetManager(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}
 
	//the use without modelmapper
	@Override
	public List<GetAllVetsResponse> getAll() {
		//business programs
		List<Vet> vets = vetRepository.findAll();
		List<GetAllVetsResponse> vetsResponse = new ArrayList<GetAllVetsResponse>();
		
		for(Vet vet : vets) {
			GetAllVetsResponse responseItem = new GetAllVetsResponse();
			responseItem.setId(vet.getId());
			responseItem.setName(vet.getName());
			responseItem.setSurname(vet.getSurname());
			responseItem.setField(vet.getField());
			responseItem.setYearsOfExperience(vet.getYearsOfExperience());
			
			vetsResponse.add(responseItem);
		}
		return vetsResponse;
	}

	@Override
	public void add(CreateVetRequest createVetRequest) {
		Vet vet = new Vet();
		vet.setName(createVetRequest.getName());
		vet.setSurname(createVetRequest.getSurname());
		vet.setField(createVetRequest.getField());
		vet.setYearsOfExperience(createVetRequest.getYearsOfExperience());
		this.vetRepository.save(vet);
		
	}

}
