package main.java.boxes;

public class Box {
    private String name;
    private String type;

    public Box(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
