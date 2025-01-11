package BMI.src.bmi;

//package bmi;

import java.util.Scanner;

public class BMI {

    public static void main(String[] cvhs) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Type in your height in inches...");
        double ht = kb.nextDouble();
        System.out.println("Type in your weight in lbs...");
        double wt = kb.nextDouble();

        double bmi = bMI(ht, wt);

        String healthStatus;
        if (bmi < 18.5) {
            healthStatus = "underweight";
        } else if (bmi < 25) {
            healthStatus = "in the healthy range";
        } else if (bmi < 30) {
            healthStatus = "overweight";
        } else if (bmi < 40) {
            healthStatus = "obese";
        } else {
            healthStatus = "severely obese";
        }

        System.out.printf("Your BMI is %.3f and you are %s.%n", bmi, healthStatus);

        kb.close();
    }

    public static double bMI(double height, double weight) {
        return (weight / (height * height)) * 703;
    }
}

