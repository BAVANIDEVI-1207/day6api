package com.example.project.model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 @Entity
 @Table
public class Model {
	@Id
	private int id;
	private String babyFisrtName;
	private String babylastName;
	private String fatherName;
	private String MotherName;
	private String address;
	public Model() {
		super();
	}
	public Model(int id, String babyFisrtName, String babylastName, String fatherName, String motherName,
			String address) {
		super();
		this.id = id;
		this.babyFisrtName = babyFisrtName;
		this.babylastName = babylastName;
		this.fatherName = fatherName;
		MotherName = motherName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBabyFisrtName() {
		return babyFisrtName;
	}
	public void setBabyFisrtName(String babyFisrtName) {
		this.babyFisrtName = babyFisrtName;
	}
	public String getBabylastName() {
		return babylastName;
	}
	public void setBabylastName(String babylastName) {
		this.babylastName = babylastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
