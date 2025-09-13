package com.practice;

import java.util.Scanner;

public class ArmstrongNumb_31 {
    public static void main(String[] args) {

        /*
         WAP to define a method to check your
         number is Armstrong number or not.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num = sc.nextInt();
//
//        int originalNum = num;
//        int sum = 0;
//
//        while(num != 0){
//
//            int digit = num % 10;
//            sum = sum + (digit * digit * digit);
//            num = num / 10;
//        }
//        if(sum == originalNum){
//            System.out.println(originalNum+" is an ArmStrong number");
//        }
//        else{
//            System.out.println(originalNum+" is not an ArmStrong number");
//        }


        // Using Method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        if(getArmStrong(num)){
            System.out.println(num+" is an ArmStrong number");
        }
        else{
            System.out.println(num+" is not an ArmStrong number");
        }
    }
    static boolean getArmStrong(int n){

        int originalNum = n;
        int sum = 0;

        while (n != 0){

            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        return sum == originalNum;
    }
}
