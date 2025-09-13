package com.practice;

import java.util.Scanner;

public class Exam1_Question_7 {
    public static void main(String[] args) {

        // Question 7.
        /*
        WAP to read the 4 subject marks from the user
        display the result.
        In any subject marks < 35 so fail.
        Percentage > 80% so distinction,
        >60 first class, >50 2nd class. otherwise just pass
        ALTERNATE : 1 Without using Method.
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Physics marks out of 100");
//        double sub1 = scanner.nextDouble();
//        System.out.println("Enter Chemistry marks out of 100");
//        double sub2 = scanner.nextDouble();
//        System.out.println("Enter Biology marks out of 100");
//        double sub3 = scanner.nextDouble();
//        System.out.println("Enter Mathematics marks out of 100");
//        double sub4 = scanner.nextDouble();
//
//        double result = sub1 +sub2 +sub3 +sub4;
//        System.out.println("Your total marks: "+result+" /400");
//
//        double percentage = (result/400)*100;
//        System.out.println("Your overall percentage: "+percentage);
//
//        if (sub1 < 35){
//            System.out.println("Fail...\n\tfail in Physics.. "+sub1);
//        }
//        else if (sub2 < 35){
//                System.out.println("Fail...\n\tfail in Chemistry.. "+sub2);
//            }
//        else if (sub3 < 35){
//                System.out.println("Fail...\n\tfail in Biology.. "+sub3);
//            }
//        else if (sub4 < 35){
//                System.out.println("Fail...\n\tfail in Math.. "+sub4);
//            }
//        else if (percentage > 80){
//            System.out.println("Congratulation you pass distinction...");
//        }
//        else if (percentage > 60){
//            System.out.println("Congratulation you pass 1st class...");
//        }
//        else if (percentage > 50){
//            System.out.println("You pass 2nd class...");
//        }
//        else {
//            System.out.println("Just pass...");
//        }
//        scanner.close();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Physics marks");
            double sub1 = sc.nextDouble();
            System.out.println("Enter Chemistry marks");
            double sub2 = sc.nextDouble();
            System.out.println("Enter Biology marks");
            double sub3 = sc.nextDouble();
            System.out.println("Enter Math marks");
            double sub4 = sc.nextDouble();

            double result = sub1+sub2+sub3+sub4;
            System.out.println("Your result is: "+result);
            double percentage = (result/400)*100;
            System.out.println("Overall percentage is: "+percentage);

            if (sub1 < 35){
                System.out.println("Fail...\n\tfail in Physics.. "+sub1);
            }
            else if(sub2 < 35){
                System.out.println("Fail...\n\tfail in Chemistry.. "+sub2);
            }
            else if(sub3 < 35){
                System.out.println("Fail...\n\tfail in Biology.. "+sub3);
            }
            else if(sub4 < 35){
                System.out.println("Fail...\n\tfail in Math.. "+sub4);
            }
            else if(percentage > 80){
                System.out.println("Congratulation you pass distinction...");
            }
            else if(percentage > 60){
                System.out.println("Congratulation you 1st class pass...");
            }
            else if(percentage > 50){
                System.out.println("You 2nd class pass...");
            }
            else{
                System.out.println("Just pass....");
            }
    }
}
