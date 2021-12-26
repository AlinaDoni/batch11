package first.OrangeAnacondas;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        /*
        Write a program that will accept 5 digit number and
will print reversed number at the end.
Example-1:
53876
The output is 67835
Example-2:
97352
The output is 25379
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 5 digit number");
        int number= input.nextInt();
        int n1 = number%10;
        int number1= n1*10;
        int n2= number%10;
        number1=(number1*10)+n2;
        int n3 = number%10;
        number1= (number1 *10) +n3;
        int n4=number%10;
        number1=(number1*10)+n4;
        int n5 = number/10;
        number1=(number1*10)+n5;
        System.out.println(number1);
    }


}
