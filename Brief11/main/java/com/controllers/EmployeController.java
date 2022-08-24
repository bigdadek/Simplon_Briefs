package com.controllers;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.models.Employee;
import com.repositories.EmployeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class EmployeController {
	
	private EmployeRepository employeDao;
	
	@GetMapping(path = "/index")
	public  String employe (Model model, 
			@RequestParam(name= " page",defaultValue = "0")int page,
			@RequestParam(name= " size",defaultValue = "5")int size,
		@RequestParam(name= " Keyword",defaultValue = "")String Keyword){
		
		Page<Employee> pageemploye=employeDao.findAll(PageRequest.of(page, size));
	//	Page<Employe> pageemploye=employeDao.findByNomContains(Keyword, PageRequest.of(page, size));
		model.addAttribute("ListEmployes",pageemploye.getContent());
		model.addAttribute("pages", new int [pageemploye.getTotalPages()]);
		model.addAttribute("currentPage",page);
		model.addAttribute("Keyword",Keyword);
		
		return "Dashboard";
	}
	
	
	@GetMapping("/delete")
	public String  delete (Long id) {
		employeDao.deleteById(id);
		return "redirect:/index";
	}
	
	@GetMapping("/EditEmployee")
	public String  EditEmployee (Model model, Long id) {
		Employee employe=employeDao.findById(id).orElse(null);
		if (employe==null) throw new RuntimeException("Employee Not Exist");
		model.addAttribute("employe", employe );
		return "EditEmployee";
	}
	
	@GetMapping("/")
	public String  home () {
		return "redirect:/index";
	}
	
	@GetMapping("/NewEmployee")
	public String  NewEmployee (Model model) {
		model.addAttribute("employe", new Employee());
		return "NewEmployee";
	}
	
	@PostMapping (path="/save")
	public String save(Model model, @Valid Employee employee , BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return "NewEmployee";
		employeDao.save(employee);
		return "redirect:/index";
		
		
	}

}
