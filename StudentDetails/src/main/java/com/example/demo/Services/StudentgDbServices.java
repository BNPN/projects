package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.demo.Model.BookRMapper;
import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
@Service
public class StudentgDbServices implements StudentRepository {
	
	@Autowired
    private JdbcTemplate db;
	
	@Override
	public ArrayList<Student> getStudent() {
		List<Student> bookList = db.query("select * from studentdetails", new BookRMapper());
        ArrayList<Student> books = new ArrayList<>(bookList);
        return books;
		
	}
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	 

}
