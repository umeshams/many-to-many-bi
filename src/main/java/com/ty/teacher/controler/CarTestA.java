package com.ty.teacher.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.teachet.dto.Car;
import com.ty.teachet.dto.Feature;

public class CarTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");

	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();

	 Car car=new Car();
	 car.setBrand("tata");
	 car.setName("nano");
	 
	 List<Feature> features=new ArrayList<Feature>();
	 Feature feature=new Feature();
	 feature.setCost(500000);
	 feature.setMileg(15);
	 feature.setFeture("airbag");
	 features.add(feature);
	 
	 Feature feature2=new Feature();
	 feature2.setFeture("autopilet");
	 features.add(feature2);
	 car.setFeature(features);
	 
	 entityTransaction.begin();
	 entityManager.persist(car);
	 entityManager.persist(feature);
	 entityManager.persist(feature2);
	 entityTransaction.commit();
	 
	 System.out.println("----data stored------");

}
}
