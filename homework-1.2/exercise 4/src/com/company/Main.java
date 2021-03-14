package com.company;

public class Main {

    public static void main(String[] args) {
        //checking ex.4
        Point point1 = new Point();
        point1.setCoordinateX(3);
        point1.setCoordinateY(4);
        System.out.println(point1.distance());

        Point point2 = new Point();
        point2.setCoordinateX(6);
        point2.setCoordinateY(8);
        System.out.println(point1.distance(point2));

    }
}
