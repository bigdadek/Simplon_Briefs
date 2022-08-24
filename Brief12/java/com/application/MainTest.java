package com.application;


import java.util.List;

import org.hibernate.Session;

import com.daoImplementation.AdminImp;
import com.daoImplementation.StudentImp;
import com.daoImplementation.TeacherImp;
import com.entities.Admin;
import com.entities.Student;
import com.entities.Teacher;
import com.hibernateUtil.HibernateUtil;

public class MainTest {

	public static void main(String[] args) {
			
							// Admin
		AdminImp adminDAO = new AdminImp();
		
				// Create the Admin 
/*		Admin admin = new Admin("khadija", "Bigdade","kb@gmail.com","kb");
		adminDAO.add(admin);
		
		Admin admin1 = new Admin("kb", "kb","kb@gmail.com","kjkb");
		adminDAO.add(admin1);
		
				// get the Admin 
		Admin admin2 = adminDAO.getById(1);
		System.out.println(admin2.getaFName());
		
				// Update a Student
		Admin admin3 = new Admin(1L,"kb", "Bigdade","bkk@gmail.com","87");
		adminDAO.update(admin3);
		

				// Delete an Admin
		adminDAO.delete(2L);
		
				// get all the Admins
		List<Admin> admins = adminDAO.getAll();
		admins.forEach(s -> System.out.println(s.getaFName()));
	
				// Log In    --> Not Working
		boolean logIn = adminDAO.logIn("kb@gmail.com","kjkb");
		if (logIn== true)
			System.out.println("Done");
		else 
			System.out.println("NOT");
*/	
	
					// ****************************
							// Student
			StudentImp studentDao = new StudentImp();
/*		
				// Add a Student
		Student student = new Student("khadija", "Bigdade",12,"1st class");
		studentDao.add(student);
		student = new Student("kb", "kb",10,"2st class");
		studentDao.add(student);
*/		
				// Update a Student
		Student student1 = new Student(1L,"omar", "dbaa",12,"2nd class");
		studentDao.update(student1);

				// get all the students
		List<Student> students = studentDao.getAll();
		students.forEach(s -> System.out.println(s.getsFName()));
		
			    // get one student
		Student student2 = studentDao.getById(1);
		System.out.println(student2.getsFName());
		
				// delete student
		studentDao.delete(2L);


	}

}
