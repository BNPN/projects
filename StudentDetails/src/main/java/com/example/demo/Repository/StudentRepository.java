package com.example.demo.Repository;

import java.util.ArrayList;

import com.example.demo.Model.Student;

public interface StudentRepository {
	ArrayList<Student> getStudent();
	Student getStudentById(int id);

}
