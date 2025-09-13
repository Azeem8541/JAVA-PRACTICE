package com.practice;

import java.util.Scanner;

public class Pattern4_56 {
    public static void main(String[] args) {

        /*
         WAP to print the following pattern

         00000
         11111
         00000
         11111
         00000

         */

//        int a = 0;
//
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                System.out.print(a);
//            }
//            if(a == 0){
//                a++;
//            }
//            else{
//                a--;
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        int a = 0;
//
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=5; j++){
//                System.out.print(a);
//            }
//            if(a == 0){
//                a++;
//            }
//            else{
//                a--;
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getPattern5(num);
    }
    static int getPattern5(int n){

        int a = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                System.out.print(a);
            }
            if(a == 0){
                a++;
            }
            else{
                a--;
            }
            System.out.println();
        }
        return n;
    }
}
