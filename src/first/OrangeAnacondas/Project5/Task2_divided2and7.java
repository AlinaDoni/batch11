package first.OrangeAnacondas.Project5;

import java.util.Scanner;

public class Task2_divided2and7 {
    public static void main(String[] args) {
        /*
        Using the scanner asks the user to input the min and max
number. Write a java code that will calculate the sum of
numbers between the range of min and max and those that
can only be divided by 2 and 7.
(min and max numbers are included)
Example:
0, 50 -> 14 + 28 + 42 = 84
         */
        System.out.println("Please enter the minimum amount ");
        Scanner input= new Scanner(System.in);
        int min= input.nextInt();
        System.out.println("Enter the max number");
        int max= input.nextInt();
        int sum=0;
        while (min<=max){
            min++;
            if (min % 2 == 0 && min % 7 == 0) {
                sum+=min;
                System.out.print(min + " + ");
            }
            }
        System.out.println();
        System.out.println( sum);
        }


    }

