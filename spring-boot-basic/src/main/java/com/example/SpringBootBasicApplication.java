package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.service.IGreetService;
import org.springframework.context.annotation.ComponentScan;

import com.vfislk.training.ShapeFactory;

@SpringBootApplication
@ComponentScan({"com.vfislk.training"," com.example"})
public class SpringBootBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}

	@Autowired
	IGreetService greetService;
	
	@Autowired
	ShapeFactory factory;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("printing area");
		factory.printArea(10, 10);
		
	}

}

