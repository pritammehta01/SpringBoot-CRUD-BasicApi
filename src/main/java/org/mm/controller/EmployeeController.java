package org.mm.controller;

import java.util.List;

import org.mm.entities.Employee;
import org.mm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/employee")
	public List<Employee> index()
	{
		return employeeService.getEmployee();
	}
	
	@PostMapping(value = "/employee") 
	public Employee save(@RequestBody Employee emp)
	{
		return employeeService.saveEmployee(emp);
	}
	
	@GetMapping(value = "/employee/{id}")
	public Employee getById(@PathVariable("id") long id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping(value = "/employee/{id}")
	public void deleteById(@PathVariable("id") long id)
	{
		employeeService.deleteById(id);
	}
	
	@PutMapping(value = "/employee")
	public Employee update(@RequestBody Employee emp)
	{ 
		return employeeService.update(emp);
	}
}
