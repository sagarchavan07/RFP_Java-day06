package com.bridgelabz.jUnitTesting;

import java.util.Scanner;

public class TemperaturConversion {
    /*
    3. To the Util Class add temperaturConversion static function, given the temperature
        in fahrenheit as input outputs the temperature in Celsius or viceversa using the
        formula
        Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
        Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("select option: \n1.Celsius to Fahrenheit \n2.Fahrenheit to Celsius");
        int option=scanner.nextInt();
        System.out.println("Enter Temprature to convert");
        int temp=scanner.nextInt();
        System.out.println(tempratureConversion(temp,option));;
    }
    static int tempratureConversion(int temp, int option){
        switch (option){
            case 1:
                return (temp*9/5) + 32; //Celsius to Fahrenhei
            case 2:
                return (temp-32) * 5/9; //Fahrenheit to Celsius
            default:
                return 0;
        }

    }
}
