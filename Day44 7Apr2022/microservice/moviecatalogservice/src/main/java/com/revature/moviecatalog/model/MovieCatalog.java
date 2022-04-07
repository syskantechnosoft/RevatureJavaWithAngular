package com.revature.moviecatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieCatalog {

	private int id;
	private String imdb_id;
	private String title;
	private String overview;
	private String homepage;
	private String release_date;
	private float vote_average;
	private float vote_count;

}
