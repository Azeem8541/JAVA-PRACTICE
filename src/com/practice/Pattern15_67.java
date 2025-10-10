package com.practice;

import java.util.Scanner;

public class Pattern15_67 {
    public static void main(String[] args) {

        /*

         WAP to print following pattern.

        1
        12
        123
        1234
        12345

         */

        // 1st way...

//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for (int i=1; i<=num; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // 2nd way...

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for (int i=1; i<=num; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j+",");
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        pattern15(num);
    }
    static int pattern15(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+",");
            }
            System.out.println();
        }
        return n;
    }
}
