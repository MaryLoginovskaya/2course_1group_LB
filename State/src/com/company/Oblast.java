package com.company;
import java.util.*;

public class Oblast {
    Scanner scanner = new Scanner(System.in);
    String name;
    Region[] region;
    String center;

    Oblast() {
        System.out.print("Название области: ");
        name = scanner.next();
        System.out.print("Областной центр: ");
        center = scanner.next();
        System.out.print("Кол-во районов: ");
        int n = 0;
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Not correct!");
        }
        if (n < 0) {
            System.err.println("Error!");
            throw new IllegalArgumentException();
        }
        region = new Region[n];
        for (int i = 0; i < n; i++) {
            region[i] = new Region();
        }
    }

    String getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Oblast.class.getSimpleName() + "[", "]")
                .add("название '" + name + "'")
                .add("район " + Arrays.toString(region))
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oblast)) return false;
        Oblast planet = (Oblast) o;
        return Objects.equals(name, planet.name) &&
                Arrays.equals(region, planet.region);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(region);
        return result;
    }
}
