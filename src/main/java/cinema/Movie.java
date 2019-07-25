package main.java.cinema;

public class Movie {
    private String genre;
    private Integer price;

    Movie(String genre, Integer price) {
        this.genre = genre;
        this.price = price;
    }

    String getGenre() {
        return genre;
    }

    Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}


