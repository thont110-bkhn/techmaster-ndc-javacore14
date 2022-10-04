package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Director;
import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Movie;
import nguyentientho.techmasterndcjavacore14.research16.part1.service.InMemoryMovieService;
import nguyentientho.techmasterndcjavacore14.research16.part1.service.MovieService;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise1 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of movies of each director
        final Collection<Movie> movies = movieService.findAllMovies();
        Map<String,Long> dirMovCounts = 
        movies.stream().map(Movie::getDirectors)
        			   .flatMap(Collection::stream)
                       .collect(Collectors.groupingBy(
                    		       Director::getName,
                    		       Collectors.counting()
                    		     )
                        );
        dirMovCounts.forEach(
        		(name,count) -> System.out.printf("%20s: %3d\n",name,count));
	}

}
