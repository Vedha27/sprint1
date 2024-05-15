package com.tnsif.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.EmployeeManagement.entity.Employee;
import com.tnsif.EmployeeManagement.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repo;
	

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e )
	{
		
		return repo.save(e);
	
	}
	
	@GetMapping("/allEmployee")
	public  List<Employee> getEmployee()
	{
		 return repo.findAll();
	}
	
	@GetMapping("/Employee/{id}")
	public Employee getEmployeeById(@PathVariable Integer id)
	{
		return repo.findById(id).get();
	}
	
	@DeleteMapping("/Employee/{id}")
	public void deleteProduct(@PathVariable Integer id)
	{
		repo.deleteById(id);
	}

	@PutMapping("/Employee/{id}")
	public void updateEmployee(@PathVariable Long id,@RequestBody Employee e)
	{
		e.setId(id);
		repo.save(e);
	}
}