package main.java.users;

import java.time.LocalDate;

public class User {
    private String email;
    private String team;
    private LocalDate loginDate;

    public User(String email, String team, LocalDate loginDate) {
        this.email = email;
        this.team = team;
        this.loginDate = loginDate;
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

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", team='" + team + '\'' +
                ", loginDate=" + loginDate +
                '}';
    }
}
