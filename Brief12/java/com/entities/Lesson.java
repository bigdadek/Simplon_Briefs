package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Lessons")
public class Lesson {

	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long lId;

	@Column(name="Level", nullable=false)
	private int level;

	@Column(name="Subject", nullable=false, length=50)
	private String lSubject;

	@Column(name="Title", nullable=false, length=50)
	private String lTitle;

	@Column(name="Lesson", nullable=false, length=50)
	private String lesson;
	
	@ManyToMany
    @JoinTable( name = "Students_Lessons",
                joinColumns = @JoinColumn( name = "lId" ),
                inverseJoinColumns = @JoinColumn( name = "sId" ) )
    private List<Student> lStudents = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name="tId")
	private Teacher lTeacher;
	
	
	// Getter & Setters
	public Long getlId() {
		return lId;
	}
	public void setlId(Long lId) {
		this.lId = lId;
	}
	public Teacher getlTeacher() {
		return lTeacher;
	}
	public void setlTeacher(Teacher lTeacher) {
		this.lTeacher = lTeacher;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getlSubject() {
		return lSubject;
	}
	public void setlSubject(String lSubject) {
		this.lSubject = lSubject;
	}
	public String getlTitle() {
		return lTitle;
	}
	public void setlTitle(String lTitle) {
		this.lTitle = lTitle;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public List<Student> getlStudents() {
		return lStudents;
	}
	public void setlStudents(List<Student> lStudents) {
		this.lStudents = lStudents;
	}
	
			// Constructors
	public Lesson() {
		super();
	}
	
	public Lesson(Long lId , int level, String lSubject, String lTitle, String lesson) {
		super();
		this.lId = lId;
		this.level = level;
		this.lSubject = lSubject;
		this.lTitle = lTitle;
		this.lesson = lesson;
	}
	
	public Lesson(int level, String lSubject, String lTitle, String lesson) {
		super();
		this.level = level;
		this.lSubject = lSubject;
		this.lTitle = lTitle;
		this.lesson = lesson;
	}
	
	public Lesson(int level, String lSubject, String lTitle, String lesson, Teacher lTeacher) {
		super();
		this.level = level;
		this.lSubject = lSubject;
		this.lTitle = lTitle;
		this.lesson = lesson;
		this.lTeacher = lTeacher;
	}
	
	public Lesson(int level, String lSubject, String lTitle, String lesson, List<Student> lStudents, Teacher lTeacher) {
		super();
		this.level = level;
		this.lSubject = lSubject;
		this.lTitle = lTitle;
		this.lesson = lesson;
		this.lStudents = lStudents;
		this.lTeacher = lTeacher;
	}
	
	
}
