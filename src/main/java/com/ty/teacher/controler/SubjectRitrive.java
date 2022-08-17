package com.ty.teacher.controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.teachet.dto.Subject;
import com.ty.teachet.dto.Teacher;

public class SubjectRitrive {
public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Subject  subject=entityManager.find(Subject.class, 2);
	
	System.out.println("id is :"+subject.getId());
	System.out.println("name is :"+subject.getName());
	System.out.println("days is :"+subject.getDay());
	
	List<Teacher> teachers=subject.getTeacher();
	for(Teacher t :teachers) {
		System.out.println("name Is :"+t.getName());
		System.out.println("age Is :"+t.getAge());
	
	}
}
}
