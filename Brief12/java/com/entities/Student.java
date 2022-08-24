package com.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Students")
public class Student {
	
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long sId;

	@Column(name="First_Name", nullable=false, length=50)
	private String sFName;

	@Column(name="Last_Name", nullable=false, length=50)
	private String sLName;

	@Column(name="Level", nullable=false)
	private int sLevel;

	@Column(name="Class", nullable=false, length=50)
	private String sClass;
	
	@ManyToMany
    @JoinTable( name = "Students_Lessons",
                joinColumns = @JoinColumn( name = "sId" ),
                inverseJoinColumns = @JoinColumn( name = "lId" ) )
    private List<Lesson> sLessons = new ArrayList<>();

	
	// Getter & Setters
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public String getsFName() {
		return sFName;
	}
	public void setsFName(String sFName) {
		this.sFName = sFName;
	}
	public String getsLName() {
		return sLName;
	}
	public void setsLName(String sLName) {
		this.sLName = sLName;
	}
	public int getsLevel() {
		return sLevel;
	}
	public void setsLevel(int sLevel) {
		this.sLevel = sLevel;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	public List<Lesson> getsLessons() {
		return sLessons;
	}
	public void setsLessons(List<Lesson> sLessons) {
		this.sLessons = sLessons;
	}
	
	
			// Constructors
	
	
	public Student() {
		super();
	}
	
	public Student(Long sId, String sFName, String sLName, int sLevel, String sClass) {
		super();
		this.sId = sId;
		this.sFName = sFName;
		this.sLName = sLName;
		this.sLevel = sLevel;
		this.sClass = sClass;
	}
	
	public  Student(String sFName, String sLName, int sLevel, String sClass) {
		super();
		this.sFName = sFName;
		this.sLName = sLName;
		this.sLevel = sLevel;
		this.sClass = sClass;
	}
	
	public Student(String sFName, String sLName, int sLevel, String sClass, List<Lesson> sLessons) {
		super();
		this.sFName = sFName;
		this.sLName = sLName;
		this.sLevel = sLevel;
		this.sClass = sClass;
		this.sLessons = sLessons;
	}
}
