package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="Emploies")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Employee {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="Full_Name", nullable=false, length=50)
	private String fName;
	
	@Column(name="Last_Name", nullable=false, length=50)
	private String lName;
	
	@Column(name="Salary", nullable=false, length=50)
	private String salary;
	
	@Column(name="Adress", nullable=false, length=50)
	private String Adress;

	@Column(name="Email", nullable=false, length=50)
	private String email;
	
	@Column(name="Phone_Number", nullable=false, length=50)
	private String phone;
	
	
	
	

}
