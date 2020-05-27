package com.company;

public class Abiturient {
    private int id;
    private String surName;
    private String name;
    private String patronymic;
    private String address;
    private String phone;
    private int[] rating;
    private int SumRating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpatronymic() {
        return patronymic;
    }

    public void setpatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int[] getRating() {
        return rating;
    }

    public void setRating(int rating[]) {
        this.rating = rating;
    }
/*
    private String printArray(int[] rating) {
        String str = "";
        for (int i : rating) {
            str += i + " ";
        }
        return str;
    }
*/
    public String toString() {
        String s="";
        for(int i = 0; i < rating.length; i++) {s+=Integer.toString(rating[i]);}
        return "Id: "+Integer.toString(id)+"\nФамилия: "+surName+"\nИмя: "+name+"\nОтчество: "+patronymic+"\nАдрес: "+address+"\nТелефон: "+phone+"\nОценки: "+s;
    }

    public int Sum() {
        int sum = 0;
        for (int i : rating) {
            sum += i;
        }
        return sum;
    }

    public Abiturient(int id, String surName, String name, String patronymic,
                   String address, String phone, int[] rating) {
        super();
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.rating = rating;
        this.SumRating = Sum();
    }
}
