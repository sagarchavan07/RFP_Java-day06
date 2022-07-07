package com.bridgelabz.jUnitTesting;

import java.util.Scanner;

public class Binary {
    /*
    7. Write Binary.java to read an integer as an Input, convert to Binary using toBinary
        function and perform the following functions.
        i. Swap nibbles and find the new number.
        ii. Find the resultant number is the number is a power of 2.
        A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
        Given a byte, swap the two nibbles in it. For example 100 is to be represented as
        01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the
        two nibbles, we get 01000110 which is 70 in decimal.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int decimal=scanner.nextInt();

        int binary=toBinary(decimal);
        System.out.println("binary : "+binary);

        int binary1=swapNibbles(binary);
        System.out.println("after Swapping : "+binary1);

        int decimal1=toDecimal(binary1);
        System.out.println("decimal after swapping : "+decimal1);

    }
    static int toBinary(int numDecimal){
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
        System.out.println();
        return number;
    }

   static int swapNibbles(int n){
        int r=n%10000;
        int l=n/10000;
        int c=r*10000+l;
       return c;
   }
   static int toDecimal(int binary){
       int decimal = 0;
       int n = 0;
       while(true){
           if(binary == 0){
               break;
           } else {
               int temp = binary%10;
               decimal += temp*Math.pow(2, n);
               binary = binary/10;
               n++;
           }
       }
       return decimal;
   }
}
