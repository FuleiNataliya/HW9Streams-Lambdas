package main.java.users;

import java.time.LocalDate;
import java.util.List;

public class Users {
    private String email;
    private String team;
    private LocalDate loginDate;
    private List<String> classes;

    public Users(String email, String team, LocalDate loginDate, List<String> classes) {
        this.email = email;
        this.team = team;
        this.loginDate = loginDate;
        this.classes = classes;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public List<String> getClasses() {
        return classes;
    }
}
