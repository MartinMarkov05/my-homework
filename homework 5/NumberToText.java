package com.company;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digitA = n / 100;
        switch (digitA){
            case 1: System.out.print("сто");break;
            case 2: System.out.print("двеста");break;
            case 3: System.out.print("триста");break;
            case 4: System.out.print("четиристотин");break;
            case 5: System.out.print("петстотин");break;
            case 6: System.out.print("шестотин");break;
            case 7: System.out.print("седемстотин");break;
            case 8: System.out.print("осемстотин");break;
            case 9: System.out.print("деветстотин");break;
        }
        int digitB = (n /10) % 10;
        switch (digitB){

            case 2: System.out.print(" двадесет");break;
            case 3: System.out.print(" тридесет");break;
            case 4: System.out.print(" четиресет");break;
            case 5: System.out.print(" педесет");break;
            case 6: System.out.print(" шейсет");break;
            case 7: System.out.print(" седемдесет");break;
            case 8: System.out.print(" осемдесет");break;
            case 9: System.out.print(" деведесет");break;

        }
        int digitC = n % 10;
        switch (digitC){

            case 1: System.out.println(" и едно");break;
            case 2: System.out.print(" и две");break;
            case 3: System.out.print(" и три");break;
            case 4: System.out.print(" и четири");break;
            case 5: System.out.print(" и пет");break;
            case 6: System.out.print(" и шест");break;
            case 7: System.out.print(" и седем");break;
            case 8: System.out.print(" и осем");break;
            case 9: System.out.print(" и девет");break;

        }
        if(digitB == 1 && digitC == 0){
            System.out.println(" и десет");
        }else if(digitB ==1 && digitC == 1){
            System.out.println(" и единадесет");
        }else if(digitB == 1 && digitC == 2){
            System.out.println(" и дванадесет");
        }else if(digitB == 1 && digitC == 3){
            System.out.println(" и тринадесет");
        }else if(digitB == 1 && digitC == 4){
            System.out.println(" и четиринадесет");
        }else if(digitB == 1 && digitC == 5){
            System.out.println("и петнадесет");
        }else if(digitB == 1 && digitC == 6){
            System.out.println(" и шестнадесет");
        }else if(digitB == 1 && digitC == 7){
            System.out.println(" и седемнадесет");
        }else if(digitB == 1 && digitC == 8){
            System.out.println(" и осемнадесет");
        }else if(digitB == 1 && digitC == 9){
            System.out.println(" и деветнадесет");
        }
        int digitD = n / 1000;
        if(digitD == 1){
            System.out.println("хиляда");
        }
    }
}
