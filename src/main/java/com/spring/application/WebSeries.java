package com.spring.application;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WebSeries {

	private @Id int id;
	private String name;
	private int seasons;
	private int episodes;
	private int ratings;

	public WebSeries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebSeries(int id, String name, int seasons, int episodes, int ratings) {
		super();
		this.id = id;
		this.name = name;
		this.seasons = seasons;
		this.episodes = episodes;
		this.ratings = ratings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

}
