package com.company;

public abstract class Length {
    private double length;

    public Length(){}

    public Length(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
