package com.company;
//ex. 3
public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(){}

    public Triangle(double sideA, double sideB, double sideC) {
        //if( (sideA+sideB) > sideC | (sideA+sideC) > sideB | (sideB+sideC) > sideA) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        //}
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public boolean validate(){
        if( (sideA+sideB) > sideC & (sideA+sideC) > sideB & (sideB+sideC) > sideA)
            return true;
        return false;
    }

    @Override
    public double calculatePerimeter() {
        if(validate()){
            return (sideA+sideB+sideC);
        }
        else return -1; //when triangle with these sides can not exist
    }

    @Override
    public double calculateArea() {
        if(validate()){
            double semi_perimeter = (sideA + sideB + sideC)/2;
            return Math.sqrt(semi_perimeter*(semi_perimeter - sideA)*(semi_perimeter - sideB)*(semi_perimeter - sideC));
        } else return -1; //when triangle with these sides can not exist
    }
}
