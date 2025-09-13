package com.practice;

import java.util.Scanner;

public class FactorialN_23 {
    public static void main(String[] args) {

        /*
         WAP to define a method to calculate the product of first N natural
         number.
         */

        // Using Without Method
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter");
//        int num = scanner.nextInt();
//
//        int product = 1;
//        for(int i=1; i<=num; i++){
//            product *= i;
//        }
//        System.out.println("Product of first "+num+" natural number is: "+product);

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        int result = getProduct(num);
        System.out.println("Product of first "+num+" natural number is: "+result);
    }
    static int getProduct(int n){
        int product = 1;

        for(int i=1; i<=n; i++){
            product *= i;
        }
        return product;
    }
}


