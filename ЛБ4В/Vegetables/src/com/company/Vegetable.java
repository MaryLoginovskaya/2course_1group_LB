package com.company;

public class Vegetable {
    String name;
    double protein;
    double carbohydrate;
    double calories;

    Vegetable(String name, double protein, double carbohydrate, double calories) {
        this.name = name;
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.calories = calories;
    }

    void show() {
        System.out.println("Название: " + name + "; Белки: " + protein + "; Углеводы: " + carbohydrate + "; Калории: " + calories + ";");
    }
    public String toString(){
        return(name + " " + protein + " " + carbohydrate + " " + calories);
    }
}
