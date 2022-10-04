package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.dao.InMemoryWorldDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.dao.WorldDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.util.CountrySummaryStatistics;

import java.util.function.Supplier;

import static java.lang.Long.compare;

public class Exercise13 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

	private static final Supplier<CountrySummaryStatistics> countrySummaryStatisticsSupplier =
			() -> new CountrySummaryStatistics((l, r) -> compare(l.getPopulation(), r.getPopulation()));

	public static void main(String[] args) {
		// Find the countries with the minimum and the maximum population
		var countrySummaryStatistics = 
				worldDao.findAllCountries()
				        .stream()
				        .collect(countrySummaryStatisticsSupplier, CountrySummaryStatistics::accept, CountrySummaryStatistics::combine);
		System.out.println(countrySummaryStatistics);
	}

}
