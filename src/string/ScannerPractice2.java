package string;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        //BMI calculation Body Mass index = weight/(height * height(meters))
        // 18-24
        // your BMI is <BMI>"
        Scanner input = new Scanner(System.in);
        System.out.println("Hi Alina please enter your weight in kg ");
        double weight = input.nextDouble();
        System.out.println("your weight is "+ weight + " now please enter your height in m");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Alina your BMI is " + bmi );

    }
}
