package com.assignment;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 ==0))
        {
            System.out.println("Year is a leap year");
        }
        else
        {
            System.out.println("Year is not a leap year ");
        }

    }
}
