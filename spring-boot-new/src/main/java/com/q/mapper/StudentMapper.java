package com.q.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.q.model.Student;

@Mapper
public interface StudentMapper {

	@Select("select * from tb_student")
	List<Student> queryALLStudent();
	
}
