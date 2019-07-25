package main.java.users;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsersIsLastLogin {

    public Map<String, List<String>> filterUsers(List<User> usersList) {
        return usersList.stream()
                .filter(user -> user.getLoginDate()
                        .isAfter(LocalDate.now().minusDays(8)))
                .collect(Collectors.groupingBy(User::getTeam, Collectors.mapping(User::getEmail, Collectors.toList())));

    }

    public List<User> usersList() {
        return Arrays.asList(
                new User("igor@gmail.com", "Go", LocalDate.of(2019, 7, 7)),
                new User("ivan@gmail.com", "Run", LocalDate.of(2019, 7, 10)),
                new User("oleg@gmail.com", "Walk", LocalDate.of(2019, 7, 15)),
                new User("petro@gmail.com", "Go", LocalDate.of(2019, 7, 20)),
                new User("vova@gmail.com", "Run", LocalDate.of(2019, 7, 1)),
                new User("bogdan@gmail.com", "Walk", LocalDate.of(2019, 7, 22)));

    }

}
