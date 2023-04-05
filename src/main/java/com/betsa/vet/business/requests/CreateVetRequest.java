package com.betsa.vet.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateVetRequest {
	private String name;
	private String surname;
	private String field;
	private int yearsOfExperience;

}
