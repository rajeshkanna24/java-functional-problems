package com.assignment;
import java.util.Scanner;
public class Threenumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        System.out.println("Enter the third number:");
        c=sc.nextInt();
        if(a>=b && b>=c)
            System.out.println(a+"is the largest number");
        else if (b>=c && b>=a)
            System.out.println(b+"is the largest number");
        else
            System.out.println(c+"is the largest number");

    }
}
