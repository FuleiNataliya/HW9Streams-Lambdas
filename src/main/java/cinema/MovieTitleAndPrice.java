package main.java.cinema;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MovieTitleAndPrice {
    public Map<String, Double> avergePrice(List<Movie> list1, List<Movie> list2) {
        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingInt(Movie::getPrice)));
    }

    public Map<String, Long> moviesGenre(List<Movie> list1, List<Movie> list2) {
        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
    }

    public List<Movie> list1() {
        return Arrays.asList(
                new Movie("Comedy", 140),
                new Movie("Drama", 100),
                new Movie("Fantasy", 110),
                new Movie("Comedy", 80),
                new Movie("Action", 90),
                new Movie("Fantasy", 100));

    }

    public List<Movie> list2() {
        return Arrays.asList(
                new Movie("History", 80),
                new Movie("Action", 100),
                new Movie("History", 900),
                new Movie("Action", 60),
                new Movie("Drama", 60),
                new Movie("Action", 100));

    }


}
