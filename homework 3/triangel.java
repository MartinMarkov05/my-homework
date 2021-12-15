package com.company;

public class triangel {
    public static void main(String args[]){
        int a = 7;
        int b = 10;
        int c = 15;
        if ((a>0 && b>0 && c>0) && (a< b+c && b< a+c && c< a+b)){
            System.out.println("Съществува такъв триъгълник");
        }else{
            System.out.println("Не съществува такъв триъгълник");
            }

    }
}
