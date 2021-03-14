package com.company;
/* 5 Design a class named TemperatureConverter
	methods --> convertFarenheitToCelsius, convertFarenheitToKelvin
                convertCelsiusToFarenheit, convertCelsiusToKelvin
                convertKelvinToFarenheit,  convertKelvinToCelsius*/
public class TemperatureConverter {
    private Farenheit farenheit;
    private Celsius celsius;
    private Kelvin kelvin;

    public TemperatureConverter(){}

    public TemperatureConverter(Farenheit farenheit, Celsius celsius, Kelvin kelvin) {
        this.farenheit = farenheit;
        this.celsius = celsius;
        this.kelvin = kelvin;
    }

    public Farenheit getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(Farenheit farenheit) {
        this.farenheit = farenheit;
    }

    public Celsius getCelsius() {
        return celsius;
    }

    public void setCelsius(Celsius celsius) {
        this.celsius = celsius;
    }

    public Kelvin getKelvin() {
        return kelvin;
    }

    public void setKelvin(Kelvin kelvin) {
        this.kelvin = kelvin;
    }

    //(°F − 32) × 5/9 = °C
    public double convertFarenheitToCelsius(){
        return (farenheit.getTemperature() - 32) * 5/9;
    }

    //(°F − 32) × 5/9 + 273.15 = K
    public double convertFarenheitToKelvin(){
        return (farenheit.getTemperature() - 32) * 5/9 + 273.15;
    }

    //(°C × 9/5) + 32 = °F
    public double convertCelsiusToFarenheit(){
        return (celsius.getTemperature() * 9/5) + 32;
    }

    //°C + 273.15 = K
    public double convertCelsiusToKelvin(){
        return (celsius.getTemperature() + 273.15);
    }

    //(K − 273.15) × 9/5 + 32 = °F
    public double convertKelvinToFarenheit(){
        return (kelvin.getTemperature() - 273.15) * 9/5 + 32;
    }

    //K − 273.15 = °C
    public double convertKelvinToCelsius(){
        return (kelvin.getTemperature() - 273.15);
    }
}
