package com.q.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q.mapper.CityMapper;
import com.q.model.City;

@Service
public class CityService {

	@Autowired
	private CityMapper cityMapper;
	
	public City getOneCity(String state) {
		return cityMapper.findByState(state);
	}
	
	public List<City> queryAll(){
		return cityMapper.queryAll();
	}
}
