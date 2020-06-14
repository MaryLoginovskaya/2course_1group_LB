package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "Спецификатор точности применяется только в спецификаторах формата %f, %е, %g для данных с  \n"+
                "плавающей точкой и в спецификаторе %s — для строк. Он задает количество выводимых десятичных знаков \n"+
                "или символов. Например, спецификатор %10.4f выводит число с минимальной шириной поля 10 символов и с \n" +
                "четырьмя десятичными знаками. Принятая по умолчанию точность равна шести десятичным знакам. Примененный \n"+
                "к строкам спецификатор точности задает максимальную длину поля вывода. Например, спецификатор %5.7s \n" +
                "выводит строку длиной не менее пяти и не более семи символов. Если строка длиннее, конечные символы  \n"+
                "отбрасываются. Ниже приведен пример использования флагов форматирования.\n";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Исходный текст: ");
        System.out.println(text);
        System.out.print("Введите номер символа: ");
        int k = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String underText = scanner.nextLine();
        System.out.println("Измененный текст: ");
        text = text.substring(0,k) + underText + text.substring(k);
        System.out.println(text);


    }
}
