package com.ty.teacher.controler;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.teachet.dto.Subject;
import com.ty.teachet.dto.Teacher;

public class TeacherRitrive {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Teacher teacher=entityManager.find(Teacher.class, 3);
	
	System.out.println("id is :"+teacher.getId());
	System.out.println("name is :"+teacher.getName());
	System.out.println("age is :"+teacher.getAge());
	
	List<Subject> subject=teacher.getSubject();
	for(Subject s:subject) {
	System.out.println("subject name is :"+s.getName());
	System.out.println("subject days is :"+s.getDay());
	
	}
}
}
