package main.java.cinema;

public class Movie {
    private String genre;
    private Integer price;

    public Movie(String genre, Integer price) {
        this.genre = genre;
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getPrice() {
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


