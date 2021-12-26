package first.OrangeAnacondas.Project5;

import java.util.Scanner;

public class Task5_PyramideReversed {
    public static void main(String[] args) {
        /*
        Ask the user to enter one in number between 1 to 10 then, Write the program to print the string in the following format:
Example:
Input: 6
Output:
666666
55555
4444
333
22
1
         */
        System.out.println("Please enter a number between 1 to 10");
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        for (int lines=1; num>=lines; num--){
            for (int n=num; lines<=n; n--){
                    System.out.print(num);
                }
            System.out.println();
            }

        }


    }

