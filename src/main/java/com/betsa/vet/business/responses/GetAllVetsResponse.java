package com.betsa.vet.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// this is the use with lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllVetsResponse {
	private int id;
	private String name;
	private String surname;
	private String field;
	private int yearsOfExperience;

}
