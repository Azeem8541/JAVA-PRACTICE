package com.practice;

import java.util.Scanner;

public class HappyNumber_34 {
    public static void main(String[] args) {

        /*
         WAP to define a method to check the number
         is happy number or not.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = sc.nextInt();

        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number.");
        } else {
            System.out.println(num + " is not a Happy Number.");
        }
    }
    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = digitSquareSum(slow);       // 1 step
            fast = digitSquareSum(digitSquareSum(fast)); // 2 steps
        } while (slow != fast);

        return slow == 1;
    }

    static int digitSquareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}

