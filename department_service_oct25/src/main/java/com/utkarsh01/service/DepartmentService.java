package com.utkarsh01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.Department;
import com.utkarsh01.exception.DepartmentNotFoundException;
import com.utkarsh01.repository.DepartmentRepository;


@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepts(){
		return departmentRepository.findAll();
	}
	
	public Department getOneDept(Integer deptId) throws Exception {
		Optional<Department> optDept= departmentRepository.findById(deptId);
		if(optDept.isPresent())
			return optDept.get();
		throw new DepartmentNotFoundException("Department not Found!!");
	}
	
	@Transactional(rollbackForClassName="{java.lang.Exception}")
	public Department saveDept(Department dept) {
		return departmentRepository.save(dept);
	}
}
