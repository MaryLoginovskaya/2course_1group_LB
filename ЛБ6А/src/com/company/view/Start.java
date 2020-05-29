package com.company.view;

import com.company.models.Theatre;

import java.util.Scanner;

public class Start {
    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите адрес театра: ");
        String address = sc.next();
        System.out.print("Введите цвет здания: ");
        String color = sc.next();
        System.out.print("Введите кол-во этажей: ");
        int etaj = sc.nextInt();
        System.out.print("Введите кол-во выходов из здания: ");
        int entrance = sc.nextInt();
        Theatre theatre = new Theatre(address, color, etaj,entrance);
        theatre.start();
        System.out.print("Введите названия выходов из здания: ");
        String a_1 = sc.next();
        String a_2 = sc.next();
        String a_3 = sc.next();
        theatre.addFloor(a_1);
        theatre.addFloor(a_2);
        theatre.addFloor(a_3);
        System.out.println(theatre);
        System.out.print("Названия выходов: ");
        System.out.println(theatre.getFloors());
        System.out.print("Какой выход хотите удалить? : ");
        int a_4 = sc.nextInt();
        theatre.deleteFloor(a_4-1);
        System.out.print("Названия выходов после изменения: ");
        System.out.println(theatre.getFloors());
        theatre.stop();
    }
}
