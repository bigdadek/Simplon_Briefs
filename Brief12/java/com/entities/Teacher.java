package com.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Teachers")
public class Teacher {
	
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long tId;

	@Column(name="First_Name", nullable=false, length=50)
	private String tFName;

	@Column(name="Last_Name", nullable=false, length=50)
	private String tLName;

	@Column(name="Level", nullable=false)
	private int tlevel;
	
	
	 
	
			// Getter & Setters
	public Long gettId() {
		return tId;
	}
	public void settId(Long tId) {
		this.tId = tId;
	}
	public String gettFName() {
		return tFName;
	}
	public void settFName(String tFName) {
		this.tFName = tFName;
	}
	public String gettLName() {
		return tLName;
	}
	public void settLName(String tLName) {
		this.tLName = tLName;
	}
	public int getlevel() {
		return tlevel;
	}
	public void settlevel(int tlevel) {
		this.tlevel = tlevel;
	}
	

	
				// Constructors
	public Teacher(Long tId, String tFName, String tLName, int tlevel) {
		super();
		this.tId = tId;
		this.tFName = tFName;
		this.tLName = tLName;
		this.tlevel = tlevel;
	}
	
	public Teacher(String tFName, String tLName, int tlevel) {
		super();
		this.tFName = tFName;
		this.tLName = tLName;
		this.tlevel = tlevel;
	}
	
	public Teacher() {
		super();
	}

}
