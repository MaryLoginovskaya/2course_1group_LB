
// B.4. Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 5 и на 7.

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько чисел Вы хотите ввести? ");
        int n = in.nextInt();
        int[] myArray;
        myArray = new int[n];

        System.out.printf("Введите %s целых чисел: ", n);
        for (int i=0;i<n; i++)
            myArray[i]=in.nextInt();

        System.out.print("Числа, делящиеся на 5: ");
        for (int i=0; i<n;i++)
            if(myArray[i]%5==0)
                System.out.print (myArray[i]+" ");
        System.out.print("\n");

        System.out.print("Числа, делящиеся на 7: ");
        for (int i=0; i<n;i++)
            if(myArray[i]%7==0)
                System.out.print (myArray[i]+" ");
        System.out.print("\n");

        System.out.print("Числа, делящиеся на 5 и на 7: ");
        for (int i=0; i<n;i++)
            if((myArray[i]%7==0)&(myArray[i]%5==0))
                System.out.print (myArray[i]+" ");

        in.close();

    }
}
