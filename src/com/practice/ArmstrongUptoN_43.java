package com.practice;

import java.util.Scanner;

public class ArmstrongUptoN_43 {
    public static void main(String[] args) {

        /*
         WAP to display the Armstrong within 1 to N.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter...");
//        int num = sc.nextInt();
//
//        for(int i=1; i<=num; i++){
//
//            int result = i;
//            int sum = 0;
//
//            while (result > 0){
//                int digit = result % 10;
//                sum += digit * digit * digit;
//                result = result / 10;
//            }
//            if(sum == i){
//                System.out.println(i);
//            }
//        }

        // Using Method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter..");
        int num = sc.nextInt();

        getArmstrong(num);
    }
    static int getArmstrong(int n){

        for(int i=1; i<=n; i++){

            int result = i;
            int sum = 0;

            while (result > 0){
                int digit = result % 10;
                sum += digit * digit * digit;
                result = result / 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
        return n;
    }
}
