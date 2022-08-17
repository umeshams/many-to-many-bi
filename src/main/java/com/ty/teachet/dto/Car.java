package com.ty.teachet.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Car {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String brand;
	@ManyToMany
	@JoinTable(name="my_car_fet",joinColumns = @JoinColumn,inverseJoinColumns = @JoinColumn)
	private List<Feature> feature;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<Feature> getFeature() {
		return feature;
	}
	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}
	
	
}
