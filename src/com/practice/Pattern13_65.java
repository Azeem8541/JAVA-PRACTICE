package com.practice;

import java.util.Scanner;

public class Pattern13_65 {
    public static void main(String[] args) {

        /*

         WAP to print the following pattern.
         *
         **
         ***
         ****
         *****

         */

//        for(int i=1; i<=5; i++){
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
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Using method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getPattern13(num);
    }
    static int getPattern13(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
}
