package com.practice;

import java.util.Scanner;

public class Pattern3_55 {
    public static void main(String[] args) {

        /*

         WAP to print following pattern.

         10101
         01010
         10101
         01010
         10101

         */

//        int a = 1;
//        for(int i=1; i<=5; i++){
//
//            for(int j=1; j<=5; j++){
//
//                System.out.print(a);

//                if(a == 1){
//                    a--;
//                }
//                else{
//                    a++;
//                }
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter...");
//        int num = sc.nextInt();
//
//        int a = 1;
//        for(int i=1; i<=num; i++){
//
//            for(int j=1; j<=5; j++){
//                System.out.print(a);
//
//                if(a == 1){
//                    a--;
//                }
//                else{
//                    a++;
//                }
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter...");
        int num = sc.nextInt();

        getPattern3(num);
    }
    static int getPattern3(int n){

        int a = 1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=5; j++){
                System.out.print(a);

                if(a ==  1){
                    a--;
                }
                else{
                    a++;
                }
            }
            System.out.println();
        }
        return n;
    }
}
