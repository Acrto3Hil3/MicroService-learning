package com.utkarsh01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class DepartmentServiceOct25Application {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceOct25Application.class, args);
	}

}
