package com.assignment;

public class HormonicNumber {
    public static void main(String[] args) {

            double n=81,i;
            double sum=0;
            for( i=1;i<=n;i++)
            {
                sum=sum+(1/i);
            }
            System.out.println("Harmonic value = "+sum);

    }
}
