package com.company;

public class absolutevalue {
    public static void main (String[] args){
        int a = 3;
        boolean absoluteValue = a > 0 || a < 0 ;
        System.out.println(absoluteValue?a : -a );
    }

}
