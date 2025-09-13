package com.practice;

import java.util.Scanner;

public class NPowerP_30 {
    public static void main(String[] args) {

        /*
         WAP to calculate the n to the power of p.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter base (n): ");
//        int num = sc.nextInt();
//
//        System.out.println("Enter power (p): ");
//        int pow = sc.nextInt();
//
//        int result = 1;
//
//        for(int i=1; i<=pow; i++){
//            result = result * num;
//        }
//        System.out.println("Result of n to the power of p is: "+result);


        // Using Method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base (n): ");
        int base = sc.nextInt();

        System.out.println("Enter power (p): ");
        int pow = sc.nextInt();

        int result = calculationPow(base, pow);
        System.out.println("Result of n to the power of  p is: "+result);
    }
    static int calculationPow(int b, int p){

        int result = 1;

        for (int i=1; i<=p; i++){
            result = result * b;
        }
        return result;
    }
}
