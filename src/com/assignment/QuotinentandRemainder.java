package com.assignment;
import java.util.Scanner;
public class QuotinentandRemainder {
    public static void main(String[] args) {
        System.out.println("Enter the values num1 and num2");
        Scanner sc =new Scanner(System.in);
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int quotient=1,remainder=0;
        quotient=num1/num2;
        remainder=num1%num2;
        System.out.println("Quotient is"+num1+"/"+num2+"is:"+quotient);
        System.out.println("Remainder is"+num1+"is divided by"+num2+"is:"+remainder);
    }
}
