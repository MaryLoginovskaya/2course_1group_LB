package com.company;
import java.util.Scanner;
/*
Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        State state = new State();
        int k = 1;
        while (k != 0) {
            System.out.println("1) Показать всё государство\n" +
                    "2) Кол-во областей\n" +
                    "3) Название столицы\n" +
                    "4) Площадь государства\n" +
                    "5) Областные центры\n" +
                    "0) Выйти");
            try {
                k = scanner.nextInt();
            } catch (IllegalArgumentException e) {
                System.err.println("not correct");
            }
            switch (k) {
                case 1:
                    System.out.println(state.toString());
                    break;
                case 2:
                    System.out.println("Кол-во областей: "+state.getNumberOfOblasts()+" области");
                    break;
                case 3:
                    state.showCapital();
                    break;
                case 4:
                    System.out.println("Площадь: "+state.getArea()+" га");
                    break;
                case 5:
                    System.out.println("Областные центры: ");
                            for(int i=0;i<state.getNumberOfOblasts();i++)
                                System.out.println(state.oblast[i].getCenter());
                    break;
                case 0:
                    break;
                default:
                    System.err.println("Error!");
            }
        }
    }
}
