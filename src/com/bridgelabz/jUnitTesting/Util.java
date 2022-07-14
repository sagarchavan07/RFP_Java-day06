package com.bridgelabz.jUnitTesting;

import java.util.Scanner;

public class Util {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(dayOfWeek(15,8,1947));
        System.out.println("***************************");
        System.out.println(temperaturConversion(37));
        System.out.println("***************************");
        monthlyPayment();
        System.out.println("***************************");
        System.out.println("enter number to find sqrt" );
        System.out.println("sqrt = "+sqrt(scanner.nextInt()));
        System.out.println("***************************");
        System.out.println("enter decimal number : " );
        toBinary(scanner.nextInt());
    }

    static int dayOfWeek(int day, int month, int year){
        int y = year-(14-month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14-month)/12) - 2;
        return (day + x + 31*m/ 12) % 7;
    }
    static double temperaturConversion(int temp){
        System.out.println("select option: \n1.Celsius to Fahrenheit \n2.Fahrenheit to Celsius");
        int option=scanner.nextInt();
        switch (option){
            case 1:
                return (temp*9/5) + 32; //Celsius to Fahrenheit
            case 2:
                return (temp-32) * 5/9; //Fahrenheit to Celsius
            default:
                return 0;
        }
    }
    static void monthlyPayment(){
        double p,y,r;
        System.out.print("Enter loan amount : ");
        p=scanner.nextInt();
        System.out.print("years to pay " );
        y=scanner.nextInt();
        System.out.print("per cent interest : ");
        r=scanner.nextInt();

        double n=12*y;
        double r1=r/(12*100);
        double payment= p*r/(1-(Math.pow((1+r1),(-n))));

        System.out.println("monthly Payment = "+payment);
    }
    static int sqrt(int n){
        double l = 0.00001;
        // Assuming the sqrt of n as n only
        double x = n;
        // The closed guess will be stored in the root
        double root;
        // To count the number of iterations
        int count = 0;
        while (true)
        {
            count++;
            // Calculate more closed x
            root = 0.5 * (x + (n / x));
            // Check for closeness
            if (Math.abs(root - x) < l)
                break;
            // Update root
            x = root;
        }
        return (int) root;
    }
    static void toBinary(int numDecimal){
        int numBinary[]=new int[100];
        int count=0;
        while (numDecimal>0){
            int rem=numDecimal%2;
            numDecimal=numDecimal/2;

            numBinary[count]=rem;
            count++;
        }

        int number=0;
        for (int i = count-1; i >=0; i--) {
            number=number*10+numBinary[i];
        }
        System.out.println("binary : "+number);

        int r=number%10000;
        int l=number/10000;
        int binary1=r*10000+l;
        System.out.println("after Swapping : "+binary1);

        int decimal = 0;
        int n = 0;
        while(true){
            if(binary1 == 0){
                break;
            } else {
                int temp = binary1%10;
                decimal += temp*Math.pow(2, n);
                binary1 = binary1/10;
                n++;
            }
        }
        System.out.println("decimal after swapping : "+decimal);
    }
}
