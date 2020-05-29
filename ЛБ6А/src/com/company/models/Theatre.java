package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Theatre extends PublicBuilding {

    private List<String> flats;
    public Theatre(String address, String color, int countOfFloors, int countOfEntrances) {
        super(address, color, countOfFloors, countOfEntrances);
        flats = new ArrayList<String>();
    }

    public void addFloor(String plane)
    {
        flats.add(plane);
    }
    public String getFloor(int index){
        return flats.get(index);
    }
    public List<String> getFloors(){
        return flats;
    }
    public void deleteFloor(int index){
        flats.remove(index);
    }
    public void deleteFloor(String plane) {
        flats.remove(plane);
    }

    @Override
    public void start() {
        System.out.println("Старт");
    }

    @Override
    public void stop() {
        System.out.println("Стоп");
    }

    @Override
    public String toString() {
        return "Здание {" +
                "адрес: '" + this.getName() + '\'' +
                ", цвет: '" + this.getColor() + '\'' +
                ", кол-во этажей: " + this.getCountOfFloors() +
                ", кол-во выходов: " + this.getCountOfEntrances() +
                '}';
    }
}
