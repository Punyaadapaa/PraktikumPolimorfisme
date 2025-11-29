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

abstract class Shape {
    abstract double area();
}

// Lingkaran
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Persegi panjang
class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class Latihan2 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(7));      
        shapes.add(new Rectangle(4, 5)); 

        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Total area = " + totalArea);
    }
}

