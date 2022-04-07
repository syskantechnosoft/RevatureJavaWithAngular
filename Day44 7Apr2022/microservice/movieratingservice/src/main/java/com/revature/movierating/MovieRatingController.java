package com.revature.movierating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.movierating.model.MovieRating;

@RestController
public class MovieRatingController {

	@Value("${api.key}")
	private String apiKey;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/movieRating/{id}")
	public MovieRating getMovieInfo(@PathVariable int id) {
		MovieRating movieRating = restTemplate
				.getForObject("https://api.themoviedb.org/3/movie/" + id + "?api_key=" + apiKey, MovieRating.class);
		return movieRating;
	}
}
