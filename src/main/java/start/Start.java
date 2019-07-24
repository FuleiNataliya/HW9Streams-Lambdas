package main.java.start;

import main.java.boxes.Box;
import main.java.boxes.PackingInTheBox;
import main.java.boxes.Protector;
import main.java.boxes.Thing;
import main.java.cinema.Movie;
import main.java.cinema.MovieTitleAndPrice;
import main.java.users.User;
import main.java.users.UsersIsLastLogin;

import java.util.List;
import java.util.Map;

public class Start {
    public void start() {
        UsersIsLastLogin user = new UsersIsLastLogin();
        List<User> users = user.usersList();
        Map<String, List<String>> stringListMap = user.filterUsers(users);
        System.out.println("Users who logged in not later than a week ago: " + "\n" + stringListMap);
        MovieTitleAndPrice movie = new MovieTitleAndPrice();
        List<Movie> movies = movie.list1();
        List<Movie> movies1 = movie.list2();
        Map<String, Double> stringDoubleMap = movie.avergePrice(movies, movies1);
        System.out.println("Average ticket price in the cinema: " + "\n" + stringDoubleMap);
        Map<String, Long> stringLongMap = movie.moviesGenre(movies, movies1);
        System.out.println("Number of movies in the given genre: " + "\n" + stringLongMap);
        PackingInTheBox box = new PackingInTheBox();
        List<Thing> thing = box.boxBrittleThing();
        List<Thing> thing1 = box.boxStrongThing();
        List<Protector> protectorList = box.packingThing(thing, thing1);
        System.out.println("List of fragile packed items: " + "\n" + protectorList);

    }
}
