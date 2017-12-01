package com.q.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.q.model.City;
import com.q.service.CityService;

@Controller
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/show")
	public String getCityByStatue() {
		City city = cityService.getOneCity("1");
		System.out.println(city.getName());
		return "index";
	}
	
	@RequestMapping("/query")
	public String queryAll(){
		List<City> cities = cityService.queryAll();
		for(City city : cities){
			System.out.println(city);
		}
		return "index";
	}
}
