/* Создать классы, спецификации которых приведены ниже.
Определить конструкторы и методы setТип(), getТип(), toString().
Определить дополнительно методы в классе, создающем массив объектов.
Задать критерий выбора данных и вывести эти данные на консоль.
В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
*/
/*
Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
Создать массив объектов. Вывести:
a) список абитуриентов, имеющих неудовлетворительные оценки;
b) список абитуриентов, у которых сумма баллов выше заданной;
c) выбрать заданное число n абитуриентов, имеющих самую высокую
сумму баллов (вывести также полный список абитуриентов, имеющих
полупроходную сумму).
 */


package com.company;
import java.util.*;


public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Abiturient[] arrayAbiturients = new Abiturient[] {
                new Abiturient(1, "A", "aa", "a", "1", "11", new int[] { 3, 5, 5, 5, 5 }),
                new Abiturient(2, "B", "bb", "b", "2", "22", new int[] { 3, 2, 5, 3, 5 }),
                new Abiturient(3, "C", "cc", "c", "3", "33", new int[] { 3, 4, 5, 4, 5 }),
                new Abiturient(4, "D", "dd", "d", "4", "44", new int[] { 3, 2, 5, 3, 5 }),
                new Abiturient(5, "E", "ee", "e", "5", "55", new int[] { 3,3, 5, 4, 5 })
        };


        System.out.print("Введите наибольшую неудовлетворительную оценку ");
        int P = in.nextInt();
        System.out.println("a) Список абитуриентов, имеющих неудовлетворительные оценки: ");
        for (Abiturient st : arrayAbiturients) {

            for (int i : st.getRating()) {
                if (i <= P) {
                    String a = st.toString();
                    System.out.println(a);
                    break;
                }
            }
        }

        System.out.print("Введите проходную сумму баллов ");
        int PSum = in.nextInt();
        System.out.println("б) Список абитуриентов, сумма баллов у которых выше заданной: ");
        for (Abiturient st : arrayAbiturients) {
            if (st.Sum() > PSum) {
                String b = st.toString();
                System.out.println(b);
            }
        }

        System.out.print("Введите число абитуриентов с самой высокой суммой баллов: n = ");
        int n = in.nextInt();

        System.out.println("Топ " + n +" абитуриентов: ");

        for (int k = arrayAbiturients.length-1 ; k > 0; k--)
            for(int j = 0 ; j < k ; j++) {
                if (arrayAbiturients[j].Sum() < arrayAbiturients[j + 1].Sum()) {
                    Abiturient tmp = arrayAbiturients[j];
                    arrayAbiturients[j] = arrayAbiturients[j + 1];
                    arrayAbiturients[j + 1] = tmp;
                }
            }
        for (int i = 0 ; i < n; i++){
            System.out.println(arrayAbiturients[i].toString());
        }
    }
}
