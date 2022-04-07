package com.revature.movierating.model;

import lombok.Data;

@Data
public class MovieRating {

	private int id;
	private String imdb_id;
	private float popularity;
	private String release_date;
	private float vote_average;
	private long vote_count;

}
