package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class Capital {
    Scanner scanner = new Scanner(System.in);
    String name;

    Capital() {
        System.out.print("Название столицы: ");
        name = scanner.next();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Capital.class.getSimpleName() + "[", "]")
                .add("название '" + name + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Capital)) return false;
        Capital star = (Capital) o;
        return Objects.equals(name, star.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
