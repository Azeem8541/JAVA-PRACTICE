package com.practice;

import java.util.Scanner;

public class Pattern1_53 {
    public static void main(String[] args) {

        /*

         WAP to draw this pattern.
         *****
         *****
         *****
         *****
         *****

         */

//        for(int i=1; i<=5; i++){
//
//            for(int j=1; j<=5; j++){
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
//
//            for(int j=1; j<=5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter...");
        int num = sc.nextInt();

        getPattern1(num);
    }
    static int getPattern1(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
}
