package com.practice;

import java.util.Scanner;

public class Pattern7_59 {
    public static void main(String[] args) {

        /*

         WAP to print the following pattern.

         1*0*1
         1*0*1
         1*0*1
         1*0*1

         */
//        int a = 1;
//
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=3; j++){
//                System.out.print(a);
//                if(a == 1){
//                    a--;
//                }
//                else{
//                    a++;
//                }
//                if(j<3){
//                    System.out.print("*");
//                }
//            }
//            a = 1;
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        int a = 1;
//
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=3; j++){
//                System.out.print(a);
//                if(a == 1){
//                    a--;
//                }
//                else{
//                    a++;
//                }
//                if(j<3){
//                    System.out.print("*");
//                }
//            }
//            a = 1;
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getPattern7(num);
    }
    static int getPattern7(int n){

        int a = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=3; j++){
                System.out.print(a);
                if(a == 1){
                    a--;
                }
                else{
                    a++;
                }
                if(j<3){
                    System.out.print("*");
                }
            }
            a = 1;
            System.out.println();
        }
        return n;
    }
}
