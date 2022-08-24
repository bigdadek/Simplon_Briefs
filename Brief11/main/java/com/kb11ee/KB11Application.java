package com.kb11ee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.models.Admin;
import com.models.Employee;
import com.repositories.AdminRepository;
import com.repositories.EmployeRepository;

@SpringBootApplication
public class KB11Application  implements CommandLineRunner{

	@Autowired
	private EmployeRepository employee;
	private AdminRepository admin;
	
	public static void main(String[] args) {
		SpringApplication.run(KB11Application.class, args);
	}
	
@Bean
	@Override
	public void run(String... args) throws Exception {
		employee.save( new Employee (1L,"kkhadija", "BIGDADE","10 000 DH", "Lqliaa" , "bk@email.com " ,"0611223344"));
		employee.save( new Employee (2L,"kkhadija", "BIGDADE","10 000 DH", "Lqliaa" , "bk@email.com " ,"0611223344"));
		employee.save( new Employee (3L,"kkhadija", "BIGDADE","10 000 DH", "Lqliaa" , "bk@email.com " ,"0611223344"));
		
		admin.save(new Admin(1L,"kb", "123"));
		
	employee.findAll().forEach(p->{
		
		System.out.println(p.toString());
	});
	
	}

}
