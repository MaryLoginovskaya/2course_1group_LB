/*
Определить класс Дробь в виде пары (m, n) с коэффициентами типа Комплексное число.
Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
Создать массив/список/множество объектов и передать его в метод,
который изменяет каждый элемент массива с четным индексом путем добавления следующего за ним элемента.
 */
package com.company;
import java.util.Random;
import java.util.Scanner;
public class Fraction {

    int m_int;
    int m_im;
    int n_int;
    int n_im;

    public Fraction(int a_1, int b_1, int a_2, int b_2) {
        m_int = a_1;
        m_im = b_1;
        n_int = a_2;
        n_im = b_2;
    }

    public static Fraction Plus(Fraction r1, Fraction r2) {
        Fraction r3 = new Fraction(0, 0, 0, 0);
        r3.m_int = (r1.m_int * r2.n_int) - (r1.m_im * r2.n_im) + (r1.n_int * r2.m_int) - (r1.n_im * r2.m_im);
        r3.m_im = r1.m_int * r2.n_im + r1.m_im * r2.n_int + r1.n_im * r2.m_int + r1.n_int * r2.m_im;
        r3.n_int = (r1.n_int * r2.n_int) - (r1.n_im * r2.n_im);
        r3.n_im = (r1.n_int * r2.n_im) + (r1.n_im * r2.n_int);
        return r3;
    }

    public static void Show(Fraction r1) {
        System.out.print("( "+ r1.m_int+" + "+r1.m_im+"i ");
        System.out.print(",");
        System.out.println(" "+ r1.n_int+" + "+r1.n_im+"i )");
    }
}