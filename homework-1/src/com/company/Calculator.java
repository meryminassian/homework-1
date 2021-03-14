package com.company;
/* 1. Create functions for the Calculator class that can do the following:
Add two numbers.
Subtract two numbers.
Multiply two numbers.
Divide two numbers.*/

public class Calculator {
    private Double num1;
    private Double num2;

    public Calculator() {
    }

    public Calculator(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double add(){
        return (num1+num2);
    }

    public Double subtract(){
        return (num1 - num2);
    }

    public Double multiply(){
        return (num1 * num2);
    }

    public Double divide(){
        if(num2 != 0)
            return (num1/num2);
        else {
            System.out.print("can not divide by 0 --> ");
            return null;
        }
    }

}
