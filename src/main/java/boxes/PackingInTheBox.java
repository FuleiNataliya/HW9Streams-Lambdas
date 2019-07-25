package main.java.boxes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PackingInTheBox {
    public List<Protector> packingThing(List<Thing> boxBrittleThing, List<Thing> boxStrongThing) {
        return Stream.concat(boxBrittleThing.stream(), boxStrongThing.stream())
                .filter(t -> (boxBrittleThing.stream()
                        .map(Thing::getName).collect(Collectors.toList()).contains(t.getName())))
                .map(Protector::new)
                .collect(Collectors.toList());

    }

    public List<Thing> boxBrittleThing() {
        return Arrays.asList(
                new Thing("phone"),
                new Thing("mirror"),
                new Thing("vase"),
                new Thing("dishes"),
                new Thing("TV"));
    }

    public List<Thing> boxStrongThing() {
        return Arrays.asList(
                new Thing("bag"),
                new Thing("shoes"),
                new Thing("table"),
                new Thing("chair"),
                new Thing("toys"));
    }
}
