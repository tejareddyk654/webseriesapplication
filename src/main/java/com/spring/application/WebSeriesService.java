package com.spring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebSeriesService {

	@Autowired
	private WebSeriesRepository repo;
	
	public List<WebSeries> ListAll(){
		return repo.findAll();
	}
	
	public void save(WebSeries b) {
		repo.save(b);
	}
	
	public void update(WebSeries b) {
		
	}
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	public List<WebSeries> getbyname(String name) {
		return repo.findbyname(name);
	}
	
	public WebSeries getbyid(int id) {
		return repo.findById(id).get();
	}
	
}
