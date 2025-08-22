package com.practice;

import java.util.Scanner;

public class Disarium_32 {
    public static void main(String[] args) {

        /*
         WAP to check your number is Disarium number or not.
         (Sum of power of individual digit by their position).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (isDisarium(num)) {
            System.out.println(num + " is a Disarium Number.");
        } else {
            System.out.println(num + " is not a Disarium Number.");
        }
    }

    static boolean isDisarium(int num) {
        int temp = num;
        int length = String.valueOf(num).length();
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
            length--;
        }

        return sum == num;
    }
}

