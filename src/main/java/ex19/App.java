/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex19;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double height = 0;
        System.out.print("What is your height? ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            height = sc.nextDouble();
            if(height>0)
                System.out.print("");
            else {
                System.out.print("");
            }
        }else {
            System.out.println("Please Enter Valid Integer");
        }

        double weight = 0;
        System.out.print("What is your weight? ");
        Scanner sc2 = new Scanner(System.in);
        if(sc2.hasNextInt()) {
            weight = sc2.nextDouble();
            if(weight>0)
                System.out.print("");
            else {
                System.out.print("");
            }
        }else {
            System.out.println("Please Enter Valid Integer");
        }


       double bmi = (weight / (height * height)) * 703;

        System.out.format("Your BMI is  %f\n", bmi);

        if(bmi > 25){
            System.out.format("You are overweight. You should see your doctor.");
        } else if(bmi < 18.5){
            System.out.format("You are underweight. You should see your doctor.");
        } else {
            System.out.format("You are within the ideal weight range.");
        }


    }
}