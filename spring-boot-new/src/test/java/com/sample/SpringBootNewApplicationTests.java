package com.sample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.q.model.Student;
import com.q.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootNewApplicationTests {
	
	@Autowired
	private StudentService studentService;

	@Test
	public void contextLoads() {
		List<Student> students = studentService.queryAllStudent();
		for(Student student : students){
			System.out.println(student);
		}
	}

}
