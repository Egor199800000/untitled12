package com.company;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 90;
        Dog two = new Dog();
        two.size = 35;
        Dog three = new Dog();
        three.size = 7;

        one.bark();
        two.bark();
        three.bark();

    }
}
