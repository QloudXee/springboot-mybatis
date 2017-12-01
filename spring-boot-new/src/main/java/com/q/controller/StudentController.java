package com.q.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.q.model.Student;
import com.q.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/query")
	public String query(Model model){
		List<Student> students = studentService.queryAllStudent();
		for(Student student : students){
			System.out.println(student);
		}
		return "student";
	}
	
	@RequestMapping("/queryAll")
	public void login(HttpServletRequest request,HttpServletResponse response) throws IOException{  
		List<Student> students = studentService.queryAllStudent();
		PrintWriter out = response.getWriter();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("students", students);
		out.print(jsonObject.toJSONString());
    }  
	
}
