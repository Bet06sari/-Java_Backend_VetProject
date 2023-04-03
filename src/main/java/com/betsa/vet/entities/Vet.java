package com.betsa.vet.entities;
//this is the use without lombok

public class Vet {
	private int id;
	private String name;
	private String surname;
	private String field;
	private int yearsOfExperience;
	
	public Vet() {
	}
	public Vet(int id, String name, String surname, String field, int yearsOfExperience) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.field = field;
		this.yearsOfExperience = yearsOfExperience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	

}
