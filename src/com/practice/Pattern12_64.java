package com.practice;

import java.util.Scanner;

public class Pattern12_64 {
    public static void main(String[] args) {

        /*

        WAP to print the following pattern.

        1*2*3
        1*2*3
        1*2*3
        1*2*3
        1*2*3

         */

//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=3; j++){
//                System.out.print(j);
//
//                if(j<3){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=3; j++){
//                System.out.print(j);
//
//                if(j<3){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getPattern12(num);
    }
    static int getPattern12(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=3; j++){
                System.out.print(j);

                if(j<3){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        return n;
    }
}
