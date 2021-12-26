package first.OrangeAnacondas;

import java.util.Scanner;

public class fiveDigitNumber {
    public static void main(String[] args) {
//         Write a program that will accept only 6 digit
//        numbers like 578432 and find multiplication
//                (5*7*8*4*3*2) of all digits and sum
//                (5+7+8+4+3+2)of all digits.
//                Example 1:
//        578432
//        Multiplication of all digits is 6720
//        The Sum of all digits is 29
//        Description
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 6 digit number");
        int number= input.nextInt();
        int n1 = number%10;
        number/=10;
        int n2= number%10;
        number/=10;
        int n3 = number%10;
        number/=10;
        int n4=number%10;
        number/=10;
        int n5 = number % 10;
        int n6= number/10;
        System.out.println("Multiplication of all digits is "+ (n1*n2*n3*n4*n5*n6));
        System.out.println("The sum of all digits is "+ (n1+n2+n3+n4+n5+n6));


    }
}
