package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salad salad = new Salad();
        int k = 1;
        while (true) {
            System.out.println("1) Показать весь салат\n" +
                    "2) Белки\n" +
                    "3) Углеводы\n" +
                    "4) Отсортировать по белку\n" +
                    "5) Посчитать кол-во калорий\n" +
                    "0) Выйти");
            try {
                k = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Не явл. числом");
                k = 0;
            }
            switch (k) {
                case 1:
                    salad.show();
                    break;
                case 2:
                    System.out.println("Белки: "+salad.protein());
                    break;
                case 3:
                    System.out.println("Углеводы: "+salad.carbohydrate());
                    break;
                case 4:
                    salad.sort_by_protein();
                    break;
                case 5:
                    System.out.print("Минимум: ");
                    double min = scanner.nextDouble();
                    System.out.print("Максимум: ");
                    double max = scanner.nextDouble();
                    for (int i = 0; i < salad.numberOfVegetables; i++) {
                        if (salad.vegetables[i].calories >= min && salad.vegetables[i].calories <= max) {
                            salad.vegetables[i].show();
                        }
                    }
                    break;
                case 0:
                    System.exit(1);
                default:
                    System.err.println("Error!");
            }
        }
    }
}
