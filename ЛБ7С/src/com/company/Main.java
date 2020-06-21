package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        StringBuilder finishText = new StringBuilder();
        int count;

        for (int i = 0; i < text.length()-1; i ++) {
            count = 1;
            if(text.charAt(i) == text.charAt(i+1)) {
                while (text.charAt(i) == text.charAt(i+1)) {
                    if(i ==  text.length()-2) {
                        count++;
                        if(text.charAt(i+1) != text.charAt(i))
                            finishText.append(text.charAt(i));
                        break;
                    }
                    count++;
                    i++;
                }
                finishText.append(text.charAt(i-1));
                finishText.append(count);
            }
            else {
                finishText.append(text.charAt(i));
                if(i ==  text.length()-2){
                    finishText.append(text.charAt(i+1));
                }
            }
        }
        System.out.print("Измененный текст: ");
        System.out.println(finishText);
    }
}
