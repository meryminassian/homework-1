package com.company;

public class Main {

    public static void main(String[] args) {

        //checking ex.1
        Shape circle = new Circle(3);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());

        System.out.println("____________________________");

        //checking ex.2
        Shape rectangle = new Rectangle(7, 4);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        System.out.println("____________________________");

        //checking ex.3
        Shape triangle = new Triangle(9,4,6);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
    }
}
