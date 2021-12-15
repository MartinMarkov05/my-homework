package com.company;

public class stadium {
    public static void main (String[] args){
        int  capacity = 25000;
        boolean hasLight = true;
        boolean getLicense = hasLight || capacity>35000;
        String result = getLicense? "Има лиценз" : "Няма лиценз";
        System.out.println(result);


    }


}




