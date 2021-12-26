package ifStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {

        //assume that user is using military style 1-24
        //print out good morninh/ good afternon
        //for the hours of morning or afternoon
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the hour for the time 1 to 24");
        int hour = input.nextInt();

        if (hour < 12 && hour>=0){
            System.out.println("Good Morning World!");
        }

        if (hour >=12 && hour <18){
            System.out.println("Good Afternoon World!");
        }

        if (hour >=18 && hour <= 23){
            System.out.println("Good Evening World!");
        }
        if (hour< 0 || hour>23){
            System.out.println("check your time");
        }
    }
}
