package com.assignment;

import org.w3c.dom.ls.LSOutput;

public class Vowel {
    public static void main(String[] args) {
        int i,countv=0,countc=0;
        String stn="This is a practice problem";
        stn =stn.toLowerCase();
        for (i=0;i<stn.length();i++)
        {
            if(stn.charAt(i)=='a'||stn.charAt(i)=='e'||stn.charAt(i)=='i'||stn.charAt(i)=='o'||stn.charAt(i)=='u')
            {
                countv++;
            }
            else if(stn.charAt(i)>='a'||stn.charAt(i)<='z')
                countc++;
        }
        System.out.println("Number of vowels:"+countv);
        System.out.println("Number of consnants:"+countc);
    }





}
