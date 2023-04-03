package com.betsa.vet.dataAccess.concretes;

import java.util.List;

import com.betsa.vet.dataAccess.abstracts.VetRepository;
import com.betsa.vet.entities.Vet;

//this using style is without jpaRepository

public class MemoryVetRepository implements VetRepository{

	@Override
	public List<Vet> getAll() {
		
		return null;
	}

}
