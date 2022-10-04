package nguyentientho.techmasterndcjavacore14.research16.part1.exercises;

import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Director;
import nguyentientho.techmasterndcjavacore14.research16.part1.domain.Genre;

import java.util.List;

record DirectorGenresPair(Director director, List<Genre> genres) {
}
