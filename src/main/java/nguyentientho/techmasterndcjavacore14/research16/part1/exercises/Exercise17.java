package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.dao.InMemoryWorldDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.dao.WorldDao;
import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Country;
import nguyentientho.techmasterndcjavacore14.research16.part1.util.DoubleSummaryGaussianStatistics;

public class Exercise17 {
	private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the minimum, the maximum, the average, and the standard deviation of GNP values.
        var gnpStatistics =
           worldDao.findAllCountries()
                   .stream()
                   .mapToDouble(Country::getGnp)
                   .collect(
                           DoubleSummaryGaussianStatistics::new,
                           DoubleSummaryGaussianStatistics::accept,
                           DoubleSummaryGaussianStatistics::combine
                   );
        System.out.println(gnpStatistics);
	}

}
