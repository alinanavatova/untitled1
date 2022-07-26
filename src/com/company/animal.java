package com.company;

public class animal {
    int age;
    String colour;
    String size;

    public animal(int age, String colour, String size) {
        this.age = age;
        this.colour = colour;
        this.size = size;
    }

    public animal() {
    }

    public animal(int age) {
        this.age = age;
    }

    public animal( String colour, int age, String size) {
        this.age = age;
        this.colour = colour;
        this.size = size;
    }
public void move(){
    System.out.println("car");
}

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
