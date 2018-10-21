package com.hibernet.configration;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernet.entity.student;



public class StudentDemo {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("hibernate.cfg.xml").addAnnotatedClass(student.class)
				.buildSessionFactory();
	   Session s=sf.getCurrentSession();
	   
	   student obj=new student("ram","mane");
	   s.beginTransaction();
	   s.save(obj);
	   s.getTransaction().commit();
	   
	   
	   //System.out.println(obj.getId());
	  // System.out.println(obj.getFname());
	  // System.out.println(obj.getLname());
		
	s.close();

				 
	}
}
