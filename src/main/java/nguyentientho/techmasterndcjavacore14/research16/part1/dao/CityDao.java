package nguyentientho.techmasterndcjavacore14.research16.part1.dao;

import nguyentientho.techmasterndcjavacore14.research16.part1.domain.City;

import java.util.List;

public interface CityDao {
	City findCityById(int id);

	City removeCity(City city);

	City addCity(City city);

	City updateCity(City city);

	List<City> findAllCities();

	List<City> findCitiesByCountryCode(String countryCode);
}
