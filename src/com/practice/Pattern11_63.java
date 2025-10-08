package com.practice;

import java.util.Scanner;

public class Pattern11_63 {
    public static void main(String[] args) {

        /*
         WAP to print the following pattern.

         12345
         12345
         12345
         12345
         12345

         */

//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=5; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = sc.nextInt();
//
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=5; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        getPattern11(num);
    }
    static int getPattern11(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        return n;
    }
}
