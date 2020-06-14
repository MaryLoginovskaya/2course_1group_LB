package com.company;

public class Vegetable {
    String name;
    double protein;
    double carbohydrate;
    double calories;

    Vegetable(String name, double protein, double carbohydrate, double calories) throws VegetableLogicException {
        if (name == "") {
            throw new VegetableLogicException("name is empty");
        }
        this.name = name;

        if (protein < 0) {
            throw new VegetableLogicException("protein value is incorrect");
        }
        this.protein = protein;

        if (carbohydrate < 0) {
            throw new VegetableLogicException("carbohydrate value is incorrect");
        }
        this.carbohydrate = carbohydrate;

        if (calories < 0) {
            throw new VegetableLogicException("calories value is incorrect");
        }

        this.calories = calories;
    }

    void show() {
        System.out.println("Название: " + name + "; Белки: " + protein + "; Углеводы: " + carbohydrate + "; Калории: " + calories + ";");
    }
    public String toString(){
        return(name + " " + protein + " " + carbohydrate + " " + calories);
    }
}
