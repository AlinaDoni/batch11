package loops.while_DoWhile;

import java.util.Scanner;

public class whilePractice2 {
    public static void main(String[] args) {
        //ask user to enter an integer value and find the divisors of the given number
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a  whole number");
//        int number = input.nextInt();
//        int divisor =0;
//        while (number % divisor == 0){
//            System.out.println(divisor + "is a divisor for "+ number);
//        while (divisor <= number) {
//            if (number % divisor == 0) {
//                System.out.println(divisor + " is a divisor for " + number);
//            }
//            divisor++;
//        }
        //ask user to provide awhole int number
            //create a multiplication table from 1to 10 for the given number
         int number= input.nextInt();
         int mult=1;
         while(mult<=10){
             int operation = mult * number;
             System.out.println(mult + " * "+number +" = "+operation);
             mult++;
         }
    }
}
