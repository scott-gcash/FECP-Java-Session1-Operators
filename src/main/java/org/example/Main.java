package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void celsiusToFahrenheit(float num){
        double fahrenheit = 0.0;

        fahrenheit = num * ( 9.0 / 5.0 ) + 32.0;
        System.out.printf("Temperature in Fahrenheit: %.2f", fahrenheit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float celsius = 0.0f;

        System.out.print("Enter temperature in Celsius: ");
        celsius = scanner.nextFloat();
        celsiusToFahrenheit(celsius);
    }
}