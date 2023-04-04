package com.betsa.vet.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.betsa.vet.entities.Vet;

public interface VetRepository extends MongoRepository<Vet, Integer> {
	//List<Vet> getAll();

}
