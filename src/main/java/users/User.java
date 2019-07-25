package main.java.users;

import java.time.LocalDate;

public class User {
    private String email;
    private String team;
    private LocalDate loginDate;

    User(String email, String team, LocalDate loginDate) {
        this.email = email;
        this.team = team;
        this.loginDate = loginDate;
    }

    String getEmail() {
        return email;
    }

    String getTeam() {
        return team;
    }

    LocalDate getLoginDate() {
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
