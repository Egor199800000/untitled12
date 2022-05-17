package com.company;

public class Dog {
    int size;

    void bark() {
        if (size > 60) {
            System.out.println("Gav Gav!!");
        } else if (size > 14) {
            System.out.println("Wuff Wuff!!");
        } else
            System.out.println("Tyaf Tyaf");
    }


}
