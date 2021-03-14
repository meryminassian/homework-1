package com.company;
//abstract class for ex. 5(temperatureConverter)
public abstract class Temperature {
    private double temperature;

    public Temperature(){}

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
