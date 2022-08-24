package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long aId;

	@Column(name="First_Name", nullable=false, length=50)
	private String aFName;

	@Column(name="Last_Name", nullable=false, length=50)
	private String aLName;

	@Column(name="Email", nullable=false, length=50)
	private String email;

	@Column(name="Password", nullable=false, length=50)
	private String password;

	
		// Setters & Getters
	public Long getaId() {
		return aId;
	}

	public void setaId(Long aId) {
		this.aId = aId;
	}

	public String getaFName() {
		return aFName;
	}

	public void setaFName(String aFName) {
		this.aFName = aFName;
	}

	public String getaLName() {
		return aLName;
	}

	public void setaLName(String aLName) {
		this.aLName = aLName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
 
	
		// Constructors
	public Admin() {
		super();
	}

	public Admin(String aFName, String aLName, String email, String password) {
		super();
		this.aFName = aFName;
		this.aLName = aLName;
		this.email = email;
		this.password = password;
	}

	public Admin(Long aId, String aFName, String aLName, String email, String password) {
		super();
		this.aId = aId;
		this.aFName = aFName;
		this.aLName = aLName;
		this.email = email;
		this.password = password;
	}
	
	
	
}
