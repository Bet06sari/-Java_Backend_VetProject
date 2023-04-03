package com.betsa.vet.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betsa.vet.business.abstracts.VetService;
import com.betsa.vet.dataAccess.abstracts.VetRepository;
import com.betsa.vet.entities.Vet;

@Service
public class VetManager implements VetService{
	private VetRepository vetRepository;

	@Autowired
	public VetManager(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public List<Vet> getAll() {
		//business programs
		return vetRepository.getAll();
	}

}
