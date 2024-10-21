package com.hmsapp.doclogin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String drug;
	private String stock;
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(long id, String drug, String stock) {
		super();
		this.id = id;
		this.drug = drug;
		this.stock = stock;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDrug() {
		return drug;
	}
	public void setDrug(String drug) {
		this.drug = drug;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	

}
