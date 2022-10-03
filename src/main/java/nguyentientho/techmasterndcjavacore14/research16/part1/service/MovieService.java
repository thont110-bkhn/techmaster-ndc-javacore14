package nguyentientho.techmasterndcjavacore14.research16.part1.service;

import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Director;
import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Genre;
import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Movie;
import nguyentientho.techmasterndcjavacore14.research16.part1.model.CriteriaBean;

import java.util.Collection;
import java.util.List;

public interface MovieService {
	Movie findMovieById(int id);

	Collection<Movie> findAllMovies();

	Collection<Movie> findAllMoviesByYearRange(int fromYear, int toYear);

	Collection<Movie> findAllMoviesByDirectorId(int directorId);

	Collection<Movie> findAllMoviesByYearRangeAndGenre(String genre,
			int fromYear, int toYear);

	Collection<Movie> findAllMoviesByGenre(String genre);
	Collection<Movie> findAllMoviesByCriteria(CriteriaBean criteria);

	Movie addMovie(int id, String title, int year, String imdb,
				   List<Genre> genres, List<Director> directors);

	Genre findGenreByName(String genre);

	Collection<Genre> findAllGenres();

	Collection<Director> findAllDirectors();
}
