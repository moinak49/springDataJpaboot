package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Emp;
import com.cg.service.IEmpService;

@SpringBootApplication
public class SpringDataJpaBootApplication implements CommandLineRunner{
	
	@Autowired
	private IEmpService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("View all Employee---------------------------------------");
		service.viewEmployee().forEach(e->System.out.println(e + " " + e.getDept()));
		System.out.println("View Employee by ID-------------------------------------");
		Emp emp= service.viewEmployee(1951);
		System.out.println(emp + " " + emp.getDept());
		
	}

}
