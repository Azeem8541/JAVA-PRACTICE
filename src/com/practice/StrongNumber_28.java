package com.practice;

import java.util.Scanner;

public class StrongNumber_28 {
    public static void main(String[] args) {

        /*
         WAP to define a method if a number
         is a strong number or not.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//
//        int num = sc.nextInt();
//
//        int originalNum = num;
//        int sum = 0;
//
//        while (num > 0){
//
//            int digit = num % 10;
//
//            int fac = 1;
//            for (int i=1; i<=digit; i++){
//                fac = fac * i;
//            }
//
//            sum = sum + fac;
//            num = num / 10;
//        }
//
//        if(sum == originalNum){
//            System.out.println(originalNum+" is a Strong Number.");
//        }
//        else{
//            System.out.println(originalNum+" is not a Strong Number.");
//        }


        // Using Method
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        int sum = getStrong(num);
//
//        if(sum == num){
//            System.out.println(num+" Is strong number");
//        }
//        else{
//            System.out.println(num+" is  not strong number");
//        }
//    }
//    static int getStrong(int n){
//
//        int originalNum = n;
//        int sum = 0;
//
//        while (n != 0){
//
//
//            int digit = n % 10;
//
//            int fac = 1;
//            for(int i=1; i<=digit; i++){
//                fac *= i;
//            }
//            sum += fac;
//            n = n / 10;
//        }
//        return sum;
    }
}
