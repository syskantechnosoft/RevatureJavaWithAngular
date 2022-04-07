package com.revature.moviecatalog.model;

import lombok.Data;

@Data
public class Movie {
	private int id;
	private String imdb_id;
	private String title;
	private String overview;
	private String homepage;
	private long budget;
	private int runtime;
	private long revenue;
	private String tagline;
}
