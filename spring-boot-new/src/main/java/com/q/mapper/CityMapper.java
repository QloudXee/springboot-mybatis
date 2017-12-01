package com.q.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.q.model.City;
import com.q.model.Student;

@Mapper
public interface CityMapper {

	@Select("select * from city where state = #{state}")
	City findByState(@Param("state") String state);

	@Select("select * from city")
	List<City> queryAll();
	
}
