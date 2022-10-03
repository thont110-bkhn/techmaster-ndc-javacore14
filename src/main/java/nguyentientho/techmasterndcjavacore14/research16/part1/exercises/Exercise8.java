package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Movie;
import nguyentientho.techmasterndcjavacore14.research16.part1.service.InMemoryMovieService;
import nguyentientho.techmasterndcjavacore14.research16.part1.service.MovieService;

import java.util.stream.Collectors;

public class Exercise8 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Group the movies by the year and list them
		var moviesByYear =
		movieService.findAllMovies().stream()
		            .collect(Collectors.groupingBy(Movie::getYear));
		moviesByYear.forEach((year,movies) -> System.out.printf("%d: %s\n",year,movies));
	}

}
