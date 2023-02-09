package com.assignment;
import java.util.Scanner;
public class Powerof2 {
    public static void main(String[] args) {
        int b,e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base:");
        b=sc.nextInt();
        System.out.println("Enter the exponent:");
        e=sc.nextInt();
        double power =Math.pow(b,e);
        System.out.println(b+" to the power " +e+ " is " +power);
    }
}
