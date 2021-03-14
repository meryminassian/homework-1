package com.company;

public class Main {

    public static void main(String[] args) {

        //checking ex.6
        DistanceConverter distanceConverter = new DistanceConverter();
        Meter meter = new Meter(1000);
        Mile mile = new Mile(1);
        System.out.println(distanceConverter.convertMetersToMiles(meter));
        System.out.println(distanceConverter.convertMilesToMeters(mile));
    }
}
