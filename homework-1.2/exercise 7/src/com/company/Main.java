package com.company;

public class Main {

    public static void main(String[] args) {

        Dram dram = new Dram(100);
        Dollar dollar = new Dollar(100);
        Ruble ruble = new Ruble(100);

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println(currencyConverter.convert(dram, ruble));
        System.out.println(currencyConverter.convert(dram, dollar));
        System.out.println(currencyConverter.convert(dollar, ruble));
        System.out.println(currencyConverter.convert(dollar, dram));
        System.out.println(currencyConverter.convert(ruble, dram));
        System.out.println(currencyConverter.convert(ruble, dollar));
    }
}
