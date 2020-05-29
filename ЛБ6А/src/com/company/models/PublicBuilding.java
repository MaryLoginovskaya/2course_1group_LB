package com.company.models;

public abstract class PublicBuilding implements Building {

    private String address;
    private String color;
    private int countOfFloors;
    private int countOfEntrances;

    public abstract void start();
    public abstract void stop();


    public abstract String toString();

    public PublicBuilding(String address, String color, int countOfFloors, int countOfEntrances) {
        this.address = address;
        this.color = color;
        this.countOfFloors = countOfFloors;
        this.countOfEntrances = countOfEntrances;
    }

    public String getName() {
        return address;
    }

    public void setName(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public int getCountOfEntrances() {
        return countOfEntrances;
    }

    public void setCountOfEntrances(int countOfEntrances) {
        this.countOfEntrances = countOfEntrances;
    }


}
