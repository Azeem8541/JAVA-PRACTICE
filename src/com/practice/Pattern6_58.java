package com.practice;

import java.util.Scanner;

public class Pattern6_58 {
    public static void main(String[] args) {

        /*

         WAP to print the following pattern.
         1*1*1
         0*0*0
         1*1*1
         0*0*0
         1*1*1

         */

        // 1st Way...
//        for(int i=1; i<=5; i++){
//            if(i %2 == 1){
//                System.out.println("1*1*1");
//            }
//            else{
//                System.out.println("0*0*0");
//            }
//        }

        // 2nd Way...
//        int a =1;
//        int b =0;
//
//        for (int i=1; i<=5; i++){
//            for(int j=1; j<=3; j++){
//                if(i % 2==1){
//                    System.out.print(a);
//                }
//                else{
//                    System.out.print(b);
//                }
//                if(j < 3){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        // 3rd Way...
//        int a=1;
//        int b=0;
//        int val = a;
//
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=3; j++){
//                System.out.print(val);
//                if(j < 3){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//
//            if(val == a){
//                val = b;
//            }
//            else{
//                val = a;
//            }
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter...");
//        int num = sc.nextInt();
//
//        int a = 1;
//        int b = 0;
//        int val = a;
//
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=3; j++){
//                System.out.print(val);
//
//                if(j < 3){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//
//            if(val == a){
//                val = b;
//            }
//            else{
//                val = a;
//            }
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter...");
        int num = sc.nextInt();

        getPattern6(num);
    }
    static int getPattern6(int n){

        int a=1;
        int b=0;

        int val = a;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=3; j++){
                System.out.print(val);
                if(j<3){
                    System.out.print("*");
                }
            }
            if(val == a){
                val = b;
            }
            else{
                val = a;
            }
        }
        return n;
    }
}
