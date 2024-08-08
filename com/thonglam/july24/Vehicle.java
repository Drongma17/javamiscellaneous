package com.thonglam.july24;

public class Vehicle {

    private int id;
    private String color;
    private int age;

    public Vehicle(int id, String color, int age) {
        this.id = id;
        this.color = color;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

   