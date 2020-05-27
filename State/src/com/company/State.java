package com.company;
import java.util.*;

public class State {
    Scanner scanner = new Scanner(System.in);
    String name;
    Capital capital;
    String area;
    Oblast[] oblast;
    int numberOfOblasts;

    State() {
        System.out.print("Название государства: ");
        name = scanner.next();
        System.out.print("Площадь государства (га): ");
        area = scanner.next();
        capital = new Capital();
        System.out.print("Кол-во областей: ");
        try {
            numberOfOblasts = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Not correct!");
        }
        if (numberOfOblasts <= 0) {
            System.err.println("Error!");
            throw new IllegalArgumentException();
        }
        oblast = new Oblast[numberOfOblasts];
        for (int i = 0; i < numberOfOblasts; i++) {
            System.out.println("Область №" + (i + 1) + ": ");
            oblast[i] = new Oblast();
        }
    }

    int getNumberOfOblasts() {
        return numberOfOblasts;
    }
    String getArea() {
        return area;
    }

    void showCapital() {
        System.out.println("Название столицы: " + capital.name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", State.class.getSimpleName() + "[", "]")
                .add("Название '" + name + "'")
                .add("Столица " + capital)
                .add("Кол-во областей " + numberOfOblasts)
                .add("Область " + Arrays.toString(oblast))
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;
        State that = (State) o;
        return numberOfOblasts == that.numberOfOblasts &&
                Objects.equals(name, that.name) &&
                Objects.equals(capital, that.capital) &&
                Arrays.equals(oblast, that.oblast);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, capital, numberOfOblasts);
        result = 31 * result + Arrays.hashCode(oblast);
        return result;
    }
}
