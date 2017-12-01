package com.q.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q.mapper.StudentMapper;
import com.q.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	public List<Student> queryAllStudent(){
		return studentMapper.queryALLStudent();
	}
}
