package org.mm.service;

import java.util.List;

import org.mm.dao.EmployeeRepository;
import org.mm.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployee()
	{
		return (List<Employee>)employeeRepository.findAll();
	}
	
	public Employee saveEmployee(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	public Employee getEmployeeById(long id)
	{
		return employeeRepository.findById(id).get();
	}
	
	public void deleteById(long id)
	{
		employeeRepository.deleteById(id);
	}
	
	public Employee update(Employee emp)
	{
		return employeeRepository.save(emp);
	}
}
