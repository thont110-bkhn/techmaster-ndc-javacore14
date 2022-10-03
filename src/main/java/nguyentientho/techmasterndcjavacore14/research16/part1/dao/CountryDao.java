package nguyentientho.techmasterndcjavacore14.research16.part1.dao;

import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Country;

import java.util.List;
import java.util.Set;

public interface CountryDao {
	Country findCountryByCode(String code);

	Country removeCountry(Country country);

	Country addCountry(Country country);

	Country updateCountry(Country country);

	List<Country> findAllCountries();

	List<Country> findCountriesByContinent(String continent);

	Set<String> getAllContinents();
}
