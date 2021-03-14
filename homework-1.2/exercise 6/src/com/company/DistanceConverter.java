package com.company;
/*6  Design a class named DistanceConverter: methods
                - convertMetersToMiles
                - convertMilesToMeters
*/
public class DistanceConverter {
    private Meter meter;
    private Mile mile;

    public DistanceConverter(){}

    public DistanceConverter(Meter meter, Mile mile) {
        this.meter = meter;
        this.mile = mile;
    }

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    public Mile getMile() {
        return mile;
    }

    public void setMile(Mile mile) {
        this.mile = mile;
    }

    public double convertMetersToMiles(Meter meters){
        return meters.getLength() * 0.000621371;
    }
    public double convertMilesToMeters(Mile miles){
        return miles.getLength() * 1609.34;
    }
}
