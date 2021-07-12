package com.example.demo.model;

public class Car {
    private String name;
    private int price;
    private int power;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getPower() {
        return this.power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return "myCar!";
    }
}
