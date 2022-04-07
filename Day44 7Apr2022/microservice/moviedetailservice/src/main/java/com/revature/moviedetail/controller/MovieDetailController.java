package com.revature.moviedetail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.moviedetail.model.Movie;



@RestController
public class MovieDetailController {

	@Value("${api.key}")
	private String apiKey;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/movies/{id}")
	public Movie getMovieInfo(@PathVariable int id) {
		Movie movie = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + id + "?api_key=" + apiKey,
				Movie.class);
		return movie;
	}
}
