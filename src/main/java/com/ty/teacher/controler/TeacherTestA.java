package com.ty.teacher.controler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.teachet.dto.Subject;
import com.ty.teachet.dto.Teacher;

public class TeacherTestA {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	List<Teacher> teachers=new ArrayList<Teacher>();
	Teacher teacher1=new Teacher();
	teacher1.setName("tony");
	teacher1.setAge(25);
	teachers.add(teacher1);
	
	Teacher teacher2=new Teacher();
	teacher2.setName("vicky");
	teacher2.setAge(23);
	teachers.add(teacher2);
	
	Subject subject=new Subject();
	subject.setDay(30);
	subject.setName("biology");
	
	subject.setTeacher(teachers);
	
	entityTransaction.begin();
	entityManager.persist(teacher1);
	entityManager.persist(teacher2);
	entityManager.persist(subject);
	entityTransaction.commit();
	System.out.println("----------data stored-----------");
	

}
}
