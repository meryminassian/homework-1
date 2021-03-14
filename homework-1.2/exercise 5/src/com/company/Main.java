package com.company;

public class Main {

    public static void main(String[] args) {
        //checking ex. 5
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        Farenheit farenheit = new Farenheit();
        farenheit.setTemperature(32);
        temperatureConverter.setFarenheit(farenheit);

        Celsius celsius = new Celsius();
        celsius.setTemperature(32);
        temperatureConverter.setCelsius(celsius);

        Kelvin kelvin = new Kelvin();
        kelvin.setTemperature(32);
        temperatureConverter.setKelvin(kelvin);

        System.out.println(temperatureConverter.convertFarenheitToCelsius());
        System.out.println(temperatureConverter.convertFarenheitToKelvin());

        System.out.println(temperatureConverter.convertCelsiusToFarenheit());
        System.out.println(temperatureConverter.convertCelsiusToKelvin());

        System.out.println(temperatureConverter.convertKelvinToFarenheit());
        System.out.println(temperatureConverter.convertKelvinToCelsius());
    }
}
