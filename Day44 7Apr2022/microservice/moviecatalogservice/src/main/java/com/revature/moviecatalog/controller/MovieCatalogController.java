package com.revature.moviecatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.moviecatalog.model.Movie;
import com.revature.moviecatalog.model.MovieCatalog;
import com.revature.moviecatalog.model.MovieRating;

@RestController
public class MovieCatalogController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/catalog/{id}")
	public MovieCatalog getMovieCatalog(@PathVariable int id) {

		Movie movie = restTemplate.getForObject("http://movie-detail-service/movies/" + id, Movie.class);

		MovieRating movieRating = restTemplate.getForObject("http://movie-rating-service/movieRating/" + id,
				MovieRating.class);

		MovieCatalog movieCatalog = new MovieCatalog(id, movie.getImdb_id(), movie.getTitle(), movie.getOverview(),
				movie.getHomepage(), movieRating.getRelease_date(), movieRating.getVote_average(),
				movieRating.getVote_count());
		return movieCatalog;
	}
}
