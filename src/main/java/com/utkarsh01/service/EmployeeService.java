package com.utkarsh01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.utkarsh01.entity.Employee;
import com.utkarsh01.exception.EmployeeNotFoundException;
import com.utkarsh01.model.Department;
import com.utkarsh01.model.Response;
import com.utkarsh01.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

	@Autowired
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	private final RestTemplate restTemplate;
	
	public List<Employee> showAllEmp(){
		return employeeRepository.findAll();
	}
	
	public Response showOneEmp(Integer id) throws EmployeeNotFoundException {
		Response response=new Response();
		Employee emp=null;
		Optional<Employee>  optEmp=employeeRepository.findById(id);
		if(optEmp.isPresent()) {
			emp=optEmp.get();
			response.setEmp(emp);
		} else {
			throw new EmployeeNotFoundException("Employee is not found!!");
		}
			Department dept=restTemplate.getForObject("http://localhost:9001/dept/getDept/"+emp.getDeptId(),Department.class);
			response.setDept(dept);
		return response;
	}
	
	@Transactional(noRollbackForClassName = "{java.lang.Exception}")
	public Employee saveEmp(Employee emp) {
		return employeeRepository.save(emp);
	}
}
