package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.dao.CityDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.dao.CountryDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.dao.InMemoryWorldDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.domain.City;
import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Country;

import java.util.Comparator;
import java.util.Objects;

public class Exercise4 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
	private static final CityDao cityDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the highest populated capital city
		var highPopulatedCapitalCity = 
				countryDao.findAllCountries()
				          .stream()
				          .map(Country::getCapital)
				          .filter(Objects::nonNull)
				          .map(cityDao::findCityById)
				          .filter(Objects::nonNull)
				          .max(Comparator.comparing(City::getPopulation));
		highPopulatedCapitalCity.ifPresent(System.out::println);		          
	}

}
