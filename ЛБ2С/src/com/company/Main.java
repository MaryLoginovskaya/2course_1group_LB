/* Ввести с консоли n-размерность матрицы a [n] [n].
Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
 */

package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер матрицы: n = ");
        int n = in.nextInt();
        int[][] array = new int[n][n];

        int[] SumArray = new int [n];
        for (int k = 0; k < SumArray.length; k++)
            SumArray[k]=0;

        System.out.println("Матрица: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int)(Math.random() *(2*n+1)) - n);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    for (int p = j+1; p < n; p++)
                        if (array[i][p] <= 0) SumArray[i] += array[i][p];
                        else break;
                    break;
                };
            }
        }

        System.out.println("Сумма искомых элементов матрицы:");
        for (int k = 0; k < SumArray.length; k++)
        System.out.print(" "+SumArray[k]);
        in.close();
    }
}