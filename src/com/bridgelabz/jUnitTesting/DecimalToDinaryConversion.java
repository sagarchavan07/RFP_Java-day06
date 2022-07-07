package com.bridgelabz.jUnitTesting;

import java.util.Scanner;

public class DecimalToDinaryConversion {
    /*
    6. Write a static function toBinary that outputs the binary (base 2) representation of
        the decimal number typed as the input. It is based on decomposing the number into
        a sum of powers of 2. For example, the binary representation of 106 is 11010102,
        which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding
        to represent 4 Byte String.
        To compute the binary representation of n, we consider the powers of 2 less than or
        equal to n in decreasing order to determine which belong in the binary
        decomposition (and therefore correspond to a 1 bit in the binary representation).
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int numDecimal=scanner.nextInt();

        toBinary(numDecimal);

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

        for (int i = count-1; i >=0; i--) {
            System.out.print(numBinary[i]);
        }
        
    }
}
