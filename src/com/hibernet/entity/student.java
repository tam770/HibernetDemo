package com.hibernet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class student 
{
     @Id
     //@GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name ="id")
	 private int id;
     @Column(name="fname")
	 private String fname;
     
     @Column(name="lname")
	 private String lname;
     
	public student() {
		
	}
	public student( String fname, String lname) {
		
		
		this.fname = fname;
		this.lname = lname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
     
}
