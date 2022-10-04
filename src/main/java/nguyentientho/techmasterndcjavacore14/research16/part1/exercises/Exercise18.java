package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Movie;
import nguyentientho.techmasterndcjavacore14.research16.part1.service.InMemoryMovieService;
import nguyentientho.techmasterndcjavacore14.research16.part1.service.MovieService;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Exercise18 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the year where the maximum number of movie is available
        var movies = movieService.findAllMovies();
        var maxMovieCountByYear = 
          movies.stream()
                .collect(groupingBy(Movie::getYear,counting()))
        		.entrySet()
        		.stream()
        		.max(comparingByValue());
        maxMovieCountByYear.ifPresent(System.out::println);
	}

}
