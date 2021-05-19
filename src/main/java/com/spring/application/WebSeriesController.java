package com.spring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSeriesController {
	
	@Autowired
	private WebSeriesService service;
	
	
	@PostMapping(path="/addSeries", consumes="application/json", produces="application/text")
	public void addSeries(@RequestBody WebSeries w)
	{
		service.save(w);
		
	}
	
	@GetMapping("/series")
	public List<WebSeries> getAll(){
		return service.ListAll();
	}
	
	@GetMapping("/series/id/{id}")
	public WebSeries getByid(@PathVariable("id")int id)
	{
		return service.getbyid(id);
	}
	
	
	@GetMapping("/series/name/{name}")
	public List<WebSeries> getByName(@PathVariable("name")String name)
	{
		return service.getbyname(name);
	}
	
	
	@PutMapping("/update")
	public void updateSeries(@RequestBody WebSeries nw)
	{
		WebSeries w = service.getbyid(nw.getId()); 
		w.setEpisodes(nw.getEpisodes());
		w.setName(nw.getName());
		w.setSeasons(nw.getSeasons());
		w.setRatings(nw.getRatings());
		service.save(w);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") String res) {
		int id=Integer.parseInt(res);
		service.delete(id);
		return "Series Removed! "+id;
	}
}
