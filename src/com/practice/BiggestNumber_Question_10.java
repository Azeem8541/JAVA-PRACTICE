package com.practice;

import java.util.Scanner;

public class BiggestNumber_Question_10 {
    public static void main(String[] args) {

        // Question 10.
        /*
        WAP to define a method to return biggest between
        two numbers.
         */
        
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter number 1");
//        int num1 = sc.nextInt();
//
//        System.out.println("Enter number 2");
//        int num2 = sc.nextInt();
//
//        if(num1 > num2){
//            System.out.println(num1+": is greater than "+num2);
//        }
//        else if(num1 < num2){
//            System.out.println(num2+" is greater than "+num1);
//        }
//        else{
//            System.out.println("Equal numbers");
//        }
//        scanner.close();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num 1");
//        double num1 = sc.nextDouble();
//        System.out.println("Enter num 2");
//        double num2 = sc.nextDouble();
//
//        getGreat(num1, num2);
//
//        sc.close();
//    }
//
//    static double getGreat(double n1, double n2) {
//        if (n1 > n2) {
//            System.out.println(n1 + " is greater then " + n2);
//            return n1;
//        } else {
//            System.out.println(n2 + " is greater than " + n1);
//            return n2;
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        getBigger(num1, num2);

    }
    static int getBigger(int n1, int n2){
        if (n1 > n2){
            System.out.println(n1+" is greater than "+n2);
            return n1;
        }
        else{
            System.out.println(n2+" is grater than "+n1);
            return n2;
        }
    }
}
