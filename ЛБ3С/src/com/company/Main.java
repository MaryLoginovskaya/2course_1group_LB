/*Определить класс Дробь в виде пары (m, n)
с коэффициентами типа Комплексное число.
Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
Создать массив/список/множество объектов и передать его в метод, который изменяет
каждый элемент массива с четным индексом путем добавления следующего за ним элемента.*/

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество дробей: ");
        int k = in.nextInt();
        Fraction[] array = new Fraction[k];
        for(int i = 0; i < array.length; i++) {
            System.out.print("Введите коэффициенты " + (i + 1) + " дроби: ");
            int a_1 = in.nextInt();
            int a_2 = in.nextInt();
            int b_1 = in.nextInt();
            int b_2 = in.nextInt();
            Fraction fraction = new Fraction(a_1,b_1,a_2,b_2);
            array[i] = fraction;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1)+") ");
            Fraction.Show(array[i]);
        }
        process(array);
        System.out.print("\nИзмененные дроби: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1)+") ");
            Fraction.Show(array[i]);
        }
    }
    public static void process(Fraction[] array) {
        if (array == null) {
            System.out.println("Exit with error");
            return;
        }
        int i, size = array.length;
        if (size>0)
            --size;
        for (i = 1; i < size; i += 2) {
            array[i] = Fraction.Plus(array[i], array[i + 1]);
        }
    }
}
