package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.service.InMemoryMovieService;
import nguyentientho.techmasterndcjavacore14.research16.part1.service.MovieService;

import java.util.List;

public class Exercise7 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the list of movies having the genres "Drama" and "Comedy" only
		var listOfGenreNames = List.of("Drama", "Comedy");
		var listOfGenres = listOfGenreNames.stream().map(movieService::findGenreByName).toList();
		var moviesInDramaAndComedyOnly =
		movieService.findAllMovies()
		            .stream()
		            .filter( movie -> movie.getGenres().size() == 2)
		            .filter( movie -> movie.getGenres().containsAll(listOfGenres))
		            .toList();
		moviesInDramaAndComedyOnly.forEach(movie -> System.out.printf("%s %s\n",movie,movie.getGenres()));
	}

}
