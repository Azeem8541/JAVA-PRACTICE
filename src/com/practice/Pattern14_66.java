package com.practice;

import java.util.Scanner;

public class Pattern14_66 {
    public static void main(String[] args) {

        /*

         WAP to print following pattern.

         *****
         ****
         ***
         **
         *

         */

//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for(int i=num; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getPattern14(num);
    }
    static int getPattern14(int n){

        for(int i=n; i>=1; i--){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
            System.out.println();
        }
        return n;
    }
}
