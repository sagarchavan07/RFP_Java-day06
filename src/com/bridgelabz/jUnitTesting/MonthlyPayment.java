package com.bridgelabz.jUnitTesting;

import java.util.Scanner;

public class MonthlyPayment {
    /*
    Write a Util Static Function to calculate monthlyPayment that reads in three
    command-line arguments P, Y, and R and calculates the monthly payments you
    would have to make over Y years to pay off a P principal loan amount at R per cent
    interest compounded monthly. The formula is
     */
    public static void main(String[] args) {
        double p,y,r;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter loan amount");
        p=scanner.nextInt();
        System.out.println("years to pay");
        y=scanner.nextInt();
        System.out.println("per cent interest");
        r=scanner.nextInt();
        int payment= (int) calmonthlyPayment(p,y,r);
        System.out.println("monthly Payment = "+payment);
    }
    static double calmonthlyPayment(double p, double y,double r){
        double n=12*y;
        double r1=r/(12*100);
        double payment= p*r/(1-(Math.pow((1+r1),(-n))));
        System.out.println(payment);
        return payment;
    }
}
