package com.practice;

import java.util.Scanner;

public class Pattern2_54 {
    public static void main(String[] args) {

        /*

         WAP to print following pattern.
         11111
         22222
         33333
         44444
         55555

         */

//        for(int i=1; i<=5; i++){
//
//            int result = i;
//
//            for(int j=1; j<=5; j++){
//                System.out.print(result);
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter...");
//        int num = sc.nextInt();
//
//        for(int i=1; i<=num; i++){
//
//            int result = i;
//
//            for(int j=1; j<=5; j++){
//                System.out.print(result);
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter...");
        int num = sc.nextInt();

        getPattern2(num);
    }
    static int getPattern2(int n){

        for(int i=1; i<=n; i++){

            int result = i;

            for(int j=1; j<=5; j++){
                System.out.print(result);
            }
            System.out.println();
        }
        return n;
    }
}
