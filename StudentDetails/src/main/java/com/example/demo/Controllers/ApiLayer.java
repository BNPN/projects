package com.example.demo.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Services.StudentgDbServices;
import com.example.demo.Model.Student;

@RestController
public class ApiLayer {
	@Autowired
	public StudentgDbServices services;
	@GetMapping("/users")
	public ArrayList<Student> getStudent(){
		return services.getStudent();
		
	}
}
