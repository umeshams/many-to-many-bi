package com.ty.teachet.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private double mileg;
	private String feture;
	public String getFeture() {
		return feture;
	}

	public void setFeture(String feture) {
		this.feture = feture;
	}

	private double cost;
	@ManyToMany(mappedBy = "feature")
	private List<Car> car;
	public double getMileg() {
		return mileg;
	}

	public void setMileg(double mileg) {
		this.mileg = mileg;
	}

	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

	
}
