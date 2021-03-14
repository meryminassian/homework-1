package com.company;

/*Design a class named CurrencyConverter which has methods names “convert” for each pair of currency
convert(Dram from, Ruble to)
convert(Dram from, Dollar to)
convert(Dollar from, Ruble to)
convert(Dollar from, Dram to)
convert(Ruble from, Dram to)
convert(Ruble from, Dollar to)*/

public class CurrencyConverter {
    private Dram dram;
    private Dollar dollar;
    private Ruble ruble;

    public CurrencyConverter(){}

    public CurrencyConverter(Dram dram, Dollar dollar, Ruble ruble) {
        this.dram = dram;
        this.dollar = dollar;
        this.ruble = ruble;
    }

    public Dram getDram() {
        return dram;
    }

    public void setDram(Dram dram) {
        this.dram = dram;
    }

    public Dollar getDollar() {
        return dollar;
    }

    public void setDollar(Dollar dollar) {
        this.dollar = dollar;
    }

    public Ruble getRuble() {
        return ruble;
    }

    public void setRuble(Ruble ruble) {
        this.ruble = ruble;
    }

    //from dram to ruble
    public double convert(Dram dram, Ruble ruble){
        return dram.getDram() * 0.15;
    }

    //from dram to dollar
    public double convert(Dram dram, Dollar dollar){
        return dram.getDram() * 0.0021;
    }

    //from dollar to ruble
    public double convert(Dollar dollar, Ruble ruble){
        return dollar.getDollar() * 73.26;
    }

    //from dollar to dram
    public double convert(Dollar dollar, Dram ruble){
        return dollar.getDollar() * 526.63;
    }

    //from ruble to dram
    public double convert(Ruble ruble, Dram dram){
        return ruble.getRuble() * 7.19;
    }

    //from rubble to dollar
    public double convert(Ruble ruble, Dollar dollar){
        return ruble.getRuble() * 0.014;
    }

}
