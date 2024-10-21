package com.hmsapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String age;
	private String bloodGroup;
	private String prescription;
	private String dose;
	private String fees;
	private String urgency;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(long id, String name, String age, String bloodGroup, String prescription, String dose, String fees,
			String urgency) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.prescription = prescription;
		this.dose = dose;
		this.fees = fees;
		this.urgency = urgency;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	

}
