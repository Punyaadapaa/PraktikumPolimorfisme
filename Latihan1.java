/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum8;

/**
 *
 * @author WORKPLUS
 */
import java.util.ArrayList;
import java.util.List;

class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog: Woof!");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball...");
    }
}

class Bird extends Animal {
    @Override
    void speak() {
        System.out.println("Bird: Tweet!");
    }
}

public class Latihan1 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Bird());

        for (Animal animal : animals) {
            animal.speak();

            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            }
        }
    }
}
