package com.betsa.vet.dataAccess.abstracts;

import java.util.List;

import com.betsa.vet.entities.Vet;

public interface VetRepository {
	List<Vet> getAll();

}
