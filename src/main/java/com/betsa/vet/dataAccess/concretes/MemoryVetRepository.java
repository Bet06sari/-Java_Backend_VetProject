package com.betsa.vet.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.betsa.vet.dataAccess.abstracts.VetRepository;
import com.betsa.vet.entities.Vet;

//this using style is without using jpaRepository
//and using fake database 

@Repository //this class is a dataAccess object
public class MemoryVetRepository implements VetRepository{
	List<Vet> vets;

	public MemoryVetRepository() {
		vets = new ArrayList<Vet>();
		vets.add(new Vet(0, "Elif", "Sevde", "doctor", 5));
		vets.add(new Vet(1, "Faruk", "Duman", "psychologist", 13));
		vets.add(new Vet(2, "Vedat", "Kahraman", "surgeon", 8));
		vets.add(new Vet(3, "Ayşe", "Çiçek", "dentist", 3));	
	}

	@Override
	public List<Vet> getAll() {
		return vets;
	}

}
