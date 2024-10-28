package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.utkarsh01.entity.Department;
import com.utkarsh01.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/")
	public List<Department> getAllDept(){
		return departmentService.getAllDepts();
	}
	
	@GetMapping("/getDept/{id}")
	public Department getDept(@PathVariable Integer id) throws Exception {
		return departmentService.getOneDept(id);
	}
	
	
	@PostMapping("/saveDept")
	public Department saveDept(@RequestBody Department dept) {
		return departmentService.saveDept(dept);
	}
}
