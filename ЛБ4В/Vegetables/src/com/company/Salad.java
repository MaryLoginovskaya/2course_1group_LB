package com.company;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Salad {
    Scanner scanner = null;
    int numberOfVegetables;
    Vegetable[] vegetables;

    Salad() {


        try {
            FileReader fr = new FileReader("text/VegetablesIn.txt");
            scanner = new Scanner(fr);
            int numberOfVegetables = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                numberOfVegetables++;
            }
            this.numberOfVegetables = numberOfVegetables;
            vegetables = new Vegetable[this.numberOfVegetables];
            fr = new FileReader("text/VegetablesIn.txt");
            scanner = new Scanner(fr);
            for (int i = 0; i < this.numberOfVegetables; i++) {
                vegetables[i] = new Vegetable(scanner.next(), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    void show() {
        for (int i = 0; i < numberOfVegetables; i++) {
            vegetables[i].show();
        }
    }

    double protein() {
        double protein = 0;
        for (int i = 0; i < numberOfVegetables; i++) {
            protein += vegetables[i].protein;
        }
        return protein;
    }

    double carbohydrate() {
        double carbohydrate = 0;
        for (int i = 0; i < numberOfVegetables; i++) {
            carbohydrate += vegetables[i].carbohydrate;
        }
        return carbohydrate;
    }

    void sort_by_protein() {
        double[] proteinSorted=new double[numberOfVegetables];
        int[] indexSorted = new int[numberOfVegetables];
        for(int i=0;i<numberOfVegetables;i++){
            proteinSorted[i]=vegetables[i].protein;
            indexSorted[i]=i;
        }
        for(int i=0;i<numberOfVegetables;i++){
            for(int j=0;j<numberOfVegetables-1;j++){
                if(proteinSorted[j]>proteinSorted[j+1]){
                    double k=proteinSorted[j+1];
                    proteinSorted[j+1]=proteinSorted[j];
                    proteinSorted[j]=k;

                    int l=indexSorted[j+1];
                    indexSorted[j+1]=indexSorted[j];
                    indexSorted[j]=l;
                }
            }
        }
        try (FileWriter fw = new FileWriter("text/VegetablesOut.txt")) {

                for(int j=0;j<numberOfVegetables;j++){

                        fw.write(vegetables[indexSorted[j]].toString());
                        fw.append('\n');

                }

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
