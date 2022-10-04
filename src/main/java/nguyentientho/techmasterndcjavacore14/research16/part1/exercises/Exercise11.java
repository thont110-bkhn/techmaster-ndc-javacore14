package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.dao.InMemoryWorldDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.dao.WorldDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Country;

import static java.util.stream.Collectors.summarizingLong;

public class Exercise11 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the minimum, the maximum and the average population of world countries
		var populationSummary = 
		worldDao.findAllCountries()
		        .stream()
				.collect(summarizingLong(Country::getPopulation));
		System.out.println(populationSummary);
	}

}
