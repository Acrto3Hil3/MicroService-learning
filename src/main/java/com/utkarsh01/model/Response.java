package com.utkarsh01.model;

import com.utkarsh01.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor
public class Response {
	private Employee emp;
	private Department dept;
}
