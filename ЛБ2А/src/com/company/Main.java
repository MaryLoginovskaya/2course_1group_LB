package com.company;
import java.util.Scanner;
import java.util.Date;

/**
 * @author maryloginovskaya
 */
public class Main {
    /** В приведенных ниже заданиях необходимо вывести внизу фамилию разработчика, дату и время получения задания, а также дату и время сдачи задания.
     * Добавить комментарии в программы, сгенерировать html-файл документации.
     * В заданиях на числа объект можно создавать в виде массива символов.
     * Ввести n чисел с консоли.
     * Найти число, в котором число различных цифр минимально.
     * Если таких чисел несколько, найти первое из них.
     */
    public static void main(String[] args) {
        Date date = new Date();


        Scanner in = new Scanner(System.in);

        System.out.print("Сколько чисел Вы хотите ввести? ");
        int n = in.nextInt();
        int[] myArray;
        myArray = new int[n];

        System.out.printf("Введите %s целых чисел: ", n);
        for (int i=0;i<n; i++)
            myArray[i]=in.nextInt();

        int[] NumDifDigit;
        NumDifDigit = new int[n];
        for (int i=0;i<n; i++)
            NumDifDigit[i]=0;

        for (int i=0;i<n; i++)
            for(int j=0;j<10; j++) {
                int A = myArray[i];
                while ( A > 0){
                    if (A % 10 == j) {NumDifDigit[i]++; break;}
                    A /= 10;
                }
            }

        int min = NumDifDigit[0], count=0;
        for (int i=1;i<n; i++)
            if(NumDifDigit[i]<min) {min = NumDifDigit[i];count=i;}

        System.out.printf("Первое из чисел, в котором число различных цифр минимально: ");
        System.out.println(myArray[count]);
        System.out.println("Автор проекта: Mary");
        System.out.println("Дата и время получения задания: Fri March 10 10:00:00 MSK 2020");
        System.out.println("Дата и время сдачи задания: " + date.toString());
        in.close();
    }
}