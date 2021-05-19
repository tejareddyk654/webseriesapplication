package com.spring.application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WebSeriesRepository extends JpaRepository<WebSeries, Integer>{

	@Query("SELECT l from WebSeries l where l.name=?1")
	public List<WebSeries> findbyname(String name);
}
