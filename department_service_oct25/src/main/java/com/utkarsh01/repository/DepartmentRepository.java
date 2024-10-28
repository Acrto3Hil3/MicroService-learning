package com.utkarsh01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh01.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
