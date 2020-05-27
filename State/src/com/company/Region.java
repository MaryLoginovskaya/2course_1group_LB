package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class Region {
    Scanner scanner = new Scanner(System.in);
    String name;

    Region() {
        System.out.print("Название района: ");
        name = scanner.next();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Region.class.getSimpleName() + "[", "]")
                .add("название '" + name + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        return Objects.equals(name, region.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
