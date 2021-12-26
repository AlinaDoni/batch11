package switchStatement;

import java.util.Scanner;

public class switchPractice1 {
    public static void main(String[] args) {
        /* get anumber between 1to 4 from user
        print out name of a season as
        1-winter
        2- spring
        3- summer

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number 1 to 4");

        int number= input.nextInt();
        switch (number){
            case 1:
                System.out.println("Welcome Winter");
                break;
            case 2 :
                System.out.println("Welcome Spring");
                break;
            case 3:
                System.out.println("Welcome Summer");
                break;
            case 4:
                System.out.println("Welcome Autumn");
                break;
            default:
                System.out.println("I said to enter from 1 to 4, don't be stupid");
                break;

        }
    }
}
