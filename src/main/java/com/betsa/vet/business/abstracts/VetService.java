package com.betsa.vet.business.abstracts;

import java.util.List;

import com.betsa.vet.business.requests.CreateVetRequest;
import com.betsa.vet.business.responses.GetAllVetsResponse;

public interface VetService {
	List<GetAllVetsResponse> getAll();
	void add(CreateVetRequest createVetRequest);
}
